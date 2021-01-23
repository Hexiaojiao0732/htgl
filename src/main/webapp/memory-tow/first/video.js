
function GoToVideo(){
	$("#nav a").off("click").on("click",function(){
       var index = $(this).index();
       $(this).addClass("on").siblings().removeClass("on");
       $("#contentBox .box").eq(index).addClass("active").siblings().removeClass("active");
     });
	var sUserAgent = navigator.userAgent.toLowerCase();
    var bIsIpad = sUserAgent.match(/ipad/i) == "ipad";
    var bIsIphoneOs = sUserAgent.match(/iphone os/i) == "iphone os";
    var bIsMidp = sUserAgent.match(/midp/i) == "midp";
    var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
    var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
    var bIsAndroid = sUserAgent.match(/android/i) == "android";
    var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
    var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
    if (bIsIpad || bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM) {
        initAppVideo();
    } else {
    	window.open("../spshow/video_1.html", "video_1", "height=450, width=940, top=20, left=20, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
    }
	
}

function initAppVideo(){
	var sjUrl = "http://video.nlc.cn:80/video5/memory/ICH/2021/01/18/91CDD5081409466b84548C6349782CAB5.m3u8";
	if(sjUrl){
	    window.location.href = sjUrl;
	}else{
	    alert("该视频无有效的手机视频播放地址！");
	}
}