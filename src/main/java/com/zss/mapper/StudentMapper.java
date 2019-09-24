package com.zss.mapper;

import com.zss.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    //获取总数
    int getStuCount(@Param("stuName") String stuName);

    //查询学生
    List<Student> queryStu(Map<String,Object> map);

    //删除
    int delStu(Integer stuNo);

    //修改
    int upStu(Integer stuNo);

    //添加
    int addStu(Student student);
}
