<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>initParam使用</title>
</head>
<body>
<%--直接在web.xml读取配置里写好的参数--%>
Author：${initParam.author}
</body>
</html>
