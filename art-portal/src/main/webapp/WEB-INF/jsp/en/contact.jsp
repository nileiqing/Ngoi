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
	<title>Next Generation Internet Center , Win Laboratory </title>
	<link href="images/favicon.ico" rel="icon" type="image/x-icon" />
	<link rel="stylesheet" href="<%=basePath%>css/stylengoi.css">
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
				<li><a href="<%=basePath%>index.html" target="_self">HOME</a></li>
				<li><a href="<%=basePath%>team.html" target="_self">TEAM</a></li>
				<!-- <li><a href="#" target="_self">AI FOR WIRELESS</a></li> -->
				<li><a href="<%=basePath%>research.html" target="_self">RESEARCH</a></li>
				<li><a href="<%=basePath%>publications.html" target="_self">PUBLICATION</a></li>
				<%--<li><a href="<%=basePath%>events.html" target="_self">EVENTS</a></li>--%>
				<%--<li><a href="<%=basePath%>activities.html" target="_self">ACTIVITY</a></li>--%>
				<li><a href="<%=basePath%>openpositions.html" target="_self">OPENTION POSITION</a></li>
				<li><a href="#" target="_self">CONTACT</a></li>
				<li style="float:right"><a href="<%=basePath%>zh/contact.html" target="_self">中文版</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
					<div class="contact_page_first_title">Contact</div>
					
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
		<a href="<%=basePath%>index.html" target="_self">Home</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>team.html" target="_self">Team</a>
		&nbsp;-&nbsp;
		<!-- <a href="#">Ai For Wireless</a>
		&nbsp;-&nbsp; -->
		<a href="<%=basePath%>research.html" target="_self">Research</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>publications.html" target="_self">Publication</a>
		&nbsp;-&nbsp;
		<%--<a href="<%=basePath%>events.html">Events</a>--%>
		<%--&nbsp;-&nbsp;--%>
		<%--<a href="<%=basePath%>activities.html">Activities</a>--%>
		<%--&nbsp;-&nbsp;--%>
		<a href="<%=basePath%>openpositions.html" target="_self">Open Positions</a>
		&nbsp;-&nbsp;
		<a href="#" target="_self">Contact Us</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2020 Next Generation Internet Center , Win Laboratory , Beijing University of Posts and Telecommunications (BUPT)</div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/en/ngoicontact.js"></script>
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