package com.art.portal.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.art.portal.service.contentHomelistService;
import com.art.portal.service.contentService;
import com.art.portal.service.contentFooterresultService;
import com.art.portal.service.contentSlidenavbarService;
import com.art.portal.service.schoolspecial;
import com.art.portal.service.contentCatNodeUrlService;
import com.art.portal.service.contentCategortService;
import com.art.portal.service.contentDetailListResultService;
import com.art.portal.service.contentCagegoryIdAndCurrtPageService;
import com.art.portal.service.contentGetFatherIdService;
@Controller
public class contentcontroller {
	
	@Autowired
	private contentCategortService contentCategortservice;
	/*
	 * 获取顶部列表
	 * 刘晓峰
	 * @param callback
	 * @return 
	 */
	@RequestMapping(value="/index",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
	@ResponseBody
	public String getcontentCategoryList(String callback) {
		String list=contentCategortservice.getContentCategortList(callback);
		return list;
	}
	
	/*
	 * 获取对应分类下的老师的内容
	 * 刘晓峰
	 * @param categorylist
	 * @return String
	 */
	@RequestMapping(value="/teacher") 
	@ResponseBody
	public String getteacherlist()
	{
		String list=contentservice.getteacherlist();
		//System.out.println(list);
		return list;
	}
	
	@Autowired
    private contentService contentservice;
	/*
	 * 获取对应分类下的内容通过ID号
	 * 刘晓峰
	 * @param categorylist
	 * @return String
	 */
	@RequestMapping(value="/getcontentlist") 
	@ResponseBody
	public String getcontentlist(long categoryId)
	{
		String list=contentservice.getContentList(categoryId);
		//System.out.println(list);
		return list;
	}
	/*
	 * 获取对应分类下的内容通过查询关键字
	 * 于立波
	 * @param categorylist
	 * @return String
	 */
	@RequestMapping(value="/getcontentlistbykeyword") 
	@ResponseBody
	public String getcontentlistbykeyword(String keyword)
	{
		String list=contentservice.getContentListByKeyword(keyword);
		return list;
	}
	@RequestMapping(value="/search") 
	public ModelAndView search(String keyword)
	{
		ModelAndView modelAndView=new ModelAndView();
	    modelAndView.addObject("keyword", keyword);
	    modelAndView.setViewName("search");
	    return modelAndView;
	}
	@Autowired 
	private contentHomelistService contentHomelistservice;
	/*
	 * 获取对应分类下的内容
	 * 刘晓峰
	 * return String
	 */
	@RequestMapping(value="/gethomelist",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
	@ResponseBody
	public String getHomelist()
	{
		String homelist=contentHomelistservice.getHomelist();
		return homelist;
	}
	
	
	@Autowired 
	private contentFooterresultService contentFooterresultService;
	/*
	 * 获取页脚部分内容
	 * 刘晓峰
	 * return String
	 */
	@RequestMapping(value="/getfooterresultlist",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
	@ResponseBody
	public String getFooterResultList()
	{
		String footerresultlist=contentFooterresultService.getfooterresult();
		return footerresultlist;
	}
	
	@Autowired 
	private contentSlidenavbarService contentSlidenavbarService;
	/*
	 * 获取轮播图的内容
	 * 刘晓峰
	 * return String
	 */
	@RequestMapping(value="/getslidenavbar",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
	@ResponseBody
	public String getSlidenavbar()
	{
		String slidenavbarlist=contentSlidenavbarService.getslidenavbar();
		return slidenavbarlist;
	}
	
	@Autowired 
	private contentDetailListResultService contentDetailListResultService;
/*	
	 * 获取根据当前页和类名获得对应的内容
	 * 刘晓峰
	 * return String
	 
	@RequestMapping(value="/getdetaillist/{categoryId}",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8") 
	@ResponseBody
	public String getdetaillist(Integer currentpage,@PathVariable Integer categoryid)
	{
		String detaillist=contentDetailListResultService.getdetaillistresult(categoryid, currentpage);
		return detaillist;
	}*/
	@Autowired 
	private contentCatNodeUrlService contentCatNodeUrlService;
		
	/*
	 * 根据点击的子类id获取该节点下的类结构对应的url
	 * 刘晓峰
	 * return String
	 */
	@RequestMapping(value="/categoryNode/{categoryid}") 
	@ResponseBody
	public String categorynode(@PathVariable Integer categoryid)
	{
		String list=contentCatNodeUrlService.getUrlByCatNode(categoryid);
		return list;
	}
	
	@Autowired 
	private contentCagegoryIdAndCurrtPageService contentCagegoryIdAndCurrtPageService;
	
	@RequestMapping(value="/detaillist/{categoryid}") 
	@ResponseBody
	public String detaillist(Integer currentpage,@PathVariable Long categoryid)
	{
		String list=contentCagegoryIdAndCurrtPageService.getlistBycategoryidandcurrentpage(categoryid, currentpage);
		return list;
	}
	
	/*
	 * 获取学院特色 
	 * 刘晓峰
	 * return String
	 */
	@Autowired 
	private schoolspecial schoolspecial;
	
	@RequestMapping(value="/content/schoolspecial") 
	@ResponseBody
	public String getschoolspecial(Integer currentpage)
	{
		String list=schoolspecial.getschoolspecial(currentpage);
		return list;
	}
}
