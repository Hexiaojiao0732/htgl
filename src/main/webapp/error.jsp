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
<title>错误</title>
<link href="<%=request.getContextPath()%>/css/errorstyle.css" rel="stylesheet" type="text/css"/>
</head>

<body style="overflow-y:hidden;">

	<div class="error_a">
        <img src="<%=request.getContextPath()%>/image/error/error_a.png"/>
        <p>对不起，系统找不到您要访问的页面！</p></br><span>Error, Page Not Found!</span>
    </div>

</body>
</html>
