function pageNavigator(id) {

}
var curWwwPath=window.document.location.href;
//获取主机地址之后的目录如：/chenThree/jspPage/pages/projectImplementation.html
var pathName=window.document.location.pathname;
var pos=curWwwPath.indexOf(pathName);
var localhostPaht=curWwwPath.substring(0,pos);

//获取主机地址，如： http://localhost:8080/chenThree
var contextPath = window.location.pathname.split("/")[1];
var webPath = localhostPaht+"/"+contextPath;



function indexBlobs(contextPath,index){
    var post_list = $('#post-list');
    post_list.empty();
    $.ajax({
        type: "post",
        url: "/"+contextPath+"/queryrIndexBlobs",
        data: "startPage="+index,
        success: function (result) {
            for (var i = 0; i < result.length; i++) {
                var post_item = $("<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n" +
                    "            <div class=\"post-item movein\">\n" +
                    "                <div class=\"post-img\">\n" +
                    "                    <a href=\"javascript:void(0)\" class=\"block\">\n" +
                    "                        <p class=\"movein hide\">\n" +
                    result[i].blobSummary +
                    "                        </p>\n" +
                    "                        <img src=\"img/system/"+result[i].category.categoryId+".jpg\" class/>\n" +
                    "                    </a>\n" +
                    "                </div>\n" +
                    "                <div class=\"post-label\">\n" +
                    "                    <div class=\"label-title\">\n" +
                    "                        <a href=\""+webPath+"/blobDetail/"+result[i].blobId+"\">\n" +
                    result[i].blobTitle +
                    "                        </a>\n" +
                    "                        <span>\n" +
                    result[i].blobTime +
                    "                        </span>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"label-category-ico label-category-ico"+result[i].category.categoryId+"\">\n" +
                    "                    </div>\n" +
                    "                    <div class=\"label-category\">\n" +
                    "                        <a href=\""+webPath+"/categoryDetail/"+result[i].category.categoryDetail+"\">\n" +
                    result[i].category.categoryDetail +
                    "                        </a>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </div>");
                post_list.append(post_item);
            }

            post_list.append("<div class=\"clearfix\">\n" +
                "        </div>");
        }
    });
}
function indexRecommendBlobs(contextPath,index){
    var recommend_post_list = $('#recommend-container');
    recommend_post_list.empty();
    $.ajax({
        type: "post",
        url: "/"+contextPath+"/queryrRecommendIndexBlobs",
        data: "startPage="+index,
        success: function (result) {
            for (var i = 0; i < result.length; i++) {
                var recommend_item = $("<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n" +
                    "                <div class=\"recommend-item movein\">\n" +
                    "                    <div class=\"post-label\">\n" +
                    "                        <div class=\"label-title\">\n" +
                    "                            <a href=\""+webPath+"/blobDetail/"+result[i].blobId+"\">\n" +
                    result[i].blobTitle +
                    "                            </a>\n" +
                    "                            <span>\n" +
                    result[i].blobTime  +
                    "                            </span>\n" +
                    "                            <div class=\"post-access\">\n" +
                    "\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-eye-open\">\n" +
                    "\t\t\t\t\t\t\t\t\t\t</span>\n" +
                    "                                <p>\n" +
                    result[i].blobAccess +"浏览"+
                    "                                </p>\n" +
                    "                                <div class=\"clearfix\">\n" +
                    "                                </div>\n" +
                    "                            </div>\n" +
                    "                        </div>\n" +
                    "                    <div class=\"label-category-ico label-category-ico"+result[i].category.categoryId+"\">\n" +
                    "                        </div>\n" +
                    "                        <div class=\"label-category\">\n" +
                    "                            <a href=\""+webPath+"/categoryDetail/"+result[i].category.categoryDetail+"\">\n" +
                    result[i].category.categoryDetail +
                    "                            </a>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "            </div>");
                recommend_post_list.append(recommend_item);
            }
            recommend_post_list.append("<div class=\"clearfix\">\n" +
                "        </div>");
        }
    });
}
function InitJson(index) {
    indexBlobs(contextPath,index);
    indexRecommendBlobs(contextPath,index);
}