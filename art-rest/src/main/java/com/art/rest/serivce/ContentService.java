package com.art.rest.serivce;

import java.util.ArrayList;
import java.util.List;

import com.art.pojo.TContent;
import com.art.rest.pojo.DetailListNode;
import com.art.rest.pojo.DetailListNodeResult;
import com.art.rest.pojo.DetailListResult;
import com.art.rest.pojo.FooterResult;
import com.art.rest.pojo.IndexContentDisplayResult;
import com.art.rest.pojo.SlideList;

public interface ContentService {
	/***
	 * 根据分类id获取对应分类内容
	 * @param CategoryId  分类id
	 * @return
	 */
	DetailListNodeResult getContentListByCategoryId(long CategoryId);
	/***
	 * 根据关键词取对应查询内容
	 * @param Keyword  查询关键词
	 * @return
	 */
	DetailListResult getContentListByKeyword(String keyword);
	/***
	 * 获取首页展示的集合
	 * @return
	 */
	IndexContentDisplayResult getContentDisplay();
	/***
	 * 获取前台的轮播图
	 * @return
	 */
	SlideList getSlidenavbar();
	
	/***
	 * 获取底部的json
	 * @return
	 */
	FooterResult getFooterResult();
	
	DetailListResult getDetailListWithPage(Integer currentPage,String sort);

    //刘晓峰
	DetailListResult getDetailListWithPageandid(Long categoryId, Integer currentPage);
	DetailListResult getDetailListWithPage(Integer currentPage);
	
	
	
	
}
