var allurl = $("#allurl").html();
var contentid = $("#contentid").html();
var logocid=14;//logo对应的categoryid;
var baccid=15;//导航栏背景图片对应的categoryid;
var labinfocid=11;//导航栏背景图片对应的categoryid;
var resthcid=12;//研究课题的对应categoryid
var sponsorscid=16;//赞助商的对应categoryid
var linkscid=17;//链接的对应categoryid
var innewcid=18;//首页新闻对应的categoryid
var ordertype=1;//排序方式
$(function (){
//获取logo
    $.getJSON(allurl + "getlist.html?categoryId="+logocid, 
		function(data) {
        var picadd = data[0].pic;
        $(".nav img").attr("src",picadd);
    });
//获取nav背景图片
    $.getJSON(allurl + "getlist.html?categoryId="+baccid, 
		function(data) {
        var picadd = data[0].pic;
        $(".nav").css("background","url("+picadd+") round");
    });
//获取赞助商
	$.getJSON(allurl + "getlist.html?categoryId="+sponsorscid, 
			function(data) {
	        var sponsors = "<strong>Sponsors:</strong>";
        	$.each(data,function(i,item){
        		sponsors+="<hr class=mainrighthr>";
	            sponsors+="<a href="+item.url+"><img src="+item.pic+"></a>";
	        });
	        $(".sponsors").html(sponsors);
	});
//获取链接
	$.getJSON(allurl + "getlist.html?categoryId="+linkscid, 
				function(data) {
		        var links = "<strong>Useful Links:</strong>";
	        	$.each(data,function(i,item){
	        		links+="<hr class=mainrighthr>";
		            links+="<a href="+item.url+"><img src="+item.pic+"></a>";
		        });
		        $(".ulinks").html(links);
		        $(".ulinks img").css({"margin-top":"15px","margin-bottom":"15px"});
	});
//获取新闻列表
	
	ajax=$.getJSON(allurl + "getlistbyorder.html?categoryId="+innewcid+"&ordertype="+ordertype, 
				function(data) {
		        var news = "";
	        	$.each(data,function(i,item){
	        		news+="<div class=listnews-desc><div class=listnews-desc-title><a href="+allurl+ "home/news/"+item.id+".html>"+item.title+"</a><span class=newsdate>Posted on "+item.subTitle+"</span></div>"
		        	news+="<div class=listnews-desc-content id=listnews-desc-content>"+item.content+"</div>"
		        	news+="</div><b><hr class=mainlefthr></b>"
		        });
		        $(".listnews-desc-list").html(news);
				$(".mnd-content").css({"width": "800px","padding": "10px"});
				$(".mnd-content img").css({"display": "inline","margin": "5px 10px","float": "right","width":"auto","height":"auto"});
	});

});
window.onload=function (){
$.when(ajax).done(function () {
function exp() {
        var exp = this.innerHTML == 'Read More...';
        this.parentNode.style.maxHeight = exp ?"3000px":"520px";
        this.innerHTML = exp ? 'Fold' : 'Read More...';
        return false;
}

var imgdefereds=[];
jQuery('img').each(function(){
    var dfd=jQuery.Deferred();
    $(this).bind('load',function(){
        dfd.resolve();//load执行代表图片加载完成
    }).bind('error',function(){
        //图片加载错误，加入错误处理
        // dfd.resolve();
    });

    if(this.complete) {//complete属性为true，代表图片加载完成
        dfd.resolve();
    }
    imgdefereds.push(dfd);
})
jQuery.when.apply(null,imgdefereds).done(function(){
    //等所有图片加载完毕之后在进行的操作
    var items = document.getElementById('listnews-desc-list').childNodes;
    var item,more;
    for (var i = 0; i < items.length; i++) {
        item = items[i];
        if (item.nodeType == 1) { //过滤掉空白节点
            if (item.scrollHeight > 520) { //大于高度，添加more
                more = document.createElement('a');
                more.innerHTML = 'Read More...';
                more.className = 'more';
                more.href = '#';
                more.onclick = exp;
                item.appendChild(more);
            }
        }
    }
});


 });

}


