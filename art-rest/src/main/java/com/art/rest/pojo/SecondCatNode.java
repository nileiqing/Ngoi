package com.art.rest.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecondCatNode {

	private Long id;
	
	@JsonProperty("n")
	private String name;
	@JsonProperty("u")
	private String url;
	
	@JsonProperty("i")
	private List<?> item;
	
	public List<?> getItem() {
		return item;
	}
	public void setItem(List<?> item) {
		this.item = item;
	}
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
