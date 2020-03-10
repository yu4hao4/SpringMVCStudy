<%--
  Created by IntelliJ IDEA.
  User: 喻浩
  Date: 2019/8/22
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.js"></script>
    
    <script>
        //页面加载，绑定单击事件
        $(function () {
           $("#btn").click(function () {
               // alert("hello btn");
               // 发送ajax请求
               $.ajax({
                   //编写json格式
                   url:"user/testAjax",
                   contentType:"application/json;charset=UTF-8",
                   data:'{"username":"hehe","password":"wqw","age":30}',
                   dataType:"json",
                   type:"post",
                   success:function (data) {
                       //data服务器端相应的json数据，进行解析
                       alert(data);
                       alert(data.username);
                       alert(data.password);
                       alert(data.age);
                   }
               })
           });
        });
    </script>
</head>
<body>
    <a href="user/testString">testString</a>

    <br/>

    <a href="user/testVoid">testVoid</a>

    <br/>

    <a href="user/testModelAndView">testModelAndView</a>

    <br/>

    <a href="user/testForwardOrRedirect">testForwardOrRedirect</a>

    <br/>

    <button id="btn">发送ajax的请求</button>
</body>
</html>
