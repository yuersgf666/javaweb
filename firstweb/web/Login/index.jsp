<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/20
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>主页</h1>
<hr/>
<c:choose>
    <c:when test="${empty sessionScope.user }">
        您还没有登录
    </c:when>
    <c:otherwise>
        用户名：${sessionScope.user.username }
        <a href="<c:url value='/QuitServlet'/>">退出</a>
    </c:otherwise>
</c:choose>
</body>
</html>
