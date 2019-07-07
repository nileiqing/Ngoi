package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentHomelistService;
@Service
public class contentHomelistImpl implements contentHomelistService {
	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_classify_url}")
	private String art_rest_classify_url;
	@Override
	public String getHomelist() {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_classify_url);
		return result;
	}

}
