package com.art.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import com.art.mapper.TContentCategoryMapper;
import com.art.mapper.TContentMapper;
import com.art.pojo.TContent;
import com.art.pojo.TContentCategory;
import com.art.pojo.TContentCategoryExample;
import com.art.pojo.TContentExample;
import com.art.pojo.TContentExample.Criteria;
import com.art.rest.pojo.ContentCatResult;
import com.art.rest.pojo.DetailListNode;
import com.art.rest.pojo.DetailListNodeResult;
import com.art.rest.pojo.DetailListResult;
import com.art.rest.pojo.FootCenterNode;
import com.art.rest.pojo.FooterResult;
import com.art.rest.pojo.FooterRightNode;
import com.art.rest.pojo.Footerleft;
import com.art.rest.pojo.IndexContentDisplayResult;
import com.art.rest.pojo.SlideImgNode;
import com.art.rest.pojo.SlideList;
import com.art.rest.serivce.ContentCategoryService;
import com.art.rest.serivce.ContentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ContentServiceImpl implements ContentService{

	@Autowired
	private TContentMapper tContentMapper;
	
	@Autowired
	private TContentCategoryMapper tContentCategoryMapper;

	@Autowired
	private ContentCategoryService contentCategoryService;

	
	//从配置文件中读取首页分页内容
	@Value("${notice}")
	private String notice;
	@Value("${news}")
	private String news;
	@Value("${OnlineDesignshow}")
	private String OnlineDesignshow;
	@Value("${school}")
	private String school;
	@Value("${OnlineDesignTopic}")
	private String OnlineDesignTopic;
	@Value("${OnlineDesignSite}")
	private String OnlineDesignSite;
	
	/***
	 * 根据分类Id获取该类别下的所有内容
	 */
	
	@Override
	public DetailListNodeResult getContentListByCategoryId(long CategoryId) {
		// TODO Auto-generated method stub
		TContentExample example=new TContentExample();
		TContentExample.Criteria criteria=example.createCriteria();
		//criteria.andCategoryIdEqualTo(CategoryId);
		criteria.andIdEqualTo(CategoryId);
		List<TContent>list=tContentMapper.selectByExampleWithBLOBs(example);
		DetailListNodeResult detailListNodeResult=new DetailListNodeResult();
		if (list!=null&&list.size()>0) {
			DetailListNode detailListNode=new DetailListNode();
			detailListNode.setId(list.get(0).getId());
			detailListNode.setName(list.get(0).getTitle());
			detailListNode.setTime(list.get(0).getCreated());
			detailListNode.setContent(list.get(0).getContent());
			detailListNodeResult.setData(detailListNode);
			return detailListNodeResult;
		}	
		return null;
	}
	/***
	 * 根据查询关键词获取对应内容
	 */
	@Override
	public DetailListResult getContentListByKeyword(String keyword) {
		if(keyword==""||keyword==null){
			return null;
		}
		// TODO Auto-generated method stub
		TContentExample example=new TContentExample();
		TContentExample.Criteria criteria=example.createCriteria();
		
		keyword = "%" + keyword + "%";  
		criteria.andTitleLike(keyword);
		List<TContent> list=tContentMapper.selectByExampleWithBLOBs(example);
		ArrayList<DetailListNode> detailListNodeResult=new ArrayList<>();
		if (list!=null&&list.size()>0) {
			for(int i=0;i<list.size();i++){
				DetailListNode detailListNode=new DetailListNode();
				detailListNode.setId(list.get(i).getId());
				detailListNode.setName(list.get(i).getTitle());
				detailListNode.setTime(list.get(i).getCreated());
				detailListNode.setContent(list.get(i).getContent());
				detailListNodeResult.add(detailListNode);
			}
			DetailListResult  detailListResult_n=new DetailListResult();
			detailListResult_n.setData(detailListNodeResult);
			detailListResult_n.setSort("搜索结果");
			return detailListResult_n;
		}	
		return null;
	}
	@Override
	public IndexContentDisplayResult getContentDisplay() {
		// TODO Auto-generated method stub
		return getContentDisplayFunction();
	}

	//获取首页需要显示的内容
	private IndexContentDisplayResult getContentDisplayFunction() {
		IndexContentDisplayResult indexContentDisplayResult=new IndexContentDisplayResult();

		indexContentDisplayResult.setNotice(getContentByClassName(notice));
		indexContentDisplayResult.setNews(getContentByClassName(news));
		indexContentDisplayResult.setOnlineshow(getContentByClassName(OnlineDesignshow));
		indexContentDisplayResult.setTrend(getContentByClassName(school));
		indexContentDisplayResult.setDisplay(getContentByClassName(OnlineDesignTopic));
		indexContentDisplayResult.setSite(getContentSite(OnlineDesignTopic));
		/*indexContentDisplayResult.setNotice(getContentByClassName("公告"));
		indexContentDisplayResult.setNews(getContentByClassName("新闻咨询"));
		indexContentDisplayResult.setOnlineshow(getContentByClassName("Online Design在线展示"));
		indexContentDisplayResult.setTrend(getContentByClassName("学院特色"));
		indexContentDisplayResult.setDisplay(getContentByClassName("Online Design展览讲座"));
		indexContentDisplayResult.setSite(getContentSite("Online Design推荐站点"));*/
		return indexContentDisplayResult;
	}

	
	private List getContentListByCategoryName(String categoryName){
		if(categoryName==null||categoryName.equals(""))
			return null;
		
		List<?> list=new ArrayList<>();
		//如果是学院特色，查找数据库中title_desc字段为1的信息
		if(categoryName.equals("学院特色")){
			TContentExample example1=new TContentExample();

			example1.setOrderByClause("created desc");
			Criteria criteria1=example1.createCriteria();
			criteria1.andTitleDescEqualTo("1");
			list=tContentMapper.selectByExample(example1);
			return list;
		}
		
		//获取类名为公告的id值
//		if(categoryName.equals("公告")){
//			categoryName="学院通知";
//		}
		
		Long noticeId=contentCategoryService.getCategoryIdByName(categoryName);
		if(noticeId==null)
			return list;
		TContentExample example=new TContentExample();

		example.setOrderByClause("created desc");
		Criteria criteria=example.createCriteria();
		criteria.andCategoryIdEqualTo(noticeId);
	    list=tContentMapper.selectByExample(example);
		return list;
	}
	
	/***
	 * 根据类名获取对应的推荐站点的5条记录
	 * @param categoryName 分类名称
	 * @return
	 */
	private List getContentSite(String categoryName){
		List tempList=new ArrayList<>();
		
		List<TContent> list=getContentListByCategoryName(categoryName);
		//截取5条放到集合中
		if (list!=null&&list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (i==6)
					break;
				ContentCatResult contentCatResult=new ContentCatResult();
				contentCatResult.setId(list.get(i).getId());
				contentCatResult.setName(list.get(i).getTitle());
				contentCatResult.setUrl(list.get(i).getUrl());
				contentCatResult.setTime(list.get(i).getUpdated());
				tempList.add(contentCatResult);
			}
		}
		
		return tempList;
	}
	
	/***
	 * 根据类名获取对应内容
	 * @param categoryName
	 * @return
	 */
	private List getContentByClassName(String categoryName){
		if(categoryName==null||categoryName.equals(""))
			return null;
		List tempList=new ArrayList<>();
		
		List<TContent> list=getContentListByCategoryName(categoryName);
		//截取5条放到集合中
		if (list!=null&&list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				if (i==5)
					break;
				ContentCatResult contentCatResult=new ContentCatResult();
				contentCatResult.setId(list.get(i).getId());
				contentCatResult.setName(list.get(i).getTitle());
				contentCatResult.setUrl("/content/"+list.get(i).getId()+".html");
				contentCatResult.setTime(list.get(i).getUpdated());
				tempList.add(contentCatResult);
			}
		}
		
		return tempList;
	}

	/***
	 * 图片描述对应数据库中的title字段
	 * 图片链接对应数据库中的pic字段
	 */
	@Override
	public SlideList getSlidenavbar() {
		// TODO Auto-generated method stub
		
		List<TContent> list=getContentListByCategoryName("大广告");
		if(list!=null&&list.size()>0){
			SlideList slideList=new SlideList();
			List tempList=new ArrayList<>();
			for (TContent tContent : list) {
				SlideImgNode slideImgNode=new SlideImgNode();
				slideImgNode.setAlt(tContent.getTitle());
				slideImgNode.setSrcB(tContent.getPic());
				tempList.add(slideImgNode);
			}
			slideList.setSlidenavbar(tempList);
			return slideList;
		}
		
		return null;
	}

	@Override
	public FooterResult getFooterResult() {		
		FooterResult footerResult=new FooterResult();		
		//左下角的Logo及地址
		// TODO Auto-generated method stub
		List<TContent> footerLeftList=getContentListByCategoryName("Logo及地址");
		Footerleft footerleft=new Footerleft();
		/***
		 * title 对应电话
		 * subtitle  对应传真
		 * titledesc 对应地址
		 * pic  对应图片
		 */
		if (footerLeftList!=null&&footerLeftList.size()>0) {
			footerleft.setTel(footerLeftList.get(0).getTitle());
			footerleft.setFax(footerLeftList.get(0).getSubTitle());
			footerleft.setAddress(footerLeftList.get(0).getTitleDesc());
			footerleft.setImg(footerLeftList.get(0).getPic());
		}
		footerResult.setFooterleft(footerleft);
		
		//获得相关链接部分
		List<TContent> footerCenterList=getContentListByCategoryName("相关链接");
		List footerCenterTempList=new ArrayList<>();
		if (footerCenterList!=null&&footerCenterList.size()>0) {
			for (int i = 0; i < footerCenterList.size(); i++) {
				FootCenterNode footCenterNode=new FootCenterNode();
				footCenterNode.setName(footerCenterList.get(i).getTitle());
				footCenterNode.setUrl(footerCenterList.get(i).getUrl());
				
				footerCenterTempList.add(footCenterNode);
			}															
			footerResult.setFootercenter(footerCenterTempList);
		}
		
		//获取关注我们部分
		List<TContent> footerRightList=getContentListByCategoryName("关注我们");
		if(footerRightList!=null&&footerRightList.size()>0){
			List footerRightTempList=new ArrayList<>();
			/*for (int i = 0; i < footerRightList.size(); i++) {
				FooterRightNode footerRightNode=new FooterRightNode();
				footerRightNode.setTit(footerRightList.get(i).getTitle());
				footerRightNode.setImg(footerRightList.get(i).getPic());
				footerRightTempList.add(footerRightNode);
			}*/
			FooterRightNode footerRightNode=new FooterRightNode();
			footerRightNode.setTit(footerRightList.get(0).getTitle());
			footerRightNode.setImg(footerRightList.get(0).getPic());
			footerRightNode.setImg1(footerRightList.get(0).getPic2());
			footerRightTempList.add(footerRightNode);
			footerResult.setFooterright(footerRightTempList);
		}
		
		return footerResult;
	}
	
	@Override
	public DetailListResult getDetailListWithPage(Integer currentPage)
	{
		// TODO Auto-generated method stub
		//先获取对应的对应的分类id
		//获取类名为公告的id值	
	
			currentPage=currentPage== null?1:currentPage;
			int pageSize=10;
			TContentExample example=new TContentExample();
			PageHelper.startPage(currentPage, pageSize);
			Criteria criteria=example.createCriteria();
			criteria.andTitleDescEqualTo("1");
			//criteria.andCategoryIdEqualTo(noticeId);
			List<TContent> list=tContentMapper.selectByExampleWithBLOBs(example);
			
			
			DetailListResult detailListResult=new DetailListResult();
			List tempList=new ArrayList<>();
			if (list!=null&&list.size()>0) {
				//包装list，获取总条数
				PageInfo<TContent> result=new PageInfo<>(list);	
				detailListResult.setCurrentpage(currentPage);
				detailListResult.setPagecount(result.getTotal());
				detailListResult.setSort("学院特色");
				//将对象集合进行包装
				for (int i = 0; i <list.size(); i++) {
					DetailListNode detailListNode=new DetailListNode();
					detailListNode.setId(list.get(i).getId());
					detailListNode.setName(list.get(i).getTitle());
					detailListNode.setTime(list.get(i).getCreated());
					detailListNode.setContent(list.get(i).getContent());
					tempList.add(detailListNode);
				}
			}
			
			detailListResult.setData(tempList);
			return detailListResult;	
		//}
		//return null;
	}
	
	
	
	
	
	/***
	 * 根据当前页查询对应的记录
	 */
	@Override
	public DetailListResult getDetailListWithPage(Integer currentPage,String sort)
	{
		// TODO Auto-generated method stub
		//先获取对应的对应的分类id
		//获取类名为公告的id值	
		if (sort!=null&&sort.length()>0) {
			Long noticeId=contentCategoryService.getCategoryIdByName(sort);
			if (noticeId==null) {
				return null;
			}
			currentPage=currentPage== null?1:currentPage;
			int pageSize=10;
			TContentExample example=new TContentExample();
			PageHelper.startPage(currentPage, pageSize);
			Criteria criteria=example.createCriteria();
			criteria.andCategoryIdEqualTo(noticeId);
			List<TContent> list=tContentMapper.selectByExampleWithBLOBs(example);
			
			
			DetailListResult detailListResult=new DetailListResult();
			List tempList=new ArrayList<>();
			if (list!=null&&list.size()>0) {
				//包装list，获取总条数
				PageInfo<TContent> result=new PageInfo<>(list);	
				detailListResult.setCurrentpage(currentPage);
				detailListResult.setPagecount(result.getTotal());
				detailListResult.setSort(sort);
				//将对象集合进行包装
				for (int i = 0; i <list.size(); i++) {
					DetailListNode detailListNode=new DetailListNode();
					detailListNode.setId(list.get(i).getId());
					detailListNode.setName(list.get(i).getTitle());
					detailListNode.setTime(list.get(i).getCreated());
					detailListNode.setContent(list.get(i).getContent());
					tempList.add(detailListNode);
				}
			}
			detailListResult.setData(tempList);
			return detailListResult;	
		}
		return null;
	}
	
	/***
	 * 刘晓峰
	 * 根据当前页查询对应的记录
	 */
	@Override
	public DetailListResult getDetailListWithPageandid(Long categoryId,Integer currentPage ) {
		// TODO Auto-generated method stub
		//先获取对应的对应的分类id
		//获取类名为公告的id值	
			currentPage=currentPage== null?1:currentPage;
			int pageSize=10;
			TContentExample example=new TContentExample();
			PageHelper.startPage(currentPage, pageSize);
			Criteria criteria=example.createCriteria();
			criteria.andCategoryIdEqualTo(categoryId);
			List<TContent> list=tContentMapper.selectByExampleWithBLOBs(example);
			
			//根据分类id获取分类名称
			TContentCategoryExample example2=new TContentCategoryExample();
			TContentCategoryExample.Criteria criteria2=example2.createCriteria();
			criteria2.andIdEqualTo(categoryId);
			List<TContentCategory> categoryList=tContentCategoryMapper.selectByExample(example2);
			
			String sort=categoryList.get(0).getName();
			
			DetailListResult detailListResult=new DetailListResult();
			List tempList=new ArrayList<>();
			if (list!=null&&list.size()>0) {
				//包装list，获取总条数
				PageInfo<TContent> result=new PageInfo<>(list);	
				detailListResult.setCurrentpage(currentPage);
				
				//得到分页的总数
				Long total=result.getTotal();
				Long pageCount=null;
				if(total%10==0){
					pageCount=total/10;
				}
				else{
					pageCount=total/10+1;
				}
				
				detailListResult.setPagecount(pageCount);
				detailListResult.setSort(sort);
				//将对象集合进行包装
				for (int i = 0; i <list.size(); i++) {
					DetailListNode detailListNode=new DetailListNode();
					detailListNode.setId(list.get(i).getId());
					detailListNode.setName(list.get(i).getTitle());
					detailListNode.setTime(list.get(i).getCreated());
					detailListNode.setContent(list.get(i).getContent());
					tempList.add(detailListNode);
				}
			}
			detailListResult.setData(tempList);
			return detailListResult;	
	}
}
