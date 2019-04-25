<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>SpringMVC</title>
</head>
<body>
<h2>Language: <a href="?lang=zh_CN"><spring:message code="language.cn" /></a> - <a href="?lang=en_US"><spring:message code="language.en" /></a></h2>
<table>
    <form action="/index" method="get">
        <tr>
            <spring:message code="account"/>：<input type="text" name="name"><br>
            <spring:message code="password"/>：<input type="text" name="pass"><br>
        </tr>
        <td><input type="submit" name="注册" value="<spring:message code="Thelogin"/>"></td>
    </form>
</table>
</body>
</html>
<%--登陆界面--%>
