<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="text-align: center">
<form action="${pageContext.request.contextPath}/param.jsp">
    num1:<input type="text" name="num1"><br/>
    num2:<input type="text" name="num"><br/>
    num3:<input type="text" name="num"><br/>
    num4:<input type="text" name="num"><br/>
    <input type="submit" value="提交">&nbsp;&nbsp;
    <input type="reset" value="重置"><br>
</form>
num1:${param.num1}<br/>
num2:${paramValues.num[0]}<br/>
num3:${paramValues.num[1]}<br/>
num4:${paramValues.num[2]}<br/>
</body>
</html>
