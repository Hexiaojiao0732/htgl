$(function() {
	search();
});

function wtjlAdd() {
	$('#zt_form').form('clear');
	showDialog('#zt_dialog', '新增');
//	url = 'addWtjl.do';
}



function ztSaveData(){
	var tp= $("#zttp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#wt_form')) {
		return;
	}
//	var tp =$('#zttp').filebox('getValue');
//	 var len = tp.length;  
//    var math = tp.substring(len - 3, len);  
//	if(math !="jpg" && math !="gif" && math !="png" && math !="jpeg"  ){
//		$.messager.alert("错误提示", "请选择正确的图片格式");
//		return;
//	}
//	var elemZdinfo = $('#zt_form');
//	var edit_info = elemZdinfo.serializeObject();
////	edit_info["zttp"] = $('#zttp').filebox('getValue');
//	var jsoninfo = JSON.stringify(edit_info);
//	alert(jsoninfo);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	
	var formData = new FormData();
	formData.append("file", document.getElementById("zttp").files[0]);
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
	        var param={};
	        param["ztmc"] = $('#ztmc').val();
	        param["kssj"] = $('#kssj').datetimebox('getValue');
	        param["jssj"] = $('#jssj').datetimebox('getValue');
	        param["jj"] =$('#jj').val();
	        param["wzjj"] =$('#wzjj').val();
	        param["yxtdwldz"] = $('#yxtdwldz').val();
	        param["zttp"] = data;
	        
	        $.ajax({
	            url: '../memory/zt/addZt.do',
	            type: "POST",
	            data: JSON.stringify(param),
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	search();
	    			$.messager.progress('close');
	    			$('#zt_dialog').dialog('close');
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
function search() {
	$.ajax({
		url : "../memory/zt/selectList.do",
		type : "post",
//		data : form,
		contentType : 'application/json',
        dataType : 'json',
		success : function(data) {
			data = data.callbackData.result;
			for(var i=0;i<data.length;i++ ){
				var obj = data[i];
//				alert(JSON.stringify(obj));
			}
			var html = '';
			$('#pqList').html('');
			var queryListCount = data.length;
			 $('#count').html('结果共' + data.length + '条，查询时间为' + 0
			 / 1000 + '秒');
			if (data.length > 0) {
				var last = 1;
				for (var i = 0; i < data.length; i++) {
					var obj = data[i];
					var ztmc = data[i].ztmc;
					if (last == 4) {
						html += '<li class="last">';
						last = 0;
					} else {
						html += '<li>';
					}
					var imageUrl = "common/imageshow.do?path="+escape(data[i].zttp);
					html += '<div class="list_img"><img  src="'
							+ imageUrl
							+ '" /></div>';
					html += '<div class="list_nr"><p><span style="font-size:23px;" >专题名称：</sapn> '
						+ data[i].ztmc + '</p>';
//					html += '<div class="list_nr"><p><span style="font-size:23px;" >专题名称：<span> '
//							+ data[i].ztmc + '</p>';
//					html += '<p>操作：<a style="color:red;font-size:18px;cursor:pointer"  class="griddel" onclick="deleteZt('+data[i].id+');"></a></p></div>';
					html += '<p><span style="font-size:20px;">专题：</span><a style="color:red;font-size:20px;text-decoration:underline;cursor:pointer"  name="noButton" onclick="xqZt('+data[i].id+');">详情</a></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img alt="删除专题信息" src="../image/icon/delete.gif" style="height:30px;weight:30px;" onclick="deleteZt('+data[i].id+');"><span style="font-size:18px; color:red;" >删除</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img alt="修改专题信息" src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="editZt('+data[i].id+');"><span style="font-size:18px; color:red;" >修改</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img alt="修改专题信息" src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="editZtTp('+data[i].id+');"><span style="font-size:18px; color:red;" >修改图片</span></p></div>';
					html += '<p class="clear"></p> </li>';
					last++;
				}

			} else {
				queryListCount = 0;
			}
			html += '<p class="clear"></p>';
			$('#pqList').html(html);
			var $target = $('#pqList');
			var targetOffset = $target.offset().top-1000;
			$('#mainDiv').animate({
				scrollTop : targetOffset
			}, 1000);
		},
		error : function(data) {
			$.messager.progress('close');
			$.messager.alert('Error', '未知错误!' + data.content);
		}
	});
}
//详情
function xqZt(id){
	showDialog('#ztxq_dialog', '专题详情');
	
	$('#ztmapinfo').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		height : 600,
		fitColumns : true,
		nowrap : false,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/ztmapinfo/selectAllList.do?id='+id,
		remoteSort: false,
		idField:'id',
		singleSelect:true,
		frozenColumns:[[
            {field:'ck',checkbox:true},
            {title:'ID',field:'id',width:80,sortable:true,hidden:true}
		]],
		columns:[[
			{field:'x',title:'横坐标',width:50},
			{field:'y',title:'纵坐标',width:50},
			{field:'dd',title:'地点',width:50},
			{field:'ms',title:'描述',width:50},
			{field:'ztmc',title:'专题名称',width:50},
			{field:'操作',title:'操作',width:50,
				formatter : function(value, row, index) {
					var e = '';
					var c = '';
					var D = '';
						e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="cbwEdit('
								+ index
								+ ')">修改</a></span>';
							d = '<span class="spanRow"><a href="#" class="griddel" onclick="ztMapInfoDelete('
									+ row.id
									+ ')">删除</a></span>';
						return   d;
						
				}
			}
		]],
		pagination:true,
		pageSize:20,
		pageList: [20,30,40,50,100],
		rownumbers:true,
		toolbar:'#ztToolbar',
		//行选择方法，进行条件触发
		onSelect: function(rowIndex, rowData){
			rolegridData(rowData);
		}
		
	});
}
function  zdmapinfoAdd(){
	$('#ztId').combobox({    
	    url:'../memory/zt/queryZtMc.do',    
	    valueField:'id',    
	    textField:'ztmc'   
	});
	$('#ztxqadd_form').form('clear');
	showDialog('#ztxqadd_dialog', '人物新增');
//	url:'../memory/ztmapinfo/ztMapInfoAdd.do';
}
function ztxqaddEditSaveData(){
	if (!checkForm('#ztxqadd_form')) {
		return;
	}
	var elemZdinfo = $('#ztxqadd_form');
	var ztmap_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(ztmap_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url :'../memory/ztmapinfo/ztMapInfoAdd.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			search();
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#ztxqadd_dialog').dialog('close');
			$('#ztmapinfo').datagrid('reload');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function ztMapInfoDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/ztmapinfo/deleteZtMapInfo.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#ztmapinfo').datagrid('reload');
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

function deleteZt(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/zt/deleteZt.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					search();
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
function  editZt(id){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/zt/queryZtById.do?id='+id,
//		data : '{"id":' + row.id + '}',
		dataType : 'json',
		success : function(data) {
			showDialog('#ztedit_dialog', '修改专题内容');
			data = data.callbackData.result;
			for(var i=0;i<data.length;i++ ){
				var obj = data[i];
					$('#id1').val(data[i].id);
					$('#ztmc1').textbox('setValue',  data[i].ztmc);
//					$('#zttp1').val("11111");
					$('#yxtdwldz1').textbox('setValue',  data[i].yxtdwldz);
					$('#kssj1').datetimebox('setValue',  data[i].kssj);
					$('#jssj1').datetimebox('setValue',  data[i].jssj);
					$('#jj1').val(data[i].jj);
					$('#wzjj1').val(data[i].wzjj);
			}
//			url = '../memory/hzhb/editHzhb.do';
			search();
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert('Error', 'Unknown Error!');
		}
	});
}

function ztEditSaveData(){
	if (!checkForm('#ztedit_form')) {
		return;
	}
	var elemZdinfo = $('#ztedit_form');
	var edit_info = elemZdinfo.serializeObject();
//	edit_info["zttp"] = $('#zttp1').filebox('getValue');
	var jsoninfo = JSON.stringify(edit_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url :'../memory/zt/editZt.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			search();
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#ztedit_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}

function  editZtTp(id){
	$('#zttpedit_form').form('clear');
	showDialog('#zttpedit_dialog', '修改专题图片');
	url = '../memory/zt/editZtTp.do?id='+id ;
}
function  zttpEditSaveData(){
	var tp= $("#zttp2").val();
	if (!checkForm('#zttpedit_form')) {
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
	formData.append("file", document.getElementById("zttp2").files[0]);
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
	    	var elemzxinfo = $('#zttpedit_form');
	    	var zttp_info = elemzxinfo.serializeObject();
	    	zttp_info["zttp"] = data;
	    	var jsoninfo = JSON.stringify(zttp_info);
	        $.ajax({
	            url: url,
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	search();
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#zt').datagrid('reload');// reload the data
	    			$('#zttpedit_dialog').dialog('close');
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
