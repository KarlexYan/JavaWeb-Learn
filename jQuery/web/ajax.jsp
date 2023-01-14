<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
    <script src="jquery-3.6.3.js"></script>
</head>
<body>
<div>
    <div>
        <ul>
            <li>用户名：</li>
            <li><input id="userName" name="userName" type="text"></li>
        </ul>
    </div>
    <div>
        <ul>
            <li>密码：</li>
            <li><input id="password" name="password" type="password"></li>
        </ul>
    </div>
    <div>
        <ul>
            <li>
                <button id="btn">登录</button>
            </li>
        </ul>
    </div>
    <div id="success"></div>
</div>
</body>
<script>
    $('#btn').click(function () {
        $.ajax({
            type: "post",  // 提交方式
            url: 'http://localhost:8080/jQuery/AjaxServlet',  // 访问路径
            data: {  // 提交的数据
                userName: $('#userName').val(),
                password: $('#password').val()
            },
            dataType: "text",  // 返回的数据类型
            success: function (data) {  // 成功的回调函数
                if (data == "true") {
                    $('#success').html("登录成功！");  // 用户名密码都正确
                } else {
                    $('#success').html("登录失败！");  // 有一个不正确就登录失败
                }
            },
            error: function () {  // 失败的回调函数
                alert("请求失败");
            }
        })
    })
</script>
</html>
