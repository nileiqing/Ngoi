package com.art.rest.controller;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.art.pojo.TContent;
import com.art.rest.pojo.DetailListNode;
import com.art.rest.pojo.DetailListNodeResult;
import com.art.rest.pojo.DetailListResult;
import com.art.rest.pojo.FooterResult;
import com.art.rest.pojo.IndexContentDisplayResult;
import com.art.rest.pojo.SlideList;
import com.art.rest.serivce.ContentService;

@Controller
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	//根据传过来的分类id查询对应的内容
	@RequestMapping("/content/list")
	@ResponseBody
	public DetailListNodeResult getContentListByCategoryId(long categoryId) {
		//List<TContent> list=contentService.getContentListByCategoryId(categoryId);
		return contentService.getContentListByCategoryId(categoryId);	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}
	//根据传过来的关键词查询对应的内容
	@RequestMapping("/content/getcontentlistbykeyword")
	@ResponseBody
	public DetailListResult getContentListByKeyword(String keyword) {
		return contentService.getContentListByKeyword(keyword);	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}
	/***
	 * 获取homelist.json
	 * @return
	 */
	@RequestMapping("/content/homelist")
	@ResponseBody
	public IndexContentDisplayResult getHomeListJson() {
		return contentService.getContentDisplay();
	}
	
	/***
	 * 获取前边打广告的json
	 * @return
	 */
	@RequestMapping("/content/slidenavbar")
	@ResponseBody
	public SlideList getSlidenavbarJson() {
		return contentService.getSlidenavbar();
	}
	
	/***
	 * 获取页脚下边的内容
	 * @return
	 */
	@RequestMapping("/content/footerresult")
	@ResponseBody
	public FooterResult getFooterResult() {
		return contentService.getFooterResult();
	}
	
	
	
	
	
	/**
	 * 根据当前页和分页内容获取对应信息列表
	 * @param currentPage 当前页
	 * @param sort	根据分类名称
	 * @return
	 */
	@RequestMapping("/content/detaillistresult")
	@ResponseBody
	public DetailListResult getDetailListResult(Integer currentPage,String sort) {
		return contentService.getDetailListWithPage(currentPage, sort);
	}
	
	
	/***
	 * 获取学院特色
	 * @param currentPage
	 * @return
	 */
	@RequestMapping("/content/schoolspecial")
	@ResponseBody
	public DetailListResult getDetailListResult(Integer currentPage) {
		return contentService.getDetailListWithPage(currentPage);
	}
	
	/**
	 * 根据当前页和id获取对应信息列表
	 *
	 * @param currentPage
	 * @param categoryid
	 * @return
	 */
	@RequestMapping("/content/detaillistresults")
	@ResponseBody
	public DetailListResult getDetailListResults(Long categoryId,Integer currentPage) {
		return contentService.getDetailListWithPageandid(categoryId, currentPage);
	}
	
}
