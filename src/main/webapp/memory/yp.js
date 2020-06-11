var  ypid;
$(function() {
	$('#yp').datagrid({
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
		url: '../memory/yp/selectYpList.do',
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
			{field:'jj',title:'简介',width:50},
			{field:'ypdz',title:'音频地址',width:50},
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
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="ypEdit('
								+ index
								+ ')">修改</a></span>';
//							d = '<span class="spanRow"><a href="#" class="griddel" onclick="ypDelete('
//									+ row.id
//									+ ')">删除</a></span>';
//						return  e + d;
						if(row.wyid == null || row.wyid== '' ){
							b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="ypEdit('
								+ index
								+ ')">修改</a></span>';
							c = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="shYp('
								+ row.id
								+ ')">审核</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="ypDelete('
								+ row.id
								+ ')">删除</a></span>';
							e = '<span class="spanRow hbut"><a href="../memory/yp/ypDownload.do?ypdz='+row.ypdz+'"  class="griddownload">下载</a></span>';
					return c+ d+e+b;
						}else{
							b = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="ypEdit('
								+ index
								+ ')">修改</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="ypDelete('
								+ row.id
								+ ')">删除</a></span>';
							e = '<span class="spanRow hbut"><a href="../memory/yp/ypDownload.do?ypdz='+row.ypdz+'"  class="griddownload">下载</a></span>';
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
		toolbar:'#ypToolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rowData){
			rolegridData(rowData);
		}
		
	});
});


function ypSearch(){
	$('#yp').datagrid('load', {
		sfsh : $('#sfsh').val(),
		tfresh : new Date().getTime()
	});
}

function shYp(a){
	ypid =a;
	$('#shyp_form').form('clear');
	showDialog('#shyp_dialog', '音频审核');
}
function  shypSaveData(){
	if (!checkForm('#shyp_form')) {
		return;
	}
	var elemZdinfo = $('#shyp_form');
	var shyp_info = elemZdinfo.serializeObject();
	shyp_info["id"] = ypid;
	var jsoninfo = JSON.stringify(shyp_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url :'../memory/yp/updateShYp.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#yp').datagrid('reload');// reload the data
			$('#shyp_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function  ypAdd(){
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
	$('#yp_form').form('clear');
	showDialog('#yp_dialog', '音频新增');
	url = '../memory/yp/addYp.do';
}

function  ypSaveData(){
	if (!checkForm('#yp_form')) {
		return;
	}
	var elemZdinfo = $('#yp_form');
	var yp_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(yp_info);
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
			$('#yp').datagrid('reload');// reload the data
			$('#yp_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function ypEdit(index) {
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
	var row = $('#yp').datagrid('getRows')[index];
	 $("#wllx ").val(row.wjlx); 
	showDialog('#yp_dialog', '音频编辑');
//	$('#gxz_form').form('clear');
	$('#yp_form').form('load', row);
	url = '../memory/yp/editYp.do' ;
}
function ypDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/yp/deleteYp.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#yp').datagrid('reload');// reload the data
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