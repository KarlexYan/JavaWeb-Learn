<%@ page import="com.KarlexYan.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/7
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <%
        /*获取用户名和密码*/
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        /*封装到JavaBean对象User*/
        User user = new User(username, password);

        if ("karlexyan".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            // 登录成功
            out.println("登录成功！");
        } else {
            // 登录失败
            out.println("登录失败");
        }
    %>
    <a href="index.jsp">返回</a>
</div>
</body>
</html>
