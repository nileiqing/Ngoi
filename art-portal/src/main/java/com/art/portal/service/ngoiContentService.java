package com.art.portal.service;

public interface ngoiContentService {
	String getPublicationContentListByOrder(Long categortId,int ordertype);
	String getAllContentListByOrder(Long categortId,int ordertype);
	String getContentListByOrder(Long categortId,int ordertype);
    String getContentList(Long categortId);
    String getContentById(Long contentId);
}
