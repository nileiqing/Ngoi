var allurl = $("#allurl").html();
var contentid = $("#contentid").html();
//以后为了方便起见可以再后台写一个接口直接配置资源文件，后台根据名字或者代码进行改值即可.
var logocid=14;//logo对应的categoryid;
var baccid=15;//导航栏背景图片对应的categoryid;
var labinfocid=11;//导航栏背景图片对应的categoryid;
var resthcid=12;//研究课题的对应categoryid
var sponsorscid=16;//赞助商的对应categoryid
var linkscid=17;//链接的对应categoryid
var innewcid=18;//首页新闻对应的categoryid
var ordertype=1;//排序方式
var teamcid=3;//team的分类id
	var facultycurid=19;//教工id
	var pdfcurid=20;//在读博士后id
	var PhDStucurid=21;//在读博士id
	var underStuCurid=22;//在读本科生id
	var aluPdfid=24;//博士后校友id
	var alugraStuid=25;//研究生校友id
	var aluUnderStuid=26;//本科生校友id
	var AffStuAndFacid=27;//附属机构学生或教工id
	var visitorid=28;//访问学者id
var researchcid=5;//研究栏目的id
var publicationcid=6//出版物栏目的Id
	var booksid=29;//出版书
	var bookChaptersid=30;//出版章节
	var journalid=31;//期刊
	var conferenceid=32;//会议
	var patentsid=33;//专利
var openpositioncid=9;//空缺职位id
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
//获取空缺职位信息
	$.getJSON(allurl + "getlistbyorder.html?categoryId="+openpositioncid+"&ordertype="+0,
				function(data) {
					var openpositionstr="";
					$.each(data,function(i,item){
						openpositionstr+="<div class=openposition_list_title><b>"+item.title+"</b></div><b><hr class=mainlefthr></b><div class=openposition_list_content>"+item.content+"</div>";
	    
		        });
					$(".openposition_list").html(openpositionstr);

	});
	
});