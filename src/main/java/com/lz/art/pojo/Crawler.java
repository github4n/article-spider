package com.lz.art.pojo;

public class Crawler {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crawler.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crawler.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crawler.start_url
     *
     * @mbggenerated
     */
    private String startUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crawler.start_url_template
     *
     * @mbggenerated
     */
    private String startUrlTemplate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crawler.target_url_template
     *
     * @mbggenerated
     */
    private String targetUrlTemplate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crawler.id
     *
     * @return the value of crawler.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crawler.id
     *
     * @param id the value for crawler.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crawler.name
     *
     * @return the value of crawler.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crawler.name
     *
     * @param name the value for crawler.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crawler.start_url
     *
     * @return the value of crawler.start_url
     *
     * @mbggenerated
     */
    public String getStartUrl() {
        return startUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crawler.start_url
     *
     * @param startUrl the value for crawler.start_url
     *
     * @mbggenerated
     */
    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl == null ? null : startUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crawler.start_url_template
     *
     * @return the value of crawler.start_url_template
     *
     * @mbggenerated
     */
    public String getStartUrlTemplate() {
        return startUrlTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crawler.start_url_template
     *
     * @param startUrlTemplate the value for crawler.start_url_template
     *
     * @mbggenerated
     */
    public void setStartUrlTemplate(String startUrlTemplate) {
        this.startUrlTemplate = startUrlTemplate == null ? null : startUrlTemplate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crawler.target_url_template
     *
     * @return the value of crawler.target_url_template
     *
     * @mbggenerated
     */
    public String getTargetUrlTemplate() {
        return targetUrlTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crawler.target_url_template
     *
     * @param targetUrlTemplate the value for crawler.target_url_template
     *
     * @mbggenerated
     */
    public void setTargetUrlTemplate(String targetUrlTemplate) {
        this.targetUrlTemplate = targetUrlTemplate == null ? null : targetUrlTemplate.trim();
    }
}