package com.art.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.art.common.pojo.ArtResult;
import com.art.common.pojo.EUDataGridResult;
import com.art.pojo.TContent;
import com.art.service.ContentService;

@Controller
@RequestMapping("/content")
public class ContentController {
	@Autowired
	private ContentService contentService;
	/**
     * 尼雷清
     * 插入新内容
     * @param content
     * @return
     */
	@RequestMapping("/save")
	@ResponseBody
	public ArtResult addContent(TContent content)throws Exception{
		ArtResult result=contentService.insertContent(content);
		return result;
	}
	/**
     * 尼雷清
     * 根据categoryId分页查询对应的内容列表
     * @param categoryId
     * @return
     */
	@RequestMapping("/query/list")
	@ResponseBody
	public EUDataGridResult getContentListByCategoryId(long categoryId,Integer page, Integer rows)throws Exception{
		EUDataGridResult result=contentService.getContentList(categoryId, page, rows);
		return result;
	}
	/**
     * 尼雷清
     * 更新对应的内容
     * @param content
     * @return
     */
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public ArtResult updateContentList(TContent content)throws Exception{
		ArtResult result=contentService.updateContent(content);
		return result;
	}
	/**
     * 尼雷清
     * 更新对应的内容
     * @param content
     * @return
     */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	
	@ResponseBody
	public ArtResult deleteContentList( @RequestParam("ids") List<Long> ids)throws Exception{
		ArtResult result=contentService.deleteConent(ids);
		return result;
	}
}
