package com.art.rest.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 首页内容需要返回的json需要的类
 * @author chenzheng
 *
 */
public class ContentCatResult {

	private long id;
	@JsonProperty("u")
	private String url;
	@JsonProperty("n")
	private String name;
	@JsonProperty("t")
	private Date time; //创建时间
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
