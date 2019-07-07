package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentCategortService;

@Service
public class contentCategortServiceImpl implements contentCategortService {
	
	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_top_url}")
	private String art_rest_top_url;
	@Override
	public String getContentCategortList(String callback) {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_top_url+"?"+"callback="+callback);
		return result;
	}

}
