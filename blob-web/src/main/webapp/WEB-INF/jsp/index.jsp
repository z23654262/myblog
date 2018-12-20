<%--
  Created by IntelliJ IDEA.
  User: zhangshuaifei
  Date: 2018/12/12
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的小博客</title>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
    <!--重置属性文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/index.css"/>
    <!--bootstrap的css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
    <!--Jquery-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/system/index.js"></script>
    <!--首页Json填充-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/system/indexJson.js"></script>
    <!--bootstrap的js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body onload="InitJson(1)">
<jsp:include page="system/top.jsp"/>

<div class="post-container">
    <div class="post-title movein">
        <span class="glyphicon glyphicon-home inline-block"></span>
        <h1 class="inline-block">首页</h1>
    </div>
    <div class="post-list" id="post-list">

    </div>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="post-navigator movein" id="post-navigator-list">
            <a href="javascript:void(0)" class="page-btn prev-page"><span class="glyphicon glyphicon-chevron-left"></span></a>
            <ol class="navigator-list">

            </ol>
            <a href="javascript:void(0)" class="page-btn next-page"><span class="glyphicon glyphicon-chevron-right"></span></a>
        </div>
    </div>
</div>

<div class="tabs">
    <div class="tabs-desc" id="tabs-desc">
        <ul class="tabs-card-btn" id="tabs-card-btn">
            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <a href="javascript:void(0)" class="tabs-card-btn-active" id="recommend-ico"><span
                        class="glyphicon glyphicon-fire"></span></a>
            </li>
            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <a href="javascript:void(0)" id="film-ico"><span class="glyphicon glyphicon-film"></span></a>
            </li>
            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <a href="javascript:void(0)" id="picture-ico"><span class="glyphicon glyphicon-picture"></span></a>
            </li>
            <div class="clearfix"></div>
        </ul>
        <div class="recommend-list" id="recommend-list">
            <div id="recommend-container" class="recommend-container">
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="post-navigator movein" id="recommend-navigator-list">
                    <a href="javascript:void(0)" class="page-btn prev-page"><span class="glyphicon glyphicon-chevron-left"></span></a>
                    <ol class="navigator-list recommend-navigator-list">

                    </ol>
                    <a href="javascript:void(0)" class="page-btn next-page"><span class="glyphicon glyphicon-chevron-right "></span></a>
                    <div class="clearfix">

                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="video-list hide" id="video-list">
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/1.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/default-blob-img3.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/8.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/1.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="clearfix">

            </div>
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/aisi.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/shanzhi.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/10.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
                <div class="video-item movein">
                    <div class="video-img">
                        <a href=""><img src="img/system/suolong.jpg"/></a>
                    </div>
                    <div class="video-detail">
                        <a href="">我是视频标题</a>
                        <p>我是作者</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="post-navigator movein">
                    <ol class="navigator-list" id="post-navigator-list">
                        <li>
                            <a href="javascript:void(0)"><span class="glyphicon glyphicon-chevron-left"></span></a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">1</a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">2</a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">3</a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">4</a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">5</a>
                        </li>
                        <li>
                            <a href=""><span class="glyphicon glyphicon-chevron-right"></span></a>
                        </li>
                    </ol>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="pic-list hide" id="pic-list">

        </div>
    </div>
</div>
<jsp:include page="system/bottom.jsp"/>

</body>
</html>
