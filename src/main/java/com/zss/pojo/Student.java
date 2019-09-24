package com.zss.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * table name:  student
 * author name: mj
 * create time: 2019-09-17 09:21:25
 */ 
public class Student implements Serializable {

	private Integer studentNo;
	private String loginPwd;
	private String studentName;
	private String sex;
	private Integer gradeId;
	private String phone;
	private String address;
	private Date bornDate;
	private String email;
	private String identityCard;

	public void setStudentNo(Integer studentNo){
		this.studentNo=studentNo;
	}
	public Integer getStudentNo(){
		return studentNo;
	}
	public void setLoginPwd(String loginPwd){
		this.loginPwd=loginPwd;
	}
	public String getLoginPwd(){
		return loginPwd;
	}
	public void setStudentName(String studentName){
		this.studentName=studentName;
	}
	public String getStudentName(){
		return studentName;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	public void setGradeId(Integer gradeId){
		this.gradeId=gradeId;
	}
	public Integer getGradeId(){
		return gradeId;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setBornDate(Date bornDate){
		this.bornDate=bornDate;
	}
	public Date getBornDate(){
		return bornDate;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setIdentityCard(String identityCard){
		this.identityCard=identityCard;
	}
	public String getIdentityCard(){
		return identityCard;
	}
}

