<%--
  Created by IntelliJ IDEA.
  User: zhangshuaifei
  Date: 2018/12/18
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>日期</title>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
    <!--重置属性文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/index.css"/>
    <!--博客日期分类css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/blob/dateBlob.css"/>
    <!--bootstrap的css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
    <!--Jquery-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/system/index.js"></script>
    <!--日期归档Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/blob/archiveByDate.js"></script>
    <!--bootstrap的js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body onload="initArchiveBlobByDate()">
<jsp:include page="../system/top.jsp" />

<div class="date-blob-container" id="date-blob-container">

</div>

<jsp:include page="../system/bottom.jsp" />
</body>
</html>
