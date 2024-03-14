package com.entity.model;

import com.entity.TushuqiugouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 图书求购
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TushuqiugouModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 图书名称
     */
    private String tushuqiugouName;


    /**
     * 图书图片
     */
    private String tushuqiugouPhoto;


    /**
     * 作者
     */
    private String tushuqiugouZuozhe;


    /**
     * 出版社
     */
    private String tushuqiugouChubanshe;


    /**
     * 图书类型
     */
    private Integer tushuTypes;


    /**
     * 图书求购状态
     */
    private Integer tushuqiugouTypes;


    /**
     * 图书详情
     */
    private String tushuqiugouContent;


    /**
     * 创建时间show2 photoShow
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：图书名称
	 */
    public String getTushuqiugouName() {
        return tushuqiugouName;
    }


    /**
	 * 设置：图书名称
	 */
    public void setTushuqiugouName(String tushuqiugouName) {
        this.tushuqiugouName = tushuqiugouName;
    }
    /**
	 * 获取：图书图片
	 */
    public String getTushuqiugouPhoto() {
        return tushuqiugouPhoto;
    }


    /**
	 * 设置：图书图片
	 */
    public void setTushuqiugouPhoto(String tushuqiugouPhoto) {
        this.tushuqiugouPhoto = tushuqiugouPhoto;
    }
    /**
	 * 获取：作者
	 */
    public String getTushuqiugouZuozhe() {
        return tushuqiugouZuozhe;
    }


    /**
	 * 设置：作者
	 */
    public void setTushuqiugouZuozhe(String tushuqiugouZuozhe) {
        this.tushuqiugouZuozhe = tushuqiugouZuozhe;
    }
    /**
	 * 获取：出版社
	 */
    public String getTushuqiugouChubanshe() {
        return tushuqiugouChubanshe;
    }


    /**
	 * 设置：出版社
	 */
    public void setTushuqiugouChubanshe(String tushuqiugouChubanshe) {
        this.tushuqiugouChubanshe = tushuqiugouChubanshe;
    }
    /**
	 * 获取：图书类型
	 */
    public Integer getTushuTypes() {
        return tushuTypes;
    }


    /**
	 * 设置：图书类型
	 */
    public void setTushuTypes(Integer tushuTypes) {
        this.tushuTypes = tushuTypes;
    }
    /**
	 * 获取：图书求购状态
	 */
    public Integer getTushuqiugouTypes() {
        return tushuqiugouTypes;
    }


    /**
	 * 设置：图书求购状态
	 */
    public void setTushuqiugouTypes(Integer tushuqiugouTypes) {
        this.tushuqiugouTypes = tushuqiugouTypes;
    }
    /**
	 * 获取：图书详情
	 */
    public String getTushuqiugouContent() {
        return tushuqiugouContent;
    }


    /**
	 * 设置：图书详情
	 */
    public void setTushuqiugouContent(String tushuqiugouContent) {
        this.tushuqiugouContent = tushuqiugouContent;
    }
    /**
	 * 获取：创建时间show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
