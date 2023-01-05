<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 页面域 存值
    pageContext.setAttribute("str", "Java");
    // 页面域 取值
    String str = (String) pageContext.getAttribute("str");

    // 请求域 存值
    ServletRequest request1 = pageContext.getRequest();
    request1.setAttribute("str", "JavaWeb");
    // 请求域 取值
    String str1 = (String) request1.getAttribute("str");
%>

<%
    out.println("page范围：" + str + "<br>");
    out.println("request1范围：" + str1 + "<br>");
%>
</body>
</html>
