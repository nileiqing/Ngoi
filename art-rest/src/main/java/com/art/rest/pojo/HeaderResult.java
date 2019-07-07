package com.art.rest.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeaderResult {

	@JsonProperty("headerimgtop")
	private String headerimg; //宽屏时的图片
	
	private String headerimgleft; //窄屏时的图片
	
	
	public String getHeaderimgleft() {
		return headerimgleft;
	}
	public void setHeaderimgleft(String headerimgleft) {
		this.headerimgleft = headerimgleft;
	}
	private List<?> headernav;
	public String getHeaderimg() {
		return headerimg;
	}
	public void setHeaderimg(String headerimg) {
		this.headerimg = headerimg;
	}
	public List<?> getHeadernav() {
		return headernav;
	}
	public void setHeadernav(List<?> headernav) {
		this.headernav = headernav;
	}
	
}
