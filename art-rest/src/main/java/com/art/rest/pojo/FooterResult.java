package com.art.rest.pojo;

import java.util.List;

public class FooterResult {
	
	private Footerleft footerleft;
	private List<?> footercenter;
	private List<?> footerright;
	
	public Footerleft getFooterleft() {
		return footerleft;
	}
	public void setFooterleft(Footerleft footerleft) {
		this.footerleft = footerleft;
	}
	public List<?> getFootercenter() {
		return footercenter;
	}
	public void setFootercenter(List<?> footercenter) {
		this.footercenter = footercenter;
	}
	public List<?> getFooterright() {
		return footerright;
	}
	public void setFooterright(List<?> footerright) {
		this.footerright = footerright;
	}
	
}
