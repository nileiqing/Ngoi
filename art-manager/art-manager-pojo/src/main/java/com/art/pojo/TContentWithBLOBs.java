package com.art.pojo;

public class TContentWithBLOBs extends TContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.content
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.content_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    private String contentZhCn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.content
     *
     * @return the value of t_content.content
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.content
     *
     * @param content the value for t_content.content
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.content_zh_cn
     *
     * @return the value of t_content.content_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public String getContentZhCn() {
        return contentZhCn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.content_zh_cn
     *
     * @param contentZhCn the value for t_content.content_zh_cn
     *
     * @mbggenerated Mon Oct 07 14:48:53 CST 2019
     */
    public void setContentZhCn(String contentZhCn) {
        this.contentZhCn = contentZhCn == null ? null : contentZhCn.trim();
    }
}