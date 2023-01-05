<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<!--header-->
<div class="header">
    <div class="container">
        <nav class="navbar navbar-default" role="navigation">
            <!--navibar-header-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/index">首页</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            商品分类<b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu multi-column columns-2">
                            <li>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <h4>商品分类</h4>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">热销</a>
                    </li>
                    <li>
                        <a href="#">新品</a>
                    </li>
                    <li>
                        <a href="#">注册</a>
                    </li>
                    <li>
                        <a href="#">登录</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="header-info">
            <div class="header-right search-box">
                <a href="#">
                    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                </a>
                <div class="search">
                    <form class="navbar-form" action="/goods_search">
                        <input type="text" class="form-control" name="keyword">
                        <button type="submit" class="btn btn-default" aria-label="Left Align">搜索</button>
                    </form>
                </div>
            </div>
            <div class="header-right cart">
                <a href="#">
                    <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
                </a>
            </div>
        </div>
    </div>
</div>
<!--content-->
<div class="account">
    <div class="container">
        <div class="register">
            <form action="/rigister" method="post">
                <div class="register-top-grid">
                    <h3>注册新用户</h3>
                    <div class="input">
                        <span>用户名
                            <label style="color: red">*</label>
                        </span>
                        <input type="text" name="username" placeholder="请输入用户名" required>
                    </div>
                    <div class="input">
                        <span>邮箱
                            <label style="color: red">*</label>
                        </span>
                        <input type="text" name="mail" placeholder="请输入邮箱" required>
                    </div>
                    <div class="input">
                        <span>密码
                            <label style="color: red">*</label>
                        </span>
                        <input type="text" name="password" placeholder="请输入密码" required>
                    </div>
                    <div class="input">
                        <span>收货人</span>
                        <input type="text" name="name" placeholder="请输入收货人">
                    </div>
                    <div class="input">
                        <span>收货电话
                        <label style="color: red">*</label>
                        </span>
                        <input type="text" name="phone" placeholder="请输入收货电话" required>
                    </div>
                    <div class="input">
                        <span>收货地址</span>
                        <input type="text" name="address" placeholder="请输入收货地址">
                    </div>
                    <div class="register-but text-center">
                        <input type="submit" value="提交">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<!--footer-->
<div class="footer">
    <div class="container">
        <div class="text-center">
            <p>www.KarlexYan.com @ All rights Reseverd</p>
        </div>
    </div>
</div>
</body>
</html>
