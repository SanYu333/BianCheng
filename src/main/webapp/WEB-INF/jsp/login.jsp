<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--使用le表达式--%>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="application/javascript" src="statics/js/jquery-2.1.0.js"></script>
    <style>
        #stuLogin{
            position: absolute;
            left: 40%;
        }
    </style>
</head>
<body>
<form action="studentController" method="get">
   <div id="stuLogin">
<%--       学号：<input type="text" /><br><br>--%>
<%--       密码：<input type="password" /><br><br>--%>
       <input type="submit" value="提交"/>
   </div>

</form>


</body>
</html>