package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentSlidenavbarService;
@Service
public class contentSlidenavbarserviceImpl implements contentSlidenavbarService {

	/*
	 * 获取轮播图
	 */
	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_carouselfigure_url}")
	private String art_rest_carouselfigure_url;
	@Override
	public String getslidenavbar() {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_carouselfigure_url);
		return result;
	}

}
