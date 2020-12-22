$(function(){
    initSpNew();
});

function initSpNew(){
    $("#tjul").html('');
    $.get(
        "../../memory/common/queryNewSp.do",
        function(data) {
            if (data) {
                data = eval('('+data+')');
                var sytjUlHtml = '';
                for(var i=0; i<data.length; i++) {
                    var row = data[i];
                    // var imageUrl = "../../memory/common/imageshow.do?path="+escape(row.spzp);
                    var imageUrl = "thumbs2/thumbs/1-xueshengjin.JPG";
                    sytjUlHtml += '<li><a href="spshow/spshow.html?id='+row.id+'"><p class="bg"></p><p class="img">' +
                        '<img src="thumbs2/'+row.spzp+'"/></p><p class="name">"'+row.spmc+'"</p></a></li>';
                }
                $("#tjul").html(sytjUlHtml);
            }
        }
    );
}

