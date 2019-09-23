package com.art.rest.serivce;

import java.util.ArrayList;
import java.util.List;

import com.art.pojo.TContent;


public interface ngoiContentService {
	/***
	 * 根据分类id获取对应分类内容
	 * @param CategoryId  分类id odertype 排序类型
	 * @return
	 */
	List<TContent> getContentListByCategoryId(long CategoryId ,int odertype);
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
	List<TContent> getContentAllListByCategoryId(long CategoryId ,int odertype);
	/***
	 * 根据title中存储的数字 大小进行排序 来获取内容列表
	 * @param CategoryId  分类id
	 * @return
	 */
	List<TContent> getPublicationContentListByOrder(long CategoryId ,int odertype);
	
}
