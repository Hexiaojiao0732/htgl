var xmId =0;
$(function() {
	$.messager.prompt("身份验证", "请输入秘钥。。。", function (data) {
		var my="gt@"+(new Date().formatDate("yyyyMMdd"));
		if (data==my) {
			initXmDataGrid(0);
			initXmSpDataGrid(0);
			initXmTkDataGrid(0);
		}else{
			window.location.reload();
		}
	});
	$('.panel-tool-close').hide();
	
	$('#pc').on('change',function(){
		var selectVal = $(this).find('option:selected').val();
        if (selectVal == "3") {
        	$('#dy_tr').show();
        }else {
        	$('#dy_tr').hide();
        }
	});
	$('#update_pc').on('change',function(){
		var selectVal = $(this).find('option:selected').val();
        if (selectVal == "3") {
        	$('#update_dy_tr').show();
        }else {
        	$('#update_dy_tr').hide();
        }
	});
	
});

function initXmDataGrid(){
	$('#xmdata').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		width : '100%',
		height : '96%',
		fitColumns : true,
		nowrap : true,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/xm/selectXmList.do?isAll=1',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
			{field:'ck',checkbox:true},
			{title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'mc',title:'名称',width:50},
			{field:'ccrxm', title:'传承人姓名', width:50},
			{field:'bh', title:'项目编号', width:100},
			{field:'ccrbh', title:'传承人编号', width:100},
			{field:'ccrxb', title:'传承人性别', width:80},
			{field:'ccrcsrq', title:'传承人出生日期', width:100},
			{field:'xmlb', title:'项目类别', width:100,
				formatter:function(value,row,index){
					if(value == 1){ return "民间文学"; }
					if(value == 2){ return "传统音乐"; }
					if(value == 3){ return "传统舞蹈"; }
					if(value == 4){ return "传统戏剧"; }
					if(value == 5){ return "曲艺"; }
					if(value == 6){ return "传统体育、游艺、杂技"; }
					if(value == 7){ return "传统美术"; }
					if(value == 8){ return "传统技艺"; }
					if(value == 9){ return "传统医药"; }
					if(value == 10){ return "民俗"; }
				}
			},
			{field:'xmzp', title:'项目显示照片', width:100,
				formatter: function(value,row,index){
					return '<span title='+value+'>'+value+'</span>'
				}
			},
			{field:'xmjs', title:'项目介绍', width:200,
				formatter: function(value,row,index){
					return '<span title='+value+'>'+value+'</span>'
				}
			},
			{field:'isTj', title:'是否推荐', width:60,
				formatter:function(value,row,index){
					if(value==1){
						return "是";
					}
					if(value ==0){
						return "否";
					}
				}
			},
			{field:'sbdqhdw', title:'申报地区或单位', width:100},
			{field:'ssqy', title:'所属省份', width:80},
			{field:'djl', title:'点击量', width:50},
			{field:'pc', title:'展示批次', width:60,
				formatter:function(value,row,index){
					if(value==null || value==''){
						return "";
					}
					if(value==1){
						return "第一批展示成果";
					}
					if(value ==2){
						return "第二批展示成果";
					}
					if(value ==3){
						return "第三批展示成果";
					}
				}
			},
			{field:'dy', title:'展示单元', width:60,
				formatter:function(value,row,index){
					if(value==null || value==''){
						return "";
					}
					if(value==1){
						return "乐舞·情韵";
					}
					if(value ==2){
						return "腔调·故事";
					}
					if(value ==3){
						return "手艺·匠心";
					}
					if(value ==4){
						return "吉祥·人生";
					}
				}
			},
			{field:'操作',title:'操作',width:200,
				formatter : function(value, row, index) {
					var a = '';
					a = '<span class="spanRow"><a href="#" class="griddel" onclick="toXmUpdate('
						+ index
						+ ')">修改内容</a></span>';
					var b = '';
					b = '<span class="spanRow"><a href="#" class="griddel" onclick="toXmUpdateImg('
						+ row.id
						+ ')">修改图片</a></span>';
					var d = '';
					d = '<span class="spanRow"><a href="#" class="griddel" onclick="xmDelete('
						+ row.id
						+ ')">删除</a></span>';
					return   a+b+d;
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,40,50,100],
		rownumbers:true,
		toolbar:'#toolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rowData){
			xmId = rowData.id;
			initXmSpDataGrid(rowData.id);
			initXmTkDataGrid(rowData.id);
		}
	});
}

function initXmSpDataGrid(id){
	$('#xmSpData').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		width : '96%',
		height:'94%',
		fitColumns : true,
		nowrap : false,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/xm/selectXmSpList.do?id='+id,
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
			{field:'ck',checkbox:true},
			{title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'mc',title:'名称',width:50},
			{field:'wyid', title:'唯一编号', width:200},
			{field:'spzp', title:'视频照片地址', width:100},
			{field:'sjUrl', title:'手机视频地址', width:100},
			{field:'操作',title:'操作',width:150,
				formatter : function(value, row, index) {
					var a = '';
					a = '<span class="spanRow"><a href="#" class="griddel" onclick="toSpUpdate('
						+ index
						+ ')">修改内容</a></span>';
					var b = '';
					b = '<span class="spanRow"><a href="#" class="griddel" onclick="toSpUpdateImg('
						+ row.id
						+ ')">修改图片</a></span>';
					var e = '';
					e = '<span class="spanRow"><a href="#" class="griddel" onclick="xmSpDelete('
						+ row.id
						+ ')">删除</a></span>';
					return   a+b+e;
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,40,50,100],
		rownumbers:true,
		toolbar:'#toolbar'
	});
}

function initXmTkDataGrid(id){
	$('#xmTkData').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		width : '96%',
		height:'94%',
		fitColumns : true,
		nowrap : false,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/xm/selectXmTkList.do?id='+id,
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
			{field:'ck',checkbox:true},
			{title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'mc',title:'名称',width:50},
			{field:'tpdz', title:'图片地址', width:200},
			{field:'操作',title:'操作',width:150,
				formatter : function(value, row, index) {
					var a = '';
					a = '<span class="spanRow"><a href="#" class="griddel" onclick="toTkUpdate('
						+ index
						+ ')">修改内容</a></span>';
					var b = '';
					b = '<span class="spanRow"><a href="#" class="griddel" onclick="toTkUpdateImg('
						+ row.id
						+ ')">修改图片</a></span>';
					var e = '';
					e = '<span class="spanRow"><a href="#" class="griddel" onclick="xmTkDelete('
						+ row.id
						+ ')">删除</a></span>';
					return   a+b+e;
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,40,50,100],
		rownumbers:true,
		toolbar:'#toolbar'
	});
}

function xmAdd() {
	$('#xm_form').form('clear');
	showDialog('#xm_dialog', '项目新增');
}
function xmSaveData(){
	var tp= $("#xmzp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#xm_form')) {
		return;
	}
	
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	
	var formData = new FormData();
	formData.append("file", document.getElementById("xmzp").files[0]);
	$.ajax({
	    url: "../memory/xm/uploadImage.do",
	    type: "POST",
	    data: formData,
	    /**
	     *必须false才会自动加上正确的Content-Type
	     */
	    contentType: false,
	    /**
	     * 必须false才会避开jQuery对 formdata 的默认处理
	     * XMLHttpRequest会对 formdata 进行正确的处理
	     */
	    processData: false,
	    dataType: 'text',
	    success: function (data) {
	    	var elemzxinfo = $('#xm_form');
	    	var xm_info = elemzxinfo.serializeObject();
	    	xm_info["xmzp"] = data;
			xm_info["ssqy"] = $("#ssqy option:selected").text();
	    	var jsoninfo = JSON.stringify(xm_info);
	        $.ajax({
	            url: '../memory/xm/addXm.do',
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	    			$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#xm_dialog').dialog('close');
	    			$('#xmdata').datagrid('reload');
	            },
	            error: function () {
	                alert("上传失败！");
	            }
	        });
	    },
	    error: function (data) {
	        alert("上传失败！");
	    }
	});
}

function  xmDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/xm/deleteXm.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#xmdata').datagrid('reload');// reload the data
				},
				error : function(data) {
					$.messager.progress('close');
					// exception in java
					$.messager.alert('Error', 'Unknown Error!');
				}
			});

		}
	});
}

function xmSpAdd() {
	if(!xmId || xmId<=0){
		alert("请先到上方选择项目！");
		return;
	}
	$('#xm_sp_form').form('clear');
	showDialog('#xm_sp_dialog', '项目视频新增');
}

function xmSpSaveData(){
	var tp= $("#spzp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}

	if (!checkForm('#xm_sp_form')) {
		return;
	}

	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});

	var formData = new FormData();
	formData.append("file", document.getElementById("spzp").files[0]);
	$.ajax({
		url: "../memory/xm/uploadImage.do",
		type: "POST",
		data: formData,
		/**
		 *必须false才会自动加上正确的Content-Type
		 */
		contentType: false,
		/**
		 * 必须false才会避开jQuery对 formdata 的默认处理
		 * XMLHttpRequest会对 formdata 进行正确的处理
		 */
		processData: false,
		dataType: 'text',
		success: function (data) {
			var elemzxinfo = $('#xm_sp_form');
			var xm_info = elemzxinfo.serializeObject();
			xm_info["spzp"] = data;
			xm_info["xmId"] = xmId;
			var jsoninfo = JSON.stringify(xm_info);
			$.ajax({
				url: '../memory/xm/addSpXm.do',
				type: "POST",
				data: jsoninfo,
				contentType: 'application/json;charset=UTF-8',
				dataType:"json",
				success: function () {
					$.messager.progress('close');
					$.messager.alert("提示", "保存成功");
					$('#xm_sp_dialog').dialog('close');
					$('#xmSpData').datagrid('reload');
				},
				error: function () {
					alert("上传失败！");
				}
			});
		},
		error: function (data) {
			alert("上传失败！");
		}
	});
}

function  xmSpDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/xm/deleteXmSp.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#xmSpData').datagrid('reload');// reload the data
				},
				error : function(data) {
					$.messager.progress('close');
					// exception in java
					$.messager.alert('Error', 'Unknown Error!');
				}
			});

		}
	});
}

function xmTkAdd() {
	if(!xmId || xmId<=0){
		alert("请先到上方选择项目！");
		return;
	}
	$('#xm_tk_form').form('clear');
	showDialog('#xm_tk_dialog', '项目图库新增');
}

function xmTkSaveData(){
	var tp= $("#tpdz").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}

	if (!checkForm('#xm_tk_form')) {
		return;
	}

	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});

	var formData = new FormData();
	formData.append("file", document.getElementById("tpdz").files[0]);
	$.ajax({
		url: "../memory/xm/uploadImage.do",
		type: "POST",
		data: formData,
		/**
		 *必须false才会自动加上正确的Content-Type
		 */
		contentType: false,
		/**
		 * 必须false才会避开jQuery对 formdata 的默认处理
		 * XMLHttpRequest会对 formdata 进行正确的处理
		 */
		processData: false,
		dataType: 'text',
		success: function (data) {
			var elemzxinfo = $('#xm_tk_form');
			var xm_info = elemzxinfo.serializeObject();
			xm_info["tpdz"] = data;
			xm_info["xmId"] = xmId;
			var jsoninfo = JSON.stringify(xm_info);
			$.ajax({
				url: '../memory/xm/addTkXm.do',
				type: "POST",
				data: jsoninfo,
				contentType: 'application/json;charset=UTF-8',
				dataType:"json",
				success: function () {
					$.messager.progress('close');
					$.messager.alert("提示", "保存成功");
					$('#xm_tk_dialog').dialog('close');
					$('#xmTkData').datagrid('reload');
				},
				error: function () {
					alert("上传失败！");
				}
			});
		},
		error: function (data) {
			alert("上传失败！");
		}
	});
}

function  xmTkDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/xm/deleteXmTk.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#xmTkData').datagrid('reload');// reload the data
				},
				error : function(data) {
					$.messager.progress('close');
					// exception in java
					$.messager.alert('Error', 'Unknown Error!');
				}
			});

		}
	});
}

function toXmUpdate(index){
	var row = $('#xmdata').datagrid('getRows')[index];
	showDialog('#xm_update_dialog', '项目内容编辑');
	$('#xm_update_form').form('load', row);
	if (row.pc == "3") {
		$("#update_dy_tr").show();
	}else {
		$("#update_dy_tr").hide();
	}
	$("#update_ssqy option").each(function(){
		if($(this).text()==row.ssqy){
			$(this).attr("selected",true);
			return;
		}
	});
}

function xmUpdateSaveData(){
	if (!checkForm('#xm_update_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var elemzxinfo = $('#xm_update_form');
	var spedit_info = elemzxinfo.serializeObject();
	spedit_info["ssqy"] = $("#update_ssqy option:selected").text();
	var jsoninfo = JSON.stringify(spedit_info);
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : "../memory/xm/editXm.do",
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#xmdata').datagrid('reload');// reload the data
			$('#xm_update_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}

function toXmUpdateImg(xmId){
	$("#xmtp_id").val(xmId);
	showDialog('#xmtp_update_dialog', '项目图片修改');
}

function xmTpUpdateSaveData(){
	var tp= $("#xmTp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("xmTp").files[0]);
	$.ajax({
		url: "../memory/xm/uploadImage.do",
		type: "POST",
		data: formData,
		/**
		 *必须false才会自动加上正确的Content-Type
		 */
		contentType: false,
		/**
		 * 必须false才会避开jQuery对 formdata 的默认处理
		 * XMLHttpRequest会对 formdata 进行正确的处理
		 */
		processData: false,
		dataType: 'text',
		success: function (data) {
			var sptp_info = {};
			sptp_info["id"]= $("#xmtp_id").val();
			sptp_info["xmzp"] = data;
			var jsoninfo = JSON.stringify(sptp_info);
			$.ajax({
				url: "../memory/xm/editXmImg.do",
				type: "POST",
				data: jsoninfo,
				contentType: 'application/json;charset=UTF-8',
				dataType:"json",
				success: function () {
					$.messager.progress('close');
					$.messager.alert("提示", "保存成功");
					$('#xmdata').datagrid('reload');// reload the data
					$('#xmtp_update_dialog').dialog('close');
				},
				error: function (data) {
					$.messager.progress('close');
					$.messager.alert("提示", "保存失败"+JSON.stringify(data));
				}
			});
		},
		error: function (data) {
			alert("上传失败！"+JSON.stringify(data));
		}
	});
}

function toSpUpdate(index){
	var row = $('#xmSpData').datagrid('getRows')[index];
	showDialog('#xm_sp_update_dialog', '视频内容编辑');
	$('#xm_sp_update_form').form('load', row);
}

function spUpdateSaveData(){
	if (!checkForm('#xm_sp_update_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var elemzxinfo = $('#xm_sp_update_form');
	var spedit_info = elemzxinfo.serializeObject();
	var jsoninfo = JSON.stringify(spedit_info);
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : "../memory/xm/updateXmSp.do",
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#xmSpData').datagrid('reload');// reload the data
			$('#xm_sp_update_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}

function toSpUpdateImg(spId){
	$("#xmsptp_id").val(spId);
	showDialog('#xmsptp_update_dialog', '视频图片修改');
}

function spTpUpdateSaveData(){
	var tp= $("#xmSpTp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("xmSpTp").files[0]);
	$.ajax({
		url: "../memory/xm/uploadImage.do",
		type: "POST",
		data: formData,
		/**
		 *必须false才会自动加上正确的Content-Type
		 */
		contentType: false,
		/**
		 * 必须false才会避开jQuery对 formdata 的默认处理
		 * XMLHttpRequest会对 formdata 进行正确的处理
		 */
		processData: false,
		dataType: 'text',
		success: function (data) {
			var sptp_info = {};
			sptp_info["id"]= $("#xmsptp_id").val();
			sptp_info["spzp"] = data;
			var jsoninfo = JSON.stringify(sptp_info);
			$.ajax({
				url: "../memory/xm/updateXmSpImg.do",
				type: "POST",
				data: jsoninfo,
				contentType: 'application/json;charset=UTF-8',
				dataType:"json",
				success: function () {
					$.messager.progress('close');
					$.messager.alert("提示", "保存成功");
					$('#xmSpData').datagrid('reload');// reload the data
					$('#xmsptp_update_dialog').dialog('close');
				},
				error: function (data) {
					$.messager.progress('close');
					$.messager.alert("提示", "保存失败"+JSON.stringify(data));
				}
			});
		},
		error: function (data) {
			alert("上传失败！"+JSON.stringify(data));
		}
	});
}

function toTkUpdate(index){
	var row = $('#xmTkData').datagrid('getRows')[index];
	showDialog('#xm_tk_update_dialog', '图片内容编辑');
	$('#xm_tk_update_form').form('load', row);
}

function tkUpdateSaveData(){
	if (!checkForm('#xm_tk_update_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var elemzxinfo = $('#xm_tk_update_form');
	var spedit_info = elemzxinfo.serializeObject();
	var jsoninfo = JSON.stringify(spedit_info);
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : "../memory/xm/updateXmTk.do",
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#xmTkData').datagrid('reload');// reload the data
			$('#xm_tk_update_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}

function toTkUpdateImg(spId){
	$("#xmtktp_id").val(spId);
	showDialog('#xmtktp_update_dialog', '视频图片修改');
}

function xmTkUpdateSaveData(){
	var tp= $("#xmTkTp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("xmTkTp").files[0]);
	$.ajax({
		url: "../memory/xm/uploadImage.do",
		type: "POST",
		data: formData,
		/**
		 *必须false才会自动加上正确的Content-Type
		 */
		contentType: false,
		/**
		 * 必须false才会避开jQuery对 formdata 的默认处理
		 * XMLHttpRequest会对 formdata 进行正确的处理
		 */
		processData: false,
		dataType: 'text',
		success: function (data) {
			var sptp_info = {};
			sptp_info["id"]= $("#xmtktp_id").val();
			sptp_info["tpdz"] = data;
			var jsoninfo = JSON.stringify(sptp_info);
			$.ajax({
				url: "../memory/xm/updateXmTkImg.do",
				type: "POST",
				data: jsoninfo,
				contentType: 'application/json;charset=UTF-8',
				dataType:"json",
				success: function () {
					$.messager.progress('close');
					$.messager.alert("提示", "保存成功");
					$('#xmTkData').datagrid('reload');// reload the data
					$('#xmtktp_update_dialog').dialog('close');
				},
				error: function (data) {
					$.messager.progress('close');
					$.messager.alert("提示", "保存失败"+JSON.stringify(data));
				}
			});
		},
		error: function (data) {
			alert("上传失败！"+JSON.stringify(data));
		}
	});
}
