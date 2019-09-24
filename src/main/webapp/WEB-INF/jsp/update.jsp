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
    <title>修改</title>
    <script type="application/javascript" src="statics/js/jquery-2.1.0.js"></script>
    <style>
        #juzhong{
            position: absolute;
            left: 40%;

        }
    </style>
</head>
<body>
<h2 align="center">学员修改</h2>

<div id="juzhong">

    学号:<input type="text" id="studentNo" name="studentNo" /><br/><br/>
    姓名:<input type="text" id="loginPwd" name="loginPwd" /><br/><br/>
    密码:<input type="text" id="studentName" name="studentName" /><br/><br/>
    年级:<input type="text" id="sex" name="sex" /><br/><br/>
    性别:<input type="text" id="gradeId" name="gradeId" /><br/><br/>
    联系电话:<input type="text" id="phone" name="phone" /><br/><br/>
    家庭地址:<input type="text" id="address" name="address" /><br/><br/>
    出生时间:<input type="text" id="bornDate" name="bornDate" /><br/><br/>
    邮箱:<input type="text" id="email" name="email" /><br/><br/>
    身份证编号:<input type="text" id="identityCard" name="identityCard" /><br/><br/>
    <input type="submit" value="修改"/>
    <input type="reset" value="重置"/>

</div>

<script type="application/javascript">
    $(function () {
        $("input[type='submit']").click(function () {

        });


    });








</script>



</body>
</html>
