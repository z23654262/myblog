<%--
  Created by IntelliJ IDEA.
  User: zhangshuaifei
  Date: 2018/12/17
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选择类别</title>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
    <!--重置属性文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/index.css"/>
    <!--选择博客css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/category/chooseCategory.css"/>
    <!--bootstrap的css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
    <!--Jquery-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/system/index.js"></script>
    <!--选择界面Json填充-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/category/category.js"></script>
    <!--bootstrap的js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body onload="initChooseCategory()">
<jsp:include page="../system/top.jsp"/>

<div class="choose-container">
    <div class="choose-title movein">
        <span class="glyphicon glyphicon-equalizer"></span>
        <h2>类别选择(点击类别名称)</h2>
    </div>
    <div class="choose-list movein" id="choose-list">

    </div>
</div>

<jsp:include page="../system/bottom.jsp"/>
</body>
</html>
