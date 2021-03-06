package com.art.pojo;

import java.util.Date;

public class TContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.id
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.category_id
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.title
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.sub_title
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String subTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.title_desc
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String titleDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.url
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.pic
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.pic2
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String pic2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.created
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.updated
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.c_index
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private Integer cIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.title_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String titleZhCn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.sub_title_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String subTitleZhCn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.title_desc_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String titleDescZhCn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.id
     *
     * @return the value of t_content.id
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.id
     *
     * @param id the value for t_content.id
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.category_id
     *
     * @return the value of t_content.category_id
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.category_id
     *
     * @param categoryId the value for t_content.category_id
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.title
     *
     * @return the value of t_content.title
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.title
     *
     * @param title the value for t_content.title
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.sub_title
     *
     * @return the value of t_content.sub_title
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.sub_title
     *
     * @param subTitle the value for t_content.sub_title
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.title_desc
     *
     * @return the value of t_content.title_desc
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.title_desc
     *
     * @param titleDesc the value for t_content.title_desc
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.url
     *
     * @return the value of t_content.url
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.url
     *
     * @param url the value for t_content.url
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.pic
     *
     * @return the value of t_content.pic
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.pic
     *
     * @param pic the value for t_content.pic
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.pic2
     *
     * @return the value of t_content.pic2
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.pic2
     *
     * @param pic2 the value for t_content.pic2
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.created
     *
     * @return the value of t_content.created
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.created
     *
     * @param created the value for t_content.created
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.updated
     *
     * @return the value of t_content.updated
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.updated
     *
     * @param updated the value for t_content.updated
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.c_index
     *
     * @return the value of t_content.c_index
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public Integer getcIndex() {
        return cIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.c_index
     *
     * @param cIndex the value for t_content.c_index
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setcIndex(Integer cIndex) {
        this.cIndex = cIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.title_zh_cn
     *
     * @return the value of t_content.title_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getTitleZhCn() {
        return titleZhCn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.title_zh_cn
     *
     * @param titleZhCn the value for t_content.title_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setTitleZhCn(String titleZhCn) {
        this.titleZhCn = titleZhCn == null ? null : titleZhCn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.sub_title_zh_cn
     *
     * @return the value of t_content.sub_title_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getSubTitleZhCn() {
        return subTitleZhCn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.sub_title_zh_cn
     *
     * @param subTitleZhCn the value for t_content.sub_title_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setSubTitleZhCn(String subTitleZhCn) {
        this.subTitleZhCn = subTitleZhCn == null ? null : subTitleZhCn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.title_desc_zh_cn
     *
     * @return the value of t_content.title_desc_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getTitleDescZhCn() {
        return titleDescZhCn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.title_desc_zh_cn
     *
     * @param titleDescZhCn the value for t_content.title_desc_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setTitleDescZhCn(String titleDescZhCn) {
        this.titleDescZhCn = titleDescZhCn == null ? null : titleDescZhCn.trim();
    }
}