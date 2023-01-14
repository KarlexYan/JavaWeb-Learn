<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="jquery-3.6.3.js"></script>
</head>
<body>
<section>
    <marquee direction="up" scrollammount="3" id="showInfo">

    </marquee>
</section>
</body>
<script>
    function getInfo() {
        $.get('http://localhost:8080/jQuery/getInfo.jsp', function (data) {
            $('#showInfo').html(data);
        })
    }

    $(document).ready(function () {
        getInfo();
        setInterval("getInfo()", 600000);
    })
</script>
</html>
