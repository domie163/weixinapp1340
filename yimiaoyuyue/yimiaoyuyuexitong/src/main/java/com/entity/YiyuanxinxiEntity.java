package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 医院信息
 *
 * @author 
 * @email
 */
@TableName("yiyuanxinxi")
public class YiyuanxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YiyuanxinxiEntity() {

	}

	public YiyuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 医院名称
     */
    @TableField(value = "yiyuanxinxi_name")

    private String yiyuanxinxiName;


    /**
     * 医院类型
     */
    @TableField(value = "yiyuanxinxi_types")

    private Integer yiyuanxinxiTypes;


    /**
     * 联系方式
     */
    @TableField(value = "yiyuanxinxi_phone")

    private String yiyuanxinxiPhone;


    /**
     * 地区
     */
    @TableField(value = "address_types")

    private Integer addressTypes;


    /**
     * 医院图片
     */
    @TableField(value = "yiyuanxinxi_photo")

    private String yiyuanxinxiPhoto;


    /**
     * 医院详情
     */
    @TableField(value = "yiyuanxinxi_content")

    private String yiyuanxinxiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：医院名称
	 */
    public String getYiyuanxinxiName() {
        return yiyuanxinxiName;
    }
    /**
	 * 获取：医院名称
	 */

    public void setYiyuanxinxiName(String yiyuanxinxiName) {
        this.yiyuanxinxiName = yiyuanxinxiName;
    }
    /**
	 * 设置：医院类型
	 */
    public Integer getYiyuanxinxiTypes() {
        return yiyuanxinxiTypes;
    }
    /**
	 * 获取：医院类型
	 */

    public void setYiyuanxinxiTypes(Integer yiyuanxinxiTypes) {
        this.yiyuanxinxiTypes = yiyuanxinxiTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getYiyuanxinxiPhone() {
        return yiyuanxinxiPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setYiyuanxinxiPhone(String yiyuanxinxiPhone) {
        this.yiyuanxinxiPhone = yiyuanxinxiPhone;
    }
    /**
	 * 设置：地区
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }
    /**
	 * 获取：地区
	 */

    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 设置：医院图片
	 */
    public String getYiyuanxinxiPhoto() {
        return yiyuanxinxiPhoto;
    }
    /**
	 * 获取：医院图片
	 */

    public void setYiyuanxinxiPhoto(String yiyuanxinxiPhoto) {
        this.yiyuanxinxiPhoto = yiyuanxinxiPhoto;
    }
    /**
	 * 设置：医院详情
	 */
    public String getYiyuanxinxiContent() {
        return yiyuanxinxiContent;
    }
    /**
	 * 获取：医院详情
	 */

    public void setYiyuanxinxiContent(String yiyuanxinxiContent) {
        this.yiyuanxinxiContent = yiyuanxinxiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yiyuanxinxi{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yiyuanxinxiName=" + yiyuanxinxiName +
            ", yiyuanxinxiTypes=" + yiyuanxinxiTypes +
            ", yiyuanxinxiPhone=" + yiyuanxinxiPhone +
            ", addressTypes=" + addressTypes +
            ", yiyuanxinxiPhoto=" + yiyuanxinxiPhoto +
            ", yiyuanxinxiContent=" + yiyuanxinxiContent +
            ", createTime=" + createTime +
        "}";
    }
}
