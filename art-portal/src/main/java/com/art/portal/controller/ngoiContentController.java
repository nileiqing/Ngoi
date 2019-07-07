package com.art.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.art.portal.service.ngoiContentService;

@Controller
public class ngoiContentController {
	
@Autowired
private ngoiContentService ngoiContentService;
//进行Contact视图的跳转
@RequestMapping(value="/contact")
public ModelAndView showcontact() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("contact");
	return modelAndView;
}
//进行Activities视图的跳转
@RequestMapping(value="/openpositions")
public ModelAndView showopenpositions() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("openpositions");
	return modelAndView;
}
//进行Activities视图的跳转
@RequestMapping(value="/activities")
public ModelAndView showactivities() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("activities");
	return modelAndView;
}
//进行Events视图的跳转
@RequestMapping(value="/events")
public ModelAndView showevents() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("events");
	return modelAndView;
}
//进行出版物视图的跳转
@RequestMapping(value="/publications")
public ModelAndView showpublications() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("publications");
	return modelAndView;
}
//进行研究项目视图的跳转
@RequestMapping(value="/research")
public ModelAndView showresearch() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("research");
	return modelAndView;
}
//进行团队视图的跳转
@RequestMapping(value="/team")
public ModelAndView showteam() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("team");
	return modelAndView;
}
//进行首页详细新闻视图的跳转
@RequestMapping(value="/home/news/{contentid}")
public ModelAndView showhomenews(@PathVariable Integer contentid) {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("homenews");
	modelAndView.addObject("contentid", contentid);
	return modelAndView;
}
//进行新闻列表视图的跳转
@RequestMapping(value="/home/newslist")
public ModelAndView showhomenewslist() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("homenewslist");
	return modelAndView;
}
//根据分类id按照顺序获取所有叶子节点的内容数据
@RequestMapping(value="/getalllist",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
@ResponseBody
public String getAllcontentListByOrder(String callback,Long categoryId,int ordertype) {
	String list=ngoiContentService.getAllContentListByOrder(categoryId,ordertype);
	return list;
}
//根据分类id按照顺序获取内容数据
@RequestMapping(value="/getlistbyorder",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
@ResponseBody
public String getcontentCategoryListByOrder(String callback,Long categoryId,int ordertype) {
	String list=ngoiContentService.getContentListByOrder(categoryId,ordertype);
	return list;
}
//根据分类id获取内容数据
@RequestMapping(value="/getlist",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
@ResponseBody
public String getcontentCategoryList(String callback,Long categoryId) {
	String list=ngoiContentService.getContentList(categoryId);
	return list;
}
//根据id获取内容数据
@RequestMapping(value="/getcontent",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
@ResponseBody
public String getcontent(String callback,Long contentId) {
	String content=ngoiContentService.getContentById(contentId);
	return content;
}
}
