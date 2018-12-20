var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var contextPath = window.location.pathname.split("/")[1];
var webPath = localhostPaht + "/" + contextPath;

function initArchiveBlobByDate() {
    var archive_container = $('#date-blob-container');
    $.ajax({
        type: "post",
        url: "/" + contextPath + "/getArchivesBlobByDate",
        success: function (result) {
            for (var i = 0; i < result.length; i++) {
                var archive_title = $("<div class=\"date-blob-title movein\">\n" +
                    "        <span class=\"glyphicon glyphicon-pushpin\"></span>\n" +
                    "        <h2>" + result[i].blobDate + "</h2>\n" +
                    "    </div>");
                var archive_item = "";
                for (var j = 0; j < result[i].blobList.length; j++) {
                    archive_item += "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n" +
                        "            <div class=\"date-blob-item\">\n" +
                        "                <p class=\"item-title\">\n" +
                        "                    <a href=\"" + webPath + "/blobDetail/" + result[i].blobList[j].blobId + "\">" + result[i].blobList[j].blobTitle + "</a>\n" +
                        "                </p>\n" +
                        "                <p class=\"item-meta\">\n" +
                        "                    发布于" + result[i].blobList[j].blobTime + "\n" +
                        "                </p>\n" +
                        "            </div>\n" +
                        "        </div>";
                }
                var archive_list = $(" <div class=\"date-blob-list movein\">\n" + archive_item + "<div class=\"clearfix\"></div></div>");
                archive_container.append(archive_title);
                archive_container.append(archive_list);
            }
        }
    });
}