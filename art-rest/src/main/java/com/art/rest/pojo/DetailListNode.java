package com.art.rest.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailListNode {
	
	private long id;	
	@JsonProperty("n")
	private String name; //新闻标题
	@JsonProperty("c")
	private String content;//新闻内容
	@JsonProperty("t")
	private Date time;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
