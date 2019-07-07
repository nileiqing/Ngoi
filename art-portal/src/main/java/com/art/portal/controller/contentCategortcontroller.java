package com.art.portal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.art.portal.service.contentGetFatherIdService;
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
		modelAndView.setViewName("index1");
		return modelAndView;
	}
	
	/*
	 * 显示次页面
	 * 刘晓峰
	 * return String
	 */
	//@RequestMapping(value="/category/25",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
	@RequestMapping(value="/category/{categoryId}")
	public ModelAndView shownext(@PathVariable Integer categoryId) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("detaillist");
		modelAndView.addObject("nodeid", categoryId);
		return modelAndView;
	}
	/*
	 * 显示详细信息页面
	 * 刘晓峰
	 * 
	 */
	@Autowired 
	private contentGetFatherIdService contentGetFatherIdService;
	@RequestMapping(value="/content/{categoryId}")
	public ModelAndView showdetail(@PathVariable Integer categoryId) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("detailmessage");
		String fathernodeid=contentGetFatherIdService.getfatherNode(categoryId);
		modelAndView.addObject("nodeid",fathernodeid);
		modelAndView.addObject("detailid", categoryId);
		return modelAndView;
	}
	/*
	 * 显示特色页面
	 * 刘晓峰
	 * return String
	 */
	@RequestMapping(value="/school/special")
	public ModelAndView schoolspecial() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("feature");
		return modelAndView;
	}
}
