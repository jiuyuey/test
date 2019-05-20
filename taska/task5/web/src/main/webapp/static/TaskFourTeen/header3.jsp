<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/static/TaskFourTeen/company.css" rel="stylesheet" type="text/css" />
    <style>
        @media screen and (max-width:1200px) {
            .header-nav-right {
                display: none;
            }

            .drop-father {
                display: block;
            }
        }
    </style>
</head>

<body>
<header>
    <div class="header-one">
        <span class="header-one-left-test">客服热线&nbsp;:&nbsp;010-594-78634</span>
        <div class="header-one-right-img">
            <img src="/static/TaskEight/TaskEightInexSrc/矢量智能对象.png">
            <img src="/static/TaskEight/TaskEightInexSrc/矢量智能对象2.png">
            <img src="/static/TaskEight/TaskEightInexSrc/矢量智能对象3.png">
            <a href="/u/log">登录</a>
            <a href="/u/regis">注册</a>
        </div>
    </div>
    <!--导航栏-->
    <div class="container-fluid header-nav">
        <div class="row">
            <div class="col header-nav-left">
                <span>技能树</span><span>www.jishu.com</span>
            </div>
            <div class="col">
                <ul class="header-nav-right">
                    <li>
                        <a href="/">首页</a>
                    </li>
                    <li>
                        <a href="/job">职业</a>
                    </li>
                    <li>
                        <a href="/company/a">推荐</a>
                    </li>
                    <li style="margin-right:-15px">
                        <a href="/u/vip">vip</a>
                    </li>
                </ul>
                <div class="drop-father">
                    <div class="drop" onclick="showDrop()">
                        <div class="drop-item">
                            <div></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--当屏幕小于800px时,一下拉形式呈现导航栏-->
    <div class="drop-down">
        <ul>
            <li>
                <a href="/">首页</a>
            </li>
            <li>
                <a href="/job">职业</a>
            </li>
            <li>
                <a href="/company/a">推荐</a>
            </li>
            <li>
                <a href="/u/vip">vip</a>
            </li>
        </ul>
    </div>
</header>
<script src="/static/TaskFourTeen/TaskFourTeen.js"></script>
</body>

</html>