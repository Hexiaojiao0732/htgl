$(function(){
    var xmId = getUrlParamByName("xmId");
    //初始化项目详情
    initXmXq(xmId);
    //修改项目点击量
    updataXmDjl(xmId);
    //初始化项目视频
    initXmSp(xmId);
    ////初始化项目图库
    initXmTk(xmId);

    $("#nav a").off("click").on("click",function(){
        var index = $(this).index();
        $(this).addClass("on").siblings().removeClass("on");
        $("#contentBox .box").eq(index).addClass("active").siblings().removeClass("active");
    });
});

function initXmXq(xmId){
    $("#xmUl").html('');
    $("#xmJjDiv").html('');
    $.get(
        "../../memory/xm/queryXmById.do?id="+xmId,
        function(data) {
            data = eval('('+data+')');
            data = data.callbackData;
            if (data && data.result && data.result.length>0) {
                data = data.result[0];
                $("#xmUl").html(data.xmjs);
                var imageUrl = "../../memory/common/imageshow.do?path="+escape(data.xmzp);
                $("#xmImage").attr("src", imageUrl);
                var xmUlHtml = '<li>传承人编号：<span>'+data.ccrbh+'</span></li><li>传承人姓名：'+data.ccrxm+'</li>' +
                    '<li>性别：'+data.ccrxb+'</li><li>出生日期：'+data.ccrcsrq+'</li><li>申报地区或单位：'+data.sbdqhdw+'</li>' +
                    '<li>项目名称：'+data.mc+'</li> <li>项目类别：'+toLx(data.xmlb)+'</li>';
                $("#xmUl").html(xmUlHtml);
                $("#xmJjDiv").html(data.xmjs);
            }
        }
    );
}

function updataXmDjl(xmId){
    $.get(
        "../../memory/xm/updateXmDjl.do?id="+xmId,
        function(data) {

        }
    );
}

function initXmSp(xmId){
    $("#spUl").html('');
    $.get(
        "../../memory/xm/getXmSpByXmId.do?xmId="+xmId,
        function(data) {
            data = eval('('+data+')');
            if (data) {
                $("#spCount").html(data.length);
                var spUlHtml = '';
                for(var i=0; i<data.length; i++) {
                    var row = data[i];
                    var imageUrl = "../../memory/common/imageshowThumb.do?path="+escape(row.spzp);
                    spUlHtml += '<li><a href="../spshow/spshow.html?id='+row.id+'" class="aa"><div class="img"><img src="'+imageUrl+'" />' +
                        '</div><p class="name">'+row.mc+'</p></a></li>';
                }
                $("#spUl").html(spUlHtml);
            }
        }
    );
}


function initXmTk(xmId){
    $("#tkUl").html('');
    $.get(
        "../../memory/xm/getXmTkByXmId.do?xmId="+xmId,
        function(data) {
            data = eval('('+data+')');
            if (data) {
                $("#tkCount").html(data.length);
                var tkUlHtml = '';
                for(var i=0; i<data.length; i++) {
                    var row = data[i];
                    var imageUrl = "../../memory/common/imageshowThumb.do?path="+escape(row.tpdz);
                    tkUlHtml += '<li><div class="aa"><img src="'+imageUrl+'" alt="'+row.mc+'" class="img"  onclick="toImgShow(this);"/>' +
                        '<p class="name">'+row.mc+'</p></div></li>';
                }
                $("#tkUl").html(tkUlHtml);
            }
        }
    );
}

function toImgShow(_this){
    imgShow("#outerdiv", "#innerdiv", "#bigimg", $(_this));
}

function toLx(value){
    if(value == 1){ return "民间文学"; }
    if(value == 2){ return "传统音乐"; }
    if(value == 3){ return "传统舞蹈"; }
    if(value == 4){ return "传统戏剧"; }
    if(value == 5){ return "曲艺"; }
    if(value == 6){ return "传统体育、游艺、杂技"; }
    if(value == 7){ return "传统美术"; }
    if(value == 8){ return "传统技艺"; }
    if(value == 9){ return "传统医药"; }
    if(value == 10){ return "民俗"; }
}

function getUrlParamByName(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}

function imgShow(outerdiv, innerdiv, bigimg, _this){
    var src = _this.attr("src");//获取当前点击的pimg元素中的src属性
    $(bigimg).attr("src", src);//设置#bigimg元素的src属性

    /*获取当前点击图片的真实大小，并显示弹出层及大图*/
    $("<img/>").attr("src", src).load(function(){
        var windowW = $(window).width();//获取当前窗口宽度
        var windowH = $(window).height();//获取当前窗口高度
        var realWidth = this.width;//获取图片真实宽度
        var realHeight = this.height;//获取图片真实高度
        var imgWidth, imgHeight;
        var scale = 0.8;//缩放尺寸，当图片真实宽度和高度大于窗口宽度和高度时进行缩放

        if(realHeight>windowH*scale) {//判断图片高度
            imgHeight = windowH*scale;//如大于窗口高度，图片高度进行缩放
            imgWidth = imgHeight/realHeight*realWidth;//等比例缩放宽度
            if(imgWidth>windowW*scale) {//如宽度扔大于窗口宽度
                imgWidth = windowW*scale;//再对宽度进行缩放
            }
        } else if(realWidth>windowW*scale) {//如图片高度合适，判断图片宽度
            imgWidth = windowW*scale;//如大于窗口宽度，图片宽度进行缩放
            imgHeight = imgWidth/realWidth*realHeight;//等比例缩放高度
        } else {//如果图片真实高度和宽度都符合要求，高宽不变
            imgWidth = realWidth;
            imgHeight = realHeight;
        }
        $(bigimg).css("width",imgWidth);//以最终的宽度对图片缩放

        var w = (windowW-imgWidth)/2;//计算图片与窗口左边距
        var h = (windowH-imgHeight)/2;//计算图片与窗口上边距
        $(innerdiv).css({"top":h, "left":w});//设置#innerdiv的top和left属性
        $(outerdiv).fadeIn("fast");//淡入显示#outerdiv及.pimg
    });

    $(outerdiv).click(function(){//再次点击淡出消失弹出层
        $(this).fadeOut("fast");
    });
}
