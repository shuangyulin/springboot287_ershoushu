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
 * 购物车
 *
 * @author 
 * @email
 */
@TableName("cart")
public class CartEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CartEntity() {

	}

	public CartEntity(T t) {
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
     * 所属用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 图书
     */
    @TableField(value = "tushu_id")

    private Integer tushuId;


    /**
     * 购买数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
     * 更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：所属用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：所属用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：图书
	 */
    public Integer getTushuId() {
        return tushuId;
    }


    /**
	 * 获取：图书
	 */

    public void setTushuId(Integer tushuId) {
        this.tushuId = tushuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
	 * 设置：更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：更新时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    @Override
    public String toString() {
        return "Cart{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", tushuId=" + tushuId +
            ", buyNumber=" + buyNumber +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", insertTime=" + insertTime +
        "}";
    }
}
