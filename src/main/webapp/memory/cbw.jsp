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
<script type="text/javascript" src="cbw.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >

<div style=" height: 60px; padding: 10px 20px" align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="wdAdd" onclick="wdAdd()">出版物新增</a>
	</label>
</div>

<div id="cbw" class="easyui-datagrid" ></div>  
<div id="wd_dialog" class="easyui-dialog"
		style="width: 450px; height: 500px; padding: 10px 20px" closed="true"
		buttons="#wd-buttons">
		<form id="wd_form" class="form-style" 
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="mc" name="mc" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
						<tr>
						<td>
							<div class="fitem">
							唯一编号:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="wyid" name="wyid" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								专题名称:&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-combobox" id="ztId1" name="ztId" style="width:200px;"
									/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								人物名称:&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-combobox" id="rwId" name="rwId" style="width:200px;"
									/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								记录名称:&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-combobox" id="jlId" name="jlId" style="width:200px;" 
									/>
							</div>
						</td>
					</tr>
				
					<tr>
						<td>
							<div class="fitem">
								页数:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="ys" name="ys" style="width:200px;"  class="easyui-numberspinner"  />
							</div>
						</td>
					</tr>
					<!-- <tr>
					<td align="left">
							<div class="fitem">
							文件类型:&nbsp;&nbsp;&nbsp;&nbsp;<select type="text"  style="width:200px;" id="wllx" name="wjlx" data-options="required:true">
							<option value="">请选择</option>
							<option value="音频">音频</option>
							<option value="视频">视频</option>
							<option value="图库">图库</option>
							<option value="文档">文档</option>
					</select>
							</div>
						</td>
					</tr> -->
					
					<tr>
						<td>
							<div class="fitem">
							拍摄时间:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="pssj" name="pssj"  style="width:200px;"  class="easyui-datetimebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								拍摄地点:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="psdd" name="psdd" class="easyui-validatebox" style="width:200px;"  />
							</div>
						</td>
					</tr>
						<tr>
						<td align="left">
							<div class="fitem">
								贡献者名称:&nbsp;<input
									class="easyui-combobox" id="gxzId" name="gxzId" style="width:200px;"
									/>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="wd-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="wdSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#wd_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<div id="shwd_dialog" class="easyui-dialog"
		style="width: 450px; height: 250px; padding: 10px 20px" closed="true"
		buttons="#shwd-buttons">
		<form id="shwd_form" class="form-style" 
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
						<tr>
						<td>
							<div class="fitem">
							唯一编号:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="wyid" name="wyid" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="shwd-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="shwdSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#shwd_dialog').dialog('close')">取消</a>
		</div>
	</div>
</body>