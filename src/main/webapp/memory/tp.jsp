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

</head>
<body class="easyui-layout" style="width: 100%;height: 100%;">
	<div style="padding: 5px; height: auto">
		<div>
			投票是否关闭:<select type="text"  style="width:200px;" id="flag" name="flag" data-options="required:true">
							<option value="1">是</option>
							<option value="2">否</option>
					</select>&nbsp;&nbsp;
			<a href="#"
				class="easyui-linkbutton" name="saveButton" iconCls="icon-search"
				onclick="save()">保存</a>&nbsp;&nbsp; 
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			var url = "../memory/tp/selectTpConfig.do";
		    $.ajax({
		        url : url,
		        type : "POST",
		        dataType: 'json',
		        contentType:'application/json;charset=UTF-8',
		        success : function(data){
		             var flag = data.flag;
		             $("#flag option").each(function(){
		         		if($(this).val()==flag){
		         			$(this).attr("selected",true);
		         			return;
		         		}
		         	});
		        },
		        error : function(data){
		            alert('系统错误！');
		        }
		    });
		});
		function save(){
			var selectVal = $("#flag").find('option:selected').val();
			var url = "../memory/tp/updateTpConfig.do?flag="+selectVal;
		    $.ajax({
		        url : url,
		        type : "POST",
		        dataType: 'json',
		        contentType:'application/json;charset=UTF-8',
		        success : function(data){
		        	$.messager.alert("提示", "保存成功");
		        },
		        error : function(data){
		            alert('系统错误！');
		        }
		    });
		}
	</script>
</body>