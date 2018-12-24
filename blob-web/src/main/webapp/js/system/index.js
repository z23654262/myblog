$(function(){
    var curWwwPath=window.document.location.href;
//获取主机地址之后的目录如：/chenThree/jspPage/pages/projectImplementation.html
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    var localhostPaht=curWwwPath.substring(0,pos);
//获取主机地址，如： http://localhost:8080/chenThree
    var contextPath = window.location.pathname.split("/")[1];
    var webPath = localhostPaht+"/"+contextPath;
    /*用户是否登录*/
    function init_nav() {
        var small_nav = $('#small-nav');
        var nav_list = $('#nav-list');
        small_nav.empty();
        nav_list.empty();
        $.ajax({
            type:"post",
            url:"/"+contextPath+"/getSessionUser",
            success:function (result) {
                var nav_context = "";
                var small_context = "";
                if(result.msg=='false'){
                    nav_context += "<a href=\""+webPath+"/toLogin\" class=\"webkit\">\n登录\n</a>";
                    small_context +="<li>\n<a href=\""+webPath+"/toLogin\">登录</a>\n</li>";
                }else{
                    nav_context += " <a href=\"javascript:void(0)\" class=\"webkit\">\n" +
                        "                <img src=\""+webPath+"/img/userHead/"+decodeURI(result.user.userImageUrl)+"\" class=\"login-user\"/>\n" +result.user.userName+
                        "            </a>\n" +
                        "            <a href=\"javascript:void(0)\" class=\"webkit logout\" >\n" +
                        "                登出\n" +
                        "            </a>";
                    small_context += "<li>\n" +
                        "                        <a href=\"javascript:void(0)\" class=\"webkit\"><img src=\""+webPath+"/img/userHead/"+decodeURI(result.user.userImageUrl)+"\" class=\"login-user\"/>"+result.user.userName+"</a>\n"+
                        "                    </li>\n" +
                        "                    <li>\n" +
                        "                        <a href=\"javascript:void(0)\" class=\"logout\">登出</a>\n" +
                        "                    </li>";
                }
                var nav_login = $("<a href=\""+webPath+"/index\" class=\"webkit\">首页</a>\n" +
                    "            <a href=\""+webPath+"/chooseCategory\" class=\"webkit\">类别</a>\n" +
                    "            <a href=\""+webPath+"/archivesByDate\" class=\"webkit\">日期归档</a>\n" +
                    "            <a href=\""+webPath+"/writeBlob\" class=\"webkit\">\n" +
                    "\t\t\t\t\t\t<span class=\"glyphicon glyphicon-pencil\">\n" +
                    "\n" +
                    "\t\t\t\t\t\t</span> 写博客\n" +
                    "            </a>\n" +
                    "            <a href=\""+webPath+"/aboutSite\" class=\"webkit\" id=\"nav-last\">\n" +
                    "                关于\n" +
                    "            </a>\n"  +nav_context+
                    "            <span class=\"search-icon glyphicon glyphicon-search hidden-xs hidden-sm cursor\">\n</span>");
                var small_login = $(small_context+"<li>\n" +
                    "                        <a href=\""+webPath+"\" class=\"webkit\">首页</a>\n" +
                    "                    </li>\n" +
                    "                    <li>\n" +
                    "                        <a href=\""+webPath+"/chooseCategory\" class=\"webkit\">类别</a>\n" +
                    "                    </li>\n" +
                    "                    <li>\n" +
                    "                        <a href=\""+webPath+"/archivesByDate\" class=\"webkit\">日期归档</a>\n" +
                    "                    </li>\n" +
                    "                    <li>\n" +
                    "                        <a href=\""+webPath+"/writeBlob\" class=\"webkit\">\n" +
                    "\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-pencil\">\n" +
                    "\t\t\t\t\t\t\t\t\t</span> 写博客\n" +
                    "                        </a>\n" +
                    "                    </li>\n" +
                    "                    <li>\n" +
                    "                        <a href=\""+webPath+"/aboutSite\" class=\"webkit\">\n" +
                    "                            关于\n" +
                    "                        </a>\n" +
                    "                    </li>");
                nav_list.append(nav_login);
                small_nav.append(small_login);
            }
        });
    }
    /*用户是否登录*/
    init_nav();

    /*用户登出*/
    function userlogout(){
        if(confirm("确定要登出吗")){
            $.ajax({
                type:"post",
                url:"/"+contextPath+"/userLogout",
                success:function (result) {
                    init_nav();
                }
            })
        }
    }
    $('.nav-container').on("click",".logout",function () {
        userlogout();
    });
    /*用户登出*/




    /*鼠标下滑导航栏隐藏*/
    var new_scroll_position = 0;
    var last_scroll_position;
    var header = $('#header');
    window.addEventListener('scroll', function(e) {
        last_scroll_position = window.scrollY;

        // Scrolling down
        if (new_scroll_position < last_scroll_position && new_scroll_position!=0 && $(window).scrollTop()>120) {
            // header.removeClass('slideDown').addClass('slideUp');
            header.removeClass('slideDown');
            header.addClass('slideUp');
            $('#small-nav').fadeOut(200);
            // Scrolling up
        }else if($(window).scrollTop()<120){
            header.removeClass('slideUp');
            header.addClass('slideDown');
        }
        else if (new_scroll_position > last_scroll_position && new_scroll_position!=0 && (new_scroll_position - last_scroll_position>6) && !$('.simditor-wrapper').hasClass('toolbar-floating')) {
            // header.removeClass('slideUp').addClass('slideDown');
            header.removeClass('slideUp');
            header.addClass('slideDown');
            setTimeout(function(){
                if($('.simditor-wrapper').hasClass('toolbar-floating')){
                    header.removeClass('slideDown');
                    header.addClass('slideUp');
                }
            },1000);
        }
        new_scroll_position = last_scroll_position;
    });
	/*唤出隐藏顶部菜单*/
    $(document).click(function(){
        $('#small-nav').fadeOut(200);
    })

    $('#nav-active-btn').click(function(){
        event.stopPropagation();
        $('#small-nav').fadeIn(200);
    });

    var small_nav_a = $('#small-nav').children('li');
    $('#small-nav').on("click","li",function () {
        event.stopPropagation();
    })
    $('#small-nav').on("click","li a",function () {
        if($(this).hasClass('logout')){
            userlogout();
        }else{
            event.stopPropagation();
        }
    })
    $(small_nav_a).each(function(i,n){
        $(n).click(function(){
            event.stopPropagation();
        })
    });

	
	/*图片模糊 标题出现*/
	var post_list = $('#post-list');
	post_list.on("mouseover",".post-img",function () {
        var a = $(this).children('a');
        var img = $(a).children('img');
        var p = $(a).children('p');
        img.addClass('img-vague');
        p.removeClass('hide');
    });
    post_list.on("mouseleave",".post-img",function () {
        var a = $(this).children('a');
        var img = $(a).children('img');
        var p = $(a).children('p');
        img.removeClass('img-vague');
        p.addClass('hide');
    });




    /*首页博客的分页页码绘制(根据当前页码绘制)*/
    var nowPage = 1;
    var totalPage;//博客总记录页数使用ajax查询

	function queryIndexBlobsCount(){
        $.ajax({
            type:"post",
            url:"/"+contextPath+"/queryIndexBlobsCount",
			async:false,//给变量赋值需要将ajax异步请求关闭
            success:function (result) {
                totalPage=result;
            }
        });
	}

    var pageSize = 5;
    function draw_page(index){
        nowPage=index;
        var startPage;
        var endPage;
        if(totalPage>pageSize){
            startPage=index-Math.floor(pageSize/2);
            /*默认是字符串的相加*/
            endPage=index*1+Math.floor(pageSize/2)*1;
            if(startPage<=0){
                startPage=1;
                endPage=pageSize;
            }else if(endPage>totalPage){
                endPage = totalPage;
                startPage = endPage-pageSize+1;
            }
        }else{
            startPage=1;
            endPage=totalPage;
        }
        var post_list = $('#post-navigator-list .navigator-list');
        post_list.empty();
        for(var i = startPage;i<=endPage;i++){
            if(i==index){
                var post_page_item = $("<li><a href=\"javascript:void(0)\" class=\"navigator-list-active\">"+i+"</a></li>");
                post_list.append(post_page_item);
                continue;
            }
            var post_page_item = $("<li><a href=\"javascript:void(0)\">"+i+"</a></li>");
            post_list.append(post_page_item);
        }
    }
    queryIndexBlobsCount();
    draw_page(1);
    function IndexBlobsAndPage(startPage){
        indexBlobs(contextPath,startPage)
        draw_page(startPage);
	}
    $('#post-navigator-list').on("click","li a",function(){
        var startPage = $(this).text()
        if(startPage!=nowPage){
            IndexBlobsAndPage(startPage);
        }
    });
    $('#post-navigator-list').on("click",".prev-page",function(){
        if(nowPage==1){
        }else{
            IndexBlobsAndPage(nowPage-1);
        }

    });
    $('#post-navigator-list').on("click",".next-page",function(){
        if(nowPage==totalPage){
        }else{
            IndexBlobsAndPage(nowPage*1+1*1);
        }
    });
    /*首页博客的分页页码绘制*/

	/*推荐博客的分页*/
    var recommendNowPage=1;
    var recommendTotalPage; //使用ajax获取推荐博客总数

    function queryRecommendBlobsCount(){
        $.ajax({
            type:"post",
            url:"/"+contextPath+"/queryIndexRecommendBlobsCount",
            async:false,//给变量赋值需要将ajax异步请求关闭
            success:function (result) {
                recommendTotalPage=result;
            }
        });
    }

    var recommendPageSize = 5;
    function draw_recommend_page(index){
        recommendNowPage=index;
        var startPage;
        var endPage;
        if(recommendTotalPage>=recommendPageSize){
            startPage=index-2;
            endPage=index*1+2*1;
            if(startPage<=0){
                startPage=1;
                endPage=recommendPageSize;
            }else if(endPage>recommendTotalPage){
                endPage = recommendTotalPage;
                startPage = endPage-recommendPageSize+1;
            }
        }else{
            startPage=1;
            endPage=recommendTotalPage;
        }
        var recommend_list = $('#recommend-navigator-list .recommend-navigator-list');
        recommend_list.empty();
        for(var i = startPage;i<=endPage;i++){
            if(i==index){
                var post_page_item = $("<li><a href=\"javascript:void(0)\" class=\"navigator-list-active\">"+i+"</a></li>");
                recommend_list.append(post_page_item);
                continue;
            }
            var post_page_item = $("<li><a href=\"javascript:void(0)\">"+i+"</a></li>");
            recommend_list.append(post_page_item);
        }
    }
    function RecommendPageAndIndex(index){
        indexRecommendBlobs(contextPath,index);
        draw_recommend_page(index);
    }
    queryRecommendBlobsCount();
    draw_recommend_page(1);
    $('#recommend-navigator-list').on("click","li a",function(){
        var startPage = $(this).text()
        if(startPage!=recommendNowPage){
            RecommendPageAndIndex(startPage);
        }
    });
    $('#recommend-navigator-list').on("click",".prev-page",function(){
        if(recommendNowPage==1){
        }else{
            RecommendPageAndIndex(recommendNowPage-1);
        }

    });
    $('#recommend-navigator-list').on("click",".next-page",function(){
        if(recommendNowPage==recommendTotalPage){
        }else{
            RecommendPageAndIndex(recommendNowPage*1+1*1);
        }
    });
	/*推荐博客的分页*/

    /**/
    function remove_all_tabs_active(){
        var btn_li = $('#tabs-card-btn').children('li');
        $(btn_li).each(function(i,n){
            var btn_a = $(n).children('a');
            $(btn_a).removeClass('tabs-card-btn-active');
        });
    }
    function add_tab_active(btn){
        if(!$(btn).hasClass('tabs-card-btn-active')){
            $(btn).addClass('tabs-card-btn-active');
        }else{
            $(btn).removeClass('tabs-card-btn-active');
        }
    }
    function remove_all_list(){
        var list = $('#tabs-desc').children('div');
        $(list).each(function(i,n){
            $(n).addClass('hide');
        });
    }
    function add_list(list){
        $(list).removeClass('hide');
    }
    function ico_click(btn,list){
        remove_all_tabs_active();
        remove_all_list();
        add_tab_active(btn);
        add_list(list);
    }
    $('#recommend-ico').click(function(){
        ico_click(this,$('#recommend-list'));
    });
    $('#film-ico').click(function(){
        ico_click(this,$('#video-list'));
    });
    $('#picture-ico').click(function(){
        ico_click(this,$('#pic-list'));
    });
    /**/


});

