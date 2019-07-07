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
	<title>Network sciEnce, Wireless, and Security (NEWS) Group</title>
	<link rel="stylesheet" href="<%=basePath%>css/stylengoi.css">
	<base target="_blank" />
	<style>
		.navbar li:first-child {
			background-color: #fff;
			border-bottom: 2px solid #52a1d2;
		}
		.navbar li:first-child a { 
			color: #8b1f30;
			
		}
	</style>
</head>
<body>
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
				<li><a href="#" target="_self">HOME</a></li>
				<li><a href="<%=basePath%>team.html" target="_self">TEAM</a></li>
				<!-- <li><a href="#" target="_self">AI FOR WIRELESS</a></li> -->
				<li><a href="<%=basePath%>research.html" target="_self">RESEARCH</a></li>
				<li><a href="<%=basePath%>publications.html" target="_self">PUBLICATION</a></li>
				<li><a href="<%=basePath%>events.html" target="_self">EVEVTS</a></li>
				<li><a href="<%=basePath%>activities.html" target="_self">ACTIVITY</a></li>
				<li><a href="<%=basePath%>openpositions.html" target="_self">OPENTION POSITION</a></li>
				<li><a href="<%=basePath%>contact.html" target="_self">CONTACT</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
				<!-- 上半部分：实验室简介 -->
				<div class="labins">
					<div class="labinfo">

					</div>
					<div></div>
					<div>We are currently focused on several research thrusts:</div>
					<div>
						<ul>
							
						</ul>
						<span id="spanvacancy">We are always looking for new students and postdocs within our area of research, broader information is found <a href="<%=basePath%>openpositions.html">here.</a></span><!-- 实验室简介 -->
					</div>
				</div>
				<!-- 下半部分：新闻 -->
				<div class="ltr">
					<div class="news">News</div>
					<b><hr class="mainlefthr"></b>
					<div class="newslist"></div>
					<div class="seemore">See&nbsp;
						<a href="<%=basePath%>home/newslist.html">more&nbsp;news</a>&nbsp;...
					</div>
				</div>
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
		<a href="#">Home</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>team.html">Team</a>
		&nbsp;-&nbsp;
		<!-- <a href="#">Ai For Wireless</a>
		&nbsp;-&nbsp; -->
		<a href="<%=basePath%>research.html">Research</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>publications.html">Publication</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>events.html">Events</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>activities.html">Activities</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>openpositions.html">Open Positions</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>contact.html">Contact Us</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2019 Network Science, Wireless, and Security Group (NetSciWiS), Virginia Tech</div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/ngoiajaxindex.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>