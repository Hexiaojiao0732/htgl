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
<script type="text/javascript" src="lbt.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
<div style=" height: 60px; padding: 10px 20px" align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="lbtAdd" onclick="lbtAdd()">轮播图新增</a>
	</label>
</div>
<div id="lbt" class="easyui-datagrid" style="height: 450px;"></div>
<div id="lbt_dialog" class="easyui-dialog"
		style="width: 420px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#lbt-buttons">
		<form id="lbt_form" class="form-style" method="post" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="lbt_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								图片名称:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="tpmc" name="tpmc"
									data-options="required:true" />
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								图片路径:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="tplj" name="tplj"  type="file" style="width:150px" accept="image/*"/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								轮播顺序:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="lbsx" name="lbsx"
									data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem" id="lbsc1">
								轮播时长:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="lbsc" name="lbsc"
									/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								轮播文字:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="lbwz" name="lbwz"
									data-options="required:true" />
							</div>
						</td>
					</tr>
					
					<tr>
						<td align="left">
							<div class="fitem">
							轮播类型:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" name="lblx" class="easyui-combobox" style="width:150px;" id="lblx" data-options="required:true">
							<option value="">请选择</option>
							<option value="0">首页</option>
							<option value="1">合作伙伴</option>
							<option value="2">你的记忆</option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								外链地址:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="url" name="url"/>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="lbt-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="lbtSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#lbt_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!-- 修改 -->
	<div id="lbtedit_dialog" class="easyui-dialog"
		style="width: 420px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#lbtedit-buttons">
		<form id="lbtedit_form" class="form-style" method="post" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="lbt_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								图片名称:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="tpmc" name="tpmc"
									data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								轮播顺序:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="lbsx" name="lbsx"
									data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								轮播时长:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="lbsc" name="lbsc"
									data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								轮播文字:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="lbwz" name="lbwz"
									data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								外链地址:&nbsp;&nbsp;&nbsp;&nbsp; <input
									class="easyui-validatebox" id="url" name="url"/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							轮播类型:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" name="lblx" class="easyui-validatebox" style="width:150px;" id="lblx" data-options="required:true">
							<option value="">请选择</option>
							<option value="0">首页</option>
							<option value="1">合作者</option>
							<option value="2">你的记忆</option>
					</select>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="lbtedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="lbteditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#lbtedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	</body>