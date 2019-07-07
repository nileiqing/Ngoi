package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentService;

@Service
public class contentServiceImpl implements contentService {

	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_index_url1}")
	private String art_rest_index_url1;
	@Value("${art_rest_index_url2}")
	private String art_rest_index_url2;
	@Value("${art_rest_teacher_url}")
	private String art_rest_teacher_url;
	@Override
	public String getContentList(Long categoryId) {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_index_url1+"?categoryId="+categoryId);
		return result;
	}
	@Override
	public String getContentListByKeyword(String keyword) {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_index_url2+"?keyword="+keyword);
		return result;
	}
	@Override
	public String getteacherlist() {
		// TODO Auto-generated method stub
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_teacher_url);
		
		return result;
	}
}
