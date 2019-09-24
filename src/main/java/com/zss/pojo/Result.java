package com.zss.pojo;

import java.util.Date;
/**
 * table name:  result
 * author name: mj
 * create time: 2019-09-17 09:21:25
 */ 
public class Result{

	private Integer studentNo;
	private Integer subjectNo;
	private Date examDate;
	private Integer studentResult;

	public void setStudentNo(Integer studentNo){
		this.studentNo=studentNo;
	}
	public Integer getStudentNo(){
		return studentNo;
	}
	public void setSubjectNo(Integer subjectNo){
		this.subjectNo=subjectNo;
	}
	public Integer getSubjectNo(){
		return subjectNo;
	}
	public void setExamDate(Date examDate){
		this.examDate=examDate;
	}
	public Date getExamDate(){
		return examDate;
	}
	public void setStudentResult(Integer studentResult){
		this.studentResult=studentResult;
	}
	public Integer getStudentResult(){
		return studentResult;
	}
}

