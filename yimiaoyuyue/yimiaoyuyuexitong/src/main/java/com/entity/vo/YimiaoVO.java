package com.entity.vo;

import com.entity.YimiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疫苗信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yimiao")
public class YimiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 医院类型
     */

    @TableField(value = "yiyuanxinxi_id")
    private Integer yiyuanxinxiId;


    /**
     * 疫苗名称
     */

    @TableField(value = "yimiao_name")
    private String yimiaoName;


    /**
     * 疫苗类型
     */

    @TableField(value = "yimiao_types")
    private Integer yimiaoTypes;


    /**
     * 疫苗图片
     */

    @TableField(value = "yimiao_photo")
    private String yimiaoPhoto;


    /**
     * 剩余数量
     */

    @TableField(value = "yimiao_kucun_number")
    private Integer yimiaoKucunNumber;


    /**
     * 疫苗价格
     */

    @TableField(value = "yimiao_new_money")
    private Double yimiaoNewMoney;


    /**
     * 适宜接种人群
     */

    @TableField(value = "yimiao_renqun")
    private String yimiaoRenqun;


    /**
     * 接种前后禁忌
     */

    @TableField(value = "yimiao_text")
    private String yimiaoText;


    /**
     * 疫苗详情
     */

    @TableField(value = "yimiao_content")
    private String yimiaoContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "yimiao_delete")
    private Integer yimiaoDelete;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：医院类型
	 */
    public Integer getYiyuanxinxiId() {
        return yiyuanxinxiId;
    }


    /**
	 * 获取：医院类型
	 */

    public void setYiyuanxinxiId(Integer yiyuanxinxiId) {
        this.yiyuanxinxiId = yiyuanxinxiId;
    }
    /**
	 * 设置：疫苗名称
	 */
    public String getYimiaoName() {
        return yimiaoName;
    }


    /**
	 * 获取：疫苗名称
	 */

    public void setYimiaoName(String yimiaoName) {
        this.yimiaoName = yimiaoName;
    }
    /**
	 * 设置：疫苗类型
	 */
    public Integer getYimiaoTypes() {
        return yimiaoTypes;
    }


    /**
	 * 获取：疫苗类型
	 */

    public void setYimiaoTypes(Integer yimiaoTypes) {
        this.yimiaoTypes = yimiaoTypes;
    }
    /**
	 * 设置：疫苗图片
	 */
    public String getYimiaoPhoto() {
        return yimiaoPhoto;
    }


    /**
	 * 获取：疫苗图片
	 */

    public void setYimiaoPhoto(String yimiaoPhoto) {
        this.yimiaoPhoto = yimiaoPhoto;
    }
    /**
	 * 设置：剩余数量
	 */
    public Integer getYimiaoKucunNumber() {
        return yimiaoKucunNumber;
    }


    /**
	 * 获取：剩余数量
	 */

    public void setYimiaoKucunNumber(Integer yimiaoKucunNumber) {
        this.yimiaoKucunNumber = yimiaoKucunNumber;
    }
    /**
	 * 设置：疫苗价格
	 */
    public Double getYimiaoNewMoney() {
        return yimiaoNewMoney;
    }


    /**
	 * 获取：疫苗价格
	 */

    public void setYimiaoNewMoney(Double yimiaoNewMoney) {
        this.yimiaoNewMoney = yimiaoNewMoney;
    }
    /**
	 * 设置：适宜接种人群
	 */
    public String getYimiaoRenqun() {
        return yimiaoRenqun;
    }


    /**
	 * 获取：适宜接种人群
	 */

    public void setYimiaoRenqun(String yimiaoRenqun) {
        this.yimiaoRenqun = yimiaoRenqun;
    }
    /**
	 * 设置：接种前后禁忌
	 */
    public String getYimiaoText() {
        return yimiaoText;
    }


    /**
	 * 获取：接种前后禁忌
	 */

    public void setYimiaoText(String yimiaoText) {
        this.yimiaoText = yimiaoText;
    }
    /**
	 * 设置：疫苗详情
	 */
    public String getYimiaoContent() {
        return yimiaoContent;
    }


    /**
	 * 获取：疫苗详情
	 */

    public void setYimiaoContent(String yimiaoContent) {
        this.yimiaoContent = yimiaoContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getYimiaoDelete() {
        return yimiaoDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setYimiaoDelete(Integer yimiaoDelete) {
        this.yimiaoDelete = yimiaoDelete;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
