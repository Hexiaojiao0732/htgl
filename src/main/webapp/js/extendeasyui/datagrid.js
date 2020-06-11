(function ($) {
	/*
	 * 王谷华:由于easyui datagrid封装的方法使用了匿名函数，无法通过继承修改，
	 * 所以load 方法采用折中方法使用xpage,xrows解决
	 * 
	 * */
	$.extend(
			$.fn.datagrid.methods, {
			getRowNum:function(jq){
				//getRowNum start
				var opts=$.data(jq[0],"datagrid").options;
				var array = new Array();
				opts.finder.getTr(jq[0],"","selected",1).each(function(){
					array.push($(this).find("td.datagrid-td-rownumber").text());
				});
				return array;
			}//getRowNum end
	
		}//fn.datagrid.methods end
	
	
	);
})(jQuery);