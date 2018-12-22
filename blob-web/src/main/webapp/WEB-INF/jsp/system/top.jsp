<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="header navbar-fixed-top" id="header">
    <div class="nav-container">
        <div class="LOGO col-lg-1 col-md-6 col-sm-6 col-xs-6">
            <a href="${pageContext.request.contextPath}/index"><img
                    src="${pageContext.request.contextPath}/img/system/Myblob-logo.png"/></a>
        </div>
        <div class="nav-list hidden-xs hidden-sm col-lg-6 col-md-6">
            <a href="${pageContext.request.contextPath}/index" class="webkit">首页</a>
            <a href="${pageContext.request.contextPath}/chooseCategory" class="webkit">类别</a>
            <a href="${pageContext.request.contextPath}/archivesByDate" class="webkit">日期归档</a>
            <a href="${pageContext.request.contextPath}/writeBlob" class="webkit">
						<span class="glyphicon glyphicon-pencil">

						</span> 写博客
            </a>
            <a href="${pageContext.request.contextPath}/aboutSite" class="webkit">
                关于
            </a>
            <span class="search-icon glyphicon glyphicon-search hidden-xs hidden-sm cursor">
				</span>
        </div>

        <div class="hidden-lg hidden-md col-sm-6 col-xs-6">
            <div class="small-list">
                <span class="glyphicon glyphicon-menu-hamburger cursor" id="nav-active-btn"></span>
                <ul id="small-nav">
                    <li>
                        <a href="${pageContext.request.contextPath}/index" class="webkit">首页</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/chooseCategory" class="webkit">类别</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/archivesByDate" class="webkit">日期归档</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/writeBlob" class="webkit">
									<span class="glyphicon glyphicon-pencil">
									</span> 写博客
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/aboutSite" class="webkit">
                            关于
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/toLogin" class="webkit">
                            这是登录
                        </a>
                    </li>
                </ul>
            </div>
            <div class="small-search">
                <span class="glyphicon glyphicon-search cursor"></span>
            </div>
        </div>
    </div>
</div>