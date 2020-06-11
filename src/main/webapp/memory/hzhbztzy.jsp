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
<script type="text/javascript" src="hzhbztzy.js"></script>
</head>
<body class="easyui-layout">   
<!-- <input type="hidden" id="id" name="id" /> -->
    <div data-options="region:'north',title:'合作伙伴专题',split:true" style="height:50%;">
    <table id="hzhbzt"></table>  
    </div>   
    <div data-options="region:'south',title:'合作伙伴专题资源',split:true" style="height:50%;">
    <table id="hzhbztzy"></table> 
    </div>   
    <div id="hzhbztToolbar" style="padding: 5px; height: auto">
		<div>
			审核筛选:<select type="text"  style="width:200px;" id="zt" name="zt" data-options="required:true">
							<option value="">全部</option>
							<option value="1">已审核</option>
							<option value="0">未审核</option>
					</select>&nbsp;&nbsp;
			<a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-search"
				onclick="hzhbztSearch()">查询</a>&nbsp;&nbsp; 
		</div>
	</div>
    <div id="hzhbztzyToolbar" style="padding: 5px; height: auto">
		<div>
			审核筛选:<select type="text"  style="width:200px;" id="zyzt" name="zyzt" data-options="required:true">
							<option value="">全部</option>
							<option value="1">已审核</option>
							<option value="0">未审核</option>
					</select>&nbsp;&nbsp;
			<a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-search"
				onclick="hzhbztzySearch()">查询</a>&nbsp;&nbsp; 
		</div>
	</div>
    <div id="hzhbzt_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#hzhbzt-buttons">
		<form id="hzhbzt_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="wjdc_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								合作伙伴专题照片:<input
									id="zp" name="zp"  accept="image/*" type="file" style="width:150px"/>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="hzhbzt-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="hzhbztSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#hzhbzt_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	
	 <div id="hzhbztzy_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#hzhbztzy-buttons">
		<form id="hzhbztzy_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="wjdc_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								合作伙伴资源照片:<input
									id="zp1" name="zp"  accept="image/*" type="file" style="width:150px"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								资源部字符串&nbsp;&nbsp;&nbsp;&nbsp;:<input
									id="zybzfc" name="zybzfc"   class="easyui-textbox" style="width:150px"/>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="hzhbztzy-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="hzhbztZySaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#hzhbztzy_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
		 <div id="hzhbztzy1_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#hzhbztzy1-buttons">
		<form id="hzhbztzy1_form" class="form-style" 
			style="padding: 10px 40px">
			<table id="wjdc_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								资源部字符串:<input
									id="zybzfc1" name="zybzfc"   class="easyui-textbox" style="width:150px"/>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="hzhbztzy1-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="hzhbztZy1SaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#hzhbztzy1_dialog').dialog('close')">取消</a>
		</div>
	</div>
</body> 