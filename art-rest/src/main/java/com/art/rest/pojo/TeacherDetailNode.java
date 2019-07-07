package com.art.rest.pojo;

import java.util.List;

public class TeacherDetailNode {

	
	private String sort;
	List<TeacherNode> teacher;
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public List<TeacherNode> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<TeacherNode> teacher) {
		this.teacher = teacher;
	}
	
}
