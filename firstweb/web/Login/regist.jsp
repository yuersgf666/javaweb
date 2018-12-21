<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/20
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>注册</h1>
<hr/>
<p style="font-weight: 900; color: red;">${msg }</p>
<form action="<c:url value='/RegistServlet'/>" method="post">
    用户名：<input type="text" name="username" value="${user.username }" /><br/>
    密　码：<input type="password" name="password"/><br/>
    确认密码：<input type="password" name="repassword"/><br/>
    验证码：<input type="text" name="registCode" size="2"/>
    <img id="vCode" src="<c:url value='/VerifyCodeServlet?name=registCode'/>" border="2"/>
    <a href="javascript:_change()" style="font-size: 12;">看不清，换一张</a><br/>
    <input type="submit" value="注册"/>
</form>
</body>
<script type="text/javascript">
    function _change() {
        var img = document.getElementById("vCode");
        img.src = "<c:url value='/VerifyCodeServlet?name=registCode&'/>" + new Date().getTime();
    }
</script>
</html>
