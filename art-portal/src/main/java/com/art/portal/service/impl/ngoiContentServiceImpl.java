package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.ngoiContentService;

@Service
public class ngoiContentServiceImpl implements ngoiContentService {

	@Value("${ngoi_rest_base_url}")
	private String ngoi_rest_base_url;
	@Value("${ngoi_rest_contentlist_url}")
	private String ngoi_rest_contentlist_url;
	@Value("${ngoi_rest_content_url}")
	private String ngoi_rest_content_url;
	@Value("${ngoi_rest_allcontent_url}")
	private String ngoi_rest_allcontent_url;
	@Override
	public String getContentListByOrder(Long categoryId,int ordertype) {
		
		String result=HttpClientUtil.doGet(ngoi_rest_base_url+ngoi_rest_contentlist_url+"?categoryId="+categoryId+"&ordertype="+ordertype);
		return result;
	}
	@Override
	public String getContentList(Long categoryId) {
		
		String result=HttpClientUtil.doGet(ngoi_rest_base_url+ngoi_rest_contentlist_url+"?categoryId="+categoryId+"&ordertype="+0);
		return result;
	}
	@Override
	public String getContentById(Long contentId) {
		// TODO Auto-generated method stub
		String result=HttpClientUtil.doGet(ngoi_rest_base_url+ngoi_rest_content_url+"?contentId="+contentId);
		return result;
	}
	@Override
	public String getAllContentListByOrder(Long categorytId, int ordertype) {
		String result=HttpClientUtil.doGet(ngoi_rest_base_url+ngoi_rest_allcontent_url+"?categoryId="+categorytId+"&ordertype="+ordertype);
		return result;
	}
	
}
