package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.schoolspecial;
@Service
public class schoolspecialimpl implements schoolspecial {

	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_schoolspecial_url}")
	private String art_rest_schoolspecial_url;
	@Override
	public String getschoolspecial(Integer currentpage) {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_schoolspecial_url+"?"+"currentpage="+currentpage);
		return result;
	}

}
