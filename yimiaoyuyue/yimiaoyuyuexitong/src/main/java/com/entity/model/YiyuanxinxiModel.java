package com.entity.model;

import com.entity.YiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医院信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YiyuanxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 医院名称
     */
    private String yiyuanxinxiName;


    /**
     * 医院类型
     */
    private Integer yiyuanxinxiTypes;


    /**
     * 联系方式
     */
    private String yiyuanxinxiPhone;


    /**
     * 地区
     */
    private Integer addressTypes;


    /**
     * 医院图片
     */
    private String yiyuanxinxiPhoto;


    /**
     * 医院详情
     */
    private String yiyuanxinxiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：医院名称
	 */
    public String getYiyuanxinxiName() {
        return yiyuanxinxiName;
    }


    /**
	 * 设置：医院名称
	 */
    public void setYiyuanxinxiName(String yiyuanxinxiName) {
        this.yiyuanxinxiName = yiyuanxinxiName;
    }
    /**
	 * 获取：医院类型
	 */
    public Integer getYiyuanxinxiTypes() {
        return yiyuanxinxiTypes;
    }


    /**
	 * 设置：医院类型
	 */
    public void setYiyuanxinxiTypes(Integer yiyuanxinxiTypes) {
        this.yiyuanxinxiTypes = yiyuanxinxiTypes;
    }
    /**
	 * 获取：联系方式
	 */
    public String getYiyuanxinxiPhone() {
        return yiyuanxinxiPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setYiyuanxinxiPhone(String yiyuanxinxiPhone) {
        this.yiyuanxinxiPhone = yiyuanxinxiPhone;
    }
    /**
	 * 获取：地区
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }


    /**
	 * 设置：地区
	 */
    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 获取：医院图片
	 */
    public String getYiyuanxinxiPhoto() {
        return yiyuanxinxiPhoto;
    }


    /**
	 * 设置：医院图片
	 */
    public void setYiyuanxinxiPhoto(String yiyuanxinxiPhoto) {
        this.yiyuanxinxiPhoto = yiyuanxinxiPhoto;
    }
    /**
	 * 获取：医院详情
	 */
    public String getYiyuanxinxiContent() {
        return yiyuanxinxiContent;
    }


    /**
	 * 设置：医院详情
	 */
    public void setYiyuanxinxiContent(String yiyuanxinxiContent) {
        this.yiyuanxinxiContent = yiyuanxinxiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
