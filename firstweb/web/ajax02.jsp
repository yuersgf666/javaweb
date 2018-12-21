<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/25
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
</head>
<body>
<h1>注册</h1>
<form action="" method="post">
    用户名：<input id="username" type="text" name="username" onblur="send()"/><span id="error" ></span><br/>
    密　码：<input type="text" name="password"/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
<script type="text/javascript">
    function createXMLHttpRequest() {
        try {
            return new XMLHttpRequest();//大多数浏览器
        } catch (e) {
            try {
                return new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e) {
                return new ActiveXObject("Microsoft.XMLHTTP");
            }
        }
    }
    function send() {
        var xmlHttp = createXMLHttpRequest();
        xmlHttp.onreadystatechange = function () {
            if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
                if(xmlHttp.responseText == "true"){
                    document.getElementById("error").innerHTML = "用户名已被注册！";
                }else {
                    document.getElementById("error").innerHTML = "";
                }
                var div = document.getElementById("div1");
                div.innerHTML = xmlHttp.responseText;
            }
        };
        xmlHttp.open("POST","/AjaxServlet02", true)
        xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        var username = document.getElementById("username").value;
        xmlHttp.send("username=" + username);
    }

</script>
</html>
