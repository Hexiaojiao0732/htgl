$(function() {
	$('#zxdata').datagrid({
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
		url: '../memory/zx/selectZxList.do',
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'bt',title:'标题',width:50},
			{field:'nr', title:'内容', width:200},
			{field:'xsurl', title:'学术URL', width:100},
			{field:'dlx', title:'类型', width:100,
				formatter:function(value,row,index){
					if(value==1){
						return "相关机构";
					}
					if(value ==2){
						return "新闻动态";
					}
					if(value ==3){
						return "推荐书目";
					}
				}
			},
			{field:'tp', title:'图片', width:100},
			{field:'fssj', title:'开始时间', width:100	,
				formatter: function(value,row,index){
					var value=  value.substring(0,19);
						return value;
				}
				},
			{field:'操作',title:'操作',width:150,
				formatter : function(value, row, index) {
					var e = '';
					var c = '';
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="zxEdit('
								+ index
								+ ')">修改</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="zxDelete('
									+ row.id
									+ ')">删除</a></span>';
							c = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="zxtpEdit('
								+ index
								+ ')">修改图片</a></span>';
						return   e+d+c;
				}
			}
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
function xuesu(){
	$('#xsurl').show();
}
function xinwen(){
	$('#xsurl').hide();
}
function zxAdd() {
	$('#xsurl').hide();
	$('#zx_form').form('clear');
	showDialog('#zx_dialog', '资讯新增');
//	url = 'addWtjl.do';
}
function zxSaveData(){
	var tp= $("#tp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#zx_form')) {
		return;
	}
	
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	
	var formData = new FormData();
	formData.append("file", document.getElementById("tp").files[0]);
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
	    	var elemzxinfo = $('#zx_form');
	    	var zx_info = elemzxinfo.serializeObject();
	    	zx_info["tp"] = data;
	    	var jsoninfo = JSON.stringify(zx_info);
	        $.ajax({
	            url: '../memory/zx/addZx.do',
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	    			$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#zx_dialog').dialog('close');
	    			$('#zxdata').datagrid('reload');
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

function  zxDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/zx/deleteZx.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#zxdata').datagrid('reload');// reload the data
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
function xuesu1(){
	$('#xsurl1').show();
}
function xinwen1(){
	$('#xsurl1').hide();
	$('#xsurl1').prop('value', '');
}
function zxEdit(index) {
	var row = $('#zxdata').datagrid('getRows')[index];
	if(row.dlx ==2){
		$('#xsurl1').hide();
	}
	if(row.dlx ==1){
		$('#xsurl1').show();
	}
	showDialog('#zxedit_dialog', '编辑资讯');
	$('#zxedit_form').form('clear');
	$('#zxedit_form').form('load', row);
	url = '../memory/zx/editZx.do' ;
}
function  zxeditSaveData(){
	if (!checkForm('#zxedit_form')) {
		return;
	}
	var elemZdinfo = $('#zxedit_form');
	var zxedit_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(zxedit_info);
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
			$('#zxdata').datagrid('reload');// reload the data
			$('#zxedit_dialog').dialog('close');
			// $('#zd_grid').datagrid('loadData',data);// reload the data
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "保存失败");
		}
	});
}
function  zxtpEdit(index){
	var row = $('#zxdata').datagrid('getRows')[index];
	showDialog('#zxtpedit_dialog', '编辑资讯图片');
	$('#zxtp_form').form('clear');
	$('#zxtp_form').form('load', row);
	url = '../memory/zx/editZxTp.do' ;
}
function zxtpeditSaveData(){
	var tp= $("#tp1").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
		if (!checkForm('#zxtp_form')) {
			return;
		}
		$.messager.progress({
			title : '请等待',
			msg : '添加/修改数据中...'
		});
		var formData = new FormData();
		formData.append("file", document.getElementById("tp1").files[0]);
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
		    	var elemzxinfo = $('#zxtp_form');
		    	var zxtp_info = elemzxinfo.serializeObject();
		    	zxtp_info["tp"] = data;
		    	var jsoninfo = JSON.stringify(zxtp_info);
		        $.ajax({
		            url: '../memory/zx/editZxTp.do',
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function () {
		            	$.messager.progress('close');
						$.messager.alert("提示", "保存成功");
		            	$('#zxdata').datagrid('reload');// reload the data
						$('#zxtpedit_dialog').dialog('close');
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
