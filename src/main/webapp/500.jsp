<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>500错误</title>
<link href="<%=request.getContextPath()%>/css/errorstyle.css" rel="stylesheet" type="text/css"/>
</head>

<body style="overflow-y:hidden;">
<!--hader-->
<div class="loginheader"><img src="<%=request.getContextPath()%>/image/error/loginlogo.jpg"/></div>
<!--hader end-->
<!--contentå¼å§-->
	<div class="error_b">
        <img src="<%=request.getContextPath()%>/image/error/error_d.png"/>
        <p>对不起，系统发生未知错误！</p></br><span>Error, Page Unknown Error!</span>
        <input type="button" name="xiayibu" value="返回首页"onmousemove="this.className='bc_on'" onmouseout="this.className='bc_out'"/>
    </div>
<!--footer-->
<div class="loginfooter">Copyright Â© 2015<br/>版权所有 上海致昕信息科技有限公司</div>
<!--footer end-->
</body>
</html>
