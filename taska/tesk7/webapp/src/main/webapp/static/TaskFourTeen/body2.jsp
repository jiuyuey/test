<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/static/TaskFourTeen/page/job.css" rel="stylesheet" type="text/css" />
    <style>
        @media screen and (max-width: 1200px) {

            .main-two {
                flex-direction: column;
            }

            .main-two li {
                width: 100%;
                text-align: center;
            }
        }

        .main-four {
            padding: 0 10vw;
        }
    </style>
</head>

<body>
    <main>
        <div class="container-fluid main-four" id="yunwei"/><%--页面效果--%>
        <div class="main-one">
            <span>首页></span>
            <span style="color:red">职业</span>
        </div>
        <ul class="main-two">
            <li class="main-two-one"><a>方向:</a>&nbsp;</li>
            <li>
                <a href="#top">全部</a>
            </li>
            <li>
                <a href="#qianduan">前端开发</a>
            </li>
            <li>
                <a href="#houduan">后端开发</a>
            </li>
            <li>
                <a href="#yidong">移动开发</a>
            </li>
            <li>
                <a href="#zheng">整站开发</a>
            </li>
            <li>
                <a href="#yunwei">运营维护</a>
            </li>
        </ul>
        <div class="main-three" id="qianduan">
            前端开发方向
        </div>
        <div class="container-fluid main-four">
            <div class="row">
                <c:forEach items="${cc}" begin="0" end="2" var="c" varStatus="sttp">
                <div class="col-xl col-lg-6">
                    <div class="table-one-father">
                        <table class="table-one" style="border-collapse: collapse;">
                            <tbody>
                                <tr>
                                    <td colspan="2">
                                        <div class="tr-one">
                                            <img src="${c.path}">
                                            <div>
                                                <h5>${c.name}</h5>
                                                <span>${c.introduction}</span>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="width:50%;border-right: 1px solid #add9c0;">
                                        <span>门槛</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${c.threshold}">
                                        <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">
                                        </c:forEach>
                                    </td>
                                    <td>
                                        <span>难易程度</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${c.easy}" >
                                        <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">&nbsp;&nbsp;
                                        </c:forEach>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-right: 1px solid #add9c0;">
                                        <span>成长周期</span>&nbsp;&nbsp;
                                        <span style="color:red">${c.growth}</span>
                                    </td>
                                    <td>
                                        <span>稀缺程度</span>&nbsp;&nbsp;
                                        <span style="color:red">${c.scarce}</span><span style="color:black">家公司需要</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="main" colspan="2" style="margin:-10px">
                                        <table style="width:100%;height:100%;border-collapse: collapse;">
                                            <tr>
                                                <td rowspan="3"
                                                    style="text-align:center;border-right: 1px solid #add9c0;border-bottom:none;">
                                                    薪资待遇
                                                </td>
                                                <td style="color:black;">
                                                    <span>0-1年</span>
                                                    <span style="float:right">${c.ayear}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;">
                                                    <span>1-3年</span>
                                                    <span style="float:right">${c.threeyears}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;border-bottom: none">
                                                    <span>3-5年</span>
                                                    <span style="float:right">${c.fiveyears}</span>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <span style="font-size:1rem;color:black">有</span>
                                        <span style="font-size:1rem;color:red">${c.leam}</span>
                                        <span style="font-size:1rem;color:black">人正在学</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-bottom: none" colspan="2">提示:在你学习之前你应该已经掌握XXXXXX,XXXXXX等语言基础</td>
                                </tr>
                            </tbody>
                        </table>
                        <div class="hover">
                            <div>${c.name}</div>
                            <div>iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，也是以Darwin为基础的，因此同样属
                                于类Unix的商业操作系统。国内iOS开
                                发起步相对较晚，人才培养机制更是远
                                远跟不上市场发展速度。有限的iOS开
                                发人才成了国内企业必争的资源。国内 iOS开发起步相对较晚，人才培养机制
                                更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>

        <div class="main-three" id="houduan">
            后端开发方向
        </div>
        <div class="container-fluid main-four">
            <div class="row">
                <c:forEach items="${ee}" begin="3" end="4" var="e" varStatus="stt">
                <div class="col-xl col-lg-6">
                    <div class="table-one-father">
                        <table class="table-one" style="border-collapse: collapse;">
                            <tbody>
                            <tr>
                                <td colspan="2">
                                    <div class="tr-one">
                                        <img src="${e.path}">
                                        <div>
                                            <h5>${e.name}</h5>
                                            <span>${e.introduction}</span>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td style="width:50%;border-right: 1px solid #add9c0;">
                                    <span>门槛</span>&nbsp;&nbsp;
                                    <c:forEach begin="1" end="${e.threshold}">
                                        <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">
                                    </c:forEach>
                                </td>
                                <td>
                                    <span>难易程度</span>&nbsp;&nbsp;
                                    <c:forEach begin="1" end="${e.easy}" >
                                        <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">&nbsp;&nbsp;
                                    </c:forEach>
                                </td>
                            </tr>
                            <tr>
                                <td style="border-right: 1px solid #add9c0;">
                                    <span>成长周期</span>&nbsp;&nbsp;
                                    <span style="color:red">${e.growth}</span>
                                </td>
                                <td>
                                    <span>稀缺程度</span>&nbsp;&nbsp;
                                    <span style="color:red">${e.scarce}</span><span style="color:black">家公司需要</span>
                                </td>
                            </tr>
                            <tr>
                                <td class="main" colspan="2" style="margin:-10px">
                                    <table style="width:100%;height:100%;border-collapse: collapse;">
                                        <tr>
                                            <td rowspan="3"
                                                style="text-align:center;border-right: 1px solid #add9c0;border-bottom:none;">
                                                薪资待遇
                                            </td>
                                            <td style="color:black;">
                                                <span>0-1年</span>
                                                <span style="float:right">${e.ayear}</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color:black;">
                                                <span>1-3年</span>
                                                <span style="float:right">${e.threeyears}</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color:black;border-bottom: none">
                                                <span>3-5年</span>
                                                <span style="float:right">${e.fiveyears}</span>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <span style="font-size:1rem;color:black">有</span>
                                    <span style="font-size:1rem;color:red">${e.leam}</span>
                                    <span style="font-size:1rem;color:black">人正在学</span>
                                </td>
                            </tr>
                            <tr>
                                <td style="border-bottom: none" colspan="2">提示:在你学习之前你应该已经掌握XXXXXX,XXXXXX等语言基础</td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="hover">
                            <div>${e.name}</div>
                            <div>iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，也是以Darwin为基础的，因此同样属
                                于类Unix的商业操作系统。国内iOS开
                                发起步相对较晚，人才培养机制更是远
                                远跟不上市场发展速度。有限的iOS开
                                发人才成了国内企业必争的资源。国内 iOS开发起步相对较晚，人才培养机制
                                更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>

        <div class="main-three" id="yidong">
            移动开发方向
        </div>
        <div class="container-fluid main-four">
            <div class="row">
                <c:forEach items="${ff}" begin="5" end="6" var="f" varStatus="sttt">
                    <div class="col-xl col-lg-6">
                        <div class="table-one-father">
                            <table class="table-one" style="border-collapse: collapse;">
                                <tbody>
                                <tr>
                                    <td colspan="2">
                                        <div class="tr-one">
                                            <img src="${f.path}">
                                            <div>
                                                <h5>${f.name}</h5>
                                                <span>${f.introduction}</span>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="width:50%;border-right: 1px solid #add9c0;">
                                        <span>门槛</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${f.threshold}">
                                            <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">
                                        </c:forEach>
                                    </td>
                                    <td>
                                        <span>难易程度</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${f.easy}" >
                                            <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">&nbsp;&nbsp;
                                        </c:forEach>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-right: 1px solid #add9c0;">
                                        <span>成长周期</span>&nbsp;&nbsp;
                                        <span style="color:red">${f.growth}</span>
                                    </td>
                                    <td>
                                        <span>稀缺程度</span>&nbsp;&nbsp;
                                        <span style="color:red">${f.scarce}</span><span style="color:black">家公司需要</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="main" colspan="2" style="margin:-10px">
                                        <table style="width:100%;height:100%;border-collapse: collapse;">
                                            <tr>
                                                <td rowspan="3"
                                                    style="text-align:center;border-right: 1px solid #add9c0;border-bottom:none;">
                                                    薪资待遇
                                                </td>
                                                <td style="color:black;">
                                                    <span>0-1年</span>
                                                    <span style="float:right">${f.ayear}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;">
                                                    <span>1-3年</span>
                                                    <span style="float:right">${f.threeyears}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;border-bottom: none">
                                                    <span>3-5年</span>
                                                    <span style="float:right">${f.fiveyears}</span>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <span style="font-size:1rem;color:black">有</span>
                                        <span style="font-size:1rem;color:red">${f.leam}</span>
                                        <span style="font-size:1rem;color:black">人正在学</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-bottom: none" colspan="2">提示:在你学习之前你应该已经掌握XXXXXX,XXXXXX等语言基础</td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="hover">
                                <div>${f.name}</div>
                                <div>iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，也是以Darwin为基础的，因此同样属
                                    于类Unix的商业操作系统。国内iOS开
                                    发起步相对较晚，人才培养机制更是远
                                    远跟不上市场发展速度。有限的iOS开
                                    发人才成了国内企业必争的资源。国内 iOS开发起步相对较晚，人才培养机制
                                    更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="main-three" id="zheng">
            整站开发方向
        </div>
        <div class="container-fluid main-four">
            <div class="row">
                <c:forEach items="${gg}" begin="7" end="8" var="g" varStatus="sttpt">
                    <div class="col-xl col-lg-6">
                        <div class="table-one-father">
                            <table class="table-one" style="border-collapse: collapse;">
                                <tbody>
                                <tr>
                                    <td colspan="2">
                                        <div class="tr-one">
                                            <img src="${g.path}">
                                            <div>
                                                <h5>${g.name}</h5>
                                                <span>${g.introduction}</span>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="width:50%;border-right: 1px solid #add9c0;">
                                        <span>门槛</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${g.threshold}">
                                            <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">
                                        </c:forEach>
                                    </td>
                                    <td>
                                        <span>难易程度</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${g.easy}" >
                                            <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">&nbsp;&nbsp;
                                        </c:forEach>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-right: 1px solid #add9c0;">
                                        <span>成长周期</span>&nbsp;&nbsp;
                                        <span style="color:red">${g.growth}</span>
                                    </td>
                                    <td>
                                        <span>稀缺程度</span>&nbsp;&nbsp;
                                        <span style="color:red">${g.scarce}</span><span style="color:black">家公司需要</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="main" colspan="2" style="margin:-10px">
                                        <table style="width:100%;height:100%;border-collapse: collapse;">
                                            <tr>
                                                <td rowspan="3"
                                                    style="text-align:center;border-right: 1px solid #add9c0;border-bottom:none;">
                                                    薪资待遇
                                                </td>
                                                <td style="color:black;">
                                                    <span>0-1年</span>
                                                    <span style="float:right">${g.ayear}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;">
                                                    <span>1-3年</span>
                                                    <span style="float:right">${g.threeyears}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;border-bottom: none">
                                                    <span>3-5年</span>
                                                    <span style="float:right">${g.fiveyears}</span>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <span style="font-size:1rem;color:black">有</span>
                                        <span style="font-size:1rem;color:red">${g.leam}</span>
                                        <span style="font-size:1rem;color:black">人正在学</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-bottom: none" colspan="2">提示:在你学习之前你应该已经掌握XXXXXX,XXXXXX等语言基础</td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="hover">
                                <div>${g.name}</div>
                                <div>iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，也是以Darwin为基础的，因此同样属
                                    于类Unix的商业操作系统。国内iOS开
                                    发起步相对较晚，人才培养机制更是远
                                    远跟不上市场发展速度。有限的iOS开
                                    发人才成了国内企业必争的资源。国内 iOS开发起步相对较晚，人才培养机制
                                    更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="main-three" id="yunwei">
            运营维护方向
        </div>
        <div class="container-fluid main-four">
            <div class="row">
                <c:forEach items="${hh}" begin="9" end="10" var="h" varStatus="stptt">
                    <div class="col-xl col-lg-6">
                        <div class="table-one-father">
                            <table class="table-one" style="border-collapse: collapse;">
                                <tbody>
                                <tr>
                                    <td colspan="2">
                                        <div class="tr-one">
                                            <img src="${h.path}">
                                            <div>
                                                <h5>${h.name}</h5>
                                                <span>${h.introduction}</span>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="width:50%;border-right: 1px solid #add9c0;">
                                        <span>门槛</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${h.threshold}">
                                            <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">
                                        </c:forEach>
                                    </td>
                                    <td>
                                        <span>难易程度</span>&nbsp;&nbsp;
                                        <c:forEach begin="1" end="${h.easy}" >
                                            <img src="/static/TaskEight/TaskEightJobSrc/形状 1.png">&nbsp;&nbsp;
                                        </c:forEach>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-right: 1px solid #add9c0;">
                                        <span>成长周期</span>&nbsp;&nbsp;
                                        <span style="color:red">${h.growth}</span>
                                    </td>
                                    <td>
                                        <span>稀缺程度</span>&nbsp;&nbsp;
                                        <span style="color:red">${h.scarce}</span><span style="color:black">家公司需要</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="main" colspan="2" style="margin:-10px">
                                        <table style="width:100%;height:100%;border-collapse: collapse;">
                                            <tr>
                                                <td rowspan="3"
                                                    style="text-align:center;border-right: 1px solid #add9c0;border-bottom:none;">
                                                    薪资待遇
                                                </td>
                                                <td style="color:black;">
                                                    <span>0-1年</span>
                                                    <span style="float:right">${h.ayear}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;">
                                                    <span>1-3年</span>
                                                    <span style="float:right">${h.threeyears}</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="color:black;border-bottom: none">
                                                    <span>3-5年</span>
                                                    <span style="float:right">${h.fiveyears}</span>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <span style="font-size:1rem;color:black">有</span>
                                        <span style="font-size:1rem;color:red">${h.leam}</span>
                                        <span style="font-size:1rem;color:black">人正在学</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="border-bottom: none" colspan="2">提示:在你学习之前你应该已经掌握XXXXXX,XXXXXX等语言基础</td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="hover">
                                <div>${h.name}</div>
                                <div>iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，也是以Darwin为基础的，因此同样属
                                    于类Unix的商业操作系统。国内iOS开
                                    发起步相对较晚，人才培养机制更是远
                                    远跟不上市场发展速度。有限的iOS开
                                    发人才成了国内企业必争的资源。国内 iOS开发起步相对较晚，人才培养机制
                                    更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="maodian">
            <div onclick="javascript:document.getElementById('top').scrollIntoView()">
            </div>
            <div onclick="javascript:document.getElementById('bottom').scrollIntoView()">
            </div>
        </div>
    </main>
   <script src="/static/TaskFourTeen/TaskFourTeen.js"></script>
</body>

</html>