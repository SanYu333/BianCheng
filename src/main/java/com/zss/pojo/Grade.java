package com.zss.pojo;

/**
 * table name:  grade
 * author name: mj
 * create time: 2019-09-17 09:21:25
 */ 
public class Grade{

	private Integer gradeID;
	private String gradeName;

	public void setGradeID(Integer gradeID){
		this.gradeID=gradeID;
	}
	public Integer getGradeID(){
		return gradeID;
	}
	public void setGradeName(String gradeName){
		this.gradeName=gradeName;
	}
	public String getGradeName(){
		return gradeName;
	}
}

