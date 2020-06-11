$(function() {
//	$('#sjzp').filebox({    
//	    buttonText: '选择图片', 
//	    buttonAlign: 'left' 
//	})
	$('#dsj').datagrid({
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
		url: '../memory/dsj/selectDsjList.do',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'sjmc',title:'事件名称',width:50},
			{field:'sjnr',title:'事件内容',width:100},
			
			{field:'sjsj', title:'事件时间', width:50	,
				formatter: function(value,row,index){
					var value=  value.substring(0,19);
						return value;
				}
				},
				{field:'sjzp',title:'时间照片',width:50},
			{field:'操作',title:'操作',width:150,
				formatter : function(value, row, index) {
					var e = '';
					var c = '';
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="sjEdit('
								+ index
								+ ')">修改</a></span>';
						c = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="sjtpEdit('
							+ index
							+ ')">修改图片</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="sjDelete('
									+ row.id
									+ ')">删除</a></span>';
						return   d+e+c;
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
function  dsjAdd(){
	$('#sj_form').form('clear');
	showDialog('#dsj_dialog', '大事记新增');
//	url = '../memory/dsj/addDsj.do';
}
function sjDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/dsj/deleteSj.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#dsj').datagrid('reload');// reload the data
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
function sjtpEdit(index){
	var row = $('#dsj').datagrid('getRows')[index];
	showDialog('#dsjedittp_dialog', '事记图片修改');
	$('#sjtp_form').form('clear');
	$('#sjtp_form').form('load', row);
}
function dsjtpSaveData(){
	var tp= $("#sjzp1").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
		if (!checkForm('#sjtp_form')) {
			return;
		}
		$.messager.progress({
			title : '请等待',
			msg : '添加/修改数据中...'
		});
		var formData = new FormData();
		formData.append("file", document.getElementById("sjzp1").files[0]);
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
		    	var elemzxinfo = $('#sjtp_form');
		    	var sj_info = elemzxinfo.serializeObject();
		    	sj_info["sjzp"] = data;
		    	var jsoninfo = JSON.stringify(sj_info);
		        $.ajax({
		            url: '../memory/dsj/editSjTp.do',
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function () {
		            	$.messager.progress('close');
						$.messager.alert("提示", "保存成功");
		            	$('#dsj').datagrid('reload');// reload the data
						$('#dsjedittp_dialog').dialog('close');
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
function sjEdit(index) {
	var row = $('#dsj').datagrid('getRows')[index];
	showDialog('#dsjedit_dialog', '编辑事件');
	$('#sjedit_form').form('clear');
	$('#sjedit_form').form('load', row);
	url = '../memory/dsj/editSj.do' ;
}


function  dsjeditSaveData(){
		if (!checkForm('#sjedit_form')) {
			return;
		}
		var elemZdinfo = $('#sjedit_form');
		var sj_info = elemZdinfo.serializeObject();
		var jsoninfo = JSON.stringify(sj_info);
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
				$('#dsj').datagrid('reload');// reload the data
				$('#dsjedit_dialog').dialog('close');
				// $('#zd_grid').datagrid('loadData',data);// reload the data
			},
			error : function(data) {
				$.messager.progress('close');
				// exception in java
				$.messager.alert("提示", "保存失败");
			}
		});
}


function  dsjSaveData(){
	var tp= $("#sjzp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
		if (!checkForm('#sj_form')) {
			return;
		}
//		var elemZdinfo = $('#sj_form');
//		var sj_info = elemZdinfo.serializeObject();
//		sj_info["sjzp"] = $('#sjzp').filebox('getValue');
//		var jsoninfo = JSON.stringify(sj_info);
		$.messager.progress({
			title : '请等待',
			msg : '添加/修改数据中...'
		});
		var formData = new FormData();
		formData.append("file", document.getElementById("sjzp").files[0]);
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
		    	var elemzxinfo = $('#sj_form');
		    	var sj_info = elemzxinfo.serializeObject();
		    	sj_info["sjzp"] = data;
		    	var jsoninfo = JSON.stringify(sj_info);
		        $.ajax({
		            url: '../memory/dsj/addDsj.do',
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function (data) {
		            	$.messager.alert(data.title, data.content); 
		            	$.messager.progress('close');
//						$.messager.alert("提示", "保存成功");
		            	$('#dsj').datagrid('reload');// reload the data
						$('#dsj_dialog').dialog('close');
		            },
		            error: function (data) {
		            	$.messager.alert(data.title, data.content); 
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
//				$('#dsj').datagrid('reload');// reload the data
//				$('#dsj_dialog').dialog('close');
//				// $('#zd_grid').datagrid('loadData',data);// reload the data
//			},
//			error : function(data) {
//				$.messager.progress('close');
//				// exception in java
//				$.messager.alert("提示", "数据填写不完整");
//			}
//		});
}
