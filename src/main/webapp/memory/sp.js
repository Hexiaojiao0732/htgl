var spid;
$(function() {
	$('#sp').datagrid({
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
		url: '../memory/sp/selectSpList.do',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'mc',title:'姓名',width:50},
			{field:'wyid',title:'唯一编号',width:50},
			{field:'rwxm',title:'人物名称',width:50},
			{field:'jlmc',title:'记录名称',width:50},
			{field:'sc',title:'时长',width:50},
			{field:'pssj',title:'拍摄时间',width:50,
				formatter: function(value,row,index){
					var value=  value.substring(0,19);
						return value;
				}
			},
			{field:'psdd',title:'拍摄地点',width:50},
			{field:'jj',title:'简介',width:50},
			{field:'gxzxm',title:'贡献者',width:50},
			{field:'spzp',title:'视频照片',width:50},
			{field:'sjUrl',title:'手机地址',width:50},
			{field:'操作',title:'操作',width:150,
				formatter : function(value, row, index) {
						if(row.wyid == null || row.wyid== '' ){
							a = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="sptpEdit('
								+ row.id
								+ ')">修改图片</a></span>';
							b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="spEdit('
								+ index
								+ ')">修改</a></span>';
							c = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="shSp('
								+ row.id
								+ ')">审核</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="spDelete('
								+ row.id
								+ ')">删除</a></span>';
							e = '<span class="spanRow hbut"><a href="../memory/sp/spDownload.do?spdz='+row.spdz+'" class="griddownload")">下载</a></span>';
					return c+ d+e+b+a;
						}else{
							a = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="sptpEdit('
								+ row.id
								+ ')">修改图片</a></span>';
							b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="spEdit('
								+ index
								+ ')">修改</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="spDelete('
								+ row.id
								+ ')">删除</a></span>';
							e = '<span class="spanRow hbut"><a href="../memory/sp/spDownload.do?spdz='+row.spdz+'"  class="griddownload">下载</a></span>';
							return d+e+b+a;
						}

				}
			}
		]],
		queryParams: {
            sfsh: 1
          }  ,
		pagination:true,
		pageSize:10,
		pageList: [10,20,30,50,100],
		rownumbers:true,
		toolbar:'#spToolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rowData){
			rolegridData(rowData);
		}

	});
});


function spSearch(){
	$('#sp').datagrid('load', {
		sfsh : $('#sfsh').val(),
		tfresh : new Date().getTime()
	});
}
//下载
function  spDownload(index){
	var row = $('#sp').datagrid('getRows')[index];
	var spdz = row.spdz;
    $.ajax({
        url: '../memory/sp/spDownload.do?spdz='+spdz,
        contentType: 'application/json;charset=UTF-8',
        dataType:"json",
        success: function () {
        	$.messager.progress('close');
			$.messager.alert("提示", "下载成功");
        },
        error: function () {
            alert("下载失败！");
        }
    });
}

//审核
function shSp(a){
	spid=a;
	$('#spsh_form').form('clear');
	showDialog('#spsh_dialog', '视频新增');
}

function spshSaveData(){
	var tp= $("#spzp1").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#spsh_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("spzp1").files[0]);
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
	    	var wy = $('#wyid1').val();
	    	var elemzxinfo = $('#shsp_form');
	    	var shsp_info = elemzxinfo.serializeObject();
	    	shsp_info["spzp"] = data;
	    	shsp_info["id"] = spid;
	    	shsp_info["wyid"] = wy;
	    	var jsoninfo = JSON.stringify(shsp_info);
	        $.ajax({
	            url: '../memory/sp/updateShSp.do',
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#sp').datagrid('reload');// reload the data
	    			$('#spsh_dialog').dialog('close');
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

function  spAdd(){
	$('#ztId1').combobox({    
		url:'../memory/zt/queryZtMc.do',    
		valueField:'id',    
		textField:'ztmc'   
	});
	$('#jlId').combobox({    
		url:'../memory/jl/queryJlMc.do',    
		valueField:'id',    
		textField:'mc'   
	});
	$('#rwId').combobox({    
		url:'../memory/rw/queryRwMc.do',    
		valueField:'id',    
		textField:'xm'   
	});
	$('#gxzId').combobox({    
		url:'../memory/gxz/queryGxzMc.do',    
		valueField:'id',    
		textField:'xm'   
	});
	$('#sp_form').form('clear');
	showDialog('#sp_dialog', '视频新增');
//	url = '../memory/sp/addSp.do';
}

function  spSaveData(){
	var tp= $("#spzp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#sp_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("spzp").files[0]);
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
	    	var elemzxinfo = $('#sp_form');
	    	var sp_info = elemzxinfo.serializeObject();
	    	sp_info["spzp"] = data;
	    	var jsoninfo = JSON.stringify(sp_info);
	        $.ajax({
	            url: '../memory/sp/addSp.do',
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#sp').datagrid('reload');// reload the data
	    			$('#sp_dialog').dialog('close');
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
//	jQuery.ajax({
//		type : 'POST',
//		contentType : 'application/json',
//		url : url,
//		data : jsoninfo,
//		dataType : 'json',
//		success : function(data) {
//			$.messager.progress('close');
//			$.messager.alert("提示", "保存成功");
//			$('#sp').datagrid('reload');// reload the data
//			$('#sp_dialog').dialog('close');
//			// $('#zd_grid').datagrid('loadData',data);// reload the data
//		},
//		error : function(data) {
//			$.messager.progress('close');
//			// exception in java
//			$.messager.alert("提示", "数据填写不完整");
//		}
//	});
}
function spEdit(index) {
	$('#jlId1').combobox({    
		url:'../memory/jl/queryJlMc.do',    
		valueField:'id',    
		textField:'mc'   
	});
	$('#rwId1').combobox({    
		url:'../memory/rw/queryRwMc.do',    
		valueField:'id',    
		textField:'xm'   
	});
	$('#gxzId1').combobox({    
		url:'../memory/gxz/queryGxzMc.do',    
		valueField:'id',    
		textField:'xm'   
	});
	var row = $('#sp').datagrid('getRows')[index];
	showDialog('#spedit_dialog', '视频编辑');
//	$('#gxz_form').form('clear');
	$('#spedit_form').form('load', row);
	url = '../memory/sp/editSp.do' ;
}
function speditSaveData(){
	if (!checkForm('#spedit_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var elemzxinfo = $('#spedit_form');
	var spedit_info = elemzxinfo.serializeObject();
	var jsoninfo = JSON.stringify(spedit_info);
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : url,
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#sp').datagrid('reload');// reload the data
			$('#spedit_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}

function  sptpEdit(id){
	$('#sptpedit_form').form('clear');
	showDialog('#sptpedit_dialog', '视频图片编辑');
	url = '../memory/sp/editSpTp.do?id='+id ;
} 

function sptpeditSaveData(){
	var tp= $("#spzp11").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#sptpedit_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("spzp11").files[0]);
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
	    	var elemzxinfo = $('#sptpedit_form');
	    	var sptp_info = elemzxinfo.serializeObject();
	    	sptp_info["spzp"] = data;
	    	var jsoninfo = JSON.stringify(sptp_info);
	        $.ajax({
	            url: url,
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#sp').datagrid('reload');// reload the data
	    			$('#sptpedit_dialog').dialog('close');
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
function spDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/sp/deleteSp.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#sp').datagrid('reload');// reload the data
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