<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="footer-container">
    <div class="footer-nav">
        <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
            <div class="footer-nav-item">
                <div class="friend-link">
                    <h3><span class="glyphicon glyphicon-paperclip"></span>友情链接</h3>
                    <ul class="link-list">
                        <li><a href="http://www.baidu.com" target="_blank">百度</a></li>
                        <li><a href="http://www.bootcss.com" target="_blank">bootstrap</a></li>
                        <li><a href="http://www.youtube.com" target="_blank">YouTuBe</a></li>
                        <li><a href="http://www.facebook.com" target="_blank">FaceBook</a></li>
                        <li><a href="http://www.glyphicons.com" target="_blank">Glyphicons</a></li>
                        <li><a href="http://github.com/z93478462/myblog" target="_blank">Fork me in GitHub</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
            <div class="footer-nav-item">
                <div class="message-board">
                    <h3><span class="glyphicon glyphicon-edit"></span>留言板</h3>
                    <form action="" method="post" class="message-form">
                        <input name="user-email"  placeholder="您的邮箱" required="required" class="message-text"/>
                        <textarea value="111" required="required" class="message-textarea"></textarea>
                        <input type="submit" value="啪叽一下" class="message-btn"/>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
            <div class="footer-nav-item">
                <div class="">
                    <h3><span class="glyphicon glyphicon-calendar"></span>老黄历</h3>
                </div>
            </div>
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="footer-nav-item">
                <div class="footer-logo">
                    <a href="${pageContext.request.contextPath}/index"><img src="${pageContext.request.contextPath}/img/system/Myblob-logo.png" /></a>
                </div>
                <h1 class="record-number">Powered By 1586414284994 ©z93478462 </h1>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
