package com.art.rest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FootCenterNode {
	
	@JsonProperty("u")
	private String url;
	@JsonProperty("n")
	private String name;
	
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
	
}
