package com.entity.vo;

import com.entity.YimiaoOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疫苗预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yimiao_order")
public class YimiaoOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "yimiao_order_uuid_number")
    private String yimiaoOrderUuidNumber;


    /**
     * 疫苗
     */

    @TableField(value = "yimiao_id")
    private Integer yimiaoId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 实付价格
     */

    @TableField(value = "yimiao_order_true_price")
    private Double yimiaoOrderTruePrice;


    /**
     * 订单类型
     */

    @TableField(value = "yimiao_order_types")
    private Integer yimiaoOrderTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 设置：订单号
	 */
    public String getYimiaoOrderUuidNumber() {
        return yimiaoOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setYimiaoOrderUuidNumber(String yimiaoOrderUuidNumber) {
        this.yimiaoOrderUuidNumber = yimiaoOrderUuidNumber;
    }
    /**
	 * 设置：疫苗
	 */
    public Integer getYimiaoId() {
        return yimiaoId;
    }


    /**
	 * 获取：疫苗
	 */

    public void setYimiaoId(Integer yimiaoId) {
        this.yimiaoId = yimiaoId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：预约数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getYimiaoOrderTruePrice() {
        return yimiaoOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setYimiaoOrderTruePrice(Double yimiaoOrderTruePrice) {
        this.yimiaoOrderTruePrice = yimiaoOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getYimiaoOrderTypes() {
        return yimiaoOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setYimiaoOrderTypes(Integer yimiaoOrderTypes) {
        this.yimiaoOrderTypes = yimiaoOrderTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
