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
<script type="text/javascript" src="zx.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
<div style=" height: 60px; padding: 10px 20px" align="center" >
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="zxAdd" onclick="zxAdd()">资讯新增</a>
	</label>
</div>

<div id="zxdata" class="easyui-datagrid" ></div>

<div id="zx_dialog" class="easyui-dialog"
		style="width: 420px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#zx-buttons">
		<form id="zx_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="zx_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
							类型:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select type="text" class="easyui-validatebox" style="width:200px;" id="dlx" name="dlx" data-options="required:true">
									<option value="">请选择</option>
									<option value="1" onclick="xuesu();">相关推荐</option>
									<option value="2" onclick="xinwen();">新闻动态</option>
									<option value="3" onclick="xuesu();">推荐书目</option>
								</select>
							</div>
						</td>
					</tr>
				
					<tr>
						<td>
							<div class="fitem">
								标题:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
									id="bt" name="bt"  style="width:200px;" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem" id="xsurl">
								学术URL:&nbsp;&nbsp;<input  
									id="xsurl" name="xsurl"  style="width:200px;" data-options="required:true" />
							</div>
						</td>
					</tr>
				<!-- <tr>
						<td>
							<div class="fitem" >
								子类型:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
									id="zlx" name="zlx"   data-options="required:true" />
							</div>
						</td>
					</tr> -->
					<tr>
						<td>
							<div class="fitem">
								图片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="tp" accept="image/*" name="tp" type="file"  style="width:200px">
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
							开始时间:&nbsp;&nbsp;<input 
									id="fssj" name="fssj"  class="easyui-datetimebox" style="width:200px;"/>
							</div>
						</td>
					</tr>
					
					<tr>
						<td align="left">
						<div class="fitem">
								内容:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="nr" name="nr"   class="easyui-validatebox" style="width:200px;height: 80px"
								></textarea>
							</div>
							</td>
					</tr>
					
				</thead>
			</table>
		</form>
		<div id="zx-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="zxSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#zx_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!-- 修改 -->
	<div id="zxedit_dialog" class="easyui-dialog"
		style="width: 420px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#zxedit-buttons">
		<form id="zxedit_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="zxedit_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
							类型:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select type="text" class="easyui-validatebox" style="width:200px;" id="dlx" name="dlx" data-options="required:true">
									<option value="">请选择</option>
									<option value="1" onclick="xuesu1();">相关机构</option>
									<option value="2" onclick="xinwen1();">新闻动态</option>
									<option value="3" onclick="xuesu1();">推荐书目</option>
								</select>
							</div>
						</td>
					</tr>
				
					<tr>
						<td>
							<div class="fitem">
								标题:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox" style="width:200px;"
									id="bt" name="bt"   data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem" id="xsurl1">
								学术URL:&nbsp;&nbsp;<input  
									id="xsurl1" name="xsurl"  style="width:200px;" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
							开始时间:&nbsp;&nbsp;<input 
									id="fssj" name="fssj" style="width:200px;" class="easyui-datetimebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					
					<tr>
						<td align="left">
						<div class="fitem">
								内容:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="nr" name="nr" style="width:200px;height: 80px;"   class="easyui-validatebox"
								></textarea>
							</div>
							</td>
					</tr>
					
				</thead>
			</table>
		</form>
		<div id="zxedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="zxeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#zxedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<!--图片 修改  -->
	<div id="zxtpedit_dialog" class="easyui-dialog"
		style="width: 420px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#zxtpedit-buttons">
		<form id="zxtp_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="zxtpedit_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								图片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="tp1" accept="image/*" name="tp" type="file"  style="width:200px">
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="zxtpedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="zxtpeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#zxtpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
</body>