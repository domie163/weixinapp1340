package com.entity.view;

import com.entity.YimiaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 疫苗信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yimiao")
public class YimiaoView extends YimiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 疫苗类型的值
		*/
		private String yimiaoValue;



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

	public YimiaoView() {

	}

	public YimiaoView(YimiaoEntity yimiaoEntity) {
		try {
			BeanUtils.copyProperties(this, yimiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 疫苗类型的值
			*/
			public String getYimiaoValue() {
				return yimiaoValue;
			}
			/**
			* 设置： 疫苗类型的值
			*/
			public void setYimiaoValue(String yimiaoValue) {
				this.yimiaoValue = yimiaoValue;
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






}
