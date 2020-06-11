$(function() {
	$('#gxz').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		width : '100%',
		height : '88%',
		fitColumns : true,
		nowrap : false,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/gxz/selectGxzList.do',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'xm',title:'姓名',width:50},
			{field:'jj',title:'简介',width:50},
			{field:'zp',title:'照片',width:50},
			{field:'操作',title:'操作',width:50,
				formatter : function(value, row, index) {
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="gxzEdit('
								+ index
								+ ')">修改</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="gxzDelete('
									+ row.id
									+ ')">删除</a></span>';
							c = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="gxztpEdit('
								+ index
								+ ')">修改图片</a></span>';
						return   e+d+c;
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,30,50,100],
		rownumbers:true,
		toolbar:'#toolbar'
		//行选择方法，进行条件触发
//		onSelect: function(rowIndex, rowData){
//			rolegridData(rowData);
//		}
		
	});
});
function  gxzAdd(){
	$('#gxz_form').form('clear');
	showDialog('#gxz_dialog', '贡献者新增');
	url = '../memory/gxz/addGxz.do';
}

function gxzSaveData(){
	var tp= $("#zp11").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
		if (!checkForm('#gxz_form')) {
			return;
		}
		$.messager.progress({
			title : '请等待',
			msg : '添加/修改数据中...'
		});
		var formData = new FormData();
		formData.append("file", document.getElementById("zp11").files[0]);
		$.ajax({
		    url: "../memory/zt/uploadImage.do",
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
		    	var elemzxinfo = $('#gxz_form');
		    	var gxztp_info = elemzxinfo.serializeObject();
		    	gxztp_info["zp"] = data;
		    	var jsoninfo = JSON.stringify(gxztp_info);
		        $.ajax({
		            url: url,
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function () {
		            	$.messager.progress('close');
						$.messager.alert("提示", "保存成功");
						$('#gxz').datagrid('reload');// reload the data
						$('#gxz_dialog').dialog('close');
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
function gxzDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/gxz/deleteGxz.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#gxz').datagrid('reload');// reload the data
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

function gxzEdit(index) {
	var row = $('#gxz').datagrid('getRows')[index];
	showDialog('#gxzedit_dialog', '编辑贡献者');
	$('#gxzedit_form').form('clear');
	$('#gxzedit_form').form('load', row);
	url = '../memory/gxz/editGxz.do' ;
}
function gxzeditSaveData(){
	if (!checkForm('#gxztp_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var elemzxinfo = $('#gxzedit_form');
	var gxzedit_info = elemzxinfo.serializeObject();
	var jsoninfo = JSON.stringify(gxzedit_info);
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : url,
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#gxz').datagrid('reload');// reload the data
			$('#gxzedit_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}


function gxztpEdit(index){
	var row = $('#gxz').datagrid('getRows')[index];
	showDialog('#gxztpedit_dialog', '编辑贡献者图片');
	$('#gxztp_form').form('clear');
	$('#gxztp_form').form('load', row);
	
}
function  gxztpSaveData(){
	var tp= $("#zp2").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
		if (!checkForm('#gxztp_form')) {
			return;
		}
		$.messager.progress({
			title : '请等待',
			msg : '添加/修改数据中...'
		});
	var	url = '../memory/gxz/editGxzTp.do' ;
		var formData = new FormData();
		formData.append("file", document.getElementById("zp2").files[0]);
		$.ajax({
		    url: "../memory/zt/uploadImage.do",
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
		    	var elemzxinfo = $('#gxztp_form');
		    	var gxztp_info = elemzxinfo.serializeObject();
		    	gxztp_info["zp"] = data;
		    	var jsoninfo = JSON.stringify(gxztp_info);
		        $.ajax({
		            url: url,
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function () {
		            	$.messager.progress('close');
						$.messager.alert("提示", "保存成功");
						$('#gxz').datagrid('reload');// reload the data
						$('#gxztpedit_dialog').dialog('close');
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
		
//		jQuery.ajax({
//			type : 'POST',
//			contentType : 'application/json',
//			url : url,
//			data : jsoninfo,
//			dataType : 'json',
//			success : function(data) {
//				$.messager.progress('close');
//				$.messager.alert("提示", "保存成功");
//				$('#gxz').datagrid('reload');// reload the data
//				$('#gxz_dialog').dialog('close');
//				// $('#zd_grid').datagrid('loadData',data);// reload the data
//			},
//			error : function(data) {
//				$.messager.progress('close');
//				// exception in java
//				$.messager.alert("提示", "数据填写不完整");
//			}
//		});
}
