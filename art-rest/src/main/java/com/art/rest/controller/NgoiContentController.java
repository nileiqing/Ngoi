package com.art.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.art.common.utils.JsonUtils;
import com.art.pojo.TContent;
import com.art.rest.serivce.ngoiContentService;

@Controller
public class NgoiContentController {

	@Autowired
	private ngoiContentService ngoiContentService;
	
	//根据传过来的分类id该分类下的所有一级子内容,一般正序排列
	@RequestMapping(value="/content/lists",method=RequestMethod.GET,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getContentListsByCategoryId(long categoryId,int ordertype) {
		//List<TContent> list=contentService.getContentListByCategoryId(categoryId);
		List<TContent> list =ngoiContentService.getContentListByCategoryId(categoryId,ordertype);
		String json=JsonUtils.objectToJson(list);
		return json;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}
	//根据传过来的分类id该分类下的所有叶子节点子内容,一般正序排列
	@RequestMapping(value="/content/alllists",method=RequestMethod.GET,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getContentAllListsByCategoryId(long categoryId,int ordertype) {
		//List<TContent> list=contentService.getContentListByCategoryId(categoryId);
		List<TContent> list =ngoiContentService.getContentAllListByCategoryId(categoryId, ordertype);
		String json=JsonUtils.objectToJson(list);
		return json;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}
	//根据contentid查询某一条记录
	@RequestMapping(value="/singlecontent",method=RequestMethod.GET,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getContentById(long contentId) {
		TContent content=ngoiContentService.getContentById(contentId);
		String jsonString=JsonUtils.objectToJson(content);
		return jsonString;
	}
	
}
