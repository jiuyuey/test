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
    <link href="/static/TaskFourTeen/index.css" rel="stylesheet" type="text/css" />
    <style>
        @media screen and (max-width:1200px) {

            .main-one {
                border: none;
            }

            .main-five {
                flex-basis: 20%;
                padding: 0;
            }

            .main-one-four {
                align-items: center;
            }

            .main-t {
                margin: 0
            }

            .main-four {
                padding: 30px 0;
            }
        }
    </style>
</head>

<body>
<header>
    <!--轮播图片-->
    <div class="navigation">
        <div class="nav-left-img">
        </div>
        <div class="main-three-one" style="margin: 40vh 0 0 0 ">
            <div class="yuan-one"></div>
            <div class="yuan-two"></div>
            <div class="yuan-three"></div>
            <div class="yuan-four"></div>
        </div>
        <div class="nav-right-img">
        </div>
    </div>
</header>
    <main>
        <div class="container-fluid" style="padding: 80px 10vw 0 10vw">
            <div class="row">
                <div class="col-xl col-lg-6 main-one">
                    <div class="main-one-top-img-one"></div>
                    <div class="main-one-center-text">高效</div>
                    <div class="main-one-bottom-text">将五到七年的成才时间,缩短到一年到三你</div>
                </div>
                <div class="col-xl col-lg-6 main-one">
                    <div class="main-one-top-img-two"> </div>
                    <div class="main-one-center-text">规范</div>
                    <div class="main-one-bottom-text">标准的实战教程,不会走弯路</div>
                </div>
                <div class="col-xl col-lg-6 main-one main-one-three">
                    <div class="main-one-top-img-three"></div>
                    <div class="main-one-center-text">人脉</div>
                    <div class="main-one-bottom-text">同班好友,同院学长,技术大师,入学就混入职脉圈,为以后铺平道路。</div>
                </div>
                <div class="col-xl col-lg-6 main-one main-one-four">
                    <div>
                        <img src="/static/TaskEight/TaskEightInexSrc/user 拷贝.png">
                        <span class="main-one-right-text">12400</span>
                    </div>
                    <span class="main-one-right-text">累计在线学习人数</span>
                    <div>
                        <img src="/static/TaskEight/TaskEightInexSrc/user 拷贝.png">
                        <span class="main-one-right-text">12400</span>
                    </div>
                    <span class="main-one-right-text">学院已经找到满意工作</span>
                </div>
            </div>
        </div>
        <div class="title-one">如何学习</div>
        <div class="container-fluid" style="padding: 0 10vw;">
            <div class="row">
                <div class="col-xl col-lg-6  main-two">
                    <div class="main-two-square">1</div>
                    <div class="main-two-center-text">匹配你现在的给人情况寻找适合自己的岗位</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
                <div class="col-xl col-lg-6 main-two">
                    <div class="main-two-square">2</div>
                    <div class="main-two-center-text">了解职业前景薪资待遇,竞争压力等</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
                <div class="col-xl col-lg-6 main-two">
                    <div class="main-two-square">3</div>
                    <div class="main-two-center-text">掌握行业内顶级技能</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
                <div class="col-xl col-lg-6 main-two">
                    <div class="main-two-square">4</div>
                    <div class="main-two-center-text">查看职业目标任务</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
            </div>
        </div>
        <div class="container-fluid main-t" style="padding: 0 10vw;">
            <div class="row">
                <div class="col-xl col-lg-6 main-two">
                    <div class="main-two-square">5</div>
                    <div class="main-two-center-text">参考学习资料,掌握技能点,逐个完成任务</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
                <div class="col-xl col-lg-6 main-two">
                    <div class="main-two-square">6</div>
                    <div class="main-two-center-text">加入班级和小伙伴们互帮互助,一块学习</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
                <div class="col-xl col-lg-6 main-two">
                    <div class="main-two-square">7</div>
                    <div class="main-two-center-text">选择导师,一路引导,加速自己成长</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
                <div class="col-xl col-lg-6 main-two">
                    <div class="main-two-square">8</div>
                    <div class="main-two-center-text">完成职业技能,升级业界大牛</div>
                    <img src="/static/TaskEight/TaskEightInexSrc/形状 7 拷贝.png">
                </div>
            </div>
        </div>

        <div class="title-two">优秀学员展示</div>

        <div class="container-fluid" style="padding: 0 10vw;margin: 50px 0 20px 0">


            <div class="row">
                <c:forEach items="${dd}" var="a" varStatus="st">
                <div class="col-xl col-lg-6 main-three">
                    <img src="${a.address}" style="margin-top: 20px">
                    <h5 class="card-title">${a.position}&nbsp;:&nbsp;${a.name}</h5>
                    <p class="card-text">${a.introduction}</p>
                </div>
                </c:forEach>
                </div>
            </div>
        </div>


        <div class="main-three-one">
            <div class="yuan-one"></div>
            <div class="yuan-two"></div>
            <div class="yuan-three"></div>
            <div class="yuan-four"></div>
        </div>
        <div class="title-two">战略合作企业</div>
        <div class="container-fluid" style="padding: 0 10vw 100px 10vw;">
            <div class="row" style="background-color:white;">
                <div class="col-xl main-four">
                    <img src="/static/TaskEight/TaskEightInexSrc/技能树首页_14.jpg">
                </div>
                <div class="col-xl main-four">
                    <img src="/static/TaskEight/TaskEightInexSrc/技能树首页_08.jpg">
                </div>
                <div class="col-xl main-four">
                    <img src="/static/TaskEight/TaskEightInexSrc/技能树首页_03.jpg">
                </div>
                <div class="col-xl main-four">
                    <img src="/static/TaskEight/TaskEightInexSrc/技能树首页_11.jpg">
                </div>
                <div class="col-xl main-four">
                    <img src="/static/TaskEight/TaskEightInexSrc/技能树首页_05.png">
                </div>
            </div>
        </div>
    </main>
    <footer>
        <div style="overflow:hidden">
            <div class="container-fluid" style="padding: 0 10vw 0 10vw">
                <div class="row main-row-five">
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">手机软件</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                </div>
            </div>
            <div class="container-fluid" style="padding: 0 10vw 0 10vw">
                <div class="row main-row-five-two">
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">手机软件</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">找工作</a>
                    </div>
                    <div class="col-xl main-five">
                        <span></span>
                        <a href="">教师招聘</a>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <script src="/static/TaskFourTeen/TaskFourTeen.js"></script>
</body>

</html>