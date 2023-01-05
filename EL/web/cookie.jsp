<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
cookie对象信息：${cookie.userName}<br/>
cookie对象的名称：${cookie.userName.name}<br/>
cookie对象的值：${cookie.userName.value}
<%
    response.addCookie(new Cookie("userName", "zhangsan"));
%>
</body>
</html>
