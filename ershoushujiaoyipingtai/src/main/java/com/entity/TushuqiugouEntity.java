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
 * 图书求购
 *
 * @author 
 * @email
 */
@TableName("tushuqiugou")
public class TushuqiugouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TushuqiugouEntity() {

	}

	public TushuqiugouEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 图书名称
     */
    @TableField(value = "tushuqiugou_name")

    private String tushuqiugouName;


    /**
     * 图书图片
     */
    @TableField(value = "tushuqiugou_photo")

    private String tushuqiugouPhoto;


    /**
     * 作者
     */
    @TableField(value = "tushuqiugou_zuozhe")

    private String tushuqiugouZuozhe;


    /**
     * 出版社
     */
    @TableField(value = "tushuqiugou_chubanshe")

    private String tushuqiugouChubanshe;


    /**
     * 图书类型
     */
    @TableField(value = "tushu_types")

    private Integer tushuTypes;


    /**
     * 图书求购状态
     */
    @TableField(value = "tushuqiugou_types")

    private Integer tushuqiugouTypes;


    /**
     * 图书详情
     */
    @TableField(value = "tushuqiugou_content")

    private String tushuqiugouContent;


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
	 * 设置：图书名称
	 */
    public String getTushuqiugouName() {
        return tushuqiugouName;
    }


    /**
	 * 获取：图书名称
	 */

    public void setTushuqiugouName(String tushuqiugouName) {
        this.tushuqiugouName = tushuqiugouName;
    }
    /**
	 * 设置：图书图片
	 */
    public String getTushuqiugouPhoto() {
        return tushuqiugouPhoto;
    }


    /**
	 * 获取：图书图片
	 */

    public void setTushuqiugouPhoto(String tushuqiugouPhoto) {
        this.tushuqiugouPhoto = tushuqiugouPhoto;
    }
    /**
	 * 设置：作者
	 */
    public String getTushuqiugouZuozhe() {
        return tushuqiugouZuozhe;
    }


    /**
	 * 获取：作者
	 */

    public void setTushuqiugouZuozhe(String tushuqiugouZuozhe) {
        this.tushuqiugouZuozhe = tushuqiugouZuozhe;
    }
    /**
	 * 设置：出版社
	 */
    public String getTushuqiugouChubanshe() {
        return tushuqiugouChubanshe;
    }


    /**
	 * 获取：出版社
	 */

    public void setTushuqiugouChubanshe(String tushuqiugouChubanshe) {
        this.tushuqiugouChubanshe = tushuqiugouChubanshe;
    }
    /**
	 * 设置：图书类型
	 */
    public Integer getTushuTypes() {
        return tushuTypes;
    }


    /**
	 * 获取：图书类型
	 */

    public void setTushuTypes(Integer tushuTypes) {
        this.tushuTypes = tushuTypes;
    }
    /**
	 * 设置：图书求购状态
	 */
    public Integer getTushuqiugouTypes() {
        return tushuqiugouTypes;
    }


    /**
	 * 获取：图书求购状态
	 */

    public void setTushuqiugouTypes(Integer tushuqiugouTypes) {
        this.tushuqiugouTypes = tushuqiugouTypes;
    }
    /**
	 * 设置：图书详情
	 */
    public String getTushuqiugouContent() {
        return tushuqiugouContent;
    }


    /**
	 * 获取：图书详情
	 */

    public void setTushuqiugouContent(String tushuqiugouContent) {
        this.tushuqiugouContent = tushuqiugouContent;
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
        return "Tushuqiugou{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", tushuqiugouName=" + tushuqiugouName +
            ", tushuqiugouPhoto=" + tushuqiugouPhoto +
            ", tushuqiugouZuozhe=" + tushuqiugouZuozhe +
            ", tushuqiugouChubanshe=" + tushuqiugouChubanshe +
            ", tushuTypes=" + tushuTypes +
            ", tushuqiugouTypes=" + tushuqiugouTypes +
            ", tushuqiugouContent=" + tushuqiugouContent +
            ", createTime=" + createTime +
        "}";
    }
}
