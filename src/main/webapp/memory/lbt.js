$(function() {
	$('#lbt').datagrid({
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
		url: '../memory/lbt/selectLbt.do',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'tpmc',title:'图片名称',width:50},
			{field:'tplj',title:'图片路径',width:50},
			{field:'lbsx',title:'轮播顺序',width:20},
			{field:'url',title:'外链地址',width:50},
			{field:'lbwz',title:'轮播文字',width:50},
			{field:'lblx',title:'轮播类型',width:20,
				formatter : function(value, row, index) {
					if(value == 0 ){
						return "首页";
					}
					if(value == 1 ){
						return "合作者";
					}
					if(value == 2 ){
						return "你的记忆";
					}
			}
			
			},
			{field:'操作',title:'操作',width:50,
				formatter : function(value, row, index) {
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="lbtEdit('
								+ index
								+ ')">修改</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="lbtDelete('
									+ row.id
									+ ')">删除</a></span>';
						return   e+d;
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
function  lbtAdd(){
	$('#lbsc1').hide();
	$('#lbt_form').form('clear');
	showDialog('#lbt_dialog', '轮播图新增');
	url = '../memory/lbt/addLbt.do';
}

function  lbtSaveData(){
	var tp= $("#tplj").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
		if (!checkForm('#lbt_form')) {
			return;
		}
		$.messager.progress({
			title : '请等待',
			msg : '添加/修改数据中...'
		});
		var formData = new FormData();
		formData.append("file", document.getElementById("tplj").files[0]);
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
		    	var elemzxinfo = $('#lbt_form');
		    	var lbt_info = elemzxinfo.serializeObject();
		    	lbt_info["tplj"] = data;
		    	var jsoninfo = JSON.stringify(lbt_info);
		        $.ajax({
		            url: url,
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function () {
		            	$.messager.progress('close');
						$.messager.alert("提示", "保存成功");
						$('#lbt').datagrid('reload');// reload the data
						$('#lbt_dialog').dialog('close');
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

function lbtDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/lbt/deleteLbt.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#lbt').datagrid('reload');// reload the data
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

function lbtEdit(index) {
	var row = $('#lbt').datagrid('getRows')[index];
	showDialog('#lbtedit_dialog', '编辑轮播图');
	$('#lbtedit_form').form('clear');
	$('#lbtedit_form').form('load', row);
	url = '../memory/lbt/editLbt.do' ;
}
function lbteditSaveData(){
	if (!checkForm('#lbtedit_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var elemzxinfo = $('#lbtedit_form');
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
			$('#lbt').datagrid('reload');// reload the data
			$('#lbtedit_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}


