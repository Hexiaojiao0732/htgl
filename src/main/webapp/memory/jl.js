$(function() {
	search1();
});

function jlAdd() {
	bindDz();
	$('#ssztId').combobox({    
	    url:'../memory/zt/queryZtMc.do',    
	    valueField:'id',    
	    textField:'ztmc'   
	});
	$('#jl_form').form('clear');
	showDialog('#jl_dialog', '记录新增');
//	url = 'addWtjl.do';
}
function jlSaveData(){
	var tp= $("#jltp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#jl_form')) {
		return;
	}
//	var tp =$('#jltp').filebox('getValue');
//	 var len = tp.length;  
//     var math = tp.substring(len - 3, len);  
//	if(math !="jpg" && math !="gif" && math !="png" && math !="jpeg"  ){
//		$.messager.alert("错误提示", "请选择正确的图片格式");
//		return;
//	}

	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var formData = new FormData();
	formData.append("file", document.getElementById("jltp").files[0]);
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
	    	var elemzxinfo = $('#jl_form');
	    	var jl_info = elemzxinfo.serializeObject();
	    	jl_info["jltp"] = data;
	    	var jsoninfo = JSON.stringify(jl_info);
	        $.ajax({
	            url: '../memory/jl/addJl.do',
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	search1();
	    			$.messager.progress('close');
	    			$('#jl_dialog').dialog('close');
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
//		url : '../memory/jl/addJl.do',
//		
//		contentType : 'application/json',
////		url : url,
//		data : jsoninfo,
//		dataType : 'json',
////		data : {
////			ssztId : $('#ssztId').combobox('getValue'),
////			yz : $('#yz').val(),
////			fl : $('#fl').val(),
////			mc : $('#mc').val(),
////			sc : $('#sc').val(),
////			dyC : $('#yrsrInfo #city_hjd option:selected').val(),
////			dyX : $('#yrsrInfo #city_hjd option:selected').val(),
////			dyS : $('#yrsrInfo #province_hjd option:selected').val(),
////			psdd : $('#psdd').val(),
////			pssj : $('#pssj').datetimebox('getValue'),
////			jltp : $('#jltp').filebox('getValue'),
////			jj : $('#jj1').val(),
////			wzjj : $('#wzjj1').val()
////		},
//		dataType : 'json',
//		success : function(data) {
//			search1();
//			$.messager.progress('close');
//			$.messager.alert(data.title, data.content);
//			$('#jl_dialog').dialog('close');
//			
//		},
//		error : function(data) {
//			$.messager.progress('close');
//			$.messager.alert('Error', 'Unknown Error!' + data);
//		}
//	});
}
function search1() {
	$.ajax({
		url : "../memory/jl/selectJl.do",
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
			$("#jlList").empty();
			var html = '';
			$('#jlList').html('');
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
					
					var imageUrl = "common/imageshow.do?path="+escape(data[i].jltp);
					html += '<div class="list_img"><img  src="'
							+ imageUrl
							+ '" /></div>';
					html += '<div class="list_nr"><p><span style="font-size:23px;" >记录名称：</sapn> '
							+ data[i].mc + '</p>';
//					html += '<p>关注度：<a style="color:red;font-size:12px;text-decoration:underline;cursor:pointer"  name="noButton" onclick="showFocusPerson();">10</a></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img src="../image/icon/delete.gif" style="height:30px;weight:30px;" onclick="deleteJl('+data[i].id+');"><span style="font-size:18px; color:red;" >删除</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="editJl('+data[i].id+');"><span style="font-size:18px; color:red;" >修改</span></p></div>';
					html += '<p><span style="font-size:23px;" >操作：</sapn><img src="../image/icon/edit.gif" style="height:30px;weight:30px;" onclick="editJlTp('+data[i].id+');"><span style="font-size:18px; color:red;" >修改图片</span></p></div>';
					html += '<p class="clear"></p> </li>';
					last++;
				}

			} else {
				queryListCount = 0;
			}
			html += '<p class="clear"></p>';
			$('#jlList').html(html);
			var $target = $('#jlList');
			var targetOffset = $target.offset().top -1000;
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

function dzChange(type, selectParentId, selectNode) {
    var level;
    var parentId = $(selectParentId + ' option:selected').val();

    if (type == 0) {
        level = 2;

    } else if (type == 1) {
        level = 3;
    }
    $.ajax({
        async:false,
    	url: '../memory/jl/dzList.do?level=' + level + '&parentId=' + parentId,    //后台webservice里的方法名称
        type: "get",
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        traditional: true,
        success: function (data) {
            var optionstring = "<option value=''></option>";

            for (var i = 0; i < data.length; i++) {
                optionstring += "<option value=\"" + data[i].code + "\" >" + data[i].name + "</option>";

            }
            $(selectNode).html(optionstring);
        },
        error: function (msg) {
            //alert("出错了！");
        }
    });
}
function bindDz() {
    $.ajax({
        url: "../memory/jl/dzList.do?level=1",    //后台webservice里的方法名称
        type : 'POST',
        dataType: "json",
        contentType: "application/json;charset=utf-8",
//        traditional: true,
        success: function (data) {
        	 var optionstring = "<option vlaue=''></option>";
             for (var i = 0; i < data.length; i++) {
                 if(data[i].name==""){
                     optionstring += "<option selected='selected' value=\"" + data[i].code + "\" >" + data[i].name + "</option>";
                 }else{


                     optionstring += "<option value=\"" + data[i].code + "\" >" + data[i].name + "</option>";
                 }

             }
             // $("#yrsrInfo #province_afd").html(optionstring);
             $("#yrsrInfo #province_hjd").html(optionstring);
             // $("#ytsrInfo #province_afd").html(optionstring);
        },
        error: function (msg) {
            //alert("出错了！");
        }
    });
}
function bindDz1() {
    $.ajax({
    	async:false,
    	url: "../memory/jl/dzList.do?level=1",    //后台webservice里的方法名称
        type : 'POST',
        dataType: "json",
        contentType: "application/json;charset=utf-8",
//        traditional: true,
        success: function (data) {
        	 var optionstring = "<option vlaue=''></option>";
             for (var i = 0; i < data.length; i++) {
                 if(data[i].name==""){
                     optionstring += "<option selected='selected' value=\"" + data[i].code + "\" >" + data[i].name + "</option>";
                 }else{


                     optionstring += "<option value=\"" + data[i].code + "\" >" + data[i].name + "</option>";
                 }

             }
             // $("#yrsrInfo #province_afd").html(optionstring);
             $("#yrsrInfo1 #province_hjd1").html(optionstring);
             // $("#ytsrInfo #province_afd").html(optionstring);
        },
        error: function (msg) {
            //alert("出错了！");
        }
    });
}
function deleteJl(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/jl/deleteJl.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					search1();
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

function editJl(id){
	jQuery.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : '../memory/jl/queryJlById.do?id='+id,
		dataType : 'json',
		success : function(data) {
			bindDz1();
			$('#ssztId1').combobox({    
			    url:'../memory/zt/queryZtMc.do',    
			    valueField:'id',    
			    textField:'ztmc'   
			});
			showDialog('#jledit_dialog', '修改记录内容');
			data = data.callbackData.result;
			for(var i=0;i<data.length;i++ ){
				var obj = data[i];
				$('#id1').val(data[i].id);
				$('#ssztId1').combobox('setValue',data[i].ssztId);
				$('#yz1').val(data[i].yz);
				$('#fl1').val(data[i].fl);
				$('#mc1').textbox('setValue', data[i].mc);
				$('#sc1').textbox('setValue', data[i].sc);
				$('#province_hjd1').val(data[i].dyS);
				$('#province_hjd1').change();
				$('#city_hjd1').val(data[i].dyC);
				$('#city_hjd1').change();
				$('#district_hjd1').val(data[i].dyX);
				$('#psdd1').textbox('setValue', data[i].psdd);
				$('#pssj1').datetimebox('setValue',  data[i].pssj);
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
function jleditSaveData(){
	if (!checkForm('#jledit_form')) {
		return;
	}
	var elemZdinfo = $('#jledit_form');
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
		url :'../memory/jl/editJl.do',
		data : jsoninfo,
		dataType : 'json',
		success : function(data) {
			search1();
			$.messager.progress('close');
			$.messager.alert("提示", "保存成功");
			$('#jledit_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			// exception in java
			$.messager.alert("提示", "数据填写不完整");
		}
	});
}
function  editJlTp(id){
	$('#jltpedit_form').form('clear');
	showDialog('#jltpedit_dialog', '修改记录图片');
	url = '../memory/jl/editJlTp.do?id='+id ;
}
function jltpeditSaveData(){
	var tp= $("#jltp1").val();
	if (!checkForm('#jltpedit_form')) {
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
	formData.append("file", document.getElementById("jltp1").files[0]);
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
	    	var elemzxinfo = $('#jltpedit_form');
	    	var jltp_info = elemzxinfo.serializeObject();
	    	jltp_info["jltp"] = data;
	    	var jsoninfo = JSON.stringify(jltp_info);
	        $.ajax({
	            url: url,
	            type: "POST",
	            data: jsoninfo,
	            contentType: 'application/json;charset=UTF-8',
	            dataType:"json",
	            success: function () {
	            	search1();
	            	$.messager.progress('close');
	    			$.messager.alert("提示", "保存成功");
	    			$('#jltpedit_dialog').dialog('close');
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