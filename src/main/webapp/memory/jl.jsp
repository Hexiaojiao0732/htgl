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
<script type="text/javascript" src="jl.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
<div style=" height: 60px; padding: 10px 20px"  align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="jlAdd" onclick="jlAdd()">记录新增</a>
	</label>
</div>

 <ul class="pscx_listnr" id="jlList" >
            </ul>  
	<div id="jl_dialog" class="easyui-dialog"
		style="width: 450px; height: 600px; padding: 10px 20px" closed="true"
		buttons="#jl-buttons">
		<form id="jl_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="yrsrInfo" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								所属专题名称:&nbsp;<input
									class="easyui-combobox" id="ssztId" name="ssztId" style="width:200px;" 
									/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								省:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select  name="dyS" class="easyui-validatebox" style="width:200px;" id="province_hjd" onchange="dzChange(0,'#yrsrInfo #province_hjd','#yrsrInfo #city_hjd')">	
							</select>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								市:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<select name="dyC" style="width:200px;" class="easyui-validatebox" id="city_hjd" onchange="dzChange(1,'#yrsrInfo #city_hjd','#yrsrInfo #district_hjd')">
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								县区:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="dyX" class="easyui-validatebox" style="width:200px;" id="district_hjd" ></select>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							语种:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" name="yz" class="easyui-validatebox" style="width:200px;" id="yz" data-options="required:true">
							<option value="">请选择</option>
							<option value="中文">中文</option>
							<option value="英文">英文</option>
							<option value="少数民族语言">少数民族语言   </option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
						分类:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" name="fl" id="fl" data-options="required:true">
							<option value="">请选择</option>
							<option value="政治历史类">政治历史类</option>
							<option value="传统遗产类">传统遗产类</option>
							<option value="文化艺术类">文化艺术类</option>
							<option value="民族和语言文字类">民族和语言文字类  </option>
					</select>
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
								名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="mc" name="mc" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								时长:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sc" name="sc" style="width:80px;" class="easyui-validatebox"/>分钟
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
							拍摄时间:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="pssj" name="pssj"  style="width:200px;"  class="easyui-datetimebox"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								拍摄地点:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="psdd" name="psdd" class="easyui-validatebox" style="width:200px;"  />
							</div>
						</td>
					</tr>
					
						<tr>
						<td>
							<div class="fitem">
								记录图片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="jltp" name="jltp" type="file" accept="image/*" style="width:200px" data-options="required:true">
							</div>
						</td>
					</tr>
					<tr>
						<td align="left"><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea  id="jj111" name="jj" 
								style="width:200px"></textarea>
							</div></td>
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="wzjj111"  name="wzjj" style="height:75px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="jl-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="jlSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#jl_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<!-- 修改 -->
	<div id="jledit_dialog" class="easyui-dialog"
		style="width: 450px; height: 600px; padding: 10px 20px" closed="true"
		buttons="#jledit-buttons">
		<form id="jledit_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="yrsrInfo1" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								所属专题名称:&nbsp;<input
									class="easyui-combobox" id="ssztId1" name="ssztId" style="width:200px;" 
									/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								省:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select  name="dyS"  style="width:200px;" id="province_hjd1" onchange="dzChange(0,'#yrsrInfo1 #province_hjd1','#yrsrInfo1 #city_hjd1')">	
							</select>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								市:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<select name="dyC" style="width:200px;"  id="city_hjd1" onchange="dzChange(1,'#yrsrInfo1 #city_hjd1','#yrsrInfo1 #district_hjd1')">
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								县区:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="dyX"  style="width:200px;" id="district_hjd1" ></select>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							语种:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" name="yz"  style="width:200px;" id="yz1" data-options="required:true">
							<option value="">请选择</option>
							<option value="中文">中文</option>
							<option value="英文">英文</option>
							<option value="少数民族语言">少数民族语言   </option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
						分类:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text"  style="width:200px;" name="fl" id="fl1" data-options="required:true">
							<option value="">请选择</option>
							<option value="政治历史类">政治历史类</option>
							<option value="传统遗产类">传统遗产类</option>
							<option value="文化艺术类">文化艺术类</option>
							<option value="民族和语言文字类">民族和语言文字类  </option>
					</select>
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
								名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="mc1" name="mc" style="width:200px;" class="easyui-textbox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								时长:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="sc1" name="sc" style="width:200px;" class="easyui-textbox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
							拍摄时间:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="pssj1" name="pssj"  style="width:200px;"  class="easyui-datetimebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								拍摄地点:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="psdd1" name="psdd" class="easyui-textbox" style="width:200px;"  />
							</div>
						</td>
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea  id="jj1" name="jj"  
								style="width:200px"></textarea>
							</div></td>
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="wzjj1"  name="wzjj" style="height:75px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="jledit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="jleditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#jledit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	
	<!-- 修改 图片-->
	<div id="jltpedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
		buttons="#jltpedit-buttons">
		<form id="jltpedit_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
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
								记录图片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="jltp1" name="jltp" type="file" accept="image/*" style="width:200px" data-options="required:true">
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="jltpedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="jltpeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#jltpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	</body>