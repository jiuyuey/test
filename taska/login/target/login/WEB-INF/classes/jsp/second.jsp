<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %><%--国际化头文件--%>
<html>
<head>
    <title>用户操作界面</title>
</head>
<body>
<h2>Language: <a href="?lang=zh_CN"><spring:message code="language.cn"/></a> - <a href="?lang=en_US"><spring:message code="language.en"/></a></h2><%--国际化的按钮切换语言包--%>

<table align="center" border="1" cellspacing="0">
    <tr>
        <td><spring:message code="Thename"/></td>
        <td><spring:message code="Thephone"/></td>
        <td><spring:message code="gender"/></td>
        <td><spring:message code="age"/></td>
        <td><spring:message code="address"/></td>
        <td><spring:message code="increase"/></td>
        <td><spring:message code="Therefresh"/></td>
    </tr>
    <form action="/increase" method="get">
        <tr>
            <td><input type="text" name="name"/></td>
            <td><input type="text" name="pass"/></td>
            <td><input type="text" name="gender"/></td>
            <td><input type="text" name="age"/></td>
            <td><input type="text" name="address"/></td>
            <td><input type="submit" name="增加" value="<spring:message code="increase"/>"></td>
        </tr>
    </form>
</table>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table align="center" border="1" cellspacing="0">
    <tr>
        <td><spring:message code="serialnumber"/></td>
        <td><spring:message code="Thename"/></td>
        <td><spring:message code="Thephone"/></td>
        <td><spring:message code="gender"/></td>
        <td><spring:message code="age"/></td>
        <td><spring:message code="address"/></td>
        <td><spring:message code="Creationtime"/> </td>
        <td><spring:message code="Modifythetime"/> </td>
        <td><spring:message code="Modifythe"/> </td>
        <td><spring:message code="delete"/> </td>
    </tr>
    <c:forEach items="${dd}" var="c" varStatus="st">
    <form action="/update" method="get">
        <tr>
            <td><input type="text" readonly="value" name="id" value="${c.id}"/></td><%--将数据库中的数据进行遍历--%>
            <td><input type="text" name="name" value="${c.name}"/></td>
            <td><input type="text" name="pass" value="${c.pass}"/></td>
            <td><input type="text" name="gender" value="${c.gender}"/></td>
            <td><input type="text" name="age" value="${c.age}"/></td>
            <td><input type="text" name="address" value="${c.address}"/></td>
            <td><input type="text" readonly="value" name="createat" value="${c.createat}"/></td><%--readonly是只读设置--%>
            <td><input type="text" readonly="value" name="updateat" value="${c.updateat}"/></td>
            <td><input type="submit" name="修改" value="<spring:message code="Modifythe"/>"/></td> <%--修改动作--%>
            <td><a href="/upd?id=${c.id}"><spring:message code="delete"/></a></td> <%--遍历后的数据返回所选中行的id进行删除操作--%>
        </tr>
    </form>
    </c:forEach>
</table>
<table align="center" border="1" cellspacing="0">
    <form action="/onpage" method="get">
        <td><input type="text" name="pageNo"/></td>
        <td><input type="submit" name="页面" value="<spring:message code="page"/>"></td><%--跳转页面的通知具备刷新的功能--%>
    </form>
</table>
</body>
</html>