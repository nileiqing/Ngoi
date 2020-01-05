package com.art.portal.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class contentCategortcontroller{

	/*
	 * 显示主页面
	 * 刘晓峰
	 * return String
	 */
	@RequestMapping(value="/show",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
	public ModelAndView showmain() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("zh/index");
		return modelAndView;
	}
}
