$(function(){
    //初始化项目推荐
    initXmtj();
});

function initXmtj(){
    $("#tjul").html('');
    $.get(
        "../../memory/common/queryTjXm.do",
        function(data) {
            if (data) {
                data = eval('('+data+')');
                var sytjUlHtml = '';
                for(var i=0; i<data.length; i++) {
                    var row = data[i];
                    var imageUrl = "../../memory/common/imageshowThumb.do?path="+escape(row.xmzp);
                    sytjUlHtml += '<li><a href="../record/record.html?xmId='+row.id+'"><p class="bg"></p><p class="img">' +
                        '<img src="'+imageUrl+'"/></p><p class="name">'+row.mc+'</p><p class="time">'+row.ccrxm+'</p>' +
                        '<p class="time">项目编号：'+row.bh+'</p><p class="tags">传承人编号：'+row.ccrbh+'</p></a></li>';
                }
                $("#tjul").html(sytjUlHtml);
            }
        }
    );
}

