package com.entity.view;

import com.entity.YiyuanxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 医院信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yiyuanxinxi")
public class YiyuanxinxiView extends YiyuanxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 医院类型的值
		*/
		private String yiyuanxinxiValue;
		/**
		* 地区的值
		*/
		private String addressValue;



	public YiyuanxinxiView() {

	}

	public YiyuanxinxiView(YiyuanxinxiEntity yiyuanxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, yiyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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













}
