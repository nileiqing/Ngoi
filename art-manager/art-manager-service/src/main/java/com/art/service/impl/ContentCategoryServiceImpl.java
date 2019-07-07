package com.art.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.common.pojo.ArtResult;
import com.art.common.pojo.EUTreeNode;
import com.art.mapper.TContentCategoryMapper;
import com.art.mapper.TContentMapper;
import com.art.pojo.TContentCategory;
import com.art.pojo.TContentCategoryExample;
import com.art.pojo.TContentCategoryExample.Criteria;
import com.art.service.ContentCategoryService;


@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TContentCategoryMapper contentCategoryMapper;
	@Autowired
	private TContentMapper contentMapper;
	/**
	 * 于立波
	 * 根据parentid查询节点列表
	 */
	@Override
	public List<EUTreeNode> getCategoryList(long parentId) {
		TContentCategoryExample example = new TContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TContentCategory> list = contentCategoryMapper.selectByExample(example);
		List<EUTreeNode> resultList = new ArrayList<>();
		for (TContentCategory tContentCategory : list) {
			//创建一个节点
			EUTreeNode node = new EUTreeNode();
			node.setId(tContentCategory.getId());
			node.setText(tContentCategory.getName());
			node.setState(tContentCategory.getIsParent()?"closed":"open");
			resultList.add(node);
		}
		return resultList;
	}
	/**
	 * 于立波
	 * 添加内容分类节点
	 */
	@Override
	public ArtResult insertContentCategory(long parentId, String name) {
		
		//创建一个pojo
		TContentCategory contentCategory = new TContentCategory();
		contentCategory.setName(name);
		contentCategory.setIsParent(false);
		//'状态。可选值:1(正常),2(删除)',
		contentCategory.setStatus(1);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		//添加记录
		contentCategoryMapper.insert(contentCategory);
		//查看父节点的isParent列是否为true，如果不是true改成true
		TContentCategory parentCat = contentCategoryMapper.selectByPrimaryKey(parentId);
		//判断是否为true
		if(parentCat.getIsParent()==false) {
			parentCat.setIsParent(true);
			//更新父节点
			contentCategoryMapper.updateByPrimaryKey(parentCat);
		}
		//返回结果
		return ArtResult.ok(contentCategory);
	  }
	/**
	 * 于立波
	 * 重命名节点
	 */
	@Override
	public ArtResult updateContentCategory(long id, String name) {
		// TODO Auto-generated method stub
		TContentCategory contentCategory = new TContentCategory();
		contentCategory.setId(id);
		contentCategory.setName(name);
		contentCategoryMapper.updateByPrimaryKeySelective(contentCategory);
		//返回结果
		return ArtResult.ok(contentCategory);
	}
	/**
	 * 于立波
	 * 删除节点
	 */
	@Override
	public ArtResult deleteContentCategory(Long parentId, Long id) {
		// TODO Auto-generated method stub
		//首先执行删除操作
		TContentCategory contentCategory = new TContentCategory();
		contentCategory.setId(id);
		contentCategoryMapper.deleteByPrimaryKey(id);
		
		//删除完毕后遍历对应父节点下是否还有子节点若没有将父节点的is_parent更改为0
		TContentCategoryExample example = new TContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TContentCategory> list = contentCategoryMapper.selectByExample(example);
		if(list.size()==0){
			TContentCategory parentcontentCategory = new TContentCategory();
			parentcontentCategory.setId(parentId);
			parentcontentCategory.setIsParent(false);
			contentCategoryMapper.updateByPrimaryKeySelective(parentcontentCategory);
		}
		return ArtResult.ok();
	}
	}
