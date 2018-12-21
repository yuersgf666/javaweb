<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/20
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index2</title>
</head>
<body>
<%
    String name = (String) session.getAttribute("uname");
    if(name == null){
        out.print("您还没有登录！");
    }else {
        out.print("用户名：" + name);
    }
%>
<a href="/index1.jsp">index1</a>
</body>
</html>
