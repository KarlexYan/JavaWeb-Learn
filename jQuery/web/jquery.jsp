<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jQuery使用</title>
    <%--引入本地的jQuery--%>
    <script src="jquery-3.6.3.js"></script>
    <%--引入CDN加速的远程jQuery--%>
    <%--    <script src="https://code.jquery.com/jquery-3.6.3.js"></script>--%>
</head>
<body>
<div id="myId">myId</div>
<button>say hello</button>
<ul>
    <li>0</li>
    <li>1</li>
    <li>2</li>
    <li>3</li>
</ul>
<script>
    // 获取元素内容
    var html = $('#myId').html();  // 输出内容:myId

    // 设置元素的内容
    $('#myId').html('Hello');  // 执行后网页元素内容变为Hello

    // 为button元素绑定单击(click)事件，参数是事件的处理程序
    $('button').click(function () {
        alert("Hello");
    })

    // 链式编程 将多个方法链式调用，将ul中索引为2的li元素的内容设置为Hello
    $('ul').find('li').eq(2).html('Hello');
</script>
</body>
</html>
