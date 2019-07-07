package com.art.rest.serivce;

import java.util.List;

import com.art.rest.pojo.CatNode;
import com.art.rest.pojo.CatResult;
import com.art.rest.pojo.HeaderResult;
import com.art.rest.pojo.TeacherDetailList;


public interface ContentCategoryService {
	
	/***
	 * 获取1级2级分类列表
	 * @return
	 */
	
	TeacherDetailList getTeacherDetailList();
	
	HeaderResult getTContentCategoryList(); 
	
	Long getCategoryIdByName(String categoryName);
	
	CatNode getCategoryCatNodeById(Long categoryId);
	
	Long getCategoryCateNodeBySonId(Long categoryId);
	
}
