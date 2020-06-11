<%@ page import="com.zhixin.rd.rkjc.web.common.PropertyUtil"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<script type="text/javascript" src="zt.js"></script>
</head>
<body class="easyui-layout" style="width: 100%; height: 100%">
	<!-- <div style=" height: 30px; padding: 10px 20px" align="center" >
	<label> <a href="#" class="easyui-linkbutton hbut"
		iconCls="icon-add" plain="true" id="wtjlAdd" onclick="wtjlAdd()"><font size="30px">专题新增</font></a>
	</label>
</div> -->

	<div style="height: 60px; padding: 10px 20px" align="center">
		<label> <a href="#" class="easyui-linkbutton hbut"
			style="width: 150px; height: 60px;" iconCls="icon-add" plain="true"
			id="wtjlAdd" onclick="wtjlAdd()">专题新增</a>
		</label>
	</div>
	<ul class="pscx_listnr" id="pqList">
	</ul>
	<div id="zt_dialog" class="easyui-dialog"
		style="width: 420px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#wtjl-buttons">
		<form id="zt_form" class="form-style" style="padding: 10px 40px"
			method="post" enctype="multipart/form-data" target="myIfram">
			<table id="wtjl_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								专题名称:&nbsp;&nbsp;&nbsp; <input class="easyui-validatebox"
									id="ztmc" name="ztmc" data-options="required:true"
									data-options="validType:'maxLength[128]'" />
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="fitem">
								专题图片:&nbsp;&nbsp;&nbsp; <input id="zttp" name="zttp" type="file"
									accept="image/*" style="width: 150px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								外链地址:&nbsp;&nbsp;&nbsp;&nbsp;<input id="yxtdwldz"
									name="yxtdwldz" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								开始时间:&nbsp;&nbsp;&nbsp;&nbsp;<input id="kssj" name="kssj"
									class="easyui-datetimebox" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								结束时间:&nbsp;&nbsp;&nbsp;&nbsp;<input id="jssj" name="jssj"
									class="easyui-datetimebox" />
							</div>
						</td>
					</tr>


					<tr>
						<td align="left">
							<div class="fitem">
								简 介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<textarea id="jj" name="jj" style="height: 80px;"></textarea>
							</div>
						</td>
					</tr>

					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;<font color="red"></font>
								<textarea id="wzjj" name="wzjj" style="height: 80px;"></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="wtjl-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="ztSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#zt_dialog').dialog('close')">取消</a>
		</div>
	</div>



	<div id="ztedit_dialog" class="easyui-dialog"
		style="width: 420px; height: 440px; padding: 10px 20px" closed="true"
		buttons="#ztedit-buttons">
		<form id="ztedit_form" class="form-style" method="post"
			style="padding: 10px 40px">
			<table id="zt_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								专题名称:&nbsp;&nbsp;&nbsp; <input class="easyui-textbox" id="ztmc1"
									name="ztmc" data-options="required:true"
									data-options="validType:'maxLength[128]'" />
							</div>
						</td>
					</tr>

					<!-- <tr>
						<td>
							<div class="fitem">
								专题图片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="zttp1" name="zttp" type="file"  style="width:150px" >
							</div>
						</td>
					</tr> -->
					<tr>
						<td>
							<div class="fitem">
								外链地址:&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-textbox"
									id="yxtdwldz1" name="yxtdwldz"  />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								开始时间:&nbsp;&nbsp;&nbsp;&nbsp;<input id="kssj1" name="kssj"
									class="easyui-datetimebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								结束时间:&nbsp;&nbsp;&nbsp;&nbsp;<input id="jssj1" name="jssj"
									class="easyui-datetimebox" data-options="required:true" />
							</div>
						</td>
					</tr>


					<tr>
						<td align="left">
							<div class="fitem">
								简 介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<textarea id="jj1" name="jj" style="height: 80px;"></textarea>
							</div>
						</td>
					</tr>

					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;<font color="red"></font>
								<textarea id="wzjj1" name="wzjj" style="height: 80px;"></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="ztedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="ztEditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#ztedit_dialog').dialog('close')">取消</a>
		</div>
	</div>



	<div id="zttpedit_dialog" class="easyui-dialog"
		style="width: 420px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#zttpedit-buttons">
		<form id="zttpedit_form" class="form-style" method="post"
			style="padding: 10px 40px">
			<table id="zt_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">

					<tr>
						<td>
							<div class="fitem">
								专题图片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="zttp2" name="zttp"
									type="file" accept="image/*" style="width: 150px">
							</div>
						</td>
					</tr>

				</thead>
			</table>
		</form>
		<div id="zttpedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="zttpEditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#zttpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>

	<!-- 详情 -->
	<div id="ztxq_dialog" class="easyui-dialog"
		style="width: 900px; height: 700px; padding: 10px 20px" closed="true"
		buttons="#ztxq-buttons">
		
		<div id="ztToolbar" style="padding: 5px; height: auto">
		<div>
		<div style="margin-bottom:5px">
			<a href="#" class="easyui-linkbutton" name="noButton" iconCls="icon-add" plain="true" id="zdmapinfoAdd" onclick="zdmapinfoAdd()">新增</a>
		</div>
			<!-- <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-search"
				onclick="spSearch()">查询</a>&nbsp;&nbsp;  -->
		</div>
	</div>
		<div id="ztmapinfo" class="easyui-datagrid"></div>

		<div id="ztxq-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-cancel"
				onclick="javascript:$('#ztxq_dialog').dialog('close')">关闭</a>
		</div>
	</div>
	<!-- 专题详情添加  -->
	<div id="ztxqadd_dialog" class="easyui-dialog"
		style="width: 500px; height: 450px; padding: 10px 20px" closed="true"
		buttons="#ztxqadd-buttons">
		<form id="ztxqadd_form" class="form-style" method="post"
			style="padding: 10px 40px">
			<table id="zt_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">

					<tr>
						<td align="left">
							<div class="fitem">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;专题名称:&nbsp;&nbsp;&nbsp; &nbsp;<input class="easyui-combobox" id="ztId"
									name="ztId" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;横坐标:&nbsp;&nbsp;&nbsp;&nbsp; <input class="easyui-textbox" id="x"
									name="x" data-options="required:true"
									data-options="validType:'maxLength[128]'" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;纵坐标:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-textbox" id="y"
									name="y" data-options="required:true"
									data-options="validType:'maxLength[128]'" />
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;	地点:&nbsp;&nbsp;&nbsp;&nbsp;
							<!-- 	<input class="easyui-textbox" id="dd"
									name="dd" data-options="required:true"
									data-options="validType:'maxLength[128]'" /> -->
									<textarea id="dd" name="dd" style="height: 60px;"></textarea>
							</div>
						</td>
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;	描述:&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font>
								<textarea id="ms" name="ms" style="height: 80px;" ></textarea>
							</div></td>
					</tr>
					
						<tr>
						<td align="left">
							<div class="fitem">
								地址坐标可在下面网站查询: <a href="http://api.map.baidu.com/lbsapi/getpoint/index.html" target="_blank"><span  style="color: blue;">http://api.map.baidu.com/lbsapi/getpoint/index.html</span></a>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="ztxqadd-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="ztxqaddEditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#ztxqadd_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
</body>