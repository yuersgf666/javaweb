<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/26
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>分IP统计访问次数</h1>
<table align="center" width="50%" border="1">
    <tr>
        <th>IP地址</th>
        <th>次数</th>
    </tr>
    <c:forEach items="${applicationScope.ipCountMap }" var="entry">
        <tr>
            <td>${entry.key }</td>
            <td>${entry.value }</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
