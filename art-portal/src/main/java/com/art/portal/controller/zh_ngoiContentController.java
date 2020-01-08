package com.art.portal.controller;

import com.art.portal.service.ngoiContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/zh")
public class zh_ngoiContentController {
	
@Autowired
private ngoiContentService ngoiContentService;
//进行Contact视图的跳转
@RequestMapping(value="/index")
public ModelAndView showindex() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("zh/index");
		return modelAndView;
	}
//进行Contact视图的跳转
@RequestMapping(value="/contact")
public ModelAndView showcontact() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/contact");
	return modelAndView;
}
//进行Activities视图的跳转
@RequestMapping(value="/openpositions")
public ModelAndView showopenpositions() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/openpositions");
	return modelAndView;
}
//进行Activities视图的跳转
@RequestMapping(value="/activities")
public ModelAndView showactivities() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/activities");
	return modelAndView;
}
//进行Events视图的跳转
@RequestMapping(value="/events")
public ModelAndView showevents() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/events");
	return modelAndView;
}
//进行出版物视图的跳转
@RequestMapping(value="/publications")
public ModelAndView showpublications() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/publications");
	return modelAndView;
}
//进行研究项目视图的跳转
@RequestMapping(value="/research")
public ModelAndView showresearch() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/research");
	return modelAndView;
}
//进行团队视图的跳转
@RequestMapping(value="/team")
public ModelAndView showteam() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/team");
	return modelAndView;
}
//进行首页详细新闻视图的跳转
@RequestMapping(value="/home/news/{contentid}")
public ModelAndView showhomenews(@PathVariable Integer contentid) {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/homenews");
	modelAndView.addObject("contentid", contentid);
	return modelAndView;
}
//进行新闻列表视图的跳转
@RequestMapping(value="/home/newslist")
public ModelAndView showhomenewslist() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("zh/homenewslist");
	return modelAndView;
}

}
