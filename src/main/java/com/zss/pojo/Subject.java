package com.zss.pojo;

import java.util.Date;
/**
 * table name:  subject
 * author name: mj
 * create time: 2019-09-17 09:21:25
 */ 
public class Subject{

	private Integer subjectNo;
	private String subjectName;
	private Integer classHour;
	private Integer gradeID;

	public void setSubjectNo(Integer subjectNo){
		this.subjectNo=subjectNo;
	}
	public Integer getSubjectNo(){
		return subjectNo;
	}
	public void setSubjectName(String subjectName){
		this.subjectName=subjectName;
	}
	public String getSubjectName(){
		return subjectName;
	}
	public void setClassHour(Integer classHour){
		this.classHour=classHour;
	}
	public Integer getClassHour(){
		return classHour;
	}
	public void setGradeID(Integer gradeID){
		this.gradeID=gradeID;
	}
	public Integer getGradeID(){
		return gradeID;
	}
}

