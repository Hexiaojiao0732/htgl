<%@ page import="com.zhixin.rd.rkjc.web.common.PropertyUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <script type="text/javascript">
        var basePath = '<%=basePath%>';
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理系统</title>
    <link type="text/css" rel="stylesheet" href="css/common.css" />
    <link type="text/css" rel="stylesheet" href="css/search.css" />
    <link type="text/css" rel="stylesheet" href="css/indexht.css" />
    <link type="text/css" rel="stylesheet" href="css/main.css" />
    <%@ include file="/common/common-head.jsp"%>
    <script src="../../js/echarts/echarts-all.js"></script>
    <link rel="stylesheet" href="css/admin.css">
</head>
<body>
	<!-- begin:header -->
	<header>
		<div class="logo">
			<img src="../images/logo.png" alt="logo" title="logo">
		</div>
	</header>
	<!-- end:header -->
	<!--begin:main-->
	<div class="main clearfix" >
		<!--begin:main-side-->
		<div class="main-side">
			<div id="wrapper" class="wrapper">
					<ul id="menuUl" class="menulist">
						<li  class="active">
							<a href="#" onclick="load(1)"><div><i class="icon icon-menu3"></i><span>专题管理 </span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(2)"><div><i class="icon icon-menu1"></i><span>记录管理</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(3)"><div><i class="icon icon-menu2"></i><span>人物管理</span> </div></a>
						</li>
						
						<li>
							<a href="#" onclick="load(4)"><div><i class="icon icon-menu4"></i><span>合作伙伴 </span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(5)"><div><i class="icon icon-menu5"></i><span>视频管理</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(6)"><div><i class="icon icon-menu6"></i><span>音频管理</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(7)"><div><i class="icon icon-menu7"></i><span>图库管理</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(8)"><div><i class="icon icon-menu8"></i><span>文档管理</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(9)"><div><i class="icon icon-menu9"></i><span>资讯管理</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(10)"><div><i class="icon icon-menu10"></i><span>大事记</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(11)"><div><i class="icon icon-menu11"></i><span>贡献者</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(12)"><div><i class="icon icon-menu8"></i><span>调查问卷</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(13)"><div><i class="icon icon-menu9"></i><span>意见建议</span></div></a>
						</li>
						<li>
							<a href="#" onclick="load(14)"><div><i class="icon icon-menu9"></i><span>评论管理</span></div></a>
						</li> 
						<li>
							<a href="#" onclick="load(15)"><div><i class="icon icon-menu9"></i><span>轮播图</span></div></a>
						</li> 
						<li>
							<a href="#" onclick="load(16)"><div><i class="icon icon-menu9"></i><span>首页设置</span></div></a>
						</li> 
						<li>
							<a href="#" onclick="load(17)"><div><i class="icon icon-menu9"></i><span>项目管理</span></div></a>
						</li> 
					</ul>
			</div>
		</div>
		<!--end:main-side-->
		<!--begin: tabs-->
		<div id="tabs" class="main-content">
			<!--åå®¹é¨å-->
			<iframe border="0" id="loadIframe" width="1000" height="700" style="overflow: scroll;" scrolling="yes"  frameborder="0" src="zt.jsp"> </iframe>        
		</div>
		<!--end:tabs-->
	</div>
	<!--end:main-->
	<!--begin:footer-->
	<footer>京ICP备05014420号国家图书馆版权所有</footer>
	<!--end:footer-->
	<script type="text/javascript">
	    $(function(){
			var w = $(window).width()-220;
			var h = $(window).height()+200;
			$("#loadIframe").attr('width', w+"px");
			$("#loadIframe").attr('height',h+"px");
	    });
	    
	    var lastIndex = -1;
		function load(index){
			var url = '';
			switch (index) {
			case 1:
				url = 'zt.jsp';
				break;
			case 2:
				url = 'jl.jsp';
				break;
			case 3:
				url = 'rw.jsp';
				break;
			case 4:
				url = 'hzhb.jsp';
				break;
			case 5:
				url = 'sp.jsp';
				break;
			case 6:
				url = 'yp.jsp';
				break;
			case 7:
				url = 'tk.jsp';
				break;
			case 8:
				url = 'wd.jsp';
				break;
			case 9:
				url = 'zx.jsp';
				break;
			case 10:
				url = 'dsj.jsp';
				break;
			case 11:
				url = 'gxz.jsp';
				break;
			case 12:
				url = 'wjdc.jsp';
				break;
			case 13:
				url = 'yj.jsp';
				break;
			case 14:
				url = 'pl.jsp';
				break; 
			case 15:
				url = 'lbt.jsp';
				break; 
			case 16:
				url = 'shouye.jsp';
				break; 
			case 17:
				url = 'xm.jsp';
				break; 
			default:
				break;
			}
			$("#loadIframe").attr("src", url);
			$($("#menuUl li")[index-1]).attr("class", "active");
			if(lastIndex>-1){
				$($("#menuUl li")[lastIndex-1]).removeAttr("class");
			}
			lastIndex = index;
		}	
	</script>
</body>
</html>