package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentDetailListResultService;
@Service
public class contentDetailListResultImpl implements contentDetailListResultService {

	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_pageandclass_url}")
	private String art_rest_pageandclass_url;
	
	@Override
	public String getdetaillistresult(Integer categoryId, Integer currentpage) {
		// TODO Auto-generated method stub
		return null;
	}}
