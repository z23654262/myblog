$(function () {
    var curWwwPath=window.document.location.href;
//获取主机地址之后的目录如：/chenThree/jspPage/pages/projectImplementation.html
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    var localhostPaht=curWwwPath.substring(0,pos);

//获取主机地址，如： http://localhost:8080/chenThree
    var contextPath = window.location.pathname.split("/")[1];
    var webPath = localhostPaht+"/"+contextPath;
    $('#login-btn').click(function () {
        var username = $('#username').val();
        var password = $('#password').val();
        var wrong_message = $('#login-wrongmessage');
        wrong_message.empty();
        $.ajax({
           type: "post",
            url:"/"+contextPath+"/userLogin",
            data:"username="+username+"&password="+password,
            success:function (result) {
                if(result.msg!='success'){
                    var wrong_datail = $("<p>"+result.msg+"</p>");
                    wrong_message.append(wrong_datail);
                    wrong_message.css('display','block');
                }else{
                    window.location.href = webPath;
                }
            }
        });
    });
});