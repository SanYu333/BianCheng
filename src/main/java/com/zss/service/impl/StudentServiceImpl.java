package com.zss.service.impl;

import com.zss.mapper.StudentMapper;
import com.zss.pojo.Student;
import com.zss.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Map;

@Transactional(propagation = Propagation.REQUIRED)//事务
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int getStuCount(String stuName) {
        return studentMapper.getStuCount(stuName);
    }

    @CachePut(value = "allStudent",key = "list")
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Student> queryStu(Map<String, Object> map) {
        return studentMapper.queryStu(map);
    }

    @CacheEvict(value = "delStudent",key = "int",allEntries = true)
    @Override
    public int delStu(Integer stuNo) {
        return studentMapper.delStu(stuNo);
    }

    @Override
    public int upStu(Integer stuNo) {
        return studentMapper.upStu(stuNo);
    }

    @Override
    public int addStu(Student student) {
        return studentMapper.addStu(student);
    }
}
