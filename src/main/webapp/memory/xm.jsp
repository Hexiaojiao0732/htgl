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

</head>
<body class="easyui-layout" style="width: 100%;height: 98%;" >
<div data-options="region:'north',title:'项目',split:true" style="width: 100%; height: 50%; padding: 10px 20px" align="center" >
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 20px; " 	iconCls="icon-add" plain="true" id="xmAdd" onclick="xmAdd()">项目管理</a>
	</label>
	<div id="xmdata" class="easyui-datagrid" style="height: 100%"></div>
</div>
<div data-options="region:'west',title:'项目视频',split:true" style="width: 50%;">
	<label> <a href="#" class="easyui-linkbutton hbut"
			   style="width: 150px; height: 20px; " 	iconCls="icon-add" plain="true" id="xmSpAdd" onclick="xmSpAdd()">视频新增</a>
	</label>
	<div id="xmSpData" class="easyui-datagrid"></div>
</div>
<div data-options="region:'east',title:'项目图库',split:true" style="width: 50%;">
	<label> <a href="#" class="easyui-linkbutton hbut"
			   style="width: 150px; height: 20px; " 	iconCls="icon-add" plain="true" id="xmTkAdd" onclick="xmTkAdd()">图库新增</a>
	</label>
	<div id="xmTkData" class="easyui-datagrid"></div>
</div>

<div id="xm_dialog" class="easyui-dialog"
		style="width: 620px; height: 540px; padding: 10px 20px" closed="true"
		buttons="#xm-buttons">
		<form id="xm_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table id="xm_tab" pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td>
							<div class="fitem">
								项目名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
									id="mc" name="mc"  style="width:200px;" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem" id="xsurl">
								传承人姓名:&nbsp;&nbsp;<input  
									id="ccrxm" name="ccrxm"  style="width:200px;" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								项目编号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="bh" name="bh"   style="width:200px;" data-options="required:true" >
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								传承人编号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="ccrbh" name="ccrbh"   style="width:200px;" data-options="required:true" >
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								传承人性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="ccrxb"  name="ccrxb"   style="width:200px;" data-options="required:true" >
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								传承人出生日期:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="ccrcsrq" name="ccrcsrq"   style="width:200px;" data-options="required:true" >
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							项目类别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="xmlb" name="xmlb" data-options="required:true">
							<option value="">请选择</option>
							<option value="1">民间文学</option>
							<option value="2">传统音乐</option>
							<option value="3">传统舞蹈</option>
							<option value="4">传统戏剧</option>
							<option value="5">曲艺</option>
							<option value="6">传统体育、游艺、杂技</option>
							<option value="7">传统美术</option>
							<option value="8">传统技艺</option>
							<option value="9">传统医药</option>
							<option value="10">民俗</option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								项目显示照片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="xmzp" accept="image/*" name="xmzp" type="file"  style="width:200px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								项目介绍:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="xmjs" name="xmjs" style="width:200px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								是否推荐:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select type="text" class="easyui-validatebox" style="width:200px;" id="isTj" name="isTj" data-options="required:true">
										<option value="0">否</option>
										<option value="1">是</option>
								</select>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								申报地区或单位:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="sbdqhdw"  name="sbdqhdw" style="width:200px">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								所属省份:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select  name="ssqy" class="easyui-validatebox" style="width:200px;" id="ssqy">
									<option vlaue="">请选择</option>
									<option value="11">北京市</option>
									<option value="12">天津市</option>
									<option value="13">河北省</option>
									<option value="14">山西</option>
									<option value="15">内蒙古自治区</option>
									<option value="21">辽宁省</option>
									<option value="22">吉林省</option>
									<option value="23">黑龙江省</option>
									<option value="31">上海市</option>
									<option value="32">江苏省</option>
									<option value="33">浙江省</option>
									<option value="34">安徽省</option>
									<option value="35">福建省</option>
									<option value="36">江西省</option>
									<option value="37">山东省</option>
									<option value="41">河南省</option><option value="42">湖北省</option><option value="43">湖南省</option><option value="44">广东省</option><option value="45">广西壮族自治区</option><option value="46">海南省</option><option value="50">重庆市</option><option value="51">四川省</option><option value="52">贵州省</option><option value="53">云南省</option><option value="54">西藏自治区</option><option value="61">陕西省</option><option value="62">甘肃省</option><option value="63">青海省</option><option value="64">宁夏回族自治区</option><option value="65">新疆维吾尔自治区</option><option value="71">台湾省</option><option value="81">香港特别行政区</option><option value="82">澳门特别行政区</option>
								</select>
							</select>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="xm-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="xmSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#xm_dialog').dialog('close')">取消</a>
		</div>
	</div>

<div id="xm_update_dialog" class="easyui-dialog"
	 style="width: 620px; height: 540px; padding: 10px 20px" closed="true"
	 buttons="#xm-update-buttons">
	<form id="xm_update_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table id="xm_update_tab" pagination="true" fitColumns="true"
			   singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="xm_update_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						项目名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
																					 id="update_mc" name="mc"  style="width:200px;" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem" id="update_xsurl">
						传承人姓名:&nbsp;&nbsp;<input
							id="update_ccrxm" name="ccrxm"  style="width:200px;" data-options="required:true" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						项目编号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="update_bh" name="bh"   style="width:200px;" data-options="required:true" >
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						传承人编号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="update_ccrbh" name="ccrbh"   style="width:200px;" data-options="required:true" >
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						传承人性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="update_ccrxb"  name="ccrxb"   style="width:200px;" data-options="required:true" >
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						传承人出生日期:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="update_ccrcsrq" name="ccrcsrq"   style="width:200px;" data-options="required:true" >
					</div>
				</td>
			</tr>
			<tr>
				<td align="left">
					<div class="fitem">
						项目类别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="update_xmlb" name="xmlb" data-options="required:true">
						<option value="">请选择</option>
						<option value="1">民间文学</option>
						<option value="2">传统音乐</option>
						<option value="3">传统舞蹈</option>
						<option value="4">传统戏剧</option>
						<option value="5">曲艺</option>
						<option value="6">传统体育、游艺、杂技</option>
						<option value="7">传统美术</option>
						<option value="8">传统技艺</option>
						<option value="9">传统医药</option>
						<option value="10">民俗</option>
					</select>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						项目介绍:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="update_xmjs" name="xmjs" style="width:200px">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						是否推荐:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<select type="text" class="easyui-validatebox" style="width:200px;" id="update_isTj" name="isTj" data-options="required:true">
							<option value="0">否</option>
							<option value="1">是</option>
						</select>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						申报地区或单位:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="update_sbdqhdw"  name="sbdqhdw" style="width:200px">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						所属省份:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<select  name="ssqy" class="easyui-validatebox" style="width:200px;" id="update_ssqy">
							<option vlaue="">请选择</option>
							<option value="11">北京市</option>
							<option value="12">天津市</option>
							<option value="13">河北省</option>
							<option value="14">山西</option>
							<option value="15">内蒙古自治区</option>
							<option value="21">辽宁省</option>
							<option value="22">吉林省</option>
							<option value="23">黑龙江省</option>
							<option value="31">上海市</option>
							<option value="32">江苏省</option>
							<option value="33">浙江省</option>
							<option value="34">安徽省</option>
							<option value="35">福建省</option>
							<option value="36">江西省</option>
							<option value="37">山东省</option>
							<option value="41">河南省</option><option value="42">湖北省</option><option value="43">湖南省</option><option value="44">广东省</option><option value="45">广西壮族自治区</option><option value="46">海南省</option><option value="50">重庆市</option><option value="51">四川省</option><option value="52">贵州省</option><option value="53">云南省</option><option value="54">西藏自治区</option><option value="61">陕西省</option><option value="62">甘肃省</option><option value="63">青海省</option><option value="64">宁夏回族自治区</option><option value="65">新疆维吾尔自治区</option><option value="71">台湾省</option><option value="81">香港特别行政区</option><option value="82">澳门特别行政区</option>
						</select>
						</select>
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xm-update-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="xmUpdateSaveData()">保存</a> <a href="#"
															  class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
															  onclick="javascript:$('#xm_update_dialog').dialog('close')">取消</a>
	</div>
</div>

<!-- 修改图片 -->
<div id="xmtp_update_dialog" class="easyui-dialog"
	 style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
	 buttons="#xmtp-updte-buttons">
	<form id="xmtp_update_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="xmtp_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						项目照片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="xmTp" name="spzp" type="file" accept="image/*" style="width:200px">
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xmtp-updte-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="xmTpUpdateSaveData()">保存</a> <a href="#"
																	class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
																	onclick="javascript:$('#xmtp_update_dialog').dialog('close')">取消</a>
	</div>
</div>

<div id="xm_sp_dialog" class="easyui-dialog"
	 style="width: 620px; height: 540px; padding: 10px 20px" closed="true"
	 buttons="#xm-sp-buttons">
	<form id="xm_sp_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table id="xm_sp_tab" pagination="true" fitColumns="true"
			   singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="sp_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						视频名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
																					 id="spmc" name="mc"  style="width:200px;" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem" id="spxsurl">
						唯一标识:&nbsp;&nbsp;<input
							id="wyid" name="wyid"  style="width:200px;" data-options="required:true" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem" id="sjSpurl">
						手机视频地址:&nbsp;&nbsp;<input
							id="sjUrl" name="sjUrl"  style="width:200px;" data-options="required:true" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						视频显示照片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="spzp" accept="image/*" name="spzp" type="file"  style="width:200px">
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xm-sp-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="xmSpSaveData()">保存</a> <a href="#"
															  class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
															  onclick="javascript:$('#xm_sp_dialog').dialog('close')">取消</a>
	</div>
</div>

<div id="xm_sp_update_dialog" class="easyui-dialog"
	 style="width: 620px; height: 540px; padding: 10px 20px" closed="true"
	 buttons="#xm-sp-update-buttons">
	<form id="xm_sp_update_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table id="xm_sp_update_tab" pagination="true" fitColumns="true"
			   singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="sp_update_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						视频名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
																					 id="spUpdatemc" name="mc"  style="width:200px;" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem" id="spUpdatexsurl">
						唯一标识:&nbsp;&nbsp;<input
							id="wyUpdateid" name="wyid"  style="width:200px;" data-options="required:true" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem" id="sjurlUpdate">
						手机视频地址:&nbsp;&nbsp;<input
							id="wyUpdateid" name="sjUrl"  style="width:200px;" data-options="required:true" />
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xm-sp-update-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="spUpdateSaveData()">保存</a> <a href="#"
																class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
																onclick="javascript:$('#xm_sp_update_dialog').dialog('close')">取消</a>
	</div>
</div>

<div id="xmsptp_update_dialog" class="easyui-dialog"
	 style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
	 buttons="#xmsptp-updte-buttons">
	<form id="xmsptp_update_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="xmsptp_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						视频照片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="xmSpTp" name="spzp" type="file" accept="image/*" style="width:200px">
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xmsptp-updte-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="spTpUpdateSaveData()">保存</a> <a href="#"
																	  class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
																	  onclick="javascript:$('#xmsptp_update_dialog').dialog('close')">取消</a>
	</div>
</div>

<div id="xm_tk_dialog" class="easyui-dialog"
	 style="width: 620px; height: 540px; padding: 10px 20px" closed="true"
	 buttons="#xm-tk-buttons">
	<form id="xm_tk_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table id="xm_tk_tab" pagination="true" fitColumns="true"
			   singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="tk_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						图片名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
																					 id="tkmc" name="mc"  style="width:200px;" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="fitem">
						图片地址:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="tpdz" accept="image/*" name="tpdz" type="file"  style="width:200px">
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xm-tk-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="xmTkSaveData()">保存</a> <a href="#"
																class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
																onclick="javascript:$('#xm_tk_dialog').dialog('close')">取消</a>
	</div>
</div>

<div id="xm_tk_update_dialog" class="easyui-dialog"
	 style="width: 620px; height: 540px; padding: 10px 20px" closed="true"
	 buttons="#xm-tk-update-buttons">
	<form id="xm_tk_update_form" class="form-style" method="post"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table id="xm_tk_update_tab" pagination="true" fitColumns="true"
			   singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="tk_update_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						图片名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  class="easyui-validatebox"
																					 id="tkUpdatemc" name="mc"  style="width:200px;" />
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xm-tk-update-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="tkUpdateSaveData()">保存</a> <a href="#"
																class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
																onclick="javascript:$('#xm_tk_update_dialog').dialog('close')">取消</a>
	</div>
</div>

<div id="xmtktp_update_dialog" class="easyui-dialog"
	 style="width: 450px; height: 300px; padding: 10px 20px" closed="true"
	 buttons="#xmtktp-updte-buttons">
	<form id="xmtktp_update_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
		  style="padding: 10px 40px">
		<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
			<tr>
				<td colspan="2" align="left"><input type="hidden" id="xmtktp_id"
													name="id" /></td>
			</tr>
			<thead align="left">
			<tr>
				<td>
					<div class="fitem">
						图片地址:&nbsp;&nbsp;&nbsp;&nbsp;<input id="xmTkTp" name="tpdz" type="file" accept="image/*" style="width:200px">
					</div>
				</td>
			</tr>
			</thead>
		</table>
	</form>
	<div id="xmtktp-updte-buttons" align="right">
		<a href="#" class="easyui-linkbutton" name="noButton"
		   iconCls="icon-ok" onclick="xmTkUpdateSaveData()">保存</a> <a href="#"
																	  class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
																	  onclick="javascript:$('#xmtktp_update_dialog').dialog('close')">取消</a>
	</div>
</div>

<script type="text/javascript" src="xm.js"></script>
</body>