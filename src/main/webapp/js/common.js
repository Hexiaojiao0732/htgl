$.fn.serializeObject = function() {
    var o = {};  
	var a = this.serializeArray();
    $.each(a, function() {  
        if (o[this.name]) {  
            if (!o[this.name].push) {  
                o[this.name] = [ o[this.name] ];  
            }  
            o[this.name].push(this.value || '');  
        } else {  
            o[this.name] = this.value || '';  
        }  
    });  
    return o;  
};

function formatter(date) {
	var y = date.getFullYear();
	var m = date.getMonth() + 1;
	var d = date.getDate();
	return y + '-' + (m < 10 ? ('0' + m) : m) + '-' + (d < 10 ? ('0' + d) : d);
}
function parser(s) {
	if (!s)
		return new Date();
	var sss = s.split('-');
	var y = parseInt(ss[0], 10);
	var m = parseInt(ss[1], 10);
	var d = parseInt(ss[2], 10);
	if (!isNaN(y) && !isNaN(m) && !isNaN(d)) {
		return new Date(y, m - 1, d);
	} else {
		return new Date();
	}
} 

function formatDateText(date) {
	return date.formatDate("yyyy-MM-dd");  
}

function formatDateTimeText(date) {
	return date.formatDate("yyyy-MM-dd hh:mm:ss");  
}

//把时间格式字符串转化为时间
//如下格式
//2006
//2006-01
//2006-01-01
//2006-01-01 12
//2006-01-01 12:12
//2006-01-01 12:12:12
function parseDate(dateStr) {
  var regexDT = /(\d{4})-?(\d{2})?-?(\d{2})?\s?(\d{2})?:?(\d{2})?:?(\d{2})?/g;
  var matchs = regexDT.exec(dateStr);
  var date = new Array();
  for (var i = 1; i < matchs.length; i++) {
      if (matchs[i]!=undefined) {
          date[i] = matchs[i];
      } else {
          if (i<=3) {
              date[i] = '01';
          } else {
              date[i] = '00';
          }
      }
  }
  return new Date(date[1], date[2]-1, date[3], date[4], date[5],date[6]);
}

//为date类添加一个format方法
//yyyy 年
//MM 月
//dd 日
//hh 小时
//mm 分
//ss 秒
//qq 季度
//S  毫秒
Date.prototype.formatDate = function (format) //author: meizz
{
  var o = {
      "M+": this.getMonth() + 1, //month
      "d+": this.getDate(),    //day
      "h+": this.getHours(),   //hour
      "m+": this.getMinutes(), //minute
      "s+": this.getSeconds(), //second
      "q+": Math.floor((this.getMonth() + 3) / 3),  //quarter
      "S": this.getMilliseconds() //millisecond
  }
  if (/(y+)/.test(format)) format = format.replace(RegExp.$1,
  (this.getFullYear() + "").substr(4 - RegExp.$1.length));
  for (var k in o) if (new RegExp("(" + k + ")").test(format))
      format = format.replace(RegExp.$1,
    RegExp.$1.length == 1 ? o[k] :
      ("00" + o[k]).substr(("" + o[k]).length));
  return format;
}

function jsprops(value){
	var props = "";
    for(var p in value){
    	// 方法
        if(typeof(value[p])=="function"){
        	value[p]();
        }else{
        // p 为属性名称，obj[p]为对应属性的值
        	props+= p + "=" + value[p] + "\t";
        }
    }
    // 最后显示所有的属性
    $.messager.alert('Props', props);
}

//最大化弹出窗口
function openWindowMax(url){
    var height = screen.availHeight - 40;
    var width = screen.availWidth - 15;
    var screenParam = "left=0,top=0,scrollbars,resizable=yes,toolbar=no',height=" + height + ",width=" + width;
    var winOpen = window.open("about:blank","",screenParam);
    winOpen.location = url;
}