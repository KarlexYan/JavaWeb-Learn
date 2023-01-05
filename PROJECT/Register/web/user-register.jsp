<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<%--  引入header.jsp 导航栏--%>
<jsp:include page="header.jsp"></jsp:include>
<%--  注册页面--%>
<div class="container">
    <div class="register">
        <form action="#" method="post">
            <div class="register-top-grid">
                <h3>注册新用户</h3>
                <div class="input">
                    <span>用户名<label style="color: red">*</label></span>
                    <input type="text" name="username" placeholder="请输入用户名" required="required">
                </div>
                <div class="input">
                    <span>邮箱<label style="color: red">*</label></span>
                    <input type="text" name="mail" placeholder="请输入邮箱" required="required">
                </div>
                <div class="input">
                    <span>密码<label style="color: red">*</label></span>
                    <input type="password" name="password" placeholder="请输入密码" required="required">
                </div>
                <div class="input">
                    <span>收货人</span>
                    <input type="text" name="name" placeholder="请输入收货人">
                </div>
                <div class="input">
                    <span>收货电话<label style="color: red">*</label></span>
                    <input type="text" name="phone" placeholder="请输入收货电话" required>
                </div>
                <div class="input">
                    <span>收货地址</span>
                    <input type="text" name="address" placeholder="请输入收货地址">
                </div>
                <div class="register-but text-center">
                    <input type="submit" value="提交">
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
