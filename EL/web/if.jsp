<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${param.action=='mon'}">
    周一了，工作的第一天
</c:if>
<c:if test="${param.action=='tue'}">
    周二了，工作的第二天
</c:if>
<c:if test="${param.action=='web'}">
    周三了，工作的第三天
</c:if>
<c:if test="${param.action=='thu'}">
    周四了，工作的第四天
</c:if>
<c:if test="${param.action=='fri'}">
    周五了，工作的第五天
</c:if>
<c:if test="${param.action=='sat'}">
    周六了，摆烂的第一天
</c:if>
<c:if test="${param.action=='sun'}">
    周日了，摆烂的第一天
</c:if>
</body>
</html>
