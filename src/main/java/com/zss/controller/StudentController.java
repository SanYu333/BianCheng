package com.zss.controller;

import com.zss.pojo.Student;
import com.zss.service.StudentService;
import com.zss.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("studentController")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        return "index";
    }


    //分页查询
    @RequestMapping(value = "querys",method = RequestMethod.POST,produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public Object stuQuery(@RequestParam("studentName") String studentName,@RequestParam("indexStu") int indexStu){
        PageUtil<Student> pageUtil = new PageUtil<Student>();

        //总数据量
        pageUtil.setTotalCount(studentService.getStuCount(studentName));

        //总页数
        if (pageUtil.getTotalCount()%pageUtil.getPageSize()==0){
            pageUtil.setTotalPageCount(pageUtil.getTotalCount()/pageUtil.getPageSize());
        }else if (pageUtil.getTotalCount()%pageUtil.getPageSize()!=0){
            pageUtil.setTotalPageCount(pageUtil.getTotalCount()/pageUtil.getPageSize()+1);
        }

        //当前页
        if (indexStu<=1){
            pageUtil.setCurrPageNo(1);
        }else if (indexStu>=pageUtil.getTotalPageCount()){
            pageUtil.setCurrPageNo(pageUtil.getTotalPageCount());
        }else{
            pageUtil.setCurrPageNo(indexStu);
        }

        Map<String,Object> map=new HashMap<>();
        map.put("stuName",studentName);
        map.put("indexStu",(pageUtil.getCurrPageNo()-1)*pageUtil.getPageSize());
        map.put("stuCount",pageUtil.getPageSize());

        pageUtil.setPage_listList(studentService.queryStu(map));

        Object object[]=new Object[2];
        object[0]=pageUtil.getPage_listList();
        object[1]=pageUtil.getCurrPageNo();
        return object;
    }

    @RequestMapping(value = "del",method = RequestMethod.POST,produces={"application/json;charset=UTF-8"})
    @ResponseBody
    //删除
    public Object deleteStu(@RequestParam("studentNo") Integer studentNo){
        int row = studentService.delStu(studentNo);
        if(row==1){
            return "true";
        }else{
            return "false";
        }
    }

    //跳转到添加界面
    @RequestMapping(value = "tiao",method = RequestMethod.GET)
    public String tiaoZhuan(){
        return "add";
    }

    //跳转到修改界面
    @RequestMapping(value = "tiao2",method = RequestMethod.GET)
    public String tiaoZhuan2(){
        return "update";
    }

    //添加
    public Object addStu(Student student){

        return "";
    }


    //修改
    public Object updateStu(){

        return "";
    }
}
