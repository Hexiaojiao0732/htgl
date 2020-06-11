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
<script type="text/javascript" src="shouye.js"></script>
</head>
<body  >
<span style="font-size:30px">首页设置</span><br/><br/><br/>
<div id="tablesytj"></div><br/>
<br/>
<hr style="height:5px;border:none;border-top:5px ridge green;" />
<br/>
<div style="height: 60px; padding: 10px 20px" >
<div><label ><span style="font-size:30px">视频推荐</span></label></div>
		<div  align="center"><label> <a href="#" class="easyui-linkbutton hbut"
			style="width: 150px; height: 60px;" iconCls="icon-add" plain="true"
			id="sitjAdd" onclick="sptjAdd()">推荐新增</a>
		</label>
		</div>
	</div>
<ul class="pscx_listnr" id="tablesptj">
	</ul>

	<div id="shouyeedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#shouyeedit-buttons">
		<form id="shouyeedit_form" class="form-style" 
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">
						<tr>
						<td>
							<div class="fitem">
							人口数量:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="z" name="z" style="width:200px;" class="easyui-validatebox"  />
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="shouyeedit-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="shouyeSaveData()">保存</a>
			 <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#shouyeedit_dialog').dialog('close')">关闭</a>
		</div>
	</div>
	
	<div id="sptj_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#sptj-buttons">
		<form id="sptj_form" class="form-style" 
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">
						<tr>
						<td>
							<div class="fitem">
							视频名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="z1" name="z" style="width:200px;" class="class="easyui-combobox"  />
							</div>
						</td>
					</tr>
					<!-- <tr>
						<td>
							<div class="fitem">
							序号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="bz" name="bz" style="width:200px;" class="easyui-validatebox"  />
							</div>
						</td>
					</tr> -->
				</thead>
			</table>
		</form>
		<div id="sptj-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="sptjSaveData()">保存</a>
			 <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#sptj_dialog').dialog('close')">关闭</a>
		</div>
	</div>

</body>