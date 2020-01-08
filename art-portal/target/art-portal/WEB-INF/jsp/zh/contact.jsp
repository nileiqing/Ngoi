<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>下一代互联网中心</title>
	<link rel="stylesheet" href="<%=basePath%>css/stylengoi.css">
	<link href="<%=basePath%>images/favicon.ico" rel="icon" type="image/x-icon" />
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.5&ak=0jMScvpPO0RxHlHlLjy8h2N3EZp1GVqI"></script> 
	<script src="http://d1.lashouimg.com/static/js/release/jquery-1.4.2.min.js" type="text/javascript"></script>  
	<base target="_blank" />
	<style>
		.navbar li:nth-child(6) {
			background-color: #fff;
			border-bottom: 2px solid #52a1d2;
		}
		.navbar li:nth-child(6) a {
			color: #8b1f30;
			
		}
		* {
			font-family: 'Open Sans'!important;
		}
		/* 带迁移到主体样式当中去 */
	#badiumap {  
    width:800px;  
    height:400px;
    margin:10px auto;
    overflow:hidden;  
    background-color: pink;
    font-family: Helvetica, Arial, '微软雅黑', sans-serif;
    font-size: 12px;
    letter-spacing: 1px;
    line-height: 20px;
    }
	#badiumap input {
	    border: 1px solid #DDD;
	    box-sizing: content-box;
	}
	.outset-but {
		margin: auto 3px;
		cursor: pointer;
	}
 	</style>
</head>
<body>
	<p id="contentid" style="display:none;">${contentid}</p>
	<p id="allurl" style="display:none;"><%=basePath%></p>
	<header>
		<!-- 头部logo及背景图 -->
		<div class="nav">
			<a href="#">
				<img src="" alt="" id="headerlogo">
			</a>
		</div>
		<!-- 头部导航栏 -->
		<div class="navbar">
			<ul>
				<li><a href="<%=basePath%>zh/index.html" target="_self">主&nbsp;&nbsp;页</a></li>
				<li><a href="<%=basePath%>zh/team.html" target="_self">成员信息</a></li>
				<li><a href="<%=basePath%>zh/research.html" target="_self">研究项目</a></li>
				<li><a href="<%=basePath%>zh/publications.html" target="_self">研究成果</a></li>
				<li><a href="<%=basePath%>zh/openpositions.html" target="_self">招生信息</a></li>
				<li><a href="#" target="_self">联系我们</a></li>
				<li style="float:right"><a href="<%=basePath%>contact.html" target="_self">English</a></li>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
					<div class="contact_page_first_title">联系我们</div>
					
					<div class="contact_desc">
						<!-- <div class="openposition_list_title">Graduate student positions (PhD and MS)</div>
						<b><hr class="mainlefthr"></b>
						<div class="openposition_list_content"><p>The NetSciWiS group is always on the look for exceptional graduate PhD/MS students having expertise and interest in one or more of our areas of research that include wireless networks, cybersecurity, smart grids, Internet of things, cyber-physical systems, game theory, optimization, social networks, and machine learning. We also welcome applicants with expertise in adjunct areas and with strong mathematical background.</p>
						<p>Interested applicants must have a solid analytical background and a drive to pursue fundamental research as evidenced by a solid academic track record and early involvement in research during their studies. Prospective candidates should email their CV to Dr. Walid Saad (saad.walid AT gmail.com or walids AT vt.edu), specifying their key research interests as well as their academic credentials. Interested students are encouraged to also submit a formal application to Virginia Tech's ECE department.</p>
						</div> -->
					</div>		
					<!-- 地图 -->
					<div id="badiumap"></div>
			</div>
			<!-- 主体右侧内容 -->
			<div class="mainright">
					<div class="sponsors">
						
					</div>
					<div class="ulinks">
						
					</div>
			</div>
	    </div>
	</div>
	<div class="footer">
		<b><hr class="mainlefthr"></b>
		<div class="fnavbar">
			<a href="<%=basePath%>zh/index.html" target="_self">主 页</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/team.html" target="_self">成员信息</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/research.html" target="_self">研究项目</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/publications.html" target="_self">研究成果</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/openpositions.html" target="_self">招生信息</a>
			&nbsp;-&nbsp;
			<a href="#" target="_self">联系我们</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2020 北京邮电大学,下一代互联网中心 </div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/zh/ngoicontact.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
<script type="text/javascript">  
    var map = new BMap.Map("badiumap");
    map.centerAndZoom(new BMap.Point(116.403884,39.914887), 13);
    map.enableScrollWheelZoom();
    var marker=new BMap.Marker(new BMap.Point(116.365602,39.969804));
    map.addOverlay(marker);
    var licontent="<b>北京邮电大学-下一代互联网中心</b><br>";
        licontent+="<span><strong>地址：</strong>北京市海淀区西土城路10号</span><br>";
        licontent+="<span><strong>电话：</strong>(010)62282615</span><br>";
        licontent+="<span class=input><strong></strong><input class=utset type=text name=origin value=北京站 /><input class=outset-but type=button value=公交 onclick=gotobaidu(1) /><input class=outset-but type=button value=驾车  onclick=gotobaidu(2) /><a class=gotob href=url=http://api.map.baidu.com/direction?destination=latlng:"+marker.getPosition().lat+","+marker.getPosition().lng+"|name:北京邮电大学"+"®ion=北京"+"&output=html target=_blank></a></span>";

    var hiddeninput="<input type=hidden value="+'北京'+" name=region /><input type=hidden value=html name=output /><input type=hidden value=driving name=mode /><input type=hidden value=latlng:"+marker.getPosition().lat+","+marker.getPosition().lng+"|name:北京邮电大学"+" name=destination />";

    var content1 ="<form id=gotobaiduform action=http://api.map.baidu.com/direction target=_blank method=get>" + licontent +hiddeninput+"</form>";

    var opts1 = { width: 300 };

    var  infoWindow = new BMap.InfoWindow(content1, opts1);
    marker.openInfoWindow(infoWindow);
    marker.addEventListener('click',function(){
        marker.openInfoWindow(infoWindow);
    });

    function gotobaidu(type)
    {
        if($.trim($("input[name=origin]").val())=="")
        {
            alert("请输入起点！");
            return;
        }else{
            if(type==1)
            {
                $("input[name=mode]").val("transit");
                $("#gotobaiduform")[0].submit();
            }else if(type==2)
            {
                $("input[name=mode]").val("driving");
                $("#gotobaiduform")[0].submit();
            }
        }
    }
</script>
</body>
</html>