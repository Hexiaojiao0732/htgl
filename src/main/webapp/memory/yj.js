$(function() {
	$('#yj').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		width : '100%',
		height : '98%',
		fitColumns : true,
		nowrap : false,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/yj/selectYjList.do',
		sortName: 'id',
		sortOrder: 'asc',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'nr',title:'内容',width:50},
			
			{field:'tjsj', title:'提交时间', width:100	,
				formatter: function(value,row,index){
					var value=  value.substring(0,19);
						return value;
				}
				}
//			{field:'操作',title:'操作',width:50,
//				formatter : function(value, row, index) {
//					var e = '';
//					var c = '';
//						e = '<span name="ajxxEdit" class="spanRow hbut"><a href="#" class="gridedit" onclick="wjdcEdit('
//								+ index
//								+ ')">修改</a></span>';
//							d = '<span class="spanRow"><a href="#" class="griddel" onclick="zxDelete('
//									+ row.id
//									+ ')">删除</a></span>';
//						return  e + d;
//				}
//			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,40,50,100],
		rownumbers:true,
		toolbar:'#toolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rowData){
			rolegridData(rowData);
		}
		
	});
});

function zxDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/wjdc/deleteWjdc.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#wjdc1').datagrid('reload');// reload the data
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

function wjdcEdit(index) {
	var row = $('#wjdc1').datagrid('getRows')[index];
	showDialog('#wjdc_dialog', '编辑wj配置');
	$('#wjdc_form').form('clear');
	$('#wjdc_form').form('load', row);
	$('#id').attr('readonly', 'readonly');
	$('#id').addClass('readonlyCss');
	url = '../memory/wjdc/editWjdc.do' ;
}
function  wfdcSaveData(){
		if (!checkForm('#wjdc_form')) {
			return;
		}
		var elemZdinfo = $('#wjdc_form');
		var wj_info = elemZdinfo.serializeObject();
		var jsoninfo = JSON.stringify(wj_info);
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
				$('#wjdc1').datagrid('reload');// reload the data
				$('#wjdc_dialog').dialog('close');
				// $('#zd_grid').datagrid('loadData',data);// reload the data
			},
			error : function(data) {
				$.messager.progress('close');
				// exception in java
				$.messager.alert("提示", "数据填写不完整");
			}
		});
}
