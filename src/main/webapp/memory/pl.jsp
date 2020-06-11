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
    <script type="text/javascript" src="bkyj.js"></script>
    <script type="text/javascript" src="queryLogs.js"></script>
<script type="text/javascript" src="pl.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >

<div id="pl" class="easyui-datagrid" ></div>  
<div id="dd_dialog"  class="easyui-dialog"
		style="width: 420px; height: 340px; padding: 10px 20px" closed="true"
		buttons="#pl-buttons">

<div id="pl-buttons" align="right">
			 <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#dd_dialog').dialog('close')">关闭</a>
		</div>
</div>  

</body>