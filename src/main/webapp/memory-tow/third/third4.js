$(function(){
    queryXmList();
});

function queryXmList(){
    $("#xmList").html('');
    var url = "../../memory/xm/selectXmList.do?pc=3&dy=4";
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
                    '</p><p class="tags">传承人编号：'+row.ccrbh+'</p></a>';
                if (row.tpCount > 0) {
                	xm += '<p class="votealerdy"><input id="xmId" type="hidden" value="'+row.id+'"/><span class="num">'+row.tpCount+'</span><span class="voted">投票</span></p>';
                }else {
                	xm += '<p class="vote"><input id="xmId" type="hidden" value="'+row.id+'"/><span class="num">0</span><span class="voted">投票</span></p>';
                }
                xm += '</li>';
                xmHtml += xm;
                
            }
            $("#xmList").html(xmHtml);
            /*投票弹窗提示关闭按钮*/
            $(".vote").click(function(){
            	var xmId = $(this).find("#xmId").val();
            	console.log(xmId);
            	selectTp($(this), xmId);
        	});
            $(".votealerdy").click(function(){
            	var xmId = $(this).find("#xmId").val();
            	console.log(xmId);
            	selectTp($(this), xmId);
        	});
          	$(".close").click(function(){
        	  $(".votealert").hide();
        	});
        },
        error : function(data){
            alert('系统错误！');
        }
    });
}

function selectTp(voteEle, xmId){
    var url = "../../memory/tp/selectTpList.do";
    $.ajax({
        url : url,
        type : "POST",
        dataType: 'json',
        contentType:'application/json;charset=UTF-8',
        success : function(data){
             var count = data.total;
             if (count<3) {
            	 joinTp(voteEle, xmId);
             }else{
            	 $(".votealert").show();
     	  		setTimeout(function(){$(".votealert").hide();}, 2000);
             }
        },
        error : function(data){
            alert('系统错误！');
        }
    });
}

function joinTp(voteEle, xmId){
    var url = "../../memory/tp/addTp.do?xmId="+xmId;
    $.ajax({
        url : url,
        type : "POST",
        dataType: 'json',
        contentType:'application/json;charset=UTF-8',
        success : function(data){
        	var num = data.num;
        	voteEle.addClass("votealerdy");
        	voteEle.find(".num").html(num);
        },
        error : function(data){
            alert('系统错误！');
        }
    });
}