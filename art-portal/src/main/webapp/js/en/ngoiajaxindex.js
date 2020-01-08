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
//获取lab的介绍
   $.getJSON(allurl + "getlist.html?categoryId="+labinfocid, 
		function(data) {
        var content = data[0].content;
        $(".labinfo").html(content);
    });
//获取研究课题
	$.getJSON(allurl + "getlist.html?categoryId="+resthcid, 
			function(data) {
	        var researchtho = "";
        	$.each(data,function(i,item){
	            researchtho += "<li><span>"+item.content+"</span></li>";
	        });
	        $(".labins ul").html(researchtho);
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
//获取首页新闻
	
	$.getJSON(allurl + "getlistbyorder.html?categoryId="+innewcid+"&ordertype="+ordertype, 
				function(data) {
		        var news = "";
	        	$.each(data,function(i,item){
	        		news+="<div class=newsdet><div class=pic><img src="+item.pic+"></div>";
	        		news+="<span class=span-date>["+item.subTitle+"]</span><b>&nbsp;</b><span class=span-desc><a href="+allurl+"home/news/"+item.id+".html>"+item.title+"</a><b>&nbsp;</b>"+item.titleDesc+"<b>&nbsp;</b>...</span></div>";
		            news+="<b><hr class=mainlefthr></b>";
		        });
		        $(".newslist").html(news);
		        $(".newsdet .pic").css({"height": "50px","width": "50px","margin-top": "5px","margin-right": "10px","float": "left"});
		        $(".newsdet img").css({"display": "block","height": "50px","width": "50px"});
		       // $(".ulinks img").css({"margin-top":"15px","margin-bottom":"15px"});

	});
//获取新闻详情

	$.getJSON(allurl + "getcontent.html?contentId="+contentid, 
				function(data) {
				var newsdesc="";
				newsdesc+="<h3>"+data.title+"</h3>";
				newsdesc+=data.content;
				console.log(newsdesc);
				$(".newscontent").html(newsdesc);
				$(".newscontent h3").css({"width": "800px","font": "normal 32px Open Sans","margin": "0","padding": "33px 10px 0 10px" ,"color": "#8b0000","text-align": "left"});
				$(".main-news-desc").css({"padding": "34px 0 5px 0","overflow": "hidden"});
				$(".mnd-content").css({"width": "800px","padding": "10px"});
				//$(".mnd-content img").css({"display": "inline","margin": "5px 10px","float": "right","width":"auto","height":"auto"});
				$(".main-news-desc").append("<div class=newsdate >Posted on "+data.subTitle+"</div>");
	});
});


