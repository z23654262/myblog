<%--
  Created by IntelliJ IDEA.
  User: zhangshuaifei
  Date: 2018/12/19
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关于本站</title>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
    <!--重置属性文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/index.css"/>
    <!--关于网站css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/aboutSite.css"/>
    <!--bootstrap的css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
    <!--Jquery-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/system/index.js"></script>
    <!--bootstrap的js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <!--引入highchart-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/highchart/highcharts.js"></script>
    <!--引入导出文件-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/highchart/exporting.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/highchart/offline-exporting.js"></script>
</head>
<body>
<jsp:include page="../system/top.jsp"/>

<div id="aboutSite-container" class="aboutSite-container">
    <div class="hidden-lg hidden-md col-sm-12 col-xs-12">
        <div class="about-tip">
            <h2>导出功能在移动设备会受到影响，如想使用导出功能请在PC端进行导出！</h2>
        </div>
    </div>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div id="blob-chart" class="blob-chart movein">

        </div>
    </div>
    <div class="clearfix"></div>
</div>


<jsp:include page="../system/bottom.jsp"/>
<script src="${pageContext.request.contextPath}/js/system/aboutSite.js"></script>
</body>
</html>
