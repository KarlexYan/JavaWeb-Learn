<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/7
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="result.jsp" method="post">
  <table width="260px" height="100px" border="1px" align="center">
    <tr>
      <td colspan="2" align="center">
        <b>登录页面</b>
      </td>
    </tr>
    <tr>
      <td>用户名：</td>
      <td><input type="text" name="username"></td>
    </tr>
    <tr>
      <td>密 码：</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td colspan="2" style="text-align: center">
        <input type="submit" value="提交">
      </td>
    </tr>
  </table>
</form>
</body>
</html>
