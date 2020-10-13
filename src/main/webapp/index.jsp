<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<html>
<head>
    <title>测试页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#ajaxBTN").click(function () {
                $.ajax({
                    url: "http://localhost:8080/SpringMVC/test/testAjax_DELETE",
                    data: {id: 1001},
                    type: "DELETE",
                    success: function (obj) {
                        alert(obj);
                    },
                    dataType: "json"
                })
            });
            <!--url如果前面加上斜杠代表是服务器的根目录,而不是项目的根目录,不加斜杠代表的是当前页面的目录,而不是项目的根目录
                如果返回值是json对象,变量i代表的是index而不是json数组中的每一个对象,需要用data[i]来获取每一个json对象
            -->
            $("#jsonBTN").click(function () {
                $.ajax({
                    url:"testJson",
                    type: "GET",
                    dataType: "json",
                    success:function (data) {
                        for(let i in data){
                            let user = data[i];
                            alert(user.id+" "+user.username+" "+user.address);
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<a href="test/sayHello"><h2>Hello World</h2></a>
<br/>
<form action="test/testRestPut" method="POST">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="测试Put"/>
</form>
<br/>
<form action="test/testRestDelete/514524" method="POST">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="测试Delete"/>
</form>

<input id="ajaxBTN" type="button" value="测试ajax">

<form action="setAttributesFourth" method="post">
    username:<input name="username" type="text"><br/>
    age:<input type="text" name="age"><br/>
    country:<input type="text" name="address.country"><br/>
    province:<input type="text" name="address.province"><br/>
    city:<input type="text" name="address.city"><br/>
    <input type="submit" value="测试提交"><br/>
</form>

<input id="jsonBTN" type="button" value="testJson" name="testJson">
</body>
</html>
