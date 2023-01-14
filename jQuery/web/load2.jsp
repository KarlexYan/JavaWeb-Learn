<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>异步请求</title>
    <script src="jquery-3.6.3.js"></script>
</head>
<body>
<button id="btn">加载数据</button>
<div id="box"></div>
<script>
    $('#btn').click(function () {
        // load()方法的三个参数，分别为 url，传入的参数，回调函数
        $('#box').load('http://localhost:8080/jQuery/Load2Servlet',
            {username: 'karlexyan', password: "123"},
            function (responseData, status, xhr) {
                console.log(responseData);  //输出请求的数据
                console.log(status);  // 输出请求状态
                console.log(xhr)  // 输出XMLHttpRequest对象
            })
    });
</script>
</body>
</html>
