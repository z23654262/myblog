var curWwwPath = window.document.location.href;
//获取主机地址之后的目录如：/chenThree/jspPage/pages/projectImplementation.html
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);

//获取主机地址，如： http://localhost:8080/chenThree
var contextPath = window.location.pathname.split("/")[1];
var webPath = localhostPaht + "/" + contextPath;

/*初始化所有类别信息*/
function initChooseCategory() {
    var choose_list = $('#choose-list');
    $.ajax({
        type: "post",
        url: "/" + contextPath + "/getCategoryBlobsCount",
        success: function (result) {
            for (var i = 0; i < result.length; i++) {
                var choose_item = $("<div class=\"col-lg-3 col-md-3 col-sm-4 col-xs-6\">\n" +
                    "            <div class=\"choose-item\">\n" +
                    "                <div class=\"category-detail\">\n" +
                    "                    <div class=\"label-category-ico label-category-ico" + result[i].categoryId + "\">\n" +
                    "                    </div>\n" +
                    "                    <h3><a href=\""+webPath+"/categoryDetail/"+result[i].categoryDetail+"\">" + result[i].categoryDetail + "</a></h3>\n" +
                    "                </div>\n" +
                    "                <div class=\"category-count\">\n" +
                    "                    <p>博客数量</p>\n" +
                    "                    <p>" + result[i].blobCount + "</p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </div>");
                choose_list.append(choose_item);
            }
            choose_list.append("<div class=\"clearfix\"></div>");
        }
    });
}

/*使用ajax向某名字对应的类别详情及类别博客列表内添加数据*/
function initCategoryDetail(){
    var categoryName = window.location.pathname.split("/")[3];
    categoryName = decodeURI(categoryName);
    var category_container = $('#category-container');
    $.ajax({
       type:"post",
        url:"/"+contextPath+"/getCategoryDetail",
        data:"name="+categoryName,
        success:function (result) {
            for(var i=0;i<result.length;i++){
                var category_title = $("<div class=\"category-title movein\">\n" +
                    "        <span class=\"glyphicon glyphicon-th\"></span>\n" +
                    "        <h2 id=\"category-title\">分类："+result[i].categoryDetail+"</h2>\n" +
                    "    </div>");
                category_container.append(category_title);

                var category_blob = "";
                /*填充博客数据*/
                for(var j=0;j<result[i].blobList.length;j++){
                    category_blob = category_blob + "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n" +
                        "            <div class=\"category-blob\">\n" +
                        "                <a href=\""+webPath+"/blobDetail/"+result[i].blobList[j].blobId+"\">"+result[i].blobList[j].blobTitle+"</a>\n" +
                        "                <span>发布于:"+result[i].blobList[j].blobTime+"</span>\n" +
                        "            </div>\n" +
                        "        </div>";
                }

                var category_blobs = $("<div class=\"category-blobs movein\">" + category_blob +"<div class=\"clearfix\"></div></div>");

                category_container.append(category_blobs);
            }
            category_container.append($("<div class=\"clearfix\"></div>"));
        }
    });
}