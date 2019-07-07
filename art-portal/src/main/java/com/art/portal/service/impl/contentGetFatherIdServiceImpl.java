package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentGetFatherIdService;
@Service
public class contentGetFatherIdServiceImpl implements contentGetFatherIdService {
	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_fatherid_url}")
	private String art_rest_fatherid_url;
	@Override
	
	public String getfatherNode(Integer categoryid) {
		String  result=HttpClientUtil.doGet(art_rest_base_url+art_rest_fatherid_url+"?categoryId="+categoryid);
		return result;
	}
	
}
