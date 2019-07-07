package com.art.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.art.common.utils.HttpClientUtil;
import com.art.portal.service.contentFooterresultService;
@Service
public class contentFooterresultServiceImpl implements contentFooterresultService {

	@Value("${art_rest_base_url}")
	private String art_rest_base_url;
	@Value("${art_rest_footerresult_url}")
	private String art_rest_footerresult_url;
	@Override
	public String getfooterresult() {
		String result=HttpClientUtil.doGet(art_rest_base_url+art_rest_footerresult_url);
		return result;
	}

}
