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
var eventscid=6//event对应的categoryid
	var eventcontentscid=34;//event内容id
	var eventimgscid=35;//event图片id
var activitycid=8;//活动id
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
//获取Events信息
	
	$.getJSON(allurl + "getlistbyorder.html?categoryId="+eventcontentscid+"&ordertype="+ordertype, 
				function(data) {
					var event="";
					$.each(data,function(i,item){
						event+=item.content+"<b><hr class=mainlefthr></b>";
					});
					$(".event_list").html(event);

	});
//获取activity信息
	
	ajax=$.getJSON(allurl + "getlistbyorder.html?categoryId="+activitycid+"&ordertype="+ordertype, 
				function(data) {
				var activitylist="";
				$.each(data,function(i,item){
					activitylist+="<div class=activities_title>"+item.title+"</div><div id=carousel-example-generic"+i+" class='carousel slide' data-ride=carousel data-interval=5000><ol class=carousel-indicators></ol><div class=carousel-inner role=listbox>"+item.content+"</div><a class='left carousel-control' href=#carousel-example-generic"+i+" role=button data-slide=prev><span class='glyphicon glyphicon-chevron-left' aria-hidden=true></span><span class=sr-only>Previous</span></a><a class='right carousel-control' href=#carousel-example-generic"+i+" role=button data-slide=next><span class='glyphicon glyphicon-chevron-right' aria-hidden=true></span><span class=sr-only>Next</span></a></div><b><hr class=mainlefthr></b>";
				});
				$(".activities_list").html(activitylist);
				    //等所有图片加载完毕之后在进行的操作
				var carousellist=$(".carousel");
				$.each(carousellist,function(i,item){
					//$('#carousel-example-generic'+'i').carousel();
			        //取该轮播图id
			        var carouselid=item.id;
			        /*console.log(carouselid);*/
			        //取图片标签
			        var imglists=item.children[1].children;
			        //该轮播图下的图片数量
			        var imglistlength=0;
			        $.each(imglists,function(i,item){
			             if(item.tagName=="IMG"){
			              imglistlength++;
			             }
			          });
			        var listr="";
			        for (var i=0;i<imglistlength;i++) {

			        listr+="<li data-target=#"+carouselid+" data-slide-to="+i+"></li>";

			      }
			      item.children[0].innerHTML=listr;
			      //设置Previous，Nex 后台太传过来数据进行标签遍历的时候进行设置即可
			    });
			      $(".carousel-indicators li:first-child").addClass("active");
			      $(".carousel-indicators li").css("margin","0 2px");
			      
			      $(".carousel-inner img").wrap("<div></div>");
			      $(".carousel-inner div").addClass("item");
			      $(".carousel-inner div:first-child").addClass("active");				
	});

});

window.onload=function (){
	
$.when(ajax).done(function () {
		//所做操作
		//获取所有轮播图列表
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
			var carousellist=$(".carousel");
				$.each(carousellist,function(i,item){
					$('#carousel-example-generic'+i).carousel();
				});
			
		});
          		
     });
}