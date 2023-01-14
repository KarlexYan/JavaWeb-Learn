<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-3.6.3.js"></script>
</head>
<body>
<button id="btn">加载数据</button>
<div id="box"></div>
<script type="text/javascript">
    $('#btn').click(function () {
        $('#box').load('http://localhost:8080/jQuery/target.jsp');
    })
</script>
</body>
</html>
