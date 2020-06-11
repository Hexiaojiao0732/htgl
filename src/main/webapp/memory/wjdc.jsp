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
    <link type="text/css" rel="stylesheet" href="css/css.css" />
    <link type="text/css" rel="stylesheet" href="css/search.css" />
    <link type="text/css" rel="stylesheet" href="css/indexht.css" />
    <link type="text/css" rel="stylesheet" href="css/main.css" />
    <%@ include file="/common/common-head.jsp"%>
    <script src="../../js/echarts/echarts-all.js"></script>
    <script type="text/javascript" src="bkyj.js"></script>
    <script type="text/javascript" src="queryLogs.js"></script>
<script type="text/javascript" src="wjdc.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
 <div id="dc" align="center">
     <input type="button" id="securityAdd" name="tijiao" value="数据导出" readonly="readonly" class="bc_on9" onclick="exportData()"/>
    </div>
   	<div id="wjdc1" class="easyui-datagrid" style="height:300px;" ></div>  
     <!-- 第一个导出数据表单 -->
	 <form id="exportForm" name="exportForm" method="post" >
		<!-- <input id="xm" name="xm" type="hidden">
		<input  id="xb" name="xb" type="hidden">
		<input  id="csrq" name="csrq" type="hidden">
		<input  id="jzgMc" name="jzgMc" type="hidden">
		<input  id="gmXsbh" name="gmXsbh" type="hidden">
		<input  id="z" name="z" type="hidden">
		<input  id="czsj" name="czsj" type="hidden"> -->
		<input type="hidden" id="tempString" name="tempString">
	</form> 
    
<div id="wjdc_dialog" class="easyui-dialog"
		style="width: 420px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#wjdc-buttons">
		<form id="wjdc_form" class="form-style" method="post"
			style="padding: 10px 40px">
			<table id="wjdc_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								姓名:&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="xm" name="xm"
									data-options="validType:'maxLength[128]'" />
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								性别:&nbsp;&nbsp;&nbsp;&nbsp;<input id="xb" name="xb" type="text" style="width:135px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								出生日期:&nbsp;<input id="csrq" name="csrq" type="text" class="easyui-datetimebox" style="width:135px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								联系方式:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="lxfs" name="lxfs"   data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							所在地区:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="szdq" name="szdq"  data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							关注内容:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="gznr" name="gznr"    data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							相关经验:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zyyxgjy" name="zyyxgjy"    data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							掌握语言:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zwyy" name="zwyy"    data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							提供资源:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="tgzynr" name="tgzynr"    data-options="required:true" />
							</div>
						</td>
					</tr>
					
				</thead>
			</table>
		</form>
		<div id="wjdc-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="wfdcSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#wjdc_dialog').dialog('close')">取消</a>
		</div>
	</div>
	</body>