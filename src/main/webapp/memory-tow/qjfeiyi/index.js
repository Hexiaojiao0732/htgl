var currPage=1;
var pageSize = 30;
var pageTotal = 0;
$(function(){
    queryXmList();
});

function queryXmList(lx,qy){
    var queryParam = {};
    queryParam['page'] = currPage;
    queryParam['rows'] = pageSize;
    $("#xmList").html('');
    var url = "../../memory/xm/selectXmList.do?page="+currPage+"&rows="+pageSize;
    if(lx && lx>0){
        url += "&lx="+lx;
    }
    if(qy && qy!='省份'){
        url += "&qy="+encodeURI(qy);
    }
    $.ajax({
        url : url,
        type : "POST",
        data : JSON.stringify(queryParam),
        dataType: 'json',
        contentType:'application/json;charset=UTF-8',
        success : function(data){
            var rows = data.rows;
            var count = data.total;
            $("#xmCount").html("（"+count+"）");
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
            pageTotal = parseInt(((count-1)/pageSize+1));
            $("#currPage").html(currPage);
            $("#totalPage").html(pageTotal);
        },
        error : function(data){
            alert('系统错误！');
        }
    });
}

function topPage(){
    if(currPage<=1){
        alert("已是第一页！");
        return;
    }
    currPage--;
    queryXmList();
}

function nextPage(){
    if(currPage>=pageTotal){
        alert("已是最后一页！");
        return;
    }
    currPage++;
    queryXmList();
}

function change(){
    var checkValue=$("#leixing").val();
    var dqS = $("#dqS option:selected").text();
    queryXmList(checkValue, dqS);
}