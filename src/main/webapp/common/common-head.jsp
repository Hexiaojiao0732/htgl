<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css"	href="<%=request.getContextPath()%>/js/jquery-easyui-1.4.3/themes/gray/easyui.css">
<link rel="stylesheet" type="text/css"	href="<%=request.getContextPath()%>/js/jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css"	href="<%=request.getContextPath()%>/js/jquery-easyui-1.4.3/demo/demo.css">
<link rel="stylesheet" type="text/css"	href="<%=request.getContextPath()%>/css/main.css">
<link rel="stylesheet" type="text/css"	href="<%=request.getContextPath()%>/css/button.css">
<link rel="stylesheet" type="text/css"	href="<%=request.getContextPath()%>/css/gridbutton.css">
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/json2.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/common.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/common2.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/jquery.cookie.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/jquery-easyui-1.4.3/plugins/jquery.dialog.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/extraFunction.js"></script>
<script type="text/javascript"	src="<%=request.getContextPath()%>/js/validates.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/extendeasyui/datagrid.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/IdcardUtil.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ad-gallery.js?rand=995"></script>
<script type="text/javascript">
    function onBigImage(e,obj){
        var pos = getMousePos(e);
        var bigger = '<div id="tooltip"><img src="'+obj.src +'"/></div>';
        $("body").append(bigger);
        var zIndex = 99;
        if($(obj).closest('.window').css('z-index')){
            zIndex = $(obj).closest('.window').css('z-index') +1;
        }
        $("#tooltip").css({
            left:pos.x,
            top:pos.y,
            "z-index":zIndex
        }).show(1000);
    }

    function mvBigImage(){
        $("#tooltip").remove();
    }

    function getMousePos(event) {
        var e = event || window.event;
        var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
        var scrollY = document.documentElement.scrollTop || document.body.scrollTop;
        var x = e.pageX || e.clientX + scrollX;
        var y = e.pageY || e.clientY + scrollY;
        return { 'x': x, 'y': y };
    }

    function getRkjcColumns(type){
        if(type==1){
            return 'GMSFHM,XM,CYM,XB_DM,MZ_DM,CSRQ,JGGJ,JGSSX,ZJXY_DM,WHCD_DM,HYZK_DM,BYZK_DM,ZY,FWCS,DHHM,ZZ,SSPCS,PCS_MC_JZD,SSSSXQ_DM,' +
                    'SSGAJG_DM,JTGX_DM,CSDXZ,YFZGX';
        }
        return 'GMSFHM,XM,CYM,XB_DM,MZ_DM,CSRQ,JGGJ,JGSSX,ZJXY_DM,WHCD_DM,HYZK_DM,BYZK_DM,ZY,FWCS,DHHM,ZZ,SSPCS,PCS_MC_JZD';
    }

    function showImg(sfzh, divName){
        $.ajax({
            type:"post",
            url:"../personinfo/getPersonImg.do",
            data:JSON.stringify({"sfzh":""+sfzh+""}),
            dataType:"json",
            contentType : 'application/json',
            success:function(res){
                if(!res.isError && res.callbackData){
                    var photoBytesList = res.callbackData;
                    var imgHtml='';
                    for(var i in photoBytesList){
                        var photoBytes = photoBytesList[i].photoBytes;
                        var slrq = formatter(new Date(photoBytesList[i].djrq));
                        var ly = photoBytesList[i].ly;
                        var name = ly+"<br/>"+slrq;
                        //展示图片
                        imgHtml +=
                                '<div style="text-align: center;float: left; margin: 7px;" onmousemove="this.style.cursor=\'pointer\'">' +
                                '<img src="data:image/png;base64,'+photoBytes+'" style="width:110px;height:90px;" onmouseover="onBigImage(event,this)" onmouseout="mvBigImage()"/>' +
                                '<br><span>'+name+'</span>' +
                                '</div>';
                    }
                    $('#'+divName).html(imgHtml);
                }
            }
        });
    }

    function watermark(settings) {
        //默认设置
        var defaultSettings={
            watermark_txt:"text",
            watermark_x:350,//水印起始位置x轴坐标
            watermark_y:250,//水印起始位置Y轴坐标
            watermark_rows:10,//水印行数
            watermark_cols:10,//水印列数
            watermark_x_space:200,//水印x轴间隔
            watermark_y_space:100,//水印y轴间隔
            watermark_color:'#aaa',//水印字体颜色
            watermark_alpha:0.4,//水印透明度
            watermark_fontsize:'25px',//水印字体大小
            watermark_font:'微软雅黑',//水印字体
            watermark_width:210,//水印宽度
            watermark_height:80,//水印长度
            watermark_angle:25//水印倾斜度数
        };
        //采用配置项替换默认值，作用类似jquery.extend
        if(arguments.length===1&&typeof arguments[0] ==="object" )
        {
            var src=arguments[0]||{};
            for(key in src)
            {
                if(src[key]&&defaultSettings[key]&&src[key]===defaultSettings[key])
                    continue;
                else if(src[key])
                    defaultSettings[key]=src[key];
            }
        }

        var oTemp = document.createDocumentFragment();

        //获取页面最大宽度
        var page_width = Math.max(document.body.scrollWidth,document.body.clientWidth);
        var cutWidth = page_width*0.0150;
        var page_width=page_width-cutWidth;
        //获取页面最大高度
        var page_height = Math.max(document.body.scrollHeight,document.body.clientHeight)+450;
        // var page_height = document.body.scrollHeight+document.body.scrollTop;
        //如果将水印列数设置为0，或水印列数设置过大，超过页面最大宽度，则重新计算水印列数和水印x轴间隔
        if (defaultSettings.watermark_cols == 0 || (parseInt(defaultSettings.watermark_x + defaultSettings.watermark_width *defaultSettings.watermark_cols + defaultSettings.watermark_x_space * (defaultSettings.watermark_cols - 1)) > page_width)) {
            defaultSettings.watermark_cols = parseInt((page_width-defaultSettings.watermark_x+defaultSettings.watermark_x_space) / (defaultSettings.watermark_width + defaultSettings.watermark_x_space));
            defaultSettings.watermark_x_space = parseInt((page_width - defaultSettings.watermark_x - defaultSettings.watermark_width * defaultSettings.watermark_cols) / (defaultSettings.watermark_cols - 1));
        }
        //如果将水印行数设置为0，或水印行数设置过大，超过页面最大长度，则重新计算水印行数和水印y轴间隔
        if (defaultSettings.watermark_rows == 0 || (parseInt(defaultSettings.watermark_y + defaultSettings.watermark_height * defaultSettings.watermark_rows + defaultSettings.watermark_y_space * (defaultSettings.watermark_rows - 1)) > page_height)) {
            defaultSettings.watermark_rows = parseInt((defaultSettings.watermark_y_space + page_height - defaultSettings.watermark_y) / (defaultSettings.watermark_height + defaultSettings.watermark_y_space));
            defaultSettings.watermark_y_space = parseInt(((page_height - defaultSettings.watermark_y) - defaultSettings.watermark_height * defaultSettings.watermark_rows) / (defaultSettings.watermark_rows - 1));
        }
        var x;
        var y;
        for (var i = 0; i < defaultSettings.watermark_rows; i++) {
            y = defaultSettings.watermark_y + (defaultSettings.watermark_y_space + defaultSettings.watermark_height) * i;
            for (var j = 0; j < defaultSettings.watermark_cols; j++) {
                x = defaultSettings.watermark_x + (defaultSettings.watermark_width + defaultSettings.watermark_x_space) * j;

                var mask_div = document.createElement('div');
                mask_div.id = 'mask_div' + i + j;
                mask_div.className = 'mask_div';
                mask_div.appendChild(document.createTextNode(defaultSettings.watermark_txt));
                //设置水印div倾斜显示
                mask_div.style.webkitTransform = "rotate(-" + defaultSettings.watermark_angle + "deg)";
                mask_div.style.MozTransform = "rotate(-" + defaultSettings.watermark_angle + "deg)";
                mask_div.style.msTransform = "rotate(-" + defaultSettings.watermark_angle + "deg)";
                mask_div.style.OTransform = "rotate(-" + defaultSettings.watermark_angle + "deg)";
                mask_div.style.transform = "rotate(-" + defaultSettings.watermark_angle + "deg)";
                mask_div.style.visibility = "";
                mask_div.style.position = "absolute";
                mask_div.style.left = x + 'px';
                mask_div.style.top = y + 'px';
                mask_div.style.overflow = "hidden";
                mask_div.style.zIndex = "9999";
                mask_div.style.pointerEvents='none';//pointer-events:none  让水印不遮挡页面的点击事件
                //mask_div.style.border="solid #eee 1px";
                mask_div.style.opacity = defaultSettings.watermark_alpha;
                mask_div.style.fontSize = defaultSettings.watermark_fontsize;
                mask_div.style.fontFamily = defaultSettings.watermark_font;
                mask_div.style.color = defaultSettings.watermark_color;
                mask_div.style.textAlign = "center";
                mask_div.style.width = defaultSettings.watermark_width + 'px';
                mask_div.style.height = defaultSettings.watermark_height + 'px';
                mask_div.style.display = "block";
                oTemp.appendChild(mask_div);
            };
        };
        document.body.appendChild(oTemp);
    }

    function loadRKjcxxCount(divName){
        $.ajax({
            type:"post",
            url:"../rkjcxxSearch/loadRKjcxxCount.do",
            dataType:"json",
            contentType : 'application/json',
            success:function(res) {
                if (!res.isError && res.callbackData) {
                    var data = res.callbackData;
                    var html = "<br/><br/><br/>人员总数：" + data.zs + "人&nbsp;&nbsp;&nbsp;&nbsp;本省：" + data.hn + "人&nbsp;&nbsp;&nbsp;&nbsp;外省：" +
                            data.fhn + "人&nbsp;&nbsp;&nbsp;&nbsp;昨日新增：" + data.zrxz + "人";
                    $('#' + divName).html(html);
                }
            }
        });

    }
</script>