<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--注明是一个错误处理页面--%>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>error</title>
</head>
<body>
<%--该页面用于展示错误信息--%>
<%=exception.getMessage()%>
</body>
</html>
