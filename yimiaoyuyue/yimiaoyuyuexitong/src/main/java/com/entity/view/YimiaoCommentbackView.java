package com.entity.view;

import com.entity.YimiaoCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 疫苗评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yimiao_commentback")
public class YimiaoCommentbackView extends YimiaoCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yimiao
			/**
			* 疫苗信息 的 医院类型
			*/
			private Integer yimiaoYiyuanxinxiId;
			/**
			* 疫苗名称
			*/
			private String yimiaoName;
			/**
			* 疫苗类型
			*/
			private Integer yimiaoTypes;
				/**
				* 疫苗类型的值
				*/
				private String yimiaoValue;
			/**
			* 疫苗图片
			*/
			private String yimiaoPhoto;
			/**
			* 剩余数量
			*/
			private Integer yimiaoKucunNumber;
			/**
			* 疫苗价格
			*/
			private Double yimiaoNewMoney;
			/**
			* 适宜接种人群
			*/
			private String yimiaoRenqun;
			/**
			* 接种前后禁忌
			*/
			private String yimiaoText;
			/**
			* 疫苗详情
			*/
			private String yimiaoContent;
			/**
			* 逻辑删除
			*/
			private Integer yimiaoDelete;

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
			* 地区
			*/
			private Integer addressTypes;
				/**
				* 地区的值
				*/
				private String addressValue;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public YimiaoCommentbackView() {

	}

	public YimiaoCommentbackView(YimiaoCommentbackEntity yimiaoCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, yimiaoCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set yimiao

					/**
					* 获取：疫苗信息 的 医院类型
					*/
					public Integer getYimiaoYiyuanxinxiId() {
						return yimiaoYiyuanxinxiId;
					}
					/**
					* 设置：疫苗信息 的 医院类型
					*/
					public void setYimiaoYiyuanxinxiId(Integer yimiaoYiyuanxinxiId) {
						this.yimiaoYiyuanxinxiId = yimiaoYiyuanxinxiId;
					}


					/**
					* 获取： 疫苗名称
					*/
					public String getYimiaoName() {
						return yimiaoName;
					}
					/**
					* 设置： 疫苗名称
					*/
					public void setYimiaoName(String yimiaoName) {
						this.yimiaoName = yimiaoName;
					}

					/**
					* 获取： 疫苗类型
					*/
					public Integer getYimiaoTypes() {
						return yimiaoTypes;
					}
					/**
					* 设置： 疫苗类型
					*/
					public void setYimiaoTypes(Integer yimiaoTypes) {
						this.yimiaoTypes = yimiaoTypes;
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

					/**
					* 获取： 疫苗图片
					*/
					public String getYimiaoPhoto() {
						return yimiaoPhoto;
					}
					/**
					* 设置： 疫苗图片
					*/
					public void setYimiaoPhoto(String yimiaoPhoto) {
						this.yimiaoPhoto = yimiaoPhoto;
					}

					/**
					* 获取： 剩余数量
					*/
					public Integer getYimiaoKucunNumber() {
						return yimiaoKucunNumber;
					}
					/**
					* 设置： 剩余数量
					*/
					public void setYimiaoKucunNumber(Integer yimiaoKucunNumber) {
						this.yimiaoKucunNumber = yimiaoKucunNumber;
					}

					/**
					* 获取： 疫苗价格
					*/
					public Double getYimiaoNewMoney() {
						return yimiaoNewMoney;
					}
					/**
					* 设置： 疫苗价格
					*/
					public void setYimiaoNewMoney(Double yimiaoNewMoney) {
						this.yimiaoNewMoney = yimiaoNewMoney;
					}

					/**
					* 获取： 适宜接种人群
					*/
					public String getYimiaoRenqun() {
						return yimiaoRenqun;
					}
					/**
					* 设置： 适宜接种人群
					*/
					public void setYimiaoRenqun(String yimiaoRenqun) {
						this.yimiaoRenqun = yimiaoRenqun;
					}

					/**
					* 获取： 接种前后禁忌
					*/
					public String getYimiaoText() {
						return yimiaoText;
					}
					/**
					* 设置： 接种前后禁忌
					*/
					public void setYimiaoText(String yimiaoText) {
						this.yimiaoText = yimiaoText;
					}

					/**
					* 获取： 疫苗详情
					*/
					public String getYimiaoContent() {
						return yimiaoContent;
					}
					/**
					* 设置： 疫苗详情
					*/
					public void setYimiaoContent(String yimiaoContent) {
						this.yimiaoContent = yimiaoContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getYimiaoDelete() {
						return yimiaoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYimiaoDelete(Integer yimiaoDelete) {
						this.yimiaoDelete = yimiaoDelete;
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
