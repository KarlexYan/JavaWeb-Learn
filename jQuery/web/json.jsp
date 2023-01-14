<%--
  Created by IntelliJ IDEA.
  User: KarlexYan
  Date: 2023/1/14
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON</title>
    <script src="jquery-3.6.3.js"></script>
</head>
<body>
<button id="btn">加载数据</button>
<table id="dataTable" border="1" cellpadding="0" cellspacing="0">
    <tr>
        <td>作者</td>
        <td>书名</td>
        <td>价格</td>
    </tr>
</table>
<script>
    $('#btn').click(function () {
        $.getJSON('http://localhost:8080/jQuery/JSONServlet', function (data) {
            var html = '';
            for (var Book in data) {
                html += '<tr>';
                for (var key in data[Book]) {
                    html += '<td>' + data[Book][key] + '</td>';
                }
                html += '</tr>';
            }
            $('#dataTable').append(html);
        });
    })
</script>
</body>
</html>
