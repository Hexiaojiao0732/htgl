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
<script type="text/javascript" src="tk.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >

<div style=" height: 60px; padding: 10px 20px"  align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="tkAdd" onclick="tkAdd()">图库新增</a>
	</label>
</div>
<div id="tkToolbar" style="padding: 5px; height: auto">
		<div>
			审核筛选:<select type="text"  style="width:200px;" id="tkZt" name="tkZt" data-options="required:true">
							<option value="">全部</option>
							<option value="1">已审核</option>
							<option value="0">未审核</option>
					</select>&nbsp;&nbsp;
			<a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-search"
				onclick="tkSearch()">查询</a>&nbsp;&nbsp; 
		</div>
	</div>
<div id="tk" class="easyui-datagrid" style="height: 450px;"></div> 
<div id="tk_dialog" class="easyui-dialog"
		style="width: 450px; height: 500px; padding: 10px 20px" closed="true"
		buttons="#tk-buttons">
		<form id="tk_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
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
							照片地址:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="tpdz" name="tpdz" style="width:200px;" accept="image/*" type="file" />
							</div>
						</td>
					</tr>
					<!-- <tr>
						<td align="left">
							<div class="fitem">
								专题名称:&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-combobox" id="ztId1" name="ztId" style="width:200px;" 
									/>
							</div>
						</td>
					</tr> -->
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
									id="pssj" name="pssj"  style="width:200px;"  class="easyui-datetimebox"  data-options="required:true"/>
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
						<tr>
						<td>
							<div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="jj" name="jj" style="height: 80px;width:200px"></textarea>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="tk-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="tkSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#tk_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<!--修改  -->
	<div id="tkedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 500px; padding: 10px 20px" closed="true"
		buttons="#tkedit-buttons">
		<form id="tkedit_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
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
					<!-- <tr>
						<td align="left">
							<div class="fitem">
								专题名称:&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-combobox" id="ztId1" name="ztId" style="width:200px;" 
									/>
							</div>
						</td>
					</tr> -->
					<tr>
						<td align="left">
							<div class="fitem">
								人物名称:&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-combobox" id="rwId1" name="rwId" style="width:200px;" 
									/>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
								记录名称:&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-combobox" id="jlId1" name="jlId" style="width:200px;" 
									/>
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
									class="easyui-combobox" id="gxzId1" name="gxzId" style="width:200px;" 
									/>
							</div>
						</td>
					</tr>
						<tr>
						<td>
							<div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="jj" name="jj" style="height: 80px;width:200px"></textarea>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="tkedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="tkeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#tkedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	
	<!--修改  -->
	<div id="tktpedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#tktpedit-buttons">
		<form id="tktpedit_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
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
							照片地址:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="tpdz1" name="tpdz" style="width:200px;" accept="image/*" type="file" />
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="tktpedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="tktpeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#tktpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
</body>