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
		* {
			font-family: 'Open Sans'!important;
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
				<li><a href="<%=basePath%>show.html" target="_self">HOME</a></li>
				<li><a href="<%=basePath%>team.html" target="_self">TEAM</a></li>
				<!-- <li><a href="#" target="_self">AI FOR WIRELESS</a></li> -->
				<li><a href="<%=basePath%>research.html" target="_self">RESEARCH</a></li>
				<li><a href="<%=basePath%>publications.html" target="_self">PUBLICATION</a></li>
				<%--<li><a href="<%=basePath%>events.html" target="_self">EVENTS</a></li>--%>
				<%--<li><a href="<%=basePath%>activities.html" target="_self">ACTIVITY</a></li>--%>
				<li><a href="<%=basePath%>openpositions.html" target="_self">OPENTION POSITION</a></li>
				<li><a href="<%=basePath%>contact.html" target="_self">CONTACT</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体内部的导航 -->
			<div class="main-nav">
				<a href="<%=basePath%>show.html">Home</a> > <a href="<%=basePath%>home/newslist.html">News</a> >
			</div>
			<!-- 主体左侧内容 -->
			<div class="mainleft">
				<div class="newscontent"></div>
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

		<a href="<%=basePath%>show.html">Home</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>team.html">Team</a>
		&nbsp;-&nbsp;
		<!-- <a href="#">Ai For Wireless</a>
		&nbsp;-&nbsp; -->
		<a href="<%=basePath%>research.html">Research</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>publications.html">Publication</a>
		&nbsp;-&nbsp;
		<%--<a href="<%=basePath%>events.html">Events</a>--%>
		<%--&nbsp;-&nbsp;--%>
		<%--<a href="<%=basePath%>activities.html">Activities</a>--%>
		<%--&nbsp;-&nbsp;--%>
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