<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/static/TaskFourTeen/page/company.css" rel="stylesheet" type="text/css" />

</head>

<body>
<div class="banner"></div>
    <main>
        <div class="main-one">
            <span>首页></span>
            <span>合作企业</span>
        </div>
        <div class="container-fluid" style="padding: 0 10vw 15vh 10vw;">
            <div class="row">
                <div class="col-xl-3 main-two">
                    <div class="main-two-left-title">
                        合作企业
                    </div>
                    <ul class="main-two-left">
                        <li>
                            <span></span>
                            <a href="/company/a">土豆网</a>
                        </li>
                        <li>
                            <span></span>
                            <a href="/company/b">阿里巴巴</a>
                        </li>
                        <li>
                            <span></span>
                            <a href="/company/c">学院都市</a>
                        </li>
                        <li>
                            <span></span>
                            <a href="/company/d">暗杀教室</a>
                        </li>
                    </ul>
                </div>
                <c:forEach items="${code}" var="n" varStatus="sttpon">
                <div class="col-xl main-two-right" style="background-color: white;background-clip:content-box;">
                    <div class="main-two-right-top">
                        <img src="${n.road}">
                        <div>
                            ${n.data}
                        </div>
                    </div>
                    <p>${n.introduce}</p>
                    <p>${n.introduceee}</p>
                </div>
                </c:forEach>
            </div>
        </div>
    </main>

    <script src="/static/TaskFourTeen/TaskFourTeen.js"></script>
</body>

</html>