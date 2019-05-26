<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<form action="/u/login" method="post"><%--登录界面--%>
    <tr>
        <input type="text" name="name"><br>
        <input type="text" name="password"><br>
    </tr>
    <input type="submit" value="登录">
</form>
</body>
</html>
