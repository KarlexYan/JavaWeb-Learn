<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--存储一个集合--%>
<%
    HashMap<String, String> map = new HashMap<>();
    map.put("tom", "Java");
    map.put("lucy", "Web");
    map.put("Jerry", "Python");
    // 将集合存入request域中
    request.setAttribute("usermap", map);
%>
<%--遍历集合--%>
map:<br/>
<c:forEach items="${usermap}" var="entry">
    ${entry.key}:${entry.value} <br/>
</c:forEach>
</body>
</html>
