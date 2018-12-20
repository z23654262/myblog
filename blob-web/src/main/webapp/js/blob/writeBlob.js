var contextPath = window.location.pathname.split("/")[1];
var editor = new Simditor({
	textarea: $('#editor'),
	toolbar: ['emoji', 'title', 'bold', 'italic', 'underline', 'strikethrough', 'fontScale', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment']
		//optional options
		,
	toolbarFloat:true,
	emoji: {
		imagePath: 'simditor/images/emoji/'
	},
	upload : {
	            url : "/"+contextPath+"/blobImgUpload", //文件上传的接口地址
	            //params: {}, //键值对,指定文件上传接口的额外参数,上传的时候随文件一起提交
	            fileKey: 'photo', //服务器端获取文件数据的参数名
	            connectionCount: 1,
	            leaveConfirm: '正在上传文件'
    },
	success: function(success){
		alert(success);
	},
	error:function () {
		alert('文件上传失败');
    }
});
$(document).on("blur", "#blob-detail-content", function() {
    var content = $(".simditor-body").html();
    $("#blobDetail").val(content);
});

function initCategory() {
	var blob_category = $('#blob-category');
	$.ajax({
		type:"post",
		url:"/"+contextPath+"/getAllCategory",
		success:function (result) {
			for(var i=0;i<result.length;i++){
				var category_item = $("<option value=\""+result[i].categoryId+"\">"+result[i].categoryDetail+"</option>");
                blob_category.append(category_item);
			}
        }
	})
}