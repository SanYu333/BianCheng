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
    <title>添加</title>
    <script type="application/javascript" src="statics/js/jquery-2.1.0.js"></script>
    <style>
        #juzhong {
            position: absolute;
            left: 40%;

        }
    </style>
</head>
<body>
<h2 align="center">学员添加</h2>

<div id="juzhong">

    学号:<input type="text" id="studentNo" name="studentNo"/><br/><br/>
    姓名:<input type="text" id="loginPwd" name="loginPwd"/><br/><br/>
    密码:<input type="text" id="studentName" name="studentName"/><br/><br/>
    年级:<input type="text" id="sex" name="sex"/><br/><br/>
    性别:<input type="text" id="gradeId" name="gradeId"/><br/><br/>
    联系电话:<input type="text" id="phone" name="phone"/><br/><br/>
    家庭地址:<input type="text" id="address" name="address"/><br/><br/>
    出生时间:<input type="text" id="bornDate" name="bornDate"/><br/><br/>
    邮箱:<input type="text" id="email" name="email"/><br/><br/>
    身份证编号:<input type="text" id="identityCard" name="identityCard"/><br/><br/>
    <input type="submit" value="提交"/>
    <input type="reset" value="重置"/>

</div>

<script type="application/javascript">
    $(function () {
        $("input[type='submit']").click(function () {
                addStu();
        });


    });

    function addStu() {
        var studentNo = $("#studentNo").val();
        var loginPwd = $("#loginPwd").val();
        var studentName = $("#studentName").val();
        var sex = $("#sex").val();
        var gradeId = $("#gradeId").val();
        var phone = $("#phone").val();
        var address = $("#address").val();
        var bornDate = $("#bornDate").val();
        var email = $("#email").val();
        var identityCard = $("#identityCard").val();

        $.ajax({
            type: "POST",
            url: "studentController/add",
            data: {
                "studentNo": studentNo,
                "loginPwd": loginPwd,
                "studentName": studentName,
                "sex": sex,
                "gradeId": gradeId,
                "phone": phone,
                "address": address,
                "bornDate": bornDate,
                "email": email,
                "identityCard": identityCard
            },
            dataType: "json",
            success: function (data) {
                if (data == true) {
                    alert("添加成功！");
                } else {
                    alert("添加失败！");
                }
            },
            error: function (jqXHR) {
                alert("发生错误：" + jqXHR.status);
            }
        });

    }


</script>


</body>
</html>
