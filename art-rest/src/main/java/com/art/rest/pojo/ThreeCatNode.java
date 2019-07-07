package com.art.rest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreeCatNode {
	
	private Long id;
	
	@JsonProperty("n")
	private String name;
	@JsonProperty("u")
	private String url;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
