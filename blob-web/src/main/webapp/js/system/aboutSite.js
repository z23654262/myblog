$(function() {
    var curWwwPath = window.document.location.href;
//获取主机地址之后的目录如：/chenThree/jspPage/pages/projectImplementation.html
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    var localhostPaht = curWwwPath.substring(0, pos);

//获取主机地址，如： http://localhost:8080/chenThree
    var contextPath = window.location.pathname.split("/")[1];
    var webPath = localhostPaht + "/" + contextPath;

    $.ajax({
        type: "post",
        url: "/" + contextPath + "/getCategoryDetail",
        data: "name=" + "%25%25",
        success: function (result) {
        	var blob_total = 0;
            var site_blob_count_data = new Array();
        	for(var i=0;i<result.length;i++){
                blob_total += result[i].blobList.length;
			}
            for(var i=0;i<result.length;i++){
                site_blob_count_data[i] = new Array();
                site_blob_count_data[i][0] = result[i].categoryDetail;
                site_blob_count_data[i][1] = result[i].blobList.length / blob_total * 100;
            }
            $('#blob-chart').highcharts({
                chart: {
                    type: 'pie'
                },
                title: {
                    text: '本站各类型博客占比示意图'
                },
                credits: {
                    enabled: false
                },
                lang: {
                    contextButtonTitle: "图表导出菜单",
                    decimalPoint: ".",
                    downloadJPEG: "下载JPEG图片",
                    downloadPDF: "下载PDF文件",
                    downloadPNG: "下载PNG文件",
                    downloadSVG: "下载SVG文件",
                    drillUpText: "返回 {series.name}",
                    loading: "加载中",
                    months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
                    noData: "没有数据",
                    numericSymbols: ["千", "兆", "G", "T", "P", "E"],
                    printChart: "打印图表",
                    resetZoom: "恢复缩放",
                    resetZoomTitle: "恢复图表",
                    shortMonths: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
                    thousandsSep: ",",
                    weekdays: ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"]
                },
                exporting: {
                    filename: '各类型博客占比示意图', //导出的文件名
                    type: 'image/png', //导出的文件类型
                    width: 800 //导出的文件宽度
                },
                xAxis: {

                },
                series: [{
                    name: '博客数量占比',
                    data: site_blob_count_data
                }]
            });
		}
	});

});