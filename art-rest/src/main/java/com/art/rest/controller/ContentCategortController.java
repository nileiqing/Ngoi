package com.art.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.art.common.utils.JsonUtils;
import com.art.rest.pojo.CatNode;
import com.art.rest.pojo.CatResult;
import com.art.rest.pojo.HeaderResult;
import com.art.rest.pojo.TeacherDetailList;
import com.art.rest.serivce.ContentCategoryService;

@Controller
public class ContentCategortController {

	@Autowired
	private ContentCategoryService contentCategoryService;
	
	@RequestMapping(value="/contentCategory/teacherDetailList")
	@ResponseBody
	public TeacherDetailList getTeacherDetailList(){
		TeacherDetailList teacherDetailList=contentCategoryService.getTeacherDetailList();
		if(teacherDetailList!=null){
			return teacherDetailList;
		}
		
		return null;
		
		
	}
	
	
	/***
	 * 获取header中的分类表
	 * @param callback  jsonp请求的函数名
	 * @return
	 */
	@RequestMapping(value="/contentCategory/header",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
	@ResponseBody
	public String getcontentCategoryList() {
		//CatResult catResult=contentCategoryService.getTContentCategoryList();
		HeaderResult headerResult=contentCategoryService.getTContentCategoryList();
		//把pojo转换成json串
		String json=JsonUtils.objectToJson(headerResult);
		//拼装返回值
		//String result=callback+"("+json+");";
		return json;
	}
	
	@RequestMapping("/contentCategory/catNode")
	@ResponseBody
	public Object getCategoryCatNodeById(Long categoryId) {
		if (categoryId!=null) {
			CatNode catNode=contentCategoryService.getCategoryCatNodeById(categoryId);
			return catNode;
		}
		return null;
	}
	
	@RequestMapping("/contentCategory/fatherCatNode")
	@ResponseBody
	public Long getCategoryCatNodeBySonId(Long categoryId) {
		//CatNode catNode=contentCategoryService.getCategoryCateNodeBySonId(categoryId);
		
		Long parentId=contentCategoryService.getCategoryCateNodeBySonId(categoryId);
		return parentId;
		//return null;
	}
	
	
	

}
