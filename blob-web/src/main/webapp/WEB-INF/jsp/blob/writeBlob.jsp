<%--
  Created by IntelliJ IDEA.
  User: zhangshuaifei
  Date: 2018/12/16
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>写博客</title>
    <%--bootstrap适应不同设备--%>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
    <!--重置属性文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/index.css"/>
    <!--写博客css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/blob/writeBlob.css" />
    <!--富文本的css-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/simditor/styles/simditor.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/simditor/styles/simditor-emoji.css" />
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
    <!--富文本编辑器的js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/simditor/scripts/module.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/simditor/scripts/hotkeys.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/simditor/scripts/uploader.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/simditor/scripts/simditor.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/simditor/scripts/simditor-emoji.js"></script>
</head>
<body onload="initCategory()">
<jsp:include page="../system/top.jsp"/>
<div class="blob-write">
    <div class="post-title movein">
        <span class="glyphicon glyphicon-pencil inline-block"></span>
        <h1 class="inline-block">写博客</h1>
    </div>
    <form action="" method="post">
        <div class="blob-meta movein">
            <h2 class="blob-meta-title">标题:</h2>
            <input type="text" name="blobTitle" id="blob-title" class="blob-meta-text"/>
        </div>
        <div class="blob-meta movein">
            <h2 class="blob-meta-title">简介:</h2>
            <input type="text" name="blobTitle" id="blob-summary" class="blob-meta-text"/>
        </div>
        <div class="blob-meta movein">
            <h2 class="blob-meta-title">类别:</h2>
            <select name="" class="blob-meta-text" id="blob-category">
            </select>
        </div>
        <div class="blob-meta movein">
            <h2 class="blob-meta-title">标签:</h2>
            <input type="text" name="tag" id="" placeholder="请输入标签，中间使用“ , ”隔开" class="blob-meta-text"/>
        </div>
        <div class="blob-detail movein" id="blob-detail-content">
            <h2 class="blob-meta-title">博客内容:</h2>
            <div class="clearfix">

            </div>
            <textarea id="editor" placeholder="Balabala">
			</textarea>
            <input type="text" name="blobDetail" id="blobDetail" hidden="hidden"/>
        </div>
        <input type="submit" value="发布" class="blob-meta-btn"/>
    </form>
</div>
<jsp:include page="../system/bottom.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/blob/writeBlob.js"></script>
</body>
</html>
