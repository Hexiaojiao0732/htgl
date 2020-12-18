$(function(){
    queryXmList();
});

function queryXmList(){
    $("#xmList").html('');
    var url = "../../memory/xm/selectXmList.do?pc=1";
    $.ajax({
        url : url,
        type : "POST",
        dataType: 'json',
        contentType:'application/json;charset=UTF-8',
        success : function(data){
            var rows = data.rows;
            var count = data.total;
            var xmHtml = "";
            for(var i=0; i<rows.length; i++){
                var row = rows[i];
                var imageUrl = "../../memory/common/imageshowThumb.do?path="+escape(row.xmzp);
                var xm = '<li><a href="../record/record.html?xmId='+row.id+'"><p class="bg"></p><p class="img"><img src="'+imageUrl+'"/>' +
                    '</p><p class="name">'+row.mc+'</p><p class="time">'+row.ccrxm+'</p><p class="time">项目编号：'+row.bh+'' +
                    '</p><p class="tags">传承人编号：'+row.ccrbh+'</p></a></li>';
                xmHtml += xm;
            }
            $("#xmList").html(xmHtml);
        },
        error : function(data){
            alert('系统错误！');
        }
    });
}