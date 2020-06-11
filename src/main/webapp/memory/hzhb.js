$(function() {
	searchHzhb();
//	$('#tp').filebox({    
//	    buttonText: '选择图片', 
//	    buttonAlign: 'left' 
//	})
//	$('#tp1').filebox({    
//		buttonText: '选择图片', 
//		buttonAlign: 'left' 
//	})
});

function hzhbAdd() {
	$('#hzhb_form').form('clear');
	showDialog('#hzhb_dialog', '新增');
//	url = '../memory/hzhb/addHzhb.do';
}
function hzhbSaveData(){
	var tp= $("#tp2").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#hzhb_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	
	var formData = new FormData();
	formData.append("file", document.getElementById("tp2").files[0]);
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
	    	var elemzxinfo = $('#hzhb_form');
	    	var jl_info = elemzxinfo.serializeObject();
	    	jl_info["tp"] = data;
	    	var jsoninfo = JSON.stringify(jl_info);
	        $.ajax({
	            url: '../memory/hzhb/addHzhb.do',
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	searchHzhb();
	    			$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#hzhb_dialog').dialog('close');
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
	
	
//	jQuery.ajax({
//		type : 'POST',
//		contentType : 'application/json',
//		url :url,
//		data : jsoninfo,
//		dataType : 'json',
//		success : function(data) {
//			searchHzhb();
//			$.messager.progress('close');
//			$.messager.alert("提示", "保存成功");
//			$('#hzhb_dialog').dialog('close');
//		},
//		error : function(data) {
//			$.messager.progress('close');
//			// exception in java
//			$.messager.alert("提示", "数据填写不完整");
//		}
//	});
}
function searchHzhb() {
	$.ajax({
		url : "../memory/hzhb/selectListHzhb.do",
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
//		            html += '<a href="../../qkcx/initDetail.do" target="_blank">';
					
					var imageUrl = "common/imageshow.do?path="+escape(data[i].tp);
					html += '<div class="list_img"><img  src="'
							+ imageUrl
							+ '" /></div>';
//					html += '<div class="list_img"><img  src="'
//							+ data[i].tp
//							+ '" /></div>';
					html += '<div class="list_nr"><p><span style="font-size:23px;" >名称：</sapn> '
						+ data[i].mc + '</p>';
//					html += '<div class="list_nr"><p><span style="font-size:23px;">名称：</span> '
//							+ data[i].mc + '</p>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><a style="color:red;font-size:18px;text-decoration:underline;cursor:pointer"  href=hzhbztzy.jsp?id='
						+ data[i].id +'  target="_blank" name="noButton"><span style="font-size:23px;">详情</span></a></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img  src="../image/icon/delete.gif" style="height:30px;weight:30px;" onclick="deleteHzhb('+data[i].id+');"><span style="font-size:18px; color:red;" >删除</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img  src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="editHzhb('+data[i].id+');"><span style="font-size:18px; color:red;" >修改</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img  src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="editHzhbTp('+data[i].id+');"><span style="font-size:18px; color:red;" >修改图片</span></p></div>';
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
function deleteHzhb(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/hzhb/deleteHzhb.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					searchHzhb();
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
function  editHzhb(id){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/hzhb/queryHzhbById.do?id='+id,
//		data : '{"id":' + row.id + '}',
		dataType : 'json',
		success : function(data) {
			showDialog('#edit_dialog', '修改合作伙伴');
			data = data.callbackData.result;
			for(var i=0;i<data.length;i++ ){
				var obj = data[i];
					$('#id1').val(data[i].id);
					$('#mc1').textbox('setValue', data[i].mc);
					$('#dlyhm1').textbox('setValue',  data[i].dlyhm);
					$('#dlmm1').textbox('setValue',  data[i].dlmm);
					$('#jj11').val(data[i].jj);
			}
//			url = '../memory/hzhb/editHzhb.do';
			searchHzhb();
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert('Error', 'Unknown Error!');
		}
	});
}

function editSaveData(){
	if (!checkForm('#edit_form')) {
		return;
	}
	var elemZdinfo = $('#edit_form');
	var edit_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(edit_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url :'../memory/hzhb/editHzhb.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			searchHzhb();
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#edit_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}


function  editHzhbTp(id){
	$('#hzhbtpedit_form').form('clear');
	showDialog('#hzhbtpedit_dialog', '修改合作伙伴图片');
	url = '../memory/hzhb/editHzhbTp.do?id='+id ;
}
function  hzhbtpeditSaveData(){
	var tp= $("#tp11").val();
	if (!checkForm('#hzhbtpedit_form')) {
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
	formData.append("file", document.getElementById("tp11").files[0]);
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
	    	var elemzxinfo = $('#hzhbtpedit_form');
	    	var zttp_info = elemzxinfo.serializeObject();
	    	zttp_info["tp"] = data;
	    	var jsoninfo = JSON.stringify(zttp_info);
	        $.ajax({
	            url: url,
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	searchHzhb();
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#hzhbtpedit_dialog').dialog('close');
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