package com.entity.view;

import com.entity.TushuOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 图书订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tushu_order")
public class TushuOrderView extends TushuOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String tushuOrderValue;
		/**
		* 支付类型的值
		*/
		private String tushuOrderPaymentValue;



		//级联表 address
			/**
			* 收货地址 的 创建用户
			*/
			private Integer addressYonghuId;
			/**
			* 收货人
			*/
			private String addressName;
			/**
			* 电话
			*/
			private String addressPhone;
			/**
			* 地址
			*/
			private String addressDizhi;
			/**
			* 是否默认地址
			*/
			private Integer isdefaultTypes;
				/**
				* 是否默认地址的值
				*/
				private String isdefaultValue;

		//级联表 tushu
			/**
			* 图书 的 用户
			*/
			private Integer tushuYonghuId;
			/**
			* 图书名称
			*/
			private String tushuName;
			/**
			* 图书图片
			*/
			private String tushuPhoto;
			/**
			* 作者
			*/
			private String tushuZuozhe;
			/**
			* 出版社
			*/
			private String tushuChubanshe;
			/**
			* 图书类型
			*/
			private Integer tushuTypes;
				/**
				* 图书类型的值
				*/
				private String tushuValue;
			/**
			* 图书库存
			*/
			private Integer tushuKucunNumber;
			/**
			* 图书原价
			*/
			private Double tushuOldMoney;
			/**
			* 现价
			*/
			private Double tushuNewMoney;
			/**
			* 点击次数
			*/
			private Integer tushuClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer tushuDelete;
			/**
			* 图书简介
			*/
			private String tushuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public TushuOrderView() {

	}

	public TushuOrderView(TushuOrderEntity tushuOrderEntity) {
		try {
			BeanUtils.copyProperties(this, tushuOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getTushuOrderValue() {
				return tushuOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setTushuOrderValue(String tushuOrderValue) {
				this.tushuOrderValue = tushuOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getTushuOrderPaymentValue() {
				return tushuOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setTushuOrderPaymentValue(String tushuOrderPaymentValue) {
				this.tushuOrderPaymentValue = tushuOrderPaymentValue;
			}




				//级联表的get和set address
					/**
					* 获取：收货地址 的 创建用户
					*/
					public Integer getAddressYonghuId() {
						return addressYonghuId;
					}
					/**
					* 设置：收货地址 的 创建用户
					*/
					public void setAddressYonghuId(Integer addressYonghuId) {
						this.addressYonghuId = addressYonghuId;
					}

					/**
					* 获取： 收货人
					*/
					public String getAddressName() {
						return addressName;
					}
					/**
					* 设置： 收货人
					*/
					public void setAddressName(String addressName) {
						this.addressName = addressName;
					}
					/**
					* 获取： 电话
					*/
					public String getAddressPhone() {
						return addressPhone;
					}
					/**
					* 设置： 电话
					*/
					public void setAddressPhone(String addressPhone) {
						this.addressPhone = addressPhone;
					}
					/**
					* 获取： 地址
					*/
					public String getAddressDizhi() {
						return addressDizhi;
					}
					/**
					* 设置： 地址
					*/
					public void setAddressDizhi(String addressDizhi) {
						this.addressDizhi = addressDizhi;
					}
					/**
					* 获取： 是否默认地址
					*/
					public Integer getIsdefaultTypes() {
						return isdefaultTypes;
					}
					/**
					* 设置： 是否默认地址
					*/
					public void setIsdefaultTypes(Integer isdefaultTypes) {
						this.isdefaultTypes = isdefaultTypes;
					}


						/**
						* 获取： 是否默认地址的值
						*/
						public String getIsdefaultValue() {
							return isdefaultValue;
						}
						/**
						* 设置： 是否默认地址的值
						*/
						public void setIsdefaultValue(String isdefaultValue) {
							this.isdefaultValue = isdefaultValue;
						}





















				//级联表的get和set tushu
					/**
					* 获取：图书 的 用户
					*/
					public Integer getTushuYonghuId() {
						return tushuYonghuId;
					}
					/**
					* 设置：图书 的 用户
					*/
					public void setTushuYonghuId(Integer tushuYonghuId) {
						this.tushuYonghuId = tushuYonghuId;
					}

					/**
					* 获取： 图书名称
					*/
					public String getTushuName() {
						return tushuName;
					}
					/**
					* 设置： 图书名称
					*/
					public void setTushuName(String tushuName) {
						this.tushuName = tushuName;
					}
					/**
					* 获取： 图书图片
					*/
					public String getTushuPhoto() {
						return tushuPhoto;
					}
					/**
					* 设置： 图书图片
					*/
					public void setTushuPhoto(String tushuPhoto) {
						this.tushuPhoto = tushuPhoto;
					}
					/**
					* 获取： 作者
					*/
					public String getTushuZuozhe() {
						return tushuZuozhe;
					}
					/**
					* 设置： 作者
					*/
					public void setTushuZuozhe(String tushuZuozhe) {
						this.tushuZuozhe = tushuZuozhe;
					}
					/**
					* 获取： 出版社
					*/
					public String getTushuChubanshe() {
						return tushuChubanshe;
					}
					/**
					* 设置： 出版社
					*/
					public void setTushuChubanshe(String tushuChubanshe) {
						this.tushuChubanshe = tushuChubanshe;
					}
					/**
					* 获取： 图书类型
					*/
					public Integer getTushuTypes() {
						return tushuTypes;
					}
					/**
					* 设置： 图书类型
					*/
					public void setTushuTypes(Integer tushuTypes) {
						this.tushuTypes = tushuTypes;
					}


						/**
						* 获取： 图书类型的值
						*/
						public String getTushuValue() {
							return tushuValue;
						}
						/**
						* 设置： 图书类型的值
						*/
						public void setTushuValue(String tushuValue) {
							this.tushuValue = tushuValue;
						}
					/**
					* 获取： 图书库存
					*/
					public Integer getTushuKucunNumber() {
						return tushuKucunNumber;
					}
					/**
					* 设置： 图书库存
					*/
					public void setTushuKucunNumber(Integer tushuKucunNumber) {
						this.tushuKucunNumber = tushuKucunNumber;
					}
					/**
					* 获取： 图书原价
					*/
					public Double getTushuOldMoney() {
						return tushuOldMoney;
					}
					/**
					* 设置： 图书原价
					*/
					public void setTushuOldMoney(Double tushuOldMoney) {
						this.tushuOldMoney = tushuOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getTushuNewMoney() {
						return tushuNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setTushuNewMoney(Double tushuNewMoney) {
						this.tushuNewMoney = tushuNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getTushuClicknum() {
						return tushuClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setTushuClicknum(Integer tushuClicknum) {
						this.tushuClicknum = tushuClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getTushuDelete() {
						return tushuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setTushuDelete(Integer tushuDelete) {
						this.tushuDelete = tushuDelete;
					}
					/**
					* 获取： 图书简介
					*/
					public String getTushuContent() {
						return tushuContent;
					}
					/**
					* 设置： 图书简介
					*/
					public void setTushuContent(String tushuContent) {
						this.tushuContent = tushuContent;
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
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
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




}
