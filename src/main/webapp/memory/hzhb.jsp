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
<script type="text/javascript" src="hzhb.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
<div style=" height: 60px; padding: 10px 20px" align="center" id="hzhb1">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="hzhbAdd" onclick="hzhbAdd()">合作伙伴新增</a>
	</label>
</div>
<ul class="pscx_listnr" id="pqList" >
            </ul>  
	<div id="hzhb_dialog" class="easyui-dialog"  
		style="width: 450px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#hzhb-buttons">
		<form id="hzhb_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="hzhb_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"  
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-textbox"
									id="mc" name="mc" style="width:200px;"/>
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								图片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="tp2" accept="image/*" name="tp" type="file" style="width:200px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								登录用户名:&nbsp;&nbsp;<input
									id="dlyhm" name="dlyhm"  class="easyui-textbox" data-options="required:true" style="width:200px;" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							登录密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="dlmm" name="dlmm" style="width:200px;" class="easyui-textbox" data-options="required:true" />
							</div>
						</td>
					</tr>
					
					
					<tr>
						<td align="left">
						<div class="fitem">
								简 介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="jj"  name="jj" 
								style="height: 80px;width:200px;"></textarea>
							</div>
							</td>
					</tr>
					
				</thead>
			</table>
		</form>
		<div id="hzhb-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="hzhbSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#hzhb_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	
	<div id="edit_dialog" class="easyui-dialog"
		style="width: 450px; height: 320px; padding: 10px 20px" closed="true"
		buttons="#edit-buttons">
		<form id="edit_form" class="form-style" method="post"
			style="padding: 10px 40px">
			<table id="edit_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"  
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-textbox"
									id="mc1" name="mc" style="width: 200px;"/>
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								登录用户名:&nbsp;<input
									id="dlyhm1" name="dlyhm" style="width: 200px;" class="easyui-textbox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							登录密码:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="dlmm1" name="dlmm" style="width: 200px;" class="easyui-textbox" data-options="required:true" />
							</div>
						</td>
					</tr>
					
					
					<tr>
						<td align="left">
						<div class="fitem">
								简 介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="jj11"  name="jj" style="height: 80px;width: 200px;"  
								></textarea>
							</div>
							</td>
					</tr>
					
				</thead>
			</table>
		</form>
		<div id="edit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="editSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#edit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!--合作伙伴 图片 修改  -->
	<div id="hzhbtpedit_dialog" class="easyui-dialog"
		style="width: 400px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#hzhbtpedit-buttons">
		<form id="hzhbtpedit_form" class="form-style" method="post"
			style="padding: 10px 40px">
			<table id="edit_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"  
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								图片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="tp11" accept="image/*" name="tp" type="file" style="width:150px">
							</div>
						</td>
					</tr>
					
				</thead>
			</table>
		</form>
		<div id="hzhbtpedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="hzhbtpeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#hzhbtpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	</body>