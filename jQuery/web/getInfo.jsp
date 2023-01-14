<%@ page import="com.KarlexYan.DBUtils.DBConnection" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/15
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <%
        ResultSet rs = DBConnection.searchTitle("select title from info order by id desc");
        if (rs.next()) {
            do {
                out.print("<li>" + rs.getString(1) + "</li>");
            } while (rs.next());
        } else {
            out.print("<li>暂无公告</li>");
        }
    %>
</ul>
</body>
</html>
