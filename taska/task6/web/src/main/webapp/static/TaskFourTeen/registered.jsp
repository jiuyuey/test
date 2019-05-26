<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<table>
    <form action="/u/registered" method="post"><%--注册界面--%>
        <tr>
            <input type="text" name="name"><br>
            <input type="text" name="password"><br>
        </tr>
        <input type="submit" value="注册" name="注册">
    </form>
</table>
</body>
</html>
