package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentCagegoryIdAndCurrtPageService;
@Service
public class contentCagegoryIdAndCurrtPageServiceImpl implements contentCagegoryIdAndCurrtPageService {
	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_pageandcategoryId_url}")
	private String art_rest_pageandcategoryId_url;
	@Override
	public String getlistBycategoryidandcurrentpage(Long categoryId, Integer currentpage) {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_pageandcategoryId_url+"?"+"categoryId="+categoryId+"&&"+"currentPage="+currentpage);
		return result;
	}
	
}
