package com.art.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.art.pojo.TContentWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.art.common.pojo.ArtResult;
import com.art.common.pojo.EUDataGridResult;
import com.art.mapper.TContentMapper;
import com.art.pojo.TContent;
import com.art.pojo.TContentExample;
import com.art.pojo.TContentExample.Criteria;
import com.art.service.ContentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class ContentServiceImpl implements ContentService{
	@Autowired
	private TContentMapper TContentMapper;
	@Override
	/**
     * 尼雷清
     * 插入分类内容
     * @param content
     * @return
     */
	public ArtResult insertContent(TContentWithBLOBs content) {
		// TODO Auto-generated method stub
		content.setCreated(new Date());
		content.setUpdated(new Date());
		//对英文的'和"前加上转义符
/*		content.setContent(AddEscapecharacter(content.getContent()));
		content.setTitle(AddEscapecharacter(content.getTitle()));
		content.setTitleDesc(AddEscapecharacter(content.getTitleDesc()));*/
		TContentMapper.insert(content);
		//若更新的是publication板块的内容，则对title字段重新进行排序和更新
		RefershOrder(content.getCategoryId());
		return ArtResult.ok();
	}
	/**
     * 尼雷清
     * 根据categoryId分页查询对应的内容列表
     * @param categoryId
     * @return
     */
	@Override
	public EUDataGridResult getContentList(long categoryId, int page, int rows) {
		// TODO Auto-generated method stub
		//查询内容列表
		TContentExample tContentExample=new TContentExample();
		Criteria  criteria=tContentExample.createCriteria();
		criteria.andCategoryIdEqualTo(categoryId);
		//若是publication模块则按照c_index序号升序排序

		 if((categoryId>=29&&categoryId<=33)||categoryId==5) {
		  tContentExample.setOrderByClause("c_index");
		 }

		PageHelper.startPage(page, rows);
		List<TContentWithBLOBs> contentList=TContentMapper.selectByExampleWithBLOBs(tContentExample);
		/*if(categoryId>=29&&categoryId<=33) {
			Collections.sort(contentList, new Comparator<TContent>() {
				@Override
				public int compare(TContent o1, TContent o2) {
					// TODO Auto-generated method stub
					return Integer.parseInt(o1.getTitle())-Integer.parseInt(o2.getTitle());
				}
			});
		}*/
		//创建一个返回值对象
		EUDataGridResult result=new EUDataGridResult();
		result.setRows(contentList);
		//取记录总条数
		PageInfo<TContentWithBLOBs> pageInfo=new PageInfo<>(contentList);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	/**
     * 尼雷清
     * 更新对应的内容
     * @param content
     * @return
     */
	@Override
	public ArtResult updateContent(TContentWithBLOBs content) {
		// TODO Auto-generated method stub
		//对英文的'和"前加上转义符        不需要加
		TContentWithBLOBs content2=TContentMapper.selectByPrimaryKey(content.getId());
		content.setCreated(content2.getCreated());
		content.setUpdated(new Date());
		TContentMapper.updateByPrimaryKeyWithBLOBs(content);
		//若更新的是publication和Research板块的内容，则对title字段重新进行排序和更新
		RefershOrder(content.getCategoryId());
		return ArtResult.ok();
	}
	/**
     * 尼雷清
     * 根据id删除对应的内容
     * @param ids
     * @return
     */
	@Override
	public ArtResult deleteConent(List<Long> ids) {
		// TODO Auto-generated method stub
		Long categoryID = TContentMapper.selectByPrimaryKey(ids.get(0)).getCategoryId();
		for(int i=0;i<ids.size();i++){
			TContentMapper.deleteByPrimaryKey(ids.get(i));
		}
		RefershOrder(categoryID);
		return ArtResult.ok();
	}
	/**
     * 尼雷清
     * 如果是操作的publication板块的内容 ，则对title的序号进行重新排序和更新（插入、更新时候进行操作）
     * @param categoryId
     * @return
     */
	public void RefershOrder(long categoryId){
		if((categoryId>=29&&categoryId<=33)||categoryId==5) {
			TContentExample tContentExample=new TContentExample();
			Criteria  criteria=tContentExample.createCriteria();
			criteria.andCategoryIdEqualTo(categoryId);
			tContentExample.setOrderByClause("c_index");
			List<TContentWithBLOBs> contentList=TContentMapper.selectByExampleWithBLOBs(tContentExample);
			//对该categoryId下的所有内容的序号进行重新排列
			for(int i = 0 ; i<contentList.size();i++) {
				contentList.get(i).setcIndex(i+1);
				TContentMapper.updateByPrimaryKeyWithBLOBs(contentList.get(i));
			}
		}
		
	}
	/**
     * 尼雷清
     * 根据对应的英文' 和 英文 " 加上转义符
     * @param str
     * @return
     */
	String AddEscapecharacter(String str){
		StringBuilder sb = new StringBuilder(str);//构造一个StringBuilder对象,方便插入
		int a=sb.indexOf("\"", 0);
		if(a!=-1){
			for(int i=0;i<str.length();i++){
				if(a>0){
					if(sb.charAt(a-1)!='\\'){
						sb.insert(a, "\\");
						a=sb.indexOf("\"", a+2);
					}else{
						a=sb.indexOf("'", a+1);
					}
				}else if(a==0){
					sb.insert(a, "\\");
					a=sb.indexOf("\"", a+2);
				}else{
					a=sb.indexOf("\"", a+1);
				}
				
				if(a==-1){
					break;
				}
			}
		}
		int b=sb.indexOf("'", 0);
		if(b!=-1){
		for(int i=0;i<str.length();i++){
			if(b>0){
				if(sb.charAt(b-1)!='\\'){
					sb.insert(b, "\\");
					b=sb.indexOf("'", b+2);
				}else{
					b=sb.indexOf("'", b+1);
				}
			}else if(b==0){
				sb.insert(b, "\\");
				b=sb.indexOf("'", b+2);
			}else{
				b=sb.indexOf("'", b+1);
			}
			
			if(b==-1){
				break;
			}
		}
	}
		return sb.toString();
	}
}
