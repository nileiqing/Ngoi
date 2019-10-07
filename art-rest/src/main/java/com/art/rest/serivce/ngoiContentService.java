package com.art.rest.serivce;

import java.util.ArrayList;
import java.util.List;

import com.art.pojo.TContent;
import com.art.pojo.TContentWithBLOBs;


public interface ngoiContentService {
	/***
	 * 根据分类id获取对应分类内容
	 * @param CategoryId  分类id odertype 排序类型
	 * @return
	 */
	List<TContentWithBLOBs> getContentListByCategoryId(long CategoryId ,int odertype);
	/***
	 * 根据id获取对应内容
	 * @param contentId  分类id
	 * @return
	 */
	TContent getContentById(long contentId);
	/***
	 * 根据分类id获取对应叶子节点分类所有子内容
	 * @param CategoryId  分类id
	 * @return
	 */
	List<TContentWithBLOBs> getContentAllListByCategoryId(long CategoryId ,int odertype);
	
}
