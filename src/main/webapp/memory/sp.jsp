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
<script type="text/javascript" src="sp.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100%;" >

<div style=" height: 60px; padding: 10px 20px"  align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="spAdd" onclick="spAdd()">视频新增</a>
	</label>
</div>

<div id="spToolbar" style="padding: 5px; height: auto">
		<div>
			审核筛选:<select type="text"  style="width:200px;" id="sfsh" name="sfsh" data-options="required:true">
							<option value="1">全部</option>
							<option value="3">已审核</option>
							<option value="2">未审核</option>
					</select>&nbsp;&nbsp;
			<a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-search"
				onclick="spSearch()">查询</a>&nbsp;&nbsp; 
		</div>
	</div>

<div id="sp" class="easyui-datagrid"></div>

<div id="sp_dialog" class="easyui-dialog"
		style="width: 450px; height: 700px; padding: 10px 20px" closed="true"
		buttons="#sp-buttons">
		<form id="sp_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
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
									id="wyid" name="wyid" style="width:200px;" class="easyui-validatebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								手机地址:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sjUrl" name="sjUrl" style="width:200px;" class="easyui-validatebox" data-options="required:true"/>
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
								时长:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sc" name="sc" style="width:80px;"/>分钟
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
									id="pssj" name="pssj"  style="width:200px;"  class="easyui-datetimebox"/>
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
								视频照片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="spzp" name="spzp" accept="image/*" type="file" style="width:200px">
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
					<tr>
						<td>
							<div class="fitem">
								字幕:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea id="zm" name="zm" style="height: 250px;width:200px" class="easyui-validatebox"></textarea>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="sp-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="spSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#sp_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<div id="spsh_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#spsh-buttons">
		<form id="spsh_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
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
									id="wyid1" name="wyid" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
						<tr>
						<td>
							<div class="fitem">
								视频照片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="spzp1" name="spzp" type="file" accept="image/*" style="width:200px">
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="spsh-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="spshSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#spsh_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<!-- 修改 -->
	<div id="spedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 600px; padding: 10px 20px" closed="true"
		buttons="#spedit-buttons">
		<form id="spedit_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
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
							唯一编号: &nbsp;&nbsp;&nbsp;&nbsp;<input
									id="wyid" name="wyid" style="width:200px;" class="easyui-validatebox"  data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								手机地址:&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sjUrl" name="sjUrl" style="width:200px;" class="easyui-validatebox"  data-options="required:true"/>
							</div>
						</td>
					</tr>
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
				
					<tr>
						<td>
							<div class="fitem">
								时长:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sc" name="sc" style="width:200px;"   data-options="required:true"/>
							</div>
						</td>
					</tr>
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
								贡献者名称:&nbsp;&nbsp;<input
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
		<div id="spedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="speditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#spedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!-- 修改图片 -->
		<div id="sptpedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#sptpedit-buttons">
		<form id="sptpedit_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
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
								视频照片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="spzp11" name="spzp" type="file" accept="image/*" style="width:200px">
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="sptpedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="sptpeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#sptpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
</body>