<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$.post()方法请求数据</title>
    <script src="jquery-3.6.3.js"></script>
</head>
<body>
<button id="btn">加载数据</button>
<div id="box"></div>
<script>
    // 调用$.get()方法请求数据
    $('#btn').click(function () {
        $.post('http://localhost:8080/jQuery/target.jsp', function (data) {
            $('#box').html(data);
        }, 'html')
    })
</script>
</body>
</html>
