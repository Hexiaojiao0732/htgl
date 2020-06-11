var ztid;
var ztzyid;
var ztzyid1;
$(function() {
	   //获取url中的参数
	var str=window.location.href;
	var id = str.substr(str.length-1,1);
	
	$('#hzhbzt').datagrid({
		iconCls : 'icon-datagrid',
		region : 'center',
		height : '100%',
		fitColumns : true,
		nowrap : false,
		striped : true,
		collapsible : false,
		loadMsg : 'Loading...',
		method : 'post',
		url: '../memory/hzhbzt/selectHzhbZtList.do?ID='+id,
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
//		          xmjj=3, xmFzr=4, lxdh=5, yx=5, zt=4, hzhbId=2, zp=22
			{field:'ztMc',title:'专题名称',width:50},
			{field:'xmMc',title:'简项目名称',width:50},
			{field:'xmjj',title:'项目简介',width:50},
			{field:'xmFzr',title:'项目负责人',width:50},
			{field:'lxdh',title:'联系电话',width:50},
			{field:'yx',title:'邮箱',width:50},
			{field:'zt',title:'状态',width:50,
				formatter : function(value, row, index) {
					if(value == 0){
						return '未审核';
					}if(value == 1){
						return '已审核';
					}
				}
			
			},
			{field:'hzhbmc',title:'合作伙伴',width:50},
			{field:'zp',title:'预览图片',width:50},
			{field:'操作',title:'操作',width:50,
				formatter : function(value, row, index) {
					var a = '<span class="spanRow hbut"><a href="../memory/common/download.do?fjdz='+row.gzwjDz+'"  class="griddownload">下载</a></span>';
					if(row.zt == 0){
						var e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="shZt('
								+ row.id
								+ ')">审核</a></span>';
						var d = '<span class="spanRow"><a href="#" class="griddel" onclick="hzhbztDelete('
							+ row.id
							+ ')">删除</a></span>';
					return  e+d+a ;
					}else{
						var d = '<span class="spanRow"><a href="#" class="griddel" onclick="hzhbztDelete('
							+ row.id
							+ ')">删除</a></span>';
					return  d+a ;
					}
				}
			}
		]],
		pagination:true,
		pageSize:10,
		pageList: [10,20,30,50,100],
		rownumbers:true,
		toolbar:'#hzhbztToolbar',
		//行选择方法，进行条件触发
		onSelect: function(index, row){
			$('#hzhbztzy').datagrid({
				iconCls : 'icon-datagrid',
				region : 'center',
				height : '100%',
				fitColumns : true,
				nowrap : false,
				striped : true,
				collapsible : false,
				loadMsg : 'Loading...',
				method : 'post',
				url: '../memory/hzhbztzy/selectHzhbZtZyList.do?ID='+row.id,
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
					{field:'wjmc',title:'文件名称',width:50},
					{field:'sfr',title:'受访人',width:50},
					{field:'cfr',title:'采访人',width:50},
					{field:'pssj',title:'拍摄时间',width:50,
						formatter: function(value,row,index){
							var value=  value.substring(0,19);
								return value;
						}
					},
					{field:'gzry',title:'工作人员',width:50},
					{field:'psdd',title:'拍摄地点',width:50},
					{field:'zy',title:'资源',width:50},
					{field:'glrw',title:'关联人物',width:50},
					{field:'gldd',title:'关联地点',width:50},
					{field:'zyDz',title:'资源地址',width:50},
					{field:'zybzfc',title:'资源部字符串',width:50},
					{field:'zyLx',title:'资源类型',width:50,
						formatter : function(value, row, index) {
//							1视频 2音频 3文档 4图片
							if(value == 1){
								return '视频';
							}if(value == 2){
								return '音频';
							}
							if(value == 3){
								return '文档';
							}if(value == 4){
								return '图片';
							}
						}
						
					},
					{field:'zyZt',title:'资源状态',width:50,
						formatter : function(value, row, index) {
							if(value == 0){
								return '未审核';
							}if(value == 1){
								return '已审核';
							}
						}
					},
					{field:'hzhbztmc',title:'合作伙伴专题名称',width:50},
					{field:'操作',title:'操作',width:50,
						formatter : function(value, row, index) {
							if(row.zyZt == 0){
								var e= '';
								e = '<span class="spanRow hbut"><a href="#" class="gridedit" onclick="shZtZy('
										+ index
										+ ')">审核</a></span>';
								d = '<span class="spanRow"><a href="#" class="griddel" onclick="hzhbztZyDelete('
									+ row.id
									+ ')">删除</a></span>';
								c = '<span class="spanRow hbut"><a href="../memory/hzhbztzy/hzhbztzyDownload.do?zydz='+row.zyDz+'"  class="griddownload">下载</a></span>';
							return  e +d+c;
							}else{
								d = '<span class="spanRow"><a href="#" class="griddel" onclick="hzhbztZyDelete('
									+ row.id
									+ ')">删除</a></span>';
								c = '<span class="spanRow hbut"><a href="../memory/hzhbztzy/hzhbztzyDownload.do?zydz='+row.zyDz+'"  class="griddownload">下载</a></span>';
								return d+c;
							}
//							if(row.zt == 1){
//								
//							}
						}
					}
				]],
				pagination:true,
				pageSize:10,
				pageList: [10,20,30,50,100],
				rownumbers:true,
				toolbar:'#hzhbztzyToolbar',
				//行选择方法，进行条件触发
				onSelect: function(rowIndex, rowData){
					
				}
				
			});
			
		}
		
	});
});
function hzhbztSearch(){
	$('#hzhbzt').datagrid('load', {
		zt : $('#zt').val(),
		tfresh : new Date().getTime()
	});
}
function hzhbztzySearch(){
	$('#hzhbztzy').datagrid('load', {
		zyzt : $('#zyzt').val(),
		tfresh : new Date().getTime()
	});
}
function hzhbztZyDelete(id){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/hzhbztzy/deleteHzHbZtZy.do?id='+id,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#hzhbztzy').datagrid('reload');// reload the data
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
function hzhbztDelete(b){
	$.messager.confirm('警告', '是否删除该数据?', function(r) {
		if (r) {
			$.messager.progress({
				title : '请等待',
				msg : '删除数据中...'
			});
			jQuery.ajax({
				type : 'POST',
				contentType : 'application/json',
				url : '../memory/hzhbzt/deleteHzHbZt.do?id='+b,
//				data : '{"id":' + row.id + '}',
				dataType : 'json',
				success : function(data) {
					$.messager.progress('close');
					$.messager.alert("提示", "删除成功");
					$('#hzhbzt').datagrid('reload');// reload the data
					$('#hzhbztzy').datagrid('reload');// reload the data
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
function  shZt(a){
	ztid=a;
	$('#hzhbzt_form').form('clear');
	showDialog('#hzhbzt_dialog', '合作伙伴专题审核');
	
}
function hzhbztSaveData(){
	var tp= $("#zp").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#hzhbzt_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	
	var formData = new FormData();
	formData.append("file", document.getElementById("zp").files[0]);
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
	    	
	    	var elemZdlxinfo = $('#hzhbzt_form');
	    	var zdlx_info = elemZdlxinfo.serializeObject();
	    	zdlx_info["zp"] = data;
	    	zdlx_info["id"] = ztid;
	    	var jsoninfo = JSON.stringify(zdlx_info);
	        jQuery.ajax({
	    		type : 'POST',
	    		url : '../memory/hzhbzt/updateSh.do',
	    		data:jsoninfo,
	    		dataType : 'json',
	    		 contentType: 'application/json;charset=UTF-8',
	    		success : function(data) {
	    			$.messager.progress('close');
//	    			$.messager.alert(data.title, data.content);
	    			$('#hzhbzt').datagrid('reload');
	    			$('#hzhbzt_dialog').dialog('close');
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
function  shZtZy(index){
	var row = $('#hzhbztzy').datagrid('getRows')[index];
	ztzyid=row.id;
	if(row.zyLx==4){
		$.messager.confirm('警告', "确定审核通过该图片？", function(r) {
			if (r) {
				$("#zybzfc1").val("已审核");
				hzhbztZy1SaveData();
			}
		});
	}else if(row.zyLx == 1){
		$('#hzhbztzy_form').form('clear');
		showDialog('#hzhbztzy_dialog', '合作伙伴资源审核');
	}else{
		$('#hzhbztzy1_form').form('clear');
		showDialog('#hzhbztzy1_dialog', '合作伙伴资源审核');
	}
}
function hzhbztZySaveData(){
	var tp= $("#zp1").val();
	if(tp== null || tp ==''){
		alert("请选择图片");
		return;
	}
	if (!checkForm('#hzhbztzy_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	
	var formData = new FormData();
	formData.append("file", document.getElementById("zp1").files[0]);
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
	    	
	    	var elemZdlxinfo = $('#hzhbztzy_form');
	    	var zdlx_info = elemZdlxinfo.serializeObject();
	    	zdlx_info["zp"] = data;
	    	zdlx_info["id"] = ztzyid;
	    	var jsoninfo = JSON.stringify(zdlx_info);
	        jQuery.ajax({
	    		type : 'POST',
	    		url : '../memory/hzhbztzy/updateShZy.do',
	    		data:jsoninfo,
	    		dataType : 'json',
	    		 contentType: 'application/json;charset=UTF-8',
	    		success : function(data) {
	    			$.messager.progress('close');
//	    			$.messager.alert(data.title, data.content);
	    			$('#hzhbztzy').datagrid('reload');
	    			$('#hzhbztzy_dialog').dialog('close');
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
function hzhbztZy1SaveData(){
	if (!checkForm('#hzhbztzy1_form')) {
		return;
	}
	$.messager.progress({
		title : '请等待',
		msg : '添加/修改数据中...'
	});
	var elemZdlxinfo = $('#hzhbztzy1_form');
	var zdlx_info = elemZdlxinfo.serializeObject();
	zdlx_info["id"] = ztzyid;
	var jsoninfo = JSON.stringify(zdlx_info);
    jQuery.ajax({
		type : 'POST',
		url : '../memory/hzhbztzy/updateShZy1.do',
		data:jsoninfo,
		dataType : 'json',
		 contentType: 'application/json;charset=UTF-8',
		success : function(data) {
			$.messager.progress('close');
//			$.messager.alert(data.title, data.content);
			$('#hzhbztzy').datagrid('reload');
			$('#hzhbztzy1_dialog').dialog('close');
		},
		error : function(data) {
			$.messager.progress('close');
			$.messager.alert('Error', 'Unknown Error!' + data);
		}
	});
	

}