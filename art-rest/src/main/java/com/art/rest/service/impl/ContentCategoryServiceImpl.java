package com.art.rest.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.mapper.TContentCategoryMapper;
import com.art.mapper.TContentMapper;
import com.art.pojo.TContent;
import com.art.pojo.TContentCategory;
import com.art.pojo.TContentCategoryExample;
import com.art.pojo.TContentCategoryExample.Criteria;
import com.art.pojo.TContentExample;
import com.art.rest.pojo.CatNode;
import com.art.rest.pojo.CatResult;
import com.art.rest.pojo.HeaderResult;
import com.art.rest.pojo.SecondCatNode;
import com.art.rest.pojo.TeacherDetailList;
import com.art.rest.pojo.TeacherDetailNode;
import com.art.rest.pojo.TeacherNode;
import com.art.rest.pojo.ThreeCatNode;
import com.art.rest.serivce.ContentCategoryService;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TContentCategoryMapper tContentCategoryMapper;

	@Autowired
	private TContentMapper tContentMapper;
	
	
	public TeacherDetailList getTeacherDetailList(){
		
		//查询结果的集合
		List<TeacherDetailNode> data=new ArrayList<>();
		//先把所有分类查出来
		TContentCategoryExample tContentCategoryExample=new TContentCategoryExample();
		Criteria criteria=tContentCategoryExample.createCriteria();
		criteria.andParentIdEqualTo((long)216);
		List<TContentCategory> list=tContentCategoryMapper.selectByExample(tContentCategoryExample);
		if(list!=null){
			//一层循环，查询出所有分类
			for (int i = 0; i < list.size(); i++) {
				TeacherDetailNode teacherDetailNode=new TeacherDetailNode();
				List<TeacherNode> teacher=new ArrayList<>();
				teacherDetailNode.setSort(list.get(i).getName());
				long selectId=list.get(i).getId();
				//获得该类下的所有内容
				TContentExample tContentExample=new TContentExample();
				com.art.pojo.TContentExample.Criteria criteria2=tContentExample.createCriteria();
				criteria2.andCategoryIdEqualTo(selectId);
				List<TContent> list2=tContentMapper.selectByExample(tContentExample);
				if(list2!=null){
					for (int j = 0; j < list2.size(); j++) {
						TeacherNode teacherNode=new TeacherNode();
						teacherNode.setId(list2.get(j).getId());
						teacherNode.setName(list2.get(j).getTitle());
						teacher.add(teacherNode);
						
					}
				}
				teacherDetailNode.setTeacher(teacher);
				
				data.add(teacherDetailNode);
			}
		}
		
		TeacherDetailList teacherDetailList=new TeacherDetailList();
		teacherDetailList.setData(data);
		
		
		return teacherDetailList;
	}
	
	
	
	
	
	

	/***
	 * 获取分类列表
	 */

	@Override
	public HeaderResult getTContentCategoryList() {
		// TODO Auto-generated method stub
		/*CatResult catResult=new CatResult();
		catResult.setData(getCategoryList(1));
		return catResult;*/
		HeaderResult headerResult=new HeaderResult();
		Long logoId=(long) 69;
		//获取首页页眉Logo的地址
		TContentExample example=new TContentExample();
		com.art.pojo.TContentExample.Criteria criteria=example.createCriteria();
		//criteria.andCategoryIdEqualTo(Integer.getInteger("69"));
		criteria.andCategoryIdEqualTo(logoId);
		List<TContent> list=tContentMapper.selectByExample(example);
		String imgURL=null;
		String imgURLleft=null;
		if (list!=null&&list.size()>0) {
			imgURL=list.get(0).getPic();
			imgURLleft=list.get(0).getPic2();
		}



		headerResult.setHeaderimg(imgURL);
		headerResult.setHeaderimgleft(imgURLleft);
		headerResult.setHeadernav(getCategoryList(1));
		return headerResult;
	}

	/***
	 * 从parentId为1的节点开始查，查出对应下边的分类，得到所有分类
	 * @param parentId
	 * @return
	 */
	private List getCategoryList(long parentId){
		TContentCategoryExample example=new TContentCategoryExample();
		Criteria criteria=example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TContentCategory> list=tContentCategoryMapper.selectByExample(example);

		List resultList=new ArrayList<>();
		if(list!=null&&list.size()>0){
			//遍历第一级节点
			for (TContentCategory tContentCategory : list) {
				List tempList=new ArrayList<>();
				CatNode catNode=new CatNode();
				catNode.setName(tContentCategory.getName());
				//如果是首页，则不加下边的子分类,并将对应的url加入里边
				if (tContentCategory.getName().equals("首页")) {
					catNode.setUrl("/show.html");
					catNode.setItem(tempList);
				}
				else{
					//查询二级分类
					TContentCategoryExample example2=new TContentCategoryExample();
					Criteria criteria2=example2.createCriteria();
					criteria2.andParentIdEqualTo(tContentCategory.getId());
					List<TContentCategory> categoryList=tContentCategoryMapper.selectByExample(example2);
					//遍历二级分类
					if(categoryList!=null&&categoryList.size()>0){
						for (TContentCategory tContentCategory2 : categoryList) {
							List secondList=new ArrayList<>();

							SecondCatNode secondCatNode=new SecondCatNode();
							secondCatNode.setId(tContentCategory2.getId());
							secondCatNode.setName(tContentCategory2.getName());

							if(tContentCategory2.getId()==216){
								secondCatNode.setUrl("/category/"+tContentCategory2.getId()+".html");
							}
							else{
								//查询三级分类
								TContentCategoryExample example3=new TContentCategoryExample();
								Criteria criteria3=example3.createCriteria();
								criteria3.andParentIdEqualTo(tContentCategory2.getId());
								List<TContentCategory> categoryList3=tContentCategoryMapper.selectByExample(example3);
								if(categoryList3!=null&&categoryList3.size()>0){
									//								secondCatNode.setItem(categoryList3);
									//								secondCatNode.setUrl("");
									for (TContentCategory tContentCategory3 : categoryList3) {
										ThreeCatNode threeCatNode=new ThreeCatNode();
										threeCatNode.setId(tContentCategory3.getId());
										threeCatNode.setName(tContentCategory3.getName());
										threeCatNode.setUrl("/category/"+tContentCategory3.getId()+".html");
										secondList.add(threeCatNode);
									}

								}
								else{
									secondCatNode.setUrl("/category/"+tContentCategory2.getId()+".html");
								}
							}
							
							secondCatNode.setItem(secondList);
							tempList.add(secondCatNode);
						}
					}
					catNode.setItem(tempList);
				}		
				resultList.add(catNode);
			}
		}

		//将查出来的页脚去掉，首页放到第一个
		//		List reList=new ArrayList<>();
		//
		//		//对首页节点进行处理
		//		reList.add(resultList.get(6)); //将首页放到第一个位置
		//		for (int i = 0; i < 6; i++) {
		//			reList.add(resultList.get(i));
		//		}
		return resultList;	

	}


	/***
	 * 根据类型的名字返回分类id
	 */
	@Override
	public Long getCategoryIdByName(String categoryName) {
		// TODO Auto-generated method stub
		if(!categoryName.equals("")){
			TContentCategoryExample example=new TContentCategoryExample();
			Criteria criteria=example.createCriteria();
			criteria.andNameEqualTo(categoryName);
			List<TContentCategory>list=tContentCategoryMapper.selectByExample(example);
			if (list!=null&&list.size()>0) {
				return list.get(0).getId();
			}
		}

		return null;
	}

	/**
	 * 根据传进来点击的分类的id值查询父节点，并将该分类下的所有分类返回
	 * @author chenzheng
	 * @param categoryId 点击的分类id
	 */
	@Override
	public CatNode getCategoryCatNodeById(Long categoryId) {

		Long parentId=getCategoryFatherIdBySonId(categoryId);
		 

		//根据传进来点击分类的id值，查询其父类的id值
		TContentCategoryExample example=new TContentCategoryExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(categoryId);		
		List<TContentCategory> parentList=tContentCategoryMapper.selectByExample(example);
		CatNode catNode=new CatNode();
		//根据父类的id查询对应的子类，并将其添加到catNode节点中
		if(parentList!=null&&parentList.size()>0){
			//获得父类的id值
			//Long parentId=parentList.get(0).getParentId();

			TContentCategoryExample example1=new TContentCategoryExample();
			Criteria criteria1=example1.createCriteria();
			criteria1.andIdEqualTo(parentId);
			List<TContentCategory> list=tContentCategoryMapper.selectByExample(example1);

			//遍历第一级节点
			for (TContentCategory tContentCategory : list) {
				List tempList=new ArrayList<>();	
				catNode.setName(tContentCategory.getName());
				//如果是首页，则不加下边的子分类,并将对应的url加入里边
				if (tContentCategory.getName().equals("首页")) {
					catNode.setUrl("/show.html");
					catNode.setItem(tempList);
				}
				else{
					//查询二级分类
					TContentCategoryExample example2=new TContentCategoryExample();
					Criteria criteria2=example2.createCriteria();
					criteria2.andParentIdEqualTo(tContentCategory.getId());
					List<TContentCategory> categoryList=tContentCategoryMapper.selectByExample(example2);
					//遍历二级分类
					if(categoryList!=null&&categoryList.size()>0){
						for (TContentCategory tContentCategory2 : categoryList) {
							List secondList=new ArrayList<>();

							SecondCatNode secondCatNode=new SecondCatNode();
							secondCatNode.setId(tContentCategory2.getId());
							secondCatNode.setName(tContentCategory2.getName());

							//查询三级分类
							TContentCategoryExample example3=new TContentCategoryExample();
							Criteria criteria3=example3.createCriteria();
							criteria3.andParentIdEqualTo(tContentCategory2.getId());
							List<TContentCategory> categoryList3=tContentCategoryMapper.selectByExample(example3);
							if(categoryList3!=null&&categoryList3.size()>0){
								//								secondCatNode.setItem(categoryList3);
								//								secondCatNode.setUrl("");
								for (TContentCategory tContentCategory3 : categoryList3) {
									ThreeCatNode threeCatNode=new ThreeCatNode();
									threeCatNode.setId(tContentCategory3.getId());
									threeCatNode.setName(tContentCategory3.getName());
									threeCatNode.setUrl("/category/"+tContentCategory3.getId()+".html");
									secondList.add(threeCatNode);
								}

							}
							else{
								secondCatNode.setUrl("/category/"+tContentCategory2.getId()+".html");
							}
							secondCatNode.setItem(secondList);
							tempList.add(secondCatNode);
							catNode.setItem(tempList);
						}
					}
				}
			}
		}

		return catNode;
	}

	@Override
	public Long getCategoryCateNodeBySonId(Long categoryId) {
		//从内容表中将其对应的父类id查出来
		TContentExample example1=new TContentExample();
		TContentExample.Criteria criteria1=example1.createCriteria();
		criteria1.andIdEqualTo(categoryId);
		List<TContent> contentList=tContentMapper.selectByExample(example1);
		//获取对应的父类id
		Long parentId=contentList.get(0).getCategoryId();
		// TODO Auto-generated method stub

		Long fatherId=getCategoryFatherIdBySonId(parentId);
		return fatherId;
		
	}


	//根据父类id，向下查询子类
	private CatNode getCategoryByFatherId(Long parentId) {
		CatNode catNode=new CatNode();
		//根据父类的id查询对应的子类，并将其添加到catNode节点中
		if(parentId!=null){
			//获得父类的id值
			//Long parentId=parentList.get(0).getParentId();

			TContentCategoryExample example1=new TContentCategoryExample();
			Criteria criteria1=example1.createCriteria();
			criteria1.andIdEqualTo(parentId);
			List<TContentCategory> list=tContentCategoryMapper.selectByExample(example1);

			//遍历第一级节点
			for (TContentCategory tContentCategory : list) {
				List tempList=new ArrayList<>();	
				catNode.setName(tContentCategory.getName());
				//如果是首页，则不加下边的子分类,并将对应的url加入里边
				if (tContentCategory.getName().equals("首页")) {
					catNode.setUrl("/show.html");
					catNode.setItem(tempList);
				}
				else{
					//查询二级分类
					TContentCategoryExample example2=new TContentCategoryExample();
					Criteria criteria2=example2.createCriteria();
					criteria2.andParentIdEqualTo(tContentCategory.getId());
					List<TContentCategory> categoryList=tContentCategoryMapper.selectByExample(example2);
					//遍历二级分类
					if(categoryList!=null&&categoryList.size()>0){
						for (TContentCategory tContentCategory2 : categoryList) {
							SecondCatNode secondCatNode=new SecondCatNode();
							secondCatNode.setId(tContentCategory2.getId());
							secondCatNode.setName(tContentCategory2.getName());
							secondCatNode.setUrl("/category/"+tContentCategory2.getId()+".html");
							tempList.add(secondCatNode);
						}
					}
					catNode.setItem(tempList);
				}		

			}
		}
		return catNode;
	}


	/***
	 * 根据子类id递归获取该分类下的超级父类id
	 * @param categoryId
	 * @return
	 */

	private Long getCategoryFatherIdBySonId(Long categoryId) {


		//根据传进来点击分类的id值，查询其父类的id值
		TContentCategoryExample example=new TContentCategoryExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(categoryId);		
		List<TContentCategory> parentList=tContentCategoryMapper.selectByExample(example);
		Long resultId=null;
		if(parentList!=null&&parentList.size()>0){
			if (parentList.get(0).getParentId()!=1) {
				resultId=getCategoryFatherIdBySonId(parentList.get(0).getParentId());
			}
			else {
				resultId=parentList.get(0).getId();
			}
		}
		

		return resultId;
	}



}
