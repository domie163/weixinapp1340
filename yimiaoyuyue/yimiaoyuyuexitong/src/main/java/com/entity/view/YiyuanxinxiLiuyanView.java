package com.entity.view;

import com.entity.YiyuanxinxiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 医院留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yiyuanxinxi_liuyan")
public class YiyuanxinxiLiuyanView extends YiyuanxinxiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yiyuanxinxi
			/**
			* 医院名称
			*/
			private String yiyuanxinxiName;
			/**
			* 医院类型
			*/
			private Integer yiyuanxinxiTypes;
				/**
				* 医院类型的值
				*/
				private String yiyuanxinxiValue;
			/**
			* 联系方式
			*/
			private String yiyuanxinxiPhone;
			/**
			* 地区
			*/
			private Integer addressTypes;
				/**
				* 地区的值
				*/
				private String addressValue;
			/**
			* 医院图片
			*/
			private String yiyuanxinxiPhoto;
			/**
			* 医院详情
			*/
			private String yiyuanxinxiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public YiyuanxinxiLiuyanView() {

	}

	public YiyuanxinxiLiuyanView(YiyuanxinxiLiuyanEntity yiyuanxinxiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, yiyuanxinxiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set yiyuanxinxi

					/**
					* 获取： 医院名称
					*/
					public String getYiyuanxinxiName() {
						return yiyuanxinxiName;
					}
					/**
					* 设置： 医院名称
					*/
					public void setYiyuanxinxiName(String yiyuanxinxiName) {
						this.yiyuanxinxiName = yiyuanxinxiName;
					}

					/**
					* 获取： 医院类型
					*/
					public Integer getYiyuanxinxiTypes() {
						return yiyuanxinxiTypes;
					}
					/**
					* 设置： 医院类型
					*/
					public void setYiyuanxinxiTypes(Integer yiyuanxinxiTypes) {
						this.yiyuanxinxiTypes = yiyuanxinxiTypes;
					}


						/**
						* 获取： 医院类型的值
						*/
						public String getYiyuanxinxiValue() {
							return yiyuanxinxiValue;
						}
						/**
						* 设置： 医院类型的值
						*/
						public void setYiyuanxinxiValue(String yiyuanxinxiValue) {
							this.yiyuanxinxiValue = yiyuanxinxiValue;
						}

					/**
					* 获取： 联系方式
					*/
					public String getYiyuanxinxiPhone() {
						return yiyuanxinxiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYiyuanxinxiPhone(String yiyuanxinxiPhone) {
						this.yiyuanxinxiPhone = yiyuanxinxiPhone;
					}



					/**
					* 获取： 医院图片
					*/
					public String getYiyuanxinxiPhoto() {
						return yiyuanxinxiPhoto;
					}
					/**
					* 设置： 医院图片
					*/
					public void setYiyuanxinxiPhoto(String yiyuanxinxiPhoto) {
						this.yiyuanxinxiPhoto = yiyuanxinxiPhoto;
					}

					/**
					* 获取： 医院详情
					*/
					public String getYiyuanxinxiContent() {
						return yiyuanxinxiContent;
					}
					/**
					* 设置： 医院详情
					*/
					public void setYiyuanxinxiContent(String yiyuanxinxiContent) {
						this.yiyuanxinxiContent = yiyuanxinxiContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 地区
					*/
					public Integer getAddressTypes() {
						return addressTypes;
					}
					/**
					* 设置： 地区
					*/
					public void setAddressTypes(Integer addressTypes) {
						this.addressTypes = addressTypes;
					}


						/**
						* 获取： 地区的值
						*/
						public String getAddressValue() {
							return addressValue;
						}
						/**
						* 设置： 地区的值
						*/
						public void setAddressValue(String addressValue) {
							this.addressValue = addressValue;
						}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
