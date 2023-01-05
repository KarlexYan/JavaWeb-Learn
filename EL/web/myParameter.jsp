<%--
  Created by IntelliJ IDEA.
  User: OBITO
  Date: 2023/1/5
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
第一个对象的用户名：${users[0].userName}<br>
年龄为${users[0].age}
<hr>
第二个对象的用户名：${users[1].userName}<br>
年龄为${users[1].age}
<hr>
第一个对象是否为空：${empty users[0]}<br>
第三个对象是否为空：${empty users[2]}<br>
<hr>
characterEncoding:${pageContext.response.characterEncoding}<br>
requestURL:${pageContext.request.requestURL}<br>
serverInfo:${pageContext.servletContext.serverInfo}<br>
servletName:${pageContext.servletConfig.servletName}<br>
</body>
</html>
