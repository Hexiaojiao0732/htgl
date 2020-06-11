var wdid;
$(function() {
	
//	$('#pl').parent().find('.datagrid-cell').each(function(){
//	    $(this).attr('title',$(this).html());
//	});
	$('#pl').datagrid({
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
		url: '../memory/pl/selectPl.do',
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
			{field:'nr',title:'评论内容',width:50,
				formatter:function(value, row, index){
//					 return "<a href='#' onclick='test("+index+");'>" + value + "</a>";
				return	'<span class="spanRow hbut"><a href="#" onclick="test('
					+ index
					+ ')">'+value+'</a></span>';

				}
			},
			{field:'plsj',title:'评论时间',width:50,
				formatter : function(value, row, index) {
					return value.substring(0,19);
				}
			},
			{field:'userId',title:'评论者',width:50},
			{field:'spmc',title:'视频名称',width:50},
			{field:'ypmc',title:'音频名称',width:50},
			{field:'cbwmc',title:'出版物名称',width:50},
			{field:'wjmc',title:'合作资源名称',width:50},
			{field:'zt',title:'审核',width:50,
				formatter : function(value, row, index) {
					if(value==0){
						return "未审核";
					}
					if(value==1){
							return "审核";
					}
				}
			},
			{field:'操作',title:'操作',width:50,
				formatter : function(value, row, index) {
					
					if(row.zt == 0){
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="shPl('
							+ row.id
							+ ')">审核</a></span>';
						d = '<span class="spanRow"><a href="#" class="griddel" onclick="plDelete('
								+ row.id
								+ ')">删除</a></span>';
						return d + e;
					}
					if(row.zt == 1){
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="cancelShPl('
							+ row.id
							+ ')">取消审核</a></span>';
						d = '<span class="spanRow"><a href="#" class="griddel" onclick="plDelete('
							+ row.id
							+ ')">删除</a></span>';
						return d + e;
					}
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,30,50,100],
		rownumbers:true,
		toolbar:'#toolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rowData){
			rolegridData(rowData);
		}
	});
});
function shPl(id){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/pl/shPl.do?id='+id,
//		data : '{"id":' + row.id + '}',
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "审核成功");
			$('#pl').datagrid('reload');// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert('Error', 'Unknown Error!');
		}
	});
}
function cancelShPl(id){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/pl/cancelShPl.do?id='+id,
//		data : '{"id":' + row.id + '}',
		dataType : 'json',
		success : function(data) {
			$.messager.progress('close');
			$.messager.alert("提示", "取消审核成功");
			$('#pl').datagrid('reload');// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert('Error', 'Unknown Error!');
		}
	});
}
function  test(index){
	var row = $('#pl').datagrid('getRows')[index];
	$('#dd_dialog').dialog({    
	    title: '评论内容',  
	    content:row.nr,
	    closed: false,    
	    cache: false,    
	});    
}



function plDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/pl/deletePl.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#pl').datagrid('reload');// reload the data
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

