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
<script type="text/javascript" src="gxz.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
<div style=" height: 60px; padding: 10px 20px" align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="gxzAdd" onclick="gxzAdd()">贡献者新增</a>
	</label>
</div>
<div id="gxz" class="easyui-datagrid" style="height: 450px;"></div>
<div id="gxz_dialog" class="easyui-dialog"
		style="width: 450px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#gxz-buttons">
		<form id="gxz_form" class="form-style" method="post" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="gxz_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								姓名:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="xm" name="xm"
									data-options="required:true" style="width:200px;" />
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								照片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zp11" name="zp"  type="file" style="width:200px" accept="image/*"/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left"><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="jj" class="easyui-validatebox" name="jj" style="height:90px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="gxz-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="gxzSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#gxz_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!-- 贡献者 修改 -->
	<div id="gxzedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#gxzedit-buttons">
		<form id="gxzedit_form" class="form-style" method="post" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="gxz_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								姓名:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="xm" name="xm"
									data-options="required:true" style="width:200px;"/>
							</div>
						</td>
					</tr>

					<tr>
						<td align="left"><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="jj" class="easyui-validatebox" name="jj" style="height:90px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="gxzedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="gxzeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#gxzedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!-- 图片 修改 -->
	<div id="gxztpedit_dialog" class="easyui-dialog"
		style="width: 420px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#gxztp-buttons">
		<form id="gxztp_form" class="form-style" method="post" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="gxz_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								照片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zp2" name="zp"  type="file" style="width:200px" accept="image/*"/>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="gxztp-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="gxztpSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#gxztpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	</body>