$(function () {
    var blobId = window.location.pathname.split("/")[3];
    var curWwwPath = window.document.location.href;
//获取主机地址之后的目录如：/chenThree/jspPage/pages/projectImplementation.html
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    var localhostPaht = curWwwPath.substring(0, pos);

//获取主机地址，如： http://localhost:8080/chenThree
    var contextPath = window.location.pathname.split("/")[1];
    var webPath = localhostPaht + "/" + contextPath;
    var title = $('#detail-title');
    var time = $('#detail-time');
    var category = $('#detail-category');
    var comment = $('#detail-comment');
    var access = $('#detail-access');
    var tag = $('#detail-tag');
    var message = $('#detail-message');
    $.ajax({
        type: "post",
        url: "/" + contextPath + "/getBlobDetail",
        data: "blobId=" + blobId,
        success: function (result) {
            title.append(result.blobTitle);
            time.append("发布于 " + result.blobTime);
            category.append($("<a href=\""+webPath+"/categoryDetail/"+result.category.categoryDetail+"\" >" + result.category.categoryDetail + "</a>"));
            if (result.commentList == null) {
                comment.append("0评论");
            } else {
                comment.append(result.commentList.length + "0评论");
            }

            access.append(result.blobAccess + "次浏览");
            for (var i = 0; i < result.blobTagList.length; i++) {
                tag.append(" <a href=\"javascript:void(0)\">" + result.blobTagList[i].tagDetail + "</a>");
            }
            message.append(result.blobDetail);
        }
    });
});