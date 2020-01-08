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
	 <link rel="stylesheet" href="<%=basePath%>lib/bootstrap/css/bootstrap.css"> 
	<link rel="stylesheet" href="<%=basePath%>css/stylengoi.css">
	
	<base target="_blank" />
	<style>
		.navbar li:nth-child(5) {
			background-color: #fff;
			border-bottom: 2px solid #52a1d2;
		}
		.navbar li:nth-child(5) a { 
			color: #8b1f30;
			
		}
		.navbar a {
			text-decoration: none!important;
		}
		a:hover {
			text-decoration: none!important;
		}
		/* 带迁移到主体样式当中去 */
		* {
			box-sizing : content-box;
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
		<div class="navbar" style="font-family: sans-serif;">
			<ul>
				<li><a href="<%=basePath%>index.html" target="_self">HOME</a></li>
				<li><a href="<%=basePath%>team.html" target="_self">TEAM</a></li>
				<!-- <li><a href="#" target="_self">AI FOR WIRELESS</a></li> -->
				<li><a href="<%=basePath%>research.html" target="_self">RESEARCH</a></li>
				<li><a href="<%=basePath%>publications.html" target="_self">PUBLICATION</a></li>
				<%--<li><a href="#" target="_self">EVENTS</a></li>--%>
				<%--<li><a href="<%=basePath%>activities.html" target="_self">ACTIVITY</a></li>--%>
				<li><a href="<%=basePath%>openpositions.html" target="_self">OPENTION POSITION</a></li>
				<li><a href="<%=basePath%>contact.html" target="_self">CONTACT</a></li>
				<li style="float:right"><a href="<%=basePath%>zh/events.html" target="_self">中文版</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
					<div class="events_page_first_title">Events</div>
					<!-- 活动列表 -->
					<div class="event_list" >
						<!-- 						<div style="font-size: 18px; ">
							<span class="event_list_date" style="color: #666;">[Jul 6-13, 2017]</span>
							<span style="color: #600">"Introducing the Internet of Things, a Hands on Workshop"</span>
							<span style="color: #222">prepared by PhD Student Yaman Sharaf-Dabbagh, C-Tech2 Summer Camp and Imagination Summer Camp</span>
						</div>
						<div class="event_list_link" style="color: #222">
							<div>C-Tech2 Summer Camp link: <a href="#">https://www.eng.vt.edu/ctech2</a> </div>
							<div>Imagination Summer Camp link: <a href="#">https://www.eng.vt.edu/ctech2</a></div>
						</div>
						<b><hr class="mainlefthr"></b>
						<div style="font-size: 18px; ">
							<span class="event_list_date" style="color: #666;">[Jul 6-13, 2017]</span>
							<span style="color: #600">"Introducing the Internet of Things, a Hands on Workshop"</span>
							<span style="color: #222">prepared by PhD Student Yaman Sharaf-Dabbagh, C-Tech2 Summer Camp and Imagination Summer Camp</span>
						</div>
						<div class="event_list_link" style="color: #222">
							<div>C-Tech2 Summer Camp link: <a href="#">https://www.eng.vt.edu/ctech2</a> </div>
							<div>Imagination Summer Camp link: <a href="#">https://www.eng.vt.edu/ctech2</a></div>
						</div> -->
					</div>		
					<!-- 轮播图 -->
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
						  <!-- Indicators -->
						  <ol class="carousel-indicators">

						  </ol>

						  <!-- Wrapper for slides -->
						  <div class="carousel-inner" role="listbox">
						           <!-- <img src="https://sites.google.com/site/netsciwisvt/sympo1.jpg" >
						           <img src="https://sites.google.com/site/netsciwisvt/sympo2.jpg" >
						           <img src="https://sites.google.com/site/netsciwisvt/sympo3.jpg" >
						           <img src="https://sites.google.com/site/netsciwisvt/sympo4.jpg" > -->
						  </div>

						  <!-- Controls -->
						  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						    <span class="sr-only">Previous</span>
						  </a>
						  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						    <span class="sr-only">Next</span>
						  </a>
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
		<%--<a href="#">Events</a>--%>
		<%--&nbsp;-&nbsp;--%>
		<%--<a href="<%=basePath%>activities.html">Activities</a>--%>
		<%--&nbsp;-&nbsp;--%>
		<a href="<%=basePath%>openpositions.html" target="_self">Open Positions</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>contact.html" target="_self">Contact Us</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2020 Next Generation Internet Center , Win Laboratory , Beijing University of Posts and Telecommunications (BUPT)</div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/en/ngoievents.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>
<script src="lib/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>