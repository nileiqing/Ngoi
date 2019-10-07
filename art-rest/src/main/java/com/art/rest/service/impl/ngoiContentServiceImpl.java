package com.art.rest.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.art.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.mapper.TContentCategoryMapper;
import com.art.mapper.TContentMapper;
import com.art.rest.serivce.ngoiContentService;

@Service
public class ngoiContentServiceImpl implements ngoiContentService{

	@Autowired
	private TContentMapper tContentMapper;
	
	@Autowired
	private TContentCategoryMapper tContentCategoryMapper;
	
	/***
	 * 根据分类Id获取该类别下的所有内容
	 * ordertype:0 为按照id正向排序
	 * ordertype:1为按照创建时间倒序排列
	 */
	
	@Override
	public List<TContentWithBLOBs> getContentListByCategoryId(long CategoryId,int ordertype) {
		// TODO Auto-generated method stub
		TContentExample example=new TContentExample();
		TContentExample.Criteria criteria=example.createCriteria();
		//criteria.andCategoryIdEqualTo(CategoryId);
		criteria.andCategoryIdEqualTo(CategoryId);
		if(ordertype==1) {
			example.setOrderByClause("created desc");
		}else if(ordertype==2){
			example.setOrderByClause("c_index");
		}
		List<TContentWithBLOBs>list=tContentMapper.selectByExampleWithBLOBs(example);
		
		if (list!=null&&list.size()>0) {
			
			return list;
		}	
		return null;
	}
	/***
	 * 根据Id获取内容
	 */
	@Override
	public TContentWithBLOBs getContentById(long contentId) {
		// TODO Auto-generated method stub
		TContentExample example=new TContentExample();
		TContentExample.Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(contentId);
		List<TContentWithBLOBs> list=tContentMapper.selectByExampleWithBLOBs(example);
		if (list!=null&&list.size()>0) {
			
			return list.get(0);
		}	
		return null;
	}
	/***
	 * 根据分类Id获取所有子类别下的所有内容
	 * ordertype:0 为按照id正向排序
	 * ordertype:1为按照创建时间倒序排列
	 */
	List<Long> CategoryIdlist=new ArrayList<Long>();
	@Override
	public List<TContentWithBLOBs> getContentAllListByCategoryId(long CategoryId, int odertype) {
		
		// TODO Auto-generated method stub
		TContentCategoryExample tContentCategoryExample=new TContentCategoryExample();
		TContentCategoryExample.Criteria tContentCategorycriteria=tContentCategoryExample.createCriteria();
		tContentCategorycriteria.andParentIdEqualTo(CategoryId);
		List<TContentCategory> tContentCategories=tContentCategoryMapper.selectByExample(tContentCategoryExample);
		if (tContentCategories!=null&&tContentCategories.size()>0) {
			
			CateGoryDFS(tContentCategories);
		}
		List<TContentWithBLOBs> contentlist=new ArrayList<TContentWithBLOBs>();
		for(int i=0;i<CategoryIdlist.size();i++) {
			TContentExample example=new TContentExample();
			TContentExample.Criteria criteria=example.createCriteria();
			criteria.andCategoryIdEqualTo(CategoryIdlist.get(i));
			if(odertype==1) {
				example.setOrderByClause("created desc");
			}else if(odertype==2){
				example.setOrderByClause("c_index");
			}
			List<TContentWithBLOBs> list=tContentMapper.selectByExampleWithBLOBs(example);
			for (int j = 0; j < list.size(); j++) {
					contentlist.add(list.get(j));
				}

			
		}
		CategoryIdlist.clear();
		return contentlist;
	}
	public void CateGoryDFS(List<TContentCategory> ContentCategoriesList) {
		for	(int i=0;i<ContentCategoriesList.size();i++) {
			if(ContentCategoriesList.get(i).getIsParent()==false){
				CategoryIdlist.add(ContentCategoriesList.get(i).getId());
			}else {
				TContentCategoryExample tContentCategoryExample=new TContentCategoryExample();
				TContentCategoryExample.Criteria tContentCategorycriteria=tContentCategoryExample.createCriteria();
				tContentCategorycriteria.andParentIdEqualTo(ContentCategoriesList.get(i).getId());
				List<TContentCategory> tContentCategories=tContentCategoryMapper.selectByExample(tContentCategoryExample);
				CateGoryDFS(tContentCategories);
			}
		}
	}

}
