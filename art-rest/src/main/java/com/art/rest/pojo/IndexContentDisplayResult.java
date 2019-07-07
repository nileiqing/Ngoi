package com.art.rest.pojo;

import java.util.List;

public class IndexContentDisplayResult {

	//公告集合
	private List<?> notice;
	//新闻集合
	private List<?> news;
	//Online Design在线展示
	private List<?> onlineshow;
	//学院动态
	private List<?> trend;
	//Online Design展览讲座
	private List<?> display;
	//Online Design推荐站点
	private List<?> site;

	public List<?> getNotice() {
		return notice;
	}

	public void setNotice(List<?> notice) {
		this.notice = notice;
	}

	public List<?> getNews() {
		return news;
	}

	public void setNews(List<?> news) {
		this.news = news;
	}

	public List<?> getOnlineshow() {
		return onlineshow;
	}

	public void setOnlineshow(List<?> onlineshow) {
		this.onlineshow = onlineshow;
	}

	public List<?> getTrend() {
		return trend;
	}

	public void setTrend(List<?> trend) {
		this.trend = trend;
	}

	public List<?> getDisplay() {
		return display;
	}

	public void setDisplay(List<?> display) {
		this.display = display;
	}

	public List<?> getSite() {
		return site;
	}

	public void setSite(List<?> site) {
		this.site = site;
	}
	
}
