$(function() {
	loadShouYe();
	loadSpTj();
});

function loadShouYe(){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/shouye/queryList.do',
		dataType : 'json',
		success : function(data) {
			data = data.callbackData.result;
			 $('#tablesytj').html('');
			 
			for(var i=0;i<data.length;i++ ){
				var HtmlBody=
					'<table id="" class="colinfo_table" width="50%">'+
						'<tr>'+
							'<td   style="background-color:#ccc">人口数量</td>'+
							'<td width="20%">'+data[i].z+'</td>'+
							'<td width="20%"><a style="color:blue" onclick="syEdit()" >修改</a></td>'+
						'</tr>'+
						
						  '</table>';
					  $('#tablesytj').html(HtmlBody);
					  showDialog('#xiangqing1','详情');
			}
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function  syEdit(){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/shouye/queryList.do',
		dataType : 'json',
		success : function(data) {
			$('#shouyeedit_dialog').dialog({
			    title: '修改首页数据',
			    left:900,
			    top:50,
			    closed: false,
			    cache: false,
			    modal: true,
			});
			data = data.callbackData.result;
			for(var i=0;i<data.length;i++ ){
				var obj = data[i];
				$('#id1').val(data[i].id);
				$('#z').val(data[i].z);
			}
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function  shouyeSaveData(){
	if (!checkForm('#shouyeedit_form')) {
		return;
	}
	var elemZdinfo = $('#shouyeedit_form');
	var edit_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(edit_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url :'../memory/shouye/editShouYe.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			loadShouYe();
			$.messager.progress('close');
			$('#shouyeedit_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "保存失败");
		}
	});
}
var count=0;
function loadSpTj(){
	$.ajax({
		url : '../memory/shouye/querySpTj.do',
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
			$('#tablesptj').html('');
			 
			if (4>=data.length > 0) {
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
					var imageUrl = "common/imageshow.do?path="+escape(data[i].spzp);
					html += '<div class="list_img"><img  src="'
							+ imageUrl
							+ '" /></div>';
					html += '<div class="list_nr"><p><span style="font-size:23px;" >视频名称：</sapn> '
						+ data[i].mc + '</p>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img alt="删除视频信息" src="../image/icon/delete.gif" style="height:30px;weight:30px;" onclick="deleteSpTj('+data[i].id+');"><span style="font-size:18px; color:red;" >删除</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><a    style="height:30px;weight:30px;color:blue;" onclick="zdSpTj('+data[i].id+');"><span style="font-size:20px;text-decoration: underline;" >置顶</sapn></a></p></div>';
					html += '<p class="clear"></p> </li>';
					last++;
					count++;
				}

			} else {
				queryListCount = 0;
				$.messager.alert("提示", "最大推荐");
			}
			html += '<p class="clear"></p>';
			$('#tablesptj').html(html);
			var $target = $('#tablesptj');
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
function zdSpTj(id){
	$.messager.confirm('警告', '是否置顶该图片?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '置顶中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/shouye/zdSpTj.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					count=0;
					loadSpTj();
					$.messager.progress('close');
					$.messager.alert("提示", "置顶成功");
//					$('#ztmapinfo').datagrid('reload');
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
function deleteSpTj(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/shouye/deleteSpTj.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					count=0;
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					loadSpTj();
//					$('#ztmapinfo').datagrid('reload');
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
function sptjAdd(){
	$('#z1').combobox({
	    url:'../memory/sp/selectSpList1.do',
	    valueField:'id',
	    textField:'mc',
		filter: function(q, row){
			var opts = $(this).combobox('options');
			return row[opts.textField].indexOf(q) >= 0;//这里改成>=即可在任意地方匹配
		}
	});  
	if(count>=4){
		$('#sptj_dialog').dialog('close');
		$.messager.alert("提示", "添加失败，最大推荐数是4,请删除");
		return;
	}
	$('#sptj_form').form('clear');
	showDialog('#sptj_dialog', '视频推荐新增');
}
function sptjSaveData(){
	if (!checkForm('#sptj_form')) {
		return;
	}
	
	var elemZdinfo = $('#sptj_form');
	var ztmap_info = elemZdinfo.serializeObject();
	var jsoninfo = JSON.stringify(ztmap_info);
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url :'../memory/shouye/sptjAdd.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			count=0;
			loadSpTj();
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#sptj_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}