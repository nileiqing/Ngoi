var allurl = $("#allurl").html();
var contentid = $("#contentid").html();
var logocid=14;//logo对应的categoryid;
var baccid=15;//导航栏背景图片对应的categoryid;
var labinfocid=11;//导航栏背景图片对应的categoryid;
var resthcid=12;//研究课题的对应categoryid
var sponsorscid=16;//赞助商的对应categoryid
var linkscid=17;//链接的对应categoryid
var innewcid=18;//首页新闻对应的categoryid
var ordertype=0;//排序方式
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
	        var sponsors = "<strong>赞助商:</strong>";
        	$.each(data,function(i,item){
        		sponsors+="<hr class=mainrighthr>";
	            sponsors+="<a href="+item.url+"><img src="+item.pic+"></a>";
	        });
	        $(".sponsors").html(sponsors);
	});
//获取链接
	$.getJSON(allurl + "getlist.html?categoryId="+linkscid, 
				function(data) {
		        var links = "<strong>友情链接:</strong>";
	        	$.each(data,function(i,item){
	        		links+="<hr class=mainrighthr>";
		            links+="<a href="+item.url+"><img src="+item.pic+"></a>";
		        });
		        $(".ulinks").html(links);
		        $(".ulinks img").css({"margin-top":"15px","margin-bottom":"15px"});
	});
//获取成员信息
	
	$.getJSON(allurl + "getalllist.html?categoryId="+teamcid+"&ordertype="+ordertype, 
				function(data) {
					var facultystr="";//教工
					var pdfcurstr="";//在读博士后
					var PhDStucurstr="";//在读博士
					var underStuCurstr="";//在读本科生
					var aluPdfstr="";//博士后校友
					var alugraStustr="";//研究生校友
					var aluUnderStustr="";//本科生校友
					var AffStuAndFacstr="";//附属机构学生或教工
					var visitorstr="";//访问学者
					var finalHtml="";
					$.each(data,function(i,item){

	        		if(item.categoryId==facultycurid){
	        			facultystr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";

	        		}else if(item.categoryId==pdfcurid){
	        			pdfcurstr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}else if(item.categoryId==PhDStucurid){
	        			PhDStucurstr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}else if(item.categoryId==underStuCurid){
	        			underStuCurstr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}else if(item.categoryId==aluPdfid){
	        			aluPdfstr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}else if(item.categoryId==alugraStuid){
	        			alugraStustr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}else if(item.categoryId==aluUnderStuid){
	        			aluUnderStustr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}else if(item.categoryId==AffStuAndFacid){
	        			AffStuAndFacstr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}else if(item.categoryId==visitorid){
	        			visitorstr+=item.contentZhCn+"<b><hr class=mainlefthr></b>";
	        		}
		        });
					if(facultystr!=""){
						facultystr="<div class=person_type_title>教师</div><b><hr class=mainlefthr></b>"+facultystr;
						finalHtml+=facultystr;
					}
					if(pdfcurstr!=""){
						pdfcurstr="<div class=person_type_title>博士后</div><b><hr class=mainlefthr></b>"+pdfcurstr;
						finalHtml+=pdfcurstr;
					}
					if(PhDStucurstr!=""){
						PhDStucurstr="<div class=person_type_title>在读博士生</div><b><hr class=mainlefthr></b>"+PhDStucurstr;
						finalHtml+=PhDStucurstr;
					}
					if(underStuCurstr!=""){
						underStuCurstr="<div class=person_type_title>在读本科生</div><b><hr class=mainlefthr></b>"+underStuCurstr;
						finalHtml+=underStuCurstr;
					}
					if(aluPdfstr!=""||alugraStustr!=""||aluUnderStustr!=""){
						finalHtml+="<div class=person_type_title>校友</div><b><hr class=mainlefthr></b>";
						if(aluPdfstr!=""){
							aluPdfstr="<div class=person_type_title_alumni>博士后</div><b><hr class=mainlefthr></b>"+aluPdfstr;
							finalHtml+=aluPdfstr;
						}
						if(alugraStustr!=""){
							alugraStustr="<div class=person_type_title_alumni>硕士生</div><b><hr class=mainlefthr></b>"+alugraStustr;
							finalHtml+=alugraStustr;
						}
						if(aluUnderStustr!=""){
							aluUnderStustr="<div class=person_type_title_alumni>本科生</div><b><hr class=mainlefthr></b>"+aluUnderStustr;
							finalHtml+=aluUnderStustr;
						}
					}
					
					if(AffStuAndFacstr!=""){
						AffStuAndFacstr="<div class=person_type_title>附属学院教师及学生</div><b><hr class=mainlefthr></b>"+AffStuAndFacstr;
						finalHtml+=AffStuAndFacstr;
					}
		       		if(visitorstr!=""){
		       			visitorstr="<div class=person_type_title>访问学者</div><b><hr class=mainlefthr></b>"+visitorstr;
						finalHtml+=visitorstr;
					}
					/*console.log(finalHtml);*/
					$(".person_instroduction").html(finalHtml);
	});

});

