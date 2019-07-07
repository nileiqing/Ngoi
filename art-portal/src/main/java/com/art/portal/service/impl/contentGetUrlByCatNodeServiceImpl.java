package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentCatNodeUrlService;
@Service
public class contentGetUrlByCatNodeServiceImpl implements contentCatNodeUrlService {
	
	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_catnode_url}")
	private String art_rest_catnode_url;
	@Override
	public String getUrlByCatNode(Integer categoryId) {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_catnode_url+"?categoryId="+categoryId);
		return result;
	}

}
