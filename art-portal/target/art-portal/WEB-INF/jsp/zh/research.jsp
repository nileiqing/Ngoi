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
	<link href="<%=basePath%>images/favicon.ico" rel="icon" type="image/x-icon" />
	<link rel="stylesheet" href="<%=basePath%>css/stylengoi.css">
	<base target="_blank" />
	<style>
		.navbar li:nth-child(3) {
			background-color: #fff;
			border-bottom: 2px solid #52a1d2;
		}
		.navbar li:nth-child(3) a { 
			color: #8b1f30;
			
		}
		* {
			font-family: 'Open Sans'!important;
		}
		/* 带迁移到主体样式当中去 */

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
				<li><a href="#" target="_self">研究项目</a></li>
				<li><a href="<%=basePath%>zh/publications.html" target="_self">研究成果</a></li>
				<li><a href="<%=basePath%>zh/openpositions.html" target="_self">招生信息</a></li>
				<li><a href="<%=basePath%>zh/contact.html" target="_self">联系我们</a></li>
				<li style="float:right"><a href="<%=basePath%>research.html" target="_self">English</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
					<div class="research_page_first_title">研究项目</div>
					
					<div class="research_desc_list"></div>		
				<!-- 	<div class="research_desc">
					<div class="research_desc_title"><a href="#">Big Data Analytics for Optimized Planning of Smart, Sustainable, and Connected Communities</a></div>
					<div class="research_desc_content">
						<div><span><strong>Sponsored by:</strong></span><p>National Science Foundation (NSF)</p></div>
						<div><span><strong>Collaborators:</strong></span><p>Harpreet Dhillon (Virginia Tech)</p></div>
						<div><img src="http://www.netsciwis.com/_/rsrc/1484690909705/research/mainDRAWING.jpg?height=251&width=400" >The goal of this project is to develop a foundational framework for the modeling and performance analysis of the Internet of Things (IoT) that will facilitate the management of resources, such as energy and computation, jointly across its cyber and physical realms. By leveraging interdisciplinary tools from stochastic geometry, distributed optimization, and operations research, the proposed framework will yield a number of results that include new statistical models and CPS performance metrics for characterizing the cyber-physical operation of IoT as well as novel distributed optimization algorithms that will adapt the cyber-physical operational state of the IoT devices to the dynamics of the CPS environment, while being cognizant of their stringent resource constraints.</div>
					</div>
				</div> 
				<b><hr class="mainlefthr"></b> -->
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
			<a href="#" target="_self">研究项目</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/publications.html" target="_self">研究成果</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/openpositions.html" target="_self">招生信息</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/contact.html" target="_self">联系我们</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2020 北京邮电大学,下一代互联网中心 </div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/zh/ngoiresearchlist.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>