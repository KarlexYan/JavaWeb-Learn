<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${empty param.username}">
        <%--为空--%>
        <c:out value="不能为空"></c:out>
    </c:when>
    <c:when test="${param.username.equals('karlexyan')}">
        ${param.username}+"is Manager"
    </c:when>
    <c:otherwise>
        ${param.username}+"is Employee"
    </c:otherwise>
</c:choose>
</body>
</html>
