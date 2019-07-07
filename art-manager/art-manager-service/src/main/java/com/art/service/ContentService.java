package com.art.service;

import java.util.List;

import com.art.common.pojo.ArtResult;
import com.art.common.pojo.EUDataGridResult;
import com.art.pojo.TContent;

public interface ContentService {

	ArtResult  insertContent(TContent content);//插入新的内容
	
	EUDataGridResult getContentList(long categoryId,int page,int rows);//根据categoryId分页查询对应的内容列表
	
	ArtResult updateContent(TContent content);//更新对应的内容
	
	ArtResult deleteConent(List<Long> ids);//根据id删除对应的内容
}
