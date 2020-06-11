$(function() {
	$('#tk').datagrid({
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
		url: '../memory/tk/selectTkList.do',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'mc',title:'姓名',width:50},
			{field:'tpdz',title:'图片地址',width:50},
			{field:'rwxm',title:'人物名称',width:50},
			{field:'jlmc',title:'记录名称',width:50},
			{field:'jj',title:'简介',width:50},
			{field:'pssj',title:'拍摄时间',width:50,
				formatter: function(value,row,index){
					if(value){
						value=  value.substring(0,19);
					}
					return value;
				}
			},
			{field:'psdd',title:'拍摄地点',width:50},
			{field:'gxzxm',title:'贡献者',width:50},
			{field:'tkZt',title:'图库状态',width:50,
				formatter : function(value, row, index) {
					if(value == 0){
						return '未审核';
					}if(value == 1){
						return '已审核';
					}
				}
			},
			{field:'操作',title:'操作',width:150,
				formatter : function(value, row, index) {
					var e = '';
					var c = '';
					if(row.tkZt == 0 || row.tkZt== '' || row.tkZt ==null){
						a = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="tkEdit('
							+ index
							+ ')">修改</a></span>';
						b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="tktpEdit('
							+ index
							+ ')">修改图片</a></span>';
						c = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="shSp('
							+ row.id
							+ ')">审核</a></span>';
						d = '<span class="spanRow"><a href="#" class="griddel" onclick="tkDelete('
							+ row.id
							+ ')">删除</a></span>';
						e = '<span class="spanRow hbut"><a href="../memory/rk/tkDownload.do?tpdz='+row.tpdz+'"  class="griddownload">下载</a></span>';
				return a+ c + d+e +b;
					}else{
						a = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="tkEdit('
							+ index
							+ ')">修改</a></span>';
						b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="tktpEdit('
							+ index
							+ ')">修改图片</a></span>';
						d = '<span class="spanRow"><a href="#" class="griddel" onclick="tkDelete('
							+ row.id
							+ ')">删除</a></span>';
						e = '<span class="spanRow hbut"><a href="../memory/tk/tkDownload.do?tpdz='+row.tpdz+'"  class="griddownload">下载</a></span>';
						return  a+d+e+b;
					}
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,30,50,100],
		rownumbers:true,
		queryParams: {          
            sfsh: null            
          }  ,
		toolbar:'#tkToolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rotkata){
			rolegridData(rotkata);
		}
		
	});
});
function tkSearch(){
	$('#tk').datagrid('load', {
		tkZt : $('#tkZt').val(),
		tfresh : new Date().getTime()
	});
}

function shSp(a){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/tk/updateShTk.do?id='+a,
//		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "审核成功");
			$('#tk').datagrid('reload');// reload the data
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function  tkAdd(){
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
	$('#tk_form').form('clear');
	showDialog('#tk_dialog', '图库新增');
//	url = '../memory/tk/addtk.do';
}

function  tkSaveData(){
	var tp= $("#tpdz").val();
	if (!checkForm('#tk_form')) {
		return;
	}
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("tpdz").files[0]);
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
	    	var elemzxinfo = $('#tk_form');
	    	var tk_info = elemzxinfo.serializeObject();
	    	tk_info["tpdz"] = data;
	    	var jsoninfo = JSON.stringify(tk_info);
	        $.ajax({
	            url: '../memory/tk/addtk.do',
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#tk').datagrid('reload');// reload the data
	    			$('#tk_dialog').dialog('close');
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
//			$('#tk').datagrid('reload');// reload the data
//			$('#tk_dialog').dialog('close');
//			// $('#zd_grid').datagrid('loadData',data);// reload the data
//		},
//		error : function(data) {
//			$.messager.progress('close');
//			// exception in java
//			$.messager.alert("提示", "数据填写不完整");
//		}
//	});
}
//图片修改
function tktpEdit(index){
	var row = $('#tk').datagrid('getRows')[index];
	showDialog('#tktpedit_dialog', '图库图片编辑');
	$('#tktpedit_form').form('clear');
	$('#tktpedit_form').form('load', row);
	url = '../memory/tk/editTkTp.do' ;
}
function  tktpeditSaveData(){
	var tp= $("#tpdz1").val();
	if (!checkForm('#tktpedit_form')) {
		return;
	}
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("tpdz1").files[0]);
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
	    	var elemzxinfo = $('#tktpedit_form');
	    	var tktp_info = elemzxinfo.serializeObject();
	    	tktp_info["tpdz"] = data;
	    	var jsoninfo = JSON.stringify(tktp_info);
	        $.ajax({
	            url: url,
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#tk').datagrid('reload');// reload the data
	    			$('#tktpedit_dialog').dialog('close');
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

//修改
function tkEdit(index) {
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
	var row = $('#tk').datagrid('getRows')[index];
	 $("#wllx ").val(row.wjlx); 
	showDialog('#tkedit_dialog', '图库编辑');
	$('#gxz_form').form('clear');
	$('#tkedit_form').form('load', row);
	url = '../memory/tk/editTk.do' ;
}

function tkeditSaveData(){
	if (!checkForm('#tkedit_form')) {
		return;
	}
	var elemZdinfo = $('#tkedit_form');
	var tkedit_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(tkedit_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : url,
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#tk').datagrid('reload');// reload the data
			$('#tkedit_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function tkDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/tk/deleteTk.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#tk').datagrid('reload');// reload the data
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