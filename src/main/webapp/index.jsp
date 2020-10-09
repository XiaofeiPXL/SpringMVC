<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
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
</body>
</html>
