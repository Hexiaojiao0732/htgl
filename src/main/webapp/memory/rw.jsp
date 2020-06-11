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
<script type="text/javascript" src="rw.js"></script>
</head>
<body class="easyui-layout" style="width: 100%;height: 100% ;" >
<div style=" height: 60px; padding: 10px 20px"  align="center">
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="rwAdd" onclick="rwAdd()">人物新增</a>
	</label>
</div>
<ul class="pscx_listnr" id="pqList" >
            </ul>  

	<div id="rw_dialog" class="easyui-dialog"
		style="width: 750px; height: 500px; padding: 10px 20px" closed="true"
		buttons="#rw-buttons">
		<form id="rw_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								所属专题名称:<input
									class="easyui-combobox" id="ztId" name="ztId" style="width:200px;" 
									/>
							</div>
						</td>
						<td>
							<div class="fitem">
								姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="xm" name="xm" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td >
							<div class="fitem">
								性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select type="text" class="easyui-validatebox" style="width:200px;" id="xb" name="xb">
							<option value="">请选择</option>
							<option value="男">男</option>
							<option value="女">女</option>
					</select>
							</div>
						</td>
						<td>
							<div class="fitem">
								年龄:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="nl" name="nl" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					
					<tr>
					<td align="left">
							<div class="fitem">
							身份:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="sf" name="sf" data-options="required:true">
							<option value="">请选择</option>
							<option value="老战士亲属">老战士亲属</option>
							<option value="学者">学者</option>
							<option value="非遗传承人">非遗传承人</option>
							<option value="专题研究者">专题研究者</option>
							<option value="其他">其他</option>
					</select>
							</div>
						</td>
						<td align="left">
							<div class="fitem">
							民族:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="mz" name="mz" data-options="required:true">
							<option value="">请选择</option>
							<option value="汉族">汉族</option>
							<option value="满族">满族</option>
							<option value="蒙族">蒙族   </option>
							<option value="维吾尔族">维吾尔族   </option>
							<option value="哈萨克族">哈萨克族  </option>
							<option value="锡伯族">锡伯族</option>
							<option value="藏族">藏族</option>
							<option value="傣族">傣族</option>
							<option value="彝族">彝族</option>
							<option value="纳西族">纳西族</option>
							<option value="水族">水族</option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
					<td align="left">
							<div class="fitem">
						分类:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="fl1" name="fl" data-options="required:true">
							<option value="">请选择</option>
							<option value="政治历史类">政治历史类</option>
							<option value="传统遗产类">传统遗产类</option>
							<option value="文化艺术类">文化艺术类</option>
							<option value="民族和语言文字类">民族和语言文字类  </option>
					</select>
							</div>
						</td>
						<td align="left">
							<div class="fitem">
							语种:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="yz" name="yz" data-options="required:true">
							<option value="">请选择</option>
							<option value="中文">中文</option>
							<option value="英文">英文</option>
							<option value="少数民族语言">少数民族语言   </option>
					</select>
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
								其他姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="qtxm" name="qtxm" style="width:200px;" class="easyui-validatebox"  />
							</div>
						</td>
						<td>
							<div class="fitem">
								国别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="gb" name="gb" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								籍贯:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="jg" name="jg" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
						<td>
							<div class="fitem">
								生卒年:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="szn" name="szn" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
					</tr>
					<tr>
						<!-- <td>
							<div class="fitem">
								内部标识号:&nbsp;&nbsp;&nbsp;<input
									id="nbbsh" name="nbbsh" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td> -->
						<td>
							<div class="fitem">
								人物照片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="rwzp" name="rwzp" accept="image/*" type="file" style="width:200px">
							</div>
						</td>
						<td>
							<div class="fitem">
								领域:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="ly" name="ly" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					<tr>
					
						<td>
							<div class="fitem">
								著作:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zp" name="zp" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
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
						<td colspan="2" ><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea  class="easyui-validatebox" id="jj1" name="jj" 
								style="height:40px;width:500px"></textarea>
							</div></td>
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="wzjj1" class="easyui-validatebox" name="wzjj" style="height:75px;width: 200px;"
								></textarea>
							</div></td>
							<td>
							<div class="fitem">
								关系人物:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="rwgx" name="rwgx" style="height:50px;width:200px;" class="easyui-textbox" />
							</div>
							<div align="center">
							<label> <a href="#" class="easyui-linkbutton hbut"
							iconCls="icon-add" plain="true" id="rwGx" onclick="rwGx()">关系人物添加</a>
							</label>
							</div>
						</td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="rw-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="rwSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#rw_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<!-- 人物关系 -->
	
	<div id="rwgx_dialog" class="easyui-dialog"
		style="width: 750px; height: 500px; padding: 10px 20px;" closed="true"
		buttons="#rwgx-buttons">
		<form id="rwgx_form" class="form-style" method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								所属人物:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									class="easyui-textbox" id="ssrwId" name="ssrwId" style="width:200px;"  readonly="readonly"
									/>
							</div>
						</td>
						<td>
							<div class="fitem">
								姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="xm1" name="xm" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td >
							<div class="fitem">
								性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select type="text" class="easyui-validatebox" style="width:200px;" id="xb1" name="xb">
							<option value="">请选择</option>
							<option value="男">男</option>
							<option value="女">女</option>
					</select>
							</div>
						</td>
						<td>
							<div class="fitem">
								年龄:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="nl1" name="nl" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					
					<tr>
					<td align="left">
							<div class="fitem">
							身份:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="sf1" name="sf" data-options="required:true">
							<option value="">请选择</option>
							<option value="老战士亲属">老战士亲属</option>
							<option value="学者">学者</option>
							<option value="非遗传承人">非遗传承人</option>
							<option value="专题研究者">专题研究者</option>
							<option value="其他">其他</option>
					</select>
							</div>
						</td>
						<td align="left">
							<div class="fitem">
							民族:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="mz1" name="mz" data-options="required:true">
							<option value="">请选择</option>
							<option value="汉族">汉族</option>
							<option value="满族">满族</option>
							<option value="蒙族">蒙族   </option>
							<option value="维吾尔族">维吾尔族   </option>
							<option value="哈萨克族">哈萨克族  </option>
							<option value="锡伯族">锡伯族</option>
							<option value="藏族">藏族</option>
							<option value="傣族">傣族</option>
							<option value="彝族">彝族</option>
							<option value="纳西族">纳西族</option>
							<option value="水族">水族</option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							语种:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="yz1" name="yz" data-options="required:true">
							<option value="">请选择</option>
							<option value="中文">中文</option>
							<option value="英文">英文</option>
							<option value="少数民族语言">少数民族语言   </option>
					</select>
							</div>
						</td>
						<td>
							<div class="fitem">
								著作:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zp1" name="zp" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
								其他姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="qtxm1" name="qtxm" style="width:200px;" class="easyui-validatebox"  />
							</div>
						</td>
						<td>
							<div class="fitem">
								国别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="gb1" name="gb" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								籍贯:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="jg1" name="jg" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
						<td>
							<div class="fitem">
								生卒年:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="szn1" name="szn" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								人物照片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="rwzp1" name="rwzp" accept="image/*" type="file" style="width:200px">
							</div>
						</td>
						<td>
							<div class="fitem">
								领域:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="ly1" name="ly" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					<tr>
					
						<td>
							<div class="fitem">
							拍摄时间:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="pssj1" name="pssj"  style="width:200px;"  class="easyui-datetimebox"/>
							</div>
						</td>
						<td>
							<div class="fitem">
								拍摄地点:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="psdd1" name="psdd" class="easyui-validatebox" style="width:200px;"  />
							</div>
						</td>
					</tr>
					<tr>
						<td ><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea  class="easyui-validatebox" id="jj1" name="jj" 
								style="width:200px"></textarea>
							</div></td>
						<td>
							<div class="fitem">
								与人物关系:&nbsp;&nbsp;&nbsp;<input
									id="yrwgx" name="yrwgx" style="width:200px;" class="easyui-validatebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="wzjj1" class="easyui-validatebox" name="wzjj" style="height:75px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="rwgx-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="rwgxSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#rwgx_dialog').dialog('close')">取消</a>
		</div>
	</div>
	<!-- 详情页面 -->
	<div id="rwxq_dialog" class="easyui-dialog"
		style="width: 750px; height: 500px; padding: 10px 20px;" closed="true"
		buttons="#rwxq-buttons">
		<div style=" height: 60px; padding: 10px 20px" >
	<label> <a href="#" class="easyui-linkbutton hbut"
	style="width: 150px; height: 60px; " 	iconCls="icon-add" plain="true" id="RWAdd" onclick="rwXqGx()">人物关系新增</a>
	</label>
		</div>
		
		<form id="rwxq_form" class="form-style" 
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id"
						name="id" /></td>
				</tr>
				<thead align="left" id="xq">
				</thead>
			</table>
		</form>
		<div id="rwxq-buttons" align="right">
		<!-- 	<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="rwgxSaveData()">保存</a>  --><a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#rwxq_dialog').dialog('close')">关闭</a>
		</div>
	</div>
	<!-- 关系 -->
<div id="gx_dialog" class="easyui-dialog"
		style="width: 750px; height: 500px; padding: 10px 20px;" closed="true"
		buttons="#gx-buttons">
		<form id="gx_form" class="form-style"  method="post" enctype="multipart/form-data" target="myIfram"
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
								姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="xm1" name="xm" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
						<td>
							<div class="fitem">
								其他姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="qtxm1" name="qtxm" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					<tr>
					
					<td>
							<div class="fitem">
								年龄:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="nl1" name="nl" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
						<td >
							<div class="fitem">
								性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select type="text" class="easyui-validatebox" style="width:200px;" id="xb" name="xb">
							<option value="">请选择</option>
							<option value="男">男</option>
							<option value="女">女</option>
					</select>
							</div>
						</td>
						
					</tr>
					
					<tr>
					<td align="left">
							<div class="fitem">
							身份:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="sf1" name="sf" data-options="required:true">
							<option value="">请选择</option>
							<option value="老战士亲属">老战士亲属</option>
							<option value="学者">学者</option>
							<option value="非遗传承人">非遗传承人</option>
							<option value="专题研究者">专题研究者</option>
							<option value="其他">其他</option>
					</select>
							</div>
						</td>
						<td align="left">
							<div class="fitem">
							民族:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="mz1" name="mz" data-options="required:true">
							<option value="">请选择</option>
							<option value="汉族">汉族</option>
							<option value="满族">满族</option>
							<option value="蒙族">蒙族   </option>
							<option value="维吾尔族">维吾尔族   </option>
							<option value="哈萨克族">哈萨克族  </option>
							<option value="锡伯族">锡伯族</option>
							<option value="藏族">藏族</option>
							<option value="傣族">傣族</option>
							<option value="彝族">彝族</option>
							<option value="纳西族">纳西族</option>
							<option value="水族">水族</option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div class="fitem">
							语种:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="yz1" name="yz" data-options="required:true">
							<option value="">请选择</option>
							<option value="中文">中文</option>
							<option value="英文">英文</option>
							<option value="少数民族语言">少数民族语言   </option>
					</select>
							</div>
						</td>
						<td>
							<div class="fitem">
								著作:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zp1" name="zp" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					
					<tr>
						
						<td>
							<div class="fitem">
								国别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="gb1" name="gb" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
						<td>
							<div class="fitem">
								领域:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="ly1" name="ly" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								籍贯:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="jg1" name="jg" style="width:200px;" class="easyui-validatebox"/>
							</div>
						</td>
						<td>
							<div class="fitem">
								生卒年:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="szn1" name="szn" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								人物照片:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="rwzp2" name="rwzp" type="file" accept="image/*" style="width:200px">
							</div>
						</td>
						<td>
							<div class="fitem">
								拍摄地点:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="psdd1" name="psdd" class="easyui-validatebox" style="width:200px;"  />
							</div>
						</td>
					</tr>
					<tr>
					
						
						<td>
							<div class="fitem">
							拍摄时间:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="pssj1" name="pssj"  style="width:200px;"  class="easyui-datetimebox"/>
							</div>
						</td>
						<td>
							<div class="fitem">
								与人物关系:&nbsp;&nbsp;&nbsp;<input
									id="yrwgx" name="yrwgx" style="width:200px;" class="easyui-validatebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
						<td ><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea  class="easyui-validatebox" id="jj1" name="jj" 
								style="width:200px"></textarea>
							</div></td>
						
						
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="wzjj1" class="easyui-validatebox" name="wzjj" style="height:75px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="gx-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="gxSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#gx_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
	<!--人物 修改  -->
	<div id="rwedit_dialog" class="easyui-dialog"
		style="width: 750px; height: 500px; padding: 10px 20px" closed="true"
		buttons="#rwedit-buttons">
		<form id="rwedit_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">
					<tr>
						<td align="left">
							<div class="fitem">
								所属专题名称:<input
									class="easyui-combobox" id="ztId1" name="ztId" style="width:200px;" 
									/>
							</div>
						</td>
						<td>
							<div class="fitem">
								姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="xm11" name="xm" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					<tr>
						<td >
							<div class="fitem">
								性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select type="text" class="easyui-validatebox" style="width:200px;" id="xb11" name="xb" data-options="required:true">
							<option value="">请选择</option>
							<option value="男">男</option>
							<option value="女">女</option>
					</select>
							</div>
						</td>
						<td>
							<div class="fitem">
								年龄:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="nl11" name="nl" style="width:200px;" class="easyui-validatebox" data-options="required:true" />
							</div>
						</td>
					</tr>
					
					<tr>
					<td align="left">
							<div class="fitem">
							身份:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="sf11" name="sf" data-options="required:true">
							<option value="">请选择</option>
							<option value="老战士亲属">老战士亲属</option>
							<option value="学者">学者</option>
							<option value="非遗传承人">非遗传承人</option>
							<option value="专题研究者">专题研究者</option>
							<option value="其他">其他</option>
					</select>
							</div>
						</td>
						<td align="left">
							<div class="fitem">
							民族:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="mz11" name="mz" data-options="required:true">
							<option value="">请选择</option>
							<option value="汉族">汉族</option>
							<option value="满族">满族</option>
							<option value="蒙族">蒙族   </option>
							<option value="维吾尔族">维吾尔族   </option>
							<option value="哈萨克族">哈萨克族  </option>
							<option value="锡伯族">锡伯族</option>
							<option value="藏族">藏族</option>
							<option value="傣族">傣族</option>
							<option value="彝族">彝族</option>
							<option value="纳西族">纳西族</option>
							<option value="水族">水族</option>
					</select>
							</div>
						</td>
					</tr>
					<tr>
					<td align="left">
							<div class="fitem">
						分类:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="fl11" name="fl" data-options="required:true">
							<option value="">请选择</option>
							<option value="政治历史类">政治历史类</option>
							<option value="传统遗产类">传统遗产类</option>
							<option value="文化艺术类">文化艺术类</option>
							<option value="民族和语言文字类">民族和语言文字类  </option>
					</select>
							</div>
						</td>
						<td align="left">
							<div class="fitem">
							语种:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select type="text" class="easyui-validatebox" style="width:200px;" id="yz11" name="yz" data-options="required:true">
							<option value="">请选择</option>
							<option value="中文">中文</option>
							<option value="英文">英文</option>
							<option value="少数民族语言">少数民族语言   </option>
					</select>
							</div>
						</td>
					</tr>
					
					<tr>
						<td>
							<div class="fitem">
								其他姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="qtxm11" name="qtxm" style="width:200px;" class="easyui-validatebox"  />
							</div>
						</td>
						<td>
							<div class="fitem">
								国别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="gb11" name="gb" style="width:200px;" class="easyui-validatebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="fitem">
								籍贯:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="jg11" name="jg" style="width:200px;" class="easyui-validatebox" data-options="required:true"/>
							</div>
						</td>
						<td>
							<div class="fitem">
								生卒年:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="szn11" name="szn" style="width:200px;" class="easyui-validatebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
							<td>
							<div class="fitem">
								著作:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="zp11" name="zp" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
						<td>
							<div class="fitem">
								领域:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="ly11" name="ly" style="width:200px;" class="easyui-validatebox" />
							</div>
						</td>
					</tr>
					<tr>
					<td>
							<div class="fitem">
								拍摄地点:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="psdd11" name="psdd" class="easyui-validatebox" style="width:200px;"  />
							</div>
						</td>
					
						<td>
							<div class="fitem">
							拍摄时间:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									id="pssj11" name="pssj"  style="width:200px;"  class="easyui-datetimebox" data-options="required:true"/>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="2" ><div class="fitem">
								简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea  class="easyui-validatebox" id="jj11" name="jj" 
								style="height:40px;width:500px"></textarea>
							</div></td>
					</tr>
					
					<tr>
						<td align="left"><div class="fitem">
								完整简介:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"></font><textarea id="wzjj11" class="easyui-validatebox" name="wzjj" style="height:75px;width: 200px;"
								></textarea>
							</div></td>
					</tr>
				</thead>
			</table>
		</form>
		<div id="rwedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="rweditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#rwedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	
		<!--人物图片修改  -->
	<div id="rwtpedit_dialog" class="easyui-dialog"
		style="width: 450px; height: 350px; padding: 10px 20px" closed="true"
		buttons="#rwtpedit-buttons">
		<form id="rwtpedit_form" class="form-style"   method="post" enctype="multipart/form-data" target="myIfram"
			style="padding: 10px 40px">
			<table  pagination="true" fitColumns="true"
				singleSelect="true" width="100%" height="100%">
				<tr>
					<td colspan="2" align="left"><input type="hidden" id="id1"
						name="id" /></td>
				</tr>
				<thead align="left">
				<td>
							<div class="fitem">
								人物照片:&nbsp;&nbsp;&nbsp;&nbsp;<input id="rwzp11" name="rwzp" accept="image/*" type="file" style="width:200px">
							</div>
						</td>
				</thead>
			</table>
		</form>
		<div id="rwtpedit-buttons" align="right">
			<a href="#" class="easyui-linkbutton" name="noButton"
				iconCls="icon-ok" onclick="rwtpeditSaveData()">保存</a> <a href="#"
				class="easyui-linkbutton" name="noButton" iconCls="icon-cancel"
				onclick="javascript:$('#rwtpedit_dialog').dialog('close')">取消</a>
		</div>
	</div>
	</body>