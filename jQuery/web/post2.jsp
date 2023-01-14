<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 18:22
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
<script>
    // 调用$.post()方法发送数据
    $('#btn').click(function () {
        var userData = {username: 'karlexyan', password: 123};
        $.post('http://localhost:8080/jQuery/Load2Servlet', userData, function (data) {
            $('#box').html(data);
        }, 'html')
    })
</script>
</body>
</html>
