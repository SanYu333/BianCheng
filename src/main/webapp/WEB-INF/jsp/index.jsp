<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%--使用le表达式--%>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学员管理--查询及删除</title>
    <script type="application/javascript" src="statics/js/jquery-2.1.0.js"></script>

</head>
<body>
<h1 align="center">欢迎使用学员管理系统</h1>

<table align="center" border="1px soild black" id="stuTable">
    <div style="position: relative;left:44%">
        <input type="text" id="studentName" name="studentName" value="">
        <input type="submit" value="查询">
    </div>
    <tr>
        <td align="center">学生学号</td>
        <td align="center">学生姓名</td>
        <td align="center">学生性别</td>
        <td align="center">联系电话</td>
        <td align="center">家庭地址</td>
        <td align="center">出生时间</td>
        <td align="center">邮箱</td>
        <td align="center">身份证编号</td>
        <td align="center" colspan="3">操作</td>
    </tr>

</table>

<a href="javascript:void(0)" id="uppage">上一页</a>
<a href="javascript:void(0)" id="nextpage">下一页</a>
<input type="hidden" id="indexStu" name="indexStu" value="1"/>

<script type="application/javascript">
    $(function () {
        queryStu();
        $("input[type='submit']").click(function () {
            queryStu();
        });

        $("#uppage").click(function () {
            $("#indexStu").val(Number($("#indexStu").val()) - 1);
            queryStu();
        });

        $("#nextpage").click(function () {
            $("#indexStu").val(Number($("#indexStu").val()) + 1);
            queryStu();
        });

        $(".deleteStudent").click(function () {
            deleteStu($(this).parent().attr("id"));
        });

    });


    function queryStu() {
        $(".queryStu").remove();
        var studentName = $("#studentName").val();
        var indexStu = $("#indexStu").val();
        /* type:提交模式   url：提交的地址  data：提交的参数  dataType：返回结果类型  success：成功后处理  error：异常处理*/
        $.ajax({
            type: "POST",
            url: "studentController/querys",
            data: {
                "studentName": studentName,
                "indexStu": indexStu
            },
            dataType: "json",
            success: function (data) {
                $("#indexStu").val(data[1]);
                $.each(data[0], function (index, value) {
                    var html =
                        "<tr class='queryStu' id='"+value.studentNo+"'>"
                        + "<td>" + value.studentNo + "</td>"
                        + "<td>" + value.studentName + "</td>"
                        + "<td>" + value.sex + "</td>"
                        + "<td>" + value.phone + "</td>"
                        + "<td>" + value.address + "</td>"
                        + "<td>" + value.bornDate + "</td>"
                        + "<td>" + value.email + "</td>"
                        + "<td>" + value.identityCard + "</td>"
                        + "<td><a href=\"javascript:void(0)\" onclick='deleteStu($(this).parent().parent().attr(\"id\"))' class=\"deleteStudent\">删除</a></td>"
                        + "<td><a href=\"studentController/tiao2\" onclick='' class=\"updateStudent\">修改</a></td>"
                        + "<td><a href=\"studentController/tiao\" onclick='' class=\"addStudent\">添加</a></td>"
                        + "</tr>";

                    $("#stuTable").append(html);
                });
            },
            error: function (jqXHR) {
                alert("发生错误：" + jqXHR.status);
            }
        });

    }

    function deleteStu(studentNo) {
        /* type:提交模式   url：提交的地址  data：提交的参数  dataType：返回结果类型  success：成功后处理  error：异常处理*/
        $.ajax({
            type: "POST",
            url: "studentController/del",
            data: {
                "studentNo": studentNo
            },
            dataType: "json",
            success: function (data) {
                 if (data==true){
                     deleteSorC(studentNo);
                     alert("删除成功！");
                 } else {
                     alert("删除失败！");
                 }
            },
            error: function (jqXHR) {
                alert("发生错误：" + jqXHR.status);
            }
        });
    }
    
    function deleteSorC(studentNo) {
        $("#"+studentNo).remove();
    }

    function tiaoZhuan() {

    }

</script>
</body>
</html>

