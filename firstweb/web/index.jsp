<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/8/10
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login窗口</title>
  </head>

  <body>
    <form action="/RegistServlet" method="post">
      <input type="text" name="uname" value=""><br/>
      <input type="password" name="pwd" value=""><br/>
      验证码：<input type="text" name="code" size="3"/>
      <img src="/VerifyCodeServlet" id="vCode">
      <a href="javascript:change()">看不清，换一张</a>
      <br/>
      <input type="submit" value="Login">
    </form>
  </body>
  <script type="text/javascript">
      function change() {
          var imgEle = document.getElementById("vCode");
          imgEle.src = "/VerifyCodeServlet?" + new Date().getTime();
      }
  </script>
</html>
