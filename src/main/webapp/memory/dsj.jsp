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
<script type="text/javascript" src="dsj.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
<div style=" height: 60px; padding: 10px 20px"  align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="dsjAdd" onclick="dsjAdd()">大事件新增</a>
	</label>
</div>
<div id="dsj" class="easyui-datagrid" style="height: 450px;"></div> 
<div id="dsj_dialog" class="easyui-dialog"
		style="width: 450px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#dsj-buttons">
		<form id="sj_form" class="form-style" method="post"  enctype="multipart/form-data" target="myIfram"
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
								事件名称:&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="sjmc" name="sjmc" style="width:200px;"
									data-options="required:true"/>
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								事件时间:&nbsp;&nbsp;&nbsp;&nbsp;<input id="sjsj" name="sjsj" type="text" class="easyui-datetimebox" style="width:200px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								事件照片:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sjzp" name="sjzp"   type="file" accept="image/*" style="width:200px"/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left"><div class="fitem">
								事件内容:&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="sjnr" class="easyui-validatebox" name="sjnr" style="height:90px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="dsj-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="dsjSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#dsj_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!--修改  -->
	<div id="dsjedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#dsjedit-buttons">
		<form id="sjedit_form" class="form-style" method="post"  enctype="multipart/form-data" target="myIfram"
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
								事件名称:&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="sjmc" name="sjmc" style="width:200px;"
									data-options="required:true"/>
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								事件时间:&nbsp;&nbsp;&nbsp;&nbsp;<input id="sjsj" name="sjsj" type="text" class="easyui-datetimebox" style="width:200px" data-options="required:true">
							</div>
						</td>
					</tr>
					<tr>
						<td align="left"><div class="fitem">
								事件内容:&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="sjnr" class="easyui-validatebox" name="sjnr" style="height:90px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="dsjedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="dsjeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#dsjedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!-- 修改图片 -->
	<div id="dsjedittp_dialog" class="easyui-dialog"
		style="width: 420px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#dsjtp-buttons">
		<form id="sjtp_form" class="form-style" method="post"  enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="sjtp_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								事件照片:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sjzp1" name="sjzp"   type="file" accept="image/*" style="width:200px"/>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="dsjtp-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="dsjtpSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#dsjedittp_dialog').dialog('close')">取消</a>
		</div>
	</div>
	</body>