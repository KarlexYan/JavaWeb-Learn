<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/4
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>声明标识</title>
</head>
<body>
<%--声明标识 可以定义方法和变量--%>
<%!
    public int add(int a, int b) {
        return a + b;
    }
%>
<%--代码片段 可以调用方法--%>
<%
    out.println(add(1, 4));
%>
</body>
</html>
