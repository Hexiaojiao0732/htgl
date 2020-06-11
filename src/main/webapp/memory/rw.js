var aArray = new Array();
var bArray = new Array();
var a =-1;
var rwgx="";
var ID;
$(function() {
	searchRw();
});

function rwXqGx(){
	a=-1;
	$('#gx_form').form('clear');
	$('#gx_dialog').dialog({
	    title: '人物关系新增',
	    left:10,
//	    right:0,
	    top:10,
	    closed: false,
	    cache: false,
	    modal: true,
	});
}
function gxSaveData(){
	var tp= $("#rwzp2").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#gx_form')) {
		return;
	}
	a++;
	bArray=[];
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	
	var formData = new FormData();
	formData.append("file", document.getElementById("rwzp2").files[0]);
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
	    	
	    	var elemZdlxinfo = $('#gx_form');
	    	var zdlx_info = elemZdlxinfo.serializeObject();
	    	zdlx_info["rwzp"] = data;
	    	var jsoninfo = JSON.stringify(zdlx_info);
	    	bArray[a] = jsoninfo;
	    	var ids=bArray; 
	        jQuery.ajax({
	    		type : 'POST',
	    		url : '../memory/rw/addGx.do?id'+ID,
	    		data:{ids:ids,id:ID},
	    		dataType : 'json',
	    		success : function(data) {
//	    			searchRw();rwxq_dialog
	    			addGXRW(ID);
//	    			showDialog('#rwxq_dialog', '关系人物新增');
	    			$.messager.progress('close');
//	    			$.messager.alert(data.title, data.content);
	    			$('#gx_dialog').dialog('close');
	    		},
	    		error : function(data) {
	    			$.messager.progress('close');
	    			$.messager.alert('Error', 'Unknown Error!' + data);
	    		}
	    	});

	    },
	    error: function (data) {
	        alert("上传失败！");
	    }
	});
	}

function rwGx(){
	$('#rwgx_form').form('clear');
	$('#rwgx_dialog').dialog({
	    title: '人物关系新增',
	    left:10,
//	    right:0,
	    top:10,
	    closed: false,
	    cache: false,
	    modal: true,
	});
	var xm=$("#xm").val();
	$('#ssrwId').textbox('setValue',xm);
	var rwgx=$("#rwgx").textbox('getValue');
}

function addGXRW(id){
	ID=id;
	jQuery.ajax({
		type : 'POST',
		url : '../memory/rw/queryById.do?id'+id,
		data :{id:id},
		dataType : 'json',
//		contentType: "application/json;charset=utf-8",
		success : function(data) {
			data = data.callbackData.result;
			for(var i=0;i<data.length;i++ ){
				var obj = data[i];
			}
			$("#xq").empty();
			var html = '';
			$('#xq').html('');
			if (data.length > 0) {
				var last = 1;
				for (var i = 0; i < data.length; i++) {
					var obj = data[i];
					var xm = data[i].xm;
					var gx =data[i].yrwgx;
					var uniqueId = 	data[i].id;
					html += '<tr><td>姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-textbox" id=""   value="'+ xm+'" style="width:200px;" readonly="readonly" data-options="required:true"/></td><td>关系:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-textbox" id=""   value="'+ gx +'" style="width:200px;" readonly="readonly"  data-options="required:true"/></td><td>&nbsp;&nbsp;<a onclick="rwgxDelete('+uniqueId+','+id+')" href="#" class="griddel">删除</a></td></tr>';
				}
			} 
			$('#xq').html(html);
			showDialog('#rwxq_dialog', '详情页面');
		},
		error : function(data) {
			$.messager.progress('close');
			$.messager.alert('Error', 'Unknown Error!' + data);
		}
	});
//	$('#rwgx_form').form('clear');
//	showDialog('#rwgx_dialog', '关系人物新增');
}

function rwgxDelete(uniqueId,id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/rw/deleteRwgx.do?id='+uniqueId,
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					addGXRW(id);
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
function rwgxSaveData(){
	var tp= $("#rwzp1").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#rwgx_form')) {
		return;
	}
	a++;
	rwgx =$('#rwgx').textbox('getValue');
	var rw=$("#xm1").val();
	var gx=$("#yrwgx").val();
//	$('#rwgx').textbox('setValue',rw+"("+gx+")");
	if(rwgx ==''){
		$('#rwgx').textbox('setValue',rw+"("+gx+")");
	}else{
		$('#rwgx').textbox('setValue',rwgx+","+rw+"("+gx+")");
	}
	
	
	var formData = new FormData();
	formData.append("file", document.getElementById("rwzp1").files[0]);
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
	        var elemZdlxinfo = $('#rwgx_form');
	    	var rwgx_info = elemZdlxinfo.serializeObject();
	    	rwgx_info["rwzp"] = data;
	    	var jsoninfo = JSON.stringify(rwgx_info);
	    	aArray[a] = jsoninfo;
	    	$('#rwgx_dialog').dialog('close');
	        
	    },
	    error: function (data) {
	        alert("上传失败！");
	    }
	});
	
}
function rwAdd() {
	a=-1;
	aArray=[];
	$('#ztId').combobox({    
	    url:'../memory/zt/queryZtMc.do',    
	    valueField:'id',    
	    textField:'ztmc'   
	});
	$('#rw_form').form('clear');
	showDialog('#rw_dialog', '人物新增');
//	url = 'addWtjl.do';
}
function rwSaveData(){
	 var tp= $("#rwzp").val();
		if(tp== null || tp ==''){
			alert("请选择图片");
			return;
		}
	if (!checkForm('#rw_form')) {
		return;
	}
	var ids=aArray; 
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	if(ids.length==0){
		var formData = new FormData();
		formData.append("file", document.getElementById("rwzp").files[0]);
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
		    	var elemzxinfo = $('#rw_form');
		    	var jl_info = elemzxinfo.serializeObject();
		    	jl_info["rwzp"] = data;
		    	var jsoninfo = JSON.stringify(jl_info);
		        $.ajax({
		            url: '../memory/rw/addRw.do',
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function () {
		            	searchRw();
						$.messager.progress('close');
						$('#rw_dialog').dialog('close');
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
		
	}else{
		var formData = new FormData();
		formData.append("file", document.getElementById("rwzp").files[0]);
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
		    	var elemzxinfo = $('#rw_form');
		    	var jl_info = elemzxinfo.serializeObject();
		    	jl_info["rwzp"] = data;
		    	var jsoninfo = JSON.stringify(jl_info);
		        $.ajax({
		            url: '../memory/rw/addRw.do',
		            type: "POST",
		            data: jsoninfo,
		            contentType: 'application/json;charset=UTF-8',
		            dataType:"json",
		            success: function (data) {
		            	var id=data.callbackData;
						searchRw();
						jQuery.ajax({
							type : 'get',
							url : '../memory/rw/addRwGx.do',
							dataType:"json",  
			                data:{ids:ids,id:id},  
			                async: false,  
							success : function(data) {
								searchRw();
								$.messager.progress('close');
								$.messager.alert(data.title, data.content);
								$('#rw_dialog').dialog('close');
								
							},
							error : function(data) {
								$.messager.progress('close');
								$.messager.alert('Error', 'Unknown Error!' + data);
							}
						});
						$.messager.progress('close');
						$.messager.alert(data.title, data.content);
						$('#rw_dialog').dialog('close');
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
		
//		jQuery.ajax({
//			type : 'POST',
//			url : '../memory/rw/addRw.do',
//			data : jsoninfo,
//			dataType : 'json',
//			contentType: "application/json;charset=utf-8",
//			success : function(data) {
//				var id=data.callbackData;
//				searchRw();
//				jQuery.ajax({
//					type : 'get',
//					url : '../memory/rw/addRwGx.do',
//					dataType:"json",  
//	                data:{ids:ids,id:id},  
//	                async: false,  
//					success : function(data) {
//						searchRw();
//						$.messager.progress('close');
//						$.messager.alert(data.title, data.content);
//						$('#rw_dialog').dialog('close');
//						
//					},
//					error : function(data) {
//						$.messager.progress('close');
//						$.messager.alert('Error', 'Unknown Error!' + data);
//					}
//				});
//				$.messager.progress('close');
//				$.messager.alert(data.title, data.content);
//				$('#rw_dialog').dialog('close');
//				
//				
//			},
//			error : function(data) {
//				$.messager.progress('close');
//				$.messager.alert('Error', 'Unknown Error!' + data);
//			}
//		});
	}
	
}
function searchRw() {
	$.ajax({
		url : "../memory/rw/selectRw.do",
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
			$("#pqList").empty();
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
					var imageUrl = "common/imageshow.do?path="+escape(data[i].rwzp);
					html += '<div class="list_img"><img  src="'
							+ imageUrl
							+ '" /></div>';
					html += '<div class="list_nr"><p><span style="font-size:23px;" >人物名称：</sapn> '
						+ data[i].xm  + '</p>';
//					html += '<div class="list_nr"><p><span style="font-size:23px;">人物名称：</span> '
//							+ data[i].xm + '</p>';
					html += '<p><span style="font-size:20px;" >相关人物：</span><a style="color:red;font-size:20px;text-decoration:underline;cursor:pointer"  name="noButton" onclick="addGXRW('+data[i].id+');">详情</a></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img src="../image/icon/delete.gif" style="height:30px;weight:30px;" onclick="deleteRw('+data[i].id+');"><span style="font-size:18px; color:red;" >删除</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="editRw('+data[i].id+');"><span style="font-size:18px; color:red;" >修改</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="edittpRw('+data[i].id+');"><span style="font-size:18px; color:red;" >修改图片</span></p></div>';
					html += '<p class="clear"></p> </li>';
					last++;
				}

			} else {
				queryListCount = 0;
			}
			html += '<p class="clear"></p>';
			$('#pqList').html(html);
			var $target = $('#pqList');
			var targetOffset = $target.offset().top - 1000;
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

function deleteRw(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/rw/deleteRw.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					searchRw();
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
function  editRw(id){
	jQuery.ajax({
		type : 'POST',
		url : '../memory/rw/queryRwById.do?id'+id,
		data :{id:id},
		dataType : 'json',
		success : function(data) {
			$('#ztId1').combobox({    
			    url:'../memory/zt/queryZtMc.do',    
			    valueField:'id',    
			    textField:'ztmc'   
			});
			$('#rwedit_form').form('clear');
			showDialog('#rwedit_dialog', '人物修改页面');
			data = data.callbackData.result;
			for(var i=0;i<data.length;i++ ){
				var obj = data[i];
				$('#id1').val(data[i].id);
				$('#ztId1').combobox('setValue',data[i].ztId);
				$('#xm11').val(data[i].xm);
				$('#xb11').val(data[i].xb);
				$('#nl11').val(data[i].nl);
				$('#sf11').val(data[i].sf);
				$('#mz11').val(data[i].mz);
				$('#fl11').val(data[i].fl);
				$('#yz11').val(data[i].yz);
				$('#qtxm11').val(data[i].qtxm);
				$('#gb11').val(data[i].gb);
				$('#jg11').val(data[i].jg);
				$('#szn11').val(data[i].szn);
				$('#zp11').val(data[i].zp);
				$('#ly11').val(data[i].ly);
				$('#psdd11').val(data[i].psdd);
				$('#pssj11').datetimebox('setValue',  data[i].pssj);
				$('#jj11').val(data[i].jj);
				$('#wzjj11').val(data[i].wzjj);
			}
		},
		error : function(data) {
			$.messager.progress('close');
			$.messager.alert('Error', 'Unknown Error!' + data);
		}
	});
}
function   rweditSaveData(){
	if (!checkForm('#rwedit_form')) {
		return;
	}
	var elemZdinfo = $('#rwedit_form');
	var rwedit_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(rwedit_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : "../memory/rw/editRw.do",
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			searchRw();
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#rwedit_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "保存失败");
		}
	});
}
function  edittpRw(id){
	$('#rwtpedit_form').form('clear');
	showDialog('#rwtpedit_dialog', '人物修改页面');
	url = '../memory/rw/editRwTp.do?id='+id ;
}
function  rwtpeditSaveData(){
	var tp= $("#rwzp11").val();
	if (!checkForm('#rwtpedit_form')) {
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
	formData.append("file", document.getElementById("rwzp11").files[0]);
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
	    	var elemzxinfo = $('#rwtpedit_form');
	    	var rwtp_info = elemzxinfo.serializeObject();
	    	rwtp_info["rwzp"] = data;
	    	var jsoninfo = JSON.stringify(rwtp_info);
	        $.ajax({
	            url: url,
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	searchRw();
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#rwtpedit_dialog').dialog('close');
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