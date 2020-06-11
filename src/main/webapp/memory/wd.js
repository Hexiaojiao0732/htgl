var wdid;
$(function() {
	$('#wd').datagrid({
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
		url: '../memory/wd/selectWdList.do',
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
			{field:'ys',title:'页数',width:50},
			{field:'wddz',title:'文档地址',width:50},
			{field:'jj',title:'简介',width:50},
			{field:'pssj',title:'拍摄时间',width:50,
				formatter: function(value,row,index){
					var value=  value.substring(0,19);
					return value;
				}
			},
			{field:'psdd',title:'拍摄地点',width:50},
			{field:'gxzxm',title:'贡献者',width:50},
			{field:'操作',title:'操作',width:50,
				formatter : function(value, row, index) {
					var e = '';
					var c = '';
					var D = '';
						
//							d = '<span class="spanRow"><a href="#" class="griddel" onclick="wdDelete('
//									+ row.id
//									+ ')">删除</a></span>';
//						return  e + d;
						
						if(row.wyid == null || row.wyid== '' ){
							b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="wdEdit('
								+ index
								+ ')">修改</a></span>';
							c = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="shWd('
								+ row.id
								+ ')">审核</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="wdDelete('
								+ row.id
								+ ')">删除</a></span>';
							e = '<span class="spanRow hbut"><a href="../memory/wd/wdDownload.do?wddz='+row.wddz+'"  class="griddownload">下载</a></span>';
							return c + d+e+b;
						}else{
							b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="wdEdit('
								+ index
								+ ')">修改</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="wdDelete('
								+ row.id
								+ ')">删除</a></span>';
							e = '<span class="spanRow hbut"><a href="../memory/wd/wdDownload.do?wddz='+row.wddz+'"  class="griddownload">下载</a></span>';
							return  d+e+b;
						}
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,30,50,100],
		rownumbers:true,
		queryParams: {          
            sfsh: 1            
          }  ,
		toolbar:'#wdToolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rowData){
			rolegridData(rowData);
		}
		
	});
});

function tkSearch(){
	$('#wd').datagrid('load', {
		sfsh : $('#sfsh').val(),
		tfresh : new Date().getTime()
	});
}

function  shWd(a){
	wdid=a;
	$('#shwd_form').form('clear');
	showDialog('#shwd_dialog', '文档审核');
}
function  shwdSaveData(){
	if (!checkForm('#shwd_form')) {
		return;
	}
	var elemZdinfo = $('#shwd_form');
	var shwd_info = elemZdinfo.serializeObject();
	shwd_info["id"]=wdid;
	var jsoninfo = JSON.stringify(shwd_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/wd/updateShWd.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#wd').datagrid('reload');// reload the data
			$('#shwd_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function  wdAdd(){
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
	$('#wd_form').form('clear');
	showDialog('#wd_dialog', '文档新增');
	url = '../memory/wd/addWd.do';
}

function  wdSaveData(){
	if (!checkForm('#wd_form')) {
		return;
	}
	var elemZdinfo = $('#wd_form');
	var wd_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(wd_info);
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
			$('#wd').datagrid('reload');// reload the data
			$('#wd_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function wdEdit(index) {
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
	var row = $('#wd').datagrid('getRows')[index];
	 $("#wllx ").val(row.wjlx); 
	showDialog('#wd_dialog', '文档编辑');
//	$('#gxz_form').form('clear');
	$('#wd_form').form('load', row);
	url = '../memory/wd/editWd.do' ;
}
function wdDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/wd/deleteWd.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#wd').datagrid('reload');// reload the data
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