<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/8
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h3 align="center">欢迎光临</h3>
<c:choose>
    <c:when test="${sessionScope.user==null}">
        <a href="${pageContext.request.contextPath}/login.jsp">用户登录</a>
    </c:when>
    <c:otherwise>
        欢迎你，${sessionScope.user.username}!
        <a href="${pageContext.request.contextPath}/LogoutServlet">注销</a>
    </c:otherwise>
</c:choose>
</body>
</html>
