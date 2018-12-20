<%--
  Created by IntelliJ IDEA.
  User: zhangshuaifei
  Date: 2018/12/16
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客详情</title>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
    <!--重置属性文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/index.css"/>
    <!--bootstrap的css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/blob/blobDetail.css"/>
    <!--Jquery-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/system/index.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/blob/blobJson.js"></script>
    <!--bootstrap的js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../system/top.jsp"/>

<div class="post-detail">
    <div class="detail-page movein">
        <div class="detail-title">
            <span class="glyphicon glyphicon-bookmark"></span>
            <h1 id="detail-title"></h1>
        </div>
        <div class="detail-data">
            <p id="detail-time"></p>
            /
            <p id="detail-category">

            </p>
            /
            <p>
                <a href="" id="detail-comment"></a>
            </p>
            /
            <p id="detail-access"></p>
        </div>
        <div class="detail-tags" id="detail-tag">

        </div>
        <div class="detail-message" id="detail-message">
        </div>
    </div>
</div>

<jsp:include page="../system/bottom.jsp"/>
</body>
</html>
