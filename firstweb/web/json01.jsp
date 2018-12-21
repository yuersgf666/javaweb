<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/25
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button onclick="send()">测试</button>
<div id="div1"></div>
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
                    var div = document.getElementById("div1");
                    div.innerHTML = xmlHttp.responseText;
                }
            };
            xmlHttp.open("POST","/JsonServlet", true)
            xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xmlHttp.send("b=B");
        }
    </script>
</html>
