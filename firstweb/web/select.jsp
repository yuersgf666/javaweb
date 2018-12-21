<%--
  Created by IntelliJ IDEA.
  User: yuers
  Date: 2018/9/25
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>省市联动</h1>
省：
<select name="province" id="province">
    <option>===请选择===</option>
</select>
市：
<select name="city" id="city">
    <option>===请选择===</option>
</select>
</body>
<script>
   /* var person = {"name":"zhangSan", "age":"18", "sex":"male"};
    alert(person.name + ", " + person.age + ", " + person.sex);*/

   /* var person = {"name":"zhangSan", "age":"18", "sex":"male", "hobby":["cf", "sj", "ddm"]};
    alert(person.name + ", " + person.age + ", " + person.sex + ", " + person.hobby);*/
   var person = {"name":"zhangSan", "getName":function() {return this.name;}};
   alert(person.name);
   alert(person.getName());
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
    // 文档加载完成后
    // 加载所有省份名称
    window.onload = function () {
        /*
         请求服务器，加载所有省名称到<select>中
         */
        /*
         1. ajax四步
         */
        var xmlHttp = createXMLHttpRequest();
        xmlHttp.onreadystatechange = callback;//服务器响应完成后执行callback函数
        xmlHttp.open("POST", "/ProvinceServlet", true);//向服务器发送GET请求
        xmlHttp.send(null);//发送请求
    }
    function callback() {
        if (this.readyState == 4 && this.status == 200) {
            // 把服务器响应的省份名称，使用逗号分割成字符串数组
            var provinceNameArray = this.responseText.split(", ");
            // 遍历每个省份名称，使用每个省份名称创建<option>元素，添加到province的<select>中
            for (var i = 0; i < provinceNameArray.length; i++) {
                addProvinceOption(provinceNameArray[i]);
            }
            // 为province的<select>元素添加onchange事件监听
            document.getElementById("province").onchange = loadCities;
        }
    }
    // 本函数在province的<select>元素发送变化时执行！
    // 本函数会使用当前选中的省份名称为参数，向服务器发送请求，获取当前省份下的所有城市！
    function loadCities() {
        var proName = this.value;//获取<select>选择的省份名称
        /*
         AJAX4步
         */
        var xmlHttp = createXMLHttpRequest();//创建异常对象
        // 指定回调函数
        xmlHttp.onreadystatechange = function() {
            if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                // 得到服务器响应的xml文档对象
                var doc = xmlHttp.responseXML;//注意，这里使用的是resopnseXML属性，不是resopnseText
                // 获取文档中所有city元素
                var cityElementList = doc.getElementsByTagName("city");
                // 获取html元素：city的<select>
                var citySelect = document.getElementById("city");
                // 删除city的<select>元素的所有子元素
                removeChildNodes(citySelect);

                // 创建<option>元素，指定文本内容为“请选择”
                var qxzOption = document.createElement("option");
                var textNode = document.createTextNode("===请选择===");
                qxzOption.appendChild(textNode);
                // 把"请选择"这个<option>添加到<select>元素中
                citySelect.appendChild(qxzOption);

                // 循环遍历每个服务器端响应的每个<city>元素
                for(var i = 0; i < cityElementList.length; i++) {
                    var cityEle = cityElementList[i];
                    var cityName = null;
                    // 获取<city>元素的文本内容！处理浏览器差异！
                    if(window.addEventListener) {
                        cityName = cityEle.textContent;
                    } else {
                        cityName = cityEle.text;
                    }
                    // 使用城市名称创建<option>，并添加到<select>元素中
                    addCityOption(cityName);
                }
            }
        };
        xmlHttp.open("POST", "/CityServlet", true);//打开与服务器的连接
        // 因为是POST请求，所以要设置Content-Type请求头
        xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        // 参数为当前选中的省份名称
        xmlHttp.send("provinceName=" + proName);
    }
    // 使用proName创建<option>元素添加到<select>元素中
    function addProvinceOption(proName) {
        var option = document.createElement("option");//创建<option>元素
        var textNode = document.createTextNode(proName);//使用省份名称创建文本节点
        option.appendChild(textNode);//把省份名称的文本节点添加到<option>元素中
        option.setAttribute("value", proName);//使用省份名称来设置<option>元素的value属性
        document.getElementById("province").appendChild(option);//把<option>元素添加到<select>元素中　
    }
    // 本函数用来创建城市的<option>，并添加到<select>元素中
    function addCityOption(cityName) {
        var citySelect = document.getElementById("city");//获取id为city的<select>
        var cityOption = document.createElement("option");//创建<option>元素
        var textNode = document.createTextNode(cityName);//使用城市名称创建文本节点
        cityOption.appendChild(textNode);//把文本节点添加到<option>元素中
        cityOption.setAttribute("value", cityName);//设置<option>元素的value属性为城市名称
        citySelect.appendChild(cityOption);//把<option>元素添加到<select>元素中
    }
    function removeChildNodes(ele) {
        var nodes = ele.childNodes;//获取当前元素的所有子元素集合
        while(nodes.length > 0) {//遍历所有子元素
            ele.removeChild(nodes[0]);//删除子元素
        }
    }
</script>
</html>
