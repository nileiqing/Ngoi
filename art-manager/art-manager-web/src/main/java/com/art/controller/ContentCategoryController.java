package com.art.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.art.common.pojo.ArtResult;
import com.art.common.pojo.EUTreeNode;
import com.art.pojo.TContentCategory;
import com.art.service.ContentCategoryService;
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {
/**
 * 于立波
 * 列出所有内容分类节点
 */
	@Autowired
	private ContentCategoryService contentCategoryService;
	@RequestMapping("/list")
     @ResponseBody
	public List<EUTreeNode> getContentCatList(@RequestParam(value="id", defaultValue="0")Long parentId) {
		List<EUTreeNode> lisaxt = contentCategoryService.getCategoryList(parentId);
		return lisaxt;
	}
	/**
	 * 于立波 
	 * 添加内容分类
	 * @param parentId
	 * @param name
	 * @return
	 */
	@RequestMapping("/create")
	@ResponseBody
	public ArtResult createContentCategory(Long parentId, String name) {
		ArtResult result=new ArtResult();
		//做空指针判断
		if(parentId!=null){
		    result = contentCategoryService.insertContentCategory(parentId, name);
			return result;
		}
		System.out.println("ylb输出：parentId为空");
		return result;
	}
	/**
	 * 于立波 
	 * 重命名节点
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ArtResult updateContentCategory(Long id, String name) {
		ArtResult result = contentCategoryService.updateContentCategory(id, name);
		return result;
	}
	/**
	 * 于立波
	 * 删除节点
      * @param parentId
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ArtResult deleteContentCategory(Long parentId, Long id) {
		ArtResult result = contentCategoryService.deleteContentCategory(parentId,id);
		return result;
	}
}
