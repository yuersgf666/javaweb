<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/18
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/UploadHandlerServlet" enctype="multipart/form-data"
    method="post">
        上传用户：<input type="text" name="uname"/><br/>
        上传文件1：<input type="file" name="file1"><br/>
        上传文件2：<input type="file" name="file2"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
