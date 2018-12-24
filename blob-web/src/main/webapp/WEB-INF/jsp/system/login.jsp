<%--
  Created by IntelliJ IDEA.
  User: zhangshuaifei
  Date: 2018/12/22
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0" />
    <!--重置属性文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"/>
    <!--首页css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/index.css"/>
    <!--登录css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/system/login.css"/>
    <!--bootstrap的css文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
    <!--Jquery-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/system/index.js"></script>
    <!--首页Js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/user/checkUser.js"></script>
    <!--bootstrap的js-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="login-container movein">
    <div class="col-lg-12">
        <div class="login-header">
            <img src="${pageContext.request.contextPath}/img/system/MyBlob-logo2.0.png"/>
        </div>
    </div>
    <div class="col-lg-12">
        <form action="" method="post">
            <div class="login-main">
                <h1>欢迎登录</h1>
                <div class="login-wrongmessage" id="login-wrongmessage">
                    <p>此处是错误信息</p>
                </div>
                <div class="login-box">
                    <label for="username" class="login-label">用户名或邮箱</label>
                    <input type="text" name="username" id="username" autocomplete="off" class="login-text" required="required"/>
                    <label for="password" class="login-label">
                        密码
                        <a href="">忘记密码?</a>
                    </label>
                    <input type="password" name="password" id="password" autocomplete="off" class="login-text" required="required"/>
                    <input type="button" value="登录" class="login-submit" id="login-btn"/>
                </div>
                <p class="no-account">
                    你是新来的吗？
                    <a href="">点我创建账号</a>
                </p>
            </div>
        </form>
    </div>
    <div class="col-lg-12">
        <div class="login-footer">
            <ul>
                <li><a href="${pageContext.request.contextPath}">返回首页</a></li>
                <li><a href="">联系站长</a></li>
            </ul>
        </div>
    </div>
    <div class="clearfix"></div>
</div>

</body>
</html>
