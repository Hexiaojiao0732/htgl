$(function() {
	$('#wjdc1').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		width : '100%',
		height : '91%',
		fitColumns : true,
		nowrap : false,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/wjdc/selectWjdcList.do',
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
				{field:'xm',title:'姓名',width:50},
				{field:'xb',title:'性别',width:50},
				{field:'csrq', title:'出生日期', width:100	},
				{field:'lxfs',title:'联系方式',width:50},
				{field:'szdq',title:'所在地区',width:50},
				{field:'gznr',title:'关注内容',width:50},
				{field:'zyyxgjy',title:'专业 相关经验',width:50},
				{field:'zwyy',title:'掌握语言',width:50},
				{field:'tgzynr',title:'提供资源内容',width:50}
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

//数据导出
function exportData() {
	$.messager.progress({
		title : '请等待',
		msg : '下载中...'
	});
	// 2请求后台
	document.getElementById("exportForm").action="../memory/wjdc/exportExcel.do";
	document.getElementById("exportForm").submit();
	$.messager.progress('close');
	// 3打印表格
}