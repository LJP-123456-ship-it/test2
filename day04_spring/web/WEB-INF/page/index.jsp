
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学框架就学 springmvc</h1>



<form action="${pageContext.request.contextPath}/hello/test01/" method="post">
    请输入useRode:<input type="text" name="name">
    <input type="submit" value=提交>
</form>

</body>
</html>
