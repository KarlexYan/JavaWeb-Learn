<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/7
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="stu" class="com.KarlexYan.domain.Student"></jsp:useBean>
<ul>
    <li>
        姓名：
        <jsp:getProperty name="stu" property="name"/>
    </li>
    <li>
        年龄：
        <jsp:getProperty name="stu" property="age"/>
    </li>
    <li>
        性别：
        <jsp:getProperty name="stu" property="gender"/>
    </li>
</ul>
</body>
</html>
