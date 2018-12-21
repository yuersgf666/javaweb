<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/20
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href='<%=response.encodeURL("/cookie01.jsp") %>' >主页</a>

<form action='<%=response.encodeURL("/cookie01.jsp") %>' method="post">
    <input type="submit" value="提交"/>
</form>
</body>
</html>
