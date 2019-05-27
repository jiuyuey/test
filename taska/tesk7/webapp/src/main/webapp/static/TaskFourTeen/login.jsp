<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<form action="/u/login" method="post"><%--登录界面--%>
    <tr>
        账号：<input type="text" name="name"><br>
        密码：<input type="text" name="password"><br>
        验证码<input type="text" name="mang"><br>
<%--        <input type="text" name="validation" ><br>--%>
    </tr>
    <input type="submit" value="登录">
</form>
<form action="/u/validation" method="post">
    <br>获取验证码<br>
    手机：<input type="text" name="phone" ><br>
    邮箱：<input type="text" name="email" ><br>
    <input type="submit" name="获取" value="获取">
</form>
<form action="/u/upload" method="post" name="f_upload" enctype="multipart/form-data">
    <input type="file" name="file" />
    <input type="submit" value="上传" />
</form>
</body>
</html>
