
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 疫苗预约
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yimiaoOrder")
public class YimiaoOrderController {
    private static final Logger logger = LoggerFactory.getLogger(YimiaoOrderController.class);

    @Autowired
    private YimiaoOrderService yimiaoOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YimiaoService yimiaoService;
    @Autowired
    private YonghuService yonghuService;
@Autowired
private YimiaoCommentbackService yimiaoCommentbackService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = yimiaoOrderService.queryPage(params);

        //字典表数据转换
        List<YimiaoOrderView> list =(List<YimiaoOrderView>)page.getList();
        for(YimiaoOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YimiaoOrderEntity yimiaoOrder = yimiaoOrderService.selectById(id);
        if(yimiaoOrder !=null){
            //entity转view
            YimiaoOrderView view = new YimiaoOrderView();
            BeanUtils.copyProperties( yimiaoOrder , view );//把实体数据重构到view中

                //级联表
                YimiaoEntity yimiao = yimiaoService.selectById(yimiaoOrder.getYimiaoId());
                if(yimiao != null){
                    BeanUtils.copyProperties( yimiao , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYimiaoId(yimiao.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(yimiaoOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YimiaoOrderEntity yimiaoOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yimiaoOrder:{}",this.getClass().getName(),yimiaoOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            yimiaoOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        yimiaoOrder.setInsertTime(new Date());
        yimiaoOrder.setCreateTime(new Date());
        yimiaoOrderService.insert(yimiaoOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YimiaoOrderEntity yimiaoOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yimiaoOrder:{}",this.getClass().getName(),yimiaoOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            yimiaoOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<YimiaoOrderEntity> queryWrapper = new EntityWrapper<YimiaoOrderEntity>()
            .eq("id",0)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YimiaoOrderEntity yimiaoOrderEntity = yimiaoOrderService.selectOne(queryWrapper);
        if(yimiaoOrderEntity==null){
            yimiaoOrderService.updateById(yimiaoOrder);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yimiaoOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<YimiaoOrderEntity> yimiaoOrderList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YimiaoOrderEntity yimiaoOrderEntity = new YimiaoOrderEntity();
//                            yimiaoOrderEntity.setYimiaoOrderUuidNumber(data.get(0));                    //订单号 要改的
//                            yimiaoOrderEntity.setYimiaoId(Integer.valueOf(data.get(0)));   //疫苗 要改的
//                            yimiaoOrderEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            yimiaoOrderEntity.setBuyNumber(Integer.valueOf(data.get(0)));   //预约数量 要改的
//                            yimiaoOrderEntity.setYimiaoOrderTruePrice(data.get(0));                    //实付价格 要改的
//                            yimiaoOrderEntity.setYimiaoOrderTypes(Integer.valueOf(data.get(0)));   //订单类型 要改的
//                            yimiaoOrderEntity.setInsertTime(date);//时间
//                            yimiaoOrderEntity.setCreateTime(date);//时间
                            yimiaoOrderList.add(yimiaoOrderEntity);


                            //把要查询是否重复的字段放入map中
                                //订单号
                                if(seachFields.containsKey("yimiaoOrderUuidNumber")){
                                    List<String> yimiaoOrderUuidNumber = seachFields.get("yimiaoOrderUuidNumber");
                                    yimiaoOrderUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yimiaoOrderUuidNumber = new ArrayList<>();
                                    yimiaoOrderUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("yimiaoOrderUuidNumber",yimiaoOrderUuidNumber);
                                }
                        }

                        //查询是否重复
                         //订单号
                        List<YimiaoOrderEntity> yimiaoOrderEntities_yimiaoOrderUuidNumber = yimiaoOrderService.selectList(new EntityWrapper<YimiaoOrderEntity>().in("yimiao_order_uuid_number", seachFields.get("yimiaoOrderUuidNumber")));
                        if(yimiaoOrderEntities_yimiaoOrderUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YimiaoOrderEntity s:yimiaoOrderEntities_yimiaoOrderUuidNumber){
                                repeatFields.add(s.getYimiaoOrderUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [订单号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yimiaoOrderService.insertBatch(yimiaoOrderList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = yimiaoOrderService.queryPage(params);

        //字典表数据转换
        List<YimiaoOrderView> list =(List<YimiaoOrderView>)page.getList();
        for(YimiaoOrderView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YimiaoOrderEntity yimiaoOrder = yimiaoOrderService.selectById(id);
            if(yimiaoOrder !=null){


                //entity转view
                YimiaoOrderView view = new YimiaoOrderView();
                BeanUtils.copyProperties( yimiaoOrder , view );//把实体数据重构到view中

                //级联表
                    YimiaoEntity yimiao = yimiaoService.selectById(yimiaoOrder.getYimiaoId());
                if(yimiao != null){
                    BeanUtils.copyProperties( yimiao , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYimiaoId(yimiao.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(yimiaoOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }



    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YimiaoOrderEntity yimiaoOrder, HttpServletRequest request) {
        logger.debug("add方法:,,Controller:{},,yimiaoOrder:{}", this.getClass().getName(), yimiaoOrder.toString());
        YimiaoEntity yimiaoEntity = yimiaoService.selectById(yimiaoOrder.getYimiaoId());
        if (yimiaoEntity == null) {
            return R.error(511, "查不到该疫苗信息");
        }
        // Double yimiaoNewMoney = yimiaoEntity.getYimiaoNewMoney();

        if (false) {
        } else if ((yimiaoEntity.getYimiaoKucunNumber() - 1) < 0) {
            return R.error(511, "购买数量不能大于库存数量");
        } else if (yimiaoEntity.getYimiaoNewMoney() == null) {
            return R.error(511, "疫苗信息价格不能为空");
        }

        //计算所获得积分
        Double buyJifen = 0.0;
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        YonghuEntity yonghuEntity = yonghuService.selectById(userId);
        if (yonghuEntity == null)
            return R.error(511, "用户不能为空");
        if (yonghuEntity.getNewMoney() == null)
            return R.error(511, "用户金额不能为空");
        double balance = yonghuEntity.getNewMoney() - yimiaoEntity.getYimiaoNewMoney() * 1;//余额
        if (balance < 0)
            return R.error(511, "余额不够支付");
        yimiaoOrder.setYimiaoOrderTypes(1); //设置订单状态为已支付
        yimiaoOrder.setYimiaoOrderTruePrice(yimiaoEntity.getYimiaoNewMoney() * 1); //设置实付价格
        yimiaoOrder.setYonghuId(userId); //设置订单支付人id
        yimiaoOrder.setYimiaoOrderUuidNumber(String.valueOf(new Date().getTime()));
        yimiaoOrder.setInsertTime(new Date());
        yimiaoOrder.setBuyNumber(1);
        yimiaoOrder.setCreateTime(new Date());
        yimiaoEntity.setYimiaoKucunNumber(yimiaoEntity.getYimiaoKucunNumber() - 1);
        yimiaoService.updateById(yimiaoEntity);
        yimiaoOrderService.insert(yimiaoOrder);//新增订单
        yonghuEntity.setNewMoney(balance);//设置金额
        yonghuService.updateById(yonghuEntity);
        return R.ok();
    }

    /**
     * 退款
     */
    @RequestMapping("/refund")
    public R refund(Integer id, HttpServletRequest request) {
        logger.debug("refund方法:,,Controller:{},,id:{}", this.getClass().getName(), id);
        String role = String.valueOf(request.getSession().getAttribute("role"));

        YimiaoOrderEntity yimiaoOrder = yimiaoOrderService.selectById(id);
        Integer buyNumber = 1;
        Integer yimiaoOrderPaymentTypes = 1;
        Integer yimiaoId = yimiaoOrder.getYimiaoId();
        if (yimiaoId == null)
            return R.error(511, "查不到该疫苗信息");
        YimiaoEntity yimiaoEntity = yimiaoService.selectById(yimiaoId);
        if (yimiaoEntity == null)
            return R.error(511, "查不到该疫苗信息");
        Double yimiaoNewMoney = yimiaoEntity.getYimiaoNewMoney();
        if (yimiaoNewMoney == null)
            return R.error(511, "疫苗信息价格不能为空");

        Integer userId = (Integer) request.getSession().getAttribute("userId");
        YonghuEntity yonghuEntity = yonghuService.selectById(userId);
        if (yonghuEntity == null)
            return R.error(511, "用户不能为空");
        if (yonghuEntity.getNewMoney() == null)
            return R.error(511, "用户金额不能为空");

        Double zhekou = 1.0;


        //判断是什么支付方式 1代表余额 2代表积分
        if (yimiaoOrderPaymentTypes == 1) {//余额支付
            //计算金额
            Double money = yimiaoEntity.getYimiaoNewMoney() * buyNumber * zhekou;
            //计算所获得积分
            Double buyJifen = 0.0;
            yonghuEntity.setNewMoney(yonghuEntity.getNewMoney() + money); //设置金额


        }

        yimiaoEntity.setYimiaoKucunNumber(yimiaoEntity.getYimiaoKucunNumber() + buyNumber);


        yimiaoOrder.setYimiaoOrderTypes(2);//设置订单状态为退款
        yimiaoOrderService.updateById(yimiaoOrder);//根据id更新
        yonghuService.updateById(yonghuEntity);//更新用户信息
        yimiaoService.updateById(yimiaoEntity);//更新订单中疫苗信息的信息
        return R.ok();
    }


    /**
     * 发货
     */
    @RequestMapping("/deliver")
    public R deliver(Integer id) {
        logger.debug("refund:,,Controller:{},,ids:{}", this.getClass().getName(), id.toString());
        YimiaoOrderEntity yimiaoOrderEntity = new YimiaoOrderEntity();
        ;
        yimiaoOrderEntity.setId(id);
        yimiaoOrderEntity.setYimiaoOrderTypes(3);
        boolean b = yimiaoOrderService.updateById(yimiaoOrderEntity);
        if (!b) {
            return R.error("操作出错");
        }
        return R.ok();
    }



    /**
     * 评价
     */
    @RequestMapping("/commentback")
    public R commentback(Integer id, String commentbackText, Integer yimiaoCommentbackPingfenNumber, HttpServletRequest request) {
        logger.debug("commentback方法:,,Controller:{},,id:{}", this.getClass().getName(), id);
        YimiaoOrderEntity yimiaoOrder = yimiaoOrderService.selectById(id);
        if (yimiaoOrder == null)
            return R.error(511, "查不到该订单");
        Integer yimiaoId = yimiaoOrder.getYimiaoId();
        if (yimiaoId == null)
            return R.error(511, "查不到该疫苗信息");

        YimiaoCommentbackEntity yimiaoCommentbackEntity = new YimiaoCommentbackEntity();
        yimiaoCommentbackEntity.setId(id);
        yimiaoCommentbackEntity.setYimiaoId(yimiaoId);
        yimiaoCommentbackEntity.setYonghuId((Integer) request.getSession().getAttribute("userId"));
        yimiaoCommentbackEntity.setYimiaoCommentbackText(commentbackText);
        yimiaoCommentbackEntity.setInsertTime(new Date());
        yimiaoCommentbackEntity.setReplyText(null);
        yimiaoCommentbackEntity.setUpdateTime(null);
        yimiaoCommentbackEntity.setCreateTime(new Date());
        yimiaoCommentbackService.insert(yimiaoCommentbackEntity);

        yimiaoOrder.setYimiaoOrderTypes(4);//设置订单状态为已评价
        yimiaoOrderService.updateById(yimiaoOrder);//根据id更新
        return R.ok();
    }


}
