<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--用于展示后端传递过来的数据--%>
用户名：<%=request.getAttribute("username")%><br/>
密 码：<%=request.getAttribute("password")%>

<hr/>
<%--用EL表达式展示数据--%>
用户名：${username}<br/>
密 码：${password}
</body>
</html>
