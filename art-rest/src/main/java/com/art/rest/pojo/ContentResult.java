package com.art.rest.pojo;

import java.util.Date;

import com.art.pojo.TContent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 首页内容需要返回的json需要的类
 * @author chenzheng
 *
 */
public class ContentResult {

	private TContent data;

	public TContent getData() {
		return data;
	}

	public void setData(TContent data) {
		this.data = data;
	}
	
	
}
