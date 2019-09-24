package com.zss.service;

import com.zss.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    //获取总数
    int getStuCount(String stuName);

    //查询学生
    List<Student> queryStu(Map<String,Object> map);

    //删除
    int delStu(Integer stuNo);

    //修改
    int upStu(Integer stuNo);

    //添加
    int addStu(Student student);
}
