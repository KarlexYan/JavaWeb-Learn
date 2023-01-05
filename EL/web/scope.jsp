<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("userName", "lisi");
%>
pageScore取值：${pageScope.userName}<br>
requestScope取值：${requestScope.userName}<br>
sessionScope取值：${sessionScope.userName}<br>
applicationScope取值：${applicationScope.userName}<br>
默认取值：${userName}<br>
<%-- 取值从小到大 pageScope->requestScope->sessionScope->applicationScope --%>
</body>
</html>
