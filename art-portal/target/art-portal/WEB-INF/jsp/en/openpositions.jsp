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
	<link href="images/favicon.ico" rel="icon" type="image/x-icon" />
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
				<li><a href="<%=basePath%>index.html" target="_self">HOME</a></li>
				<li><a href="<%=basePath%>team.html" target="_self">TEAM</a></li>
				<!-- <li><a href="#" target="_self">AI FOR WIRELESS</a></li> -->
				<li><a href="<%=basePath%>research.html" target="_self">RESEARCH</a></li>
				<li><a href="<%=basePath%>publications.html" target="_self">PUBLICATION</a></li>
				<%--<li><a href="<%=basePath%>events.html" target="_self">EVENTS</a></li>--%>
				<%--<li><a href="<%=basePath%>activities.html" target="_self">ACTIVITY</a></li>--%>
				<li><a href="#" target="_self">OPENTION POSITION</a></li>
				<li><a href="<%=basePath%>contact.html" target="_self">CONTACT</a></li>
				<li style="float:right"><a href="<%=basePath%>zh/openpositions.html" target="_self">中文版</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
					<div class="openposition_page_first_title">Open Positions</div>
					
					<div class="openposition_list">
						<!-- <div class="openposition_list_title">Graduate student positions (PhD and MS)</div>
						<b><hr class="mainlefthr"></b>
						<div class="openposition_list_content"><p>The NetSciWiS group is always on the look for exceptional graduate PhD/MS students having expertise and interest in one or more of our areas of research that include wireless networks, cybersecurity, smart grids, Internet of things, cyber-physical systems, game theory, optimization, social networks, and machine learning. We also welcome applicants with expertise in adjunct areas and with strong mathematical background.</p>
						<p>Interested applicants must have a solid analytical background and a drive to pursue fundamental research as evidenced by a solid academic track record and early involvement in research during their studies. Prospective candidates should email their CV to Dr. Walid Saad (saad.walid AT gmail.com or walids AT vt.edu), specifying their key research interests as well as their academic credentials. Interested students are encouraged to also submit a formal application to Virginia Tech's ECE department.</p>
						</div> -->
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
		<%--<a href="<%=basePath%>events.html">Events</a>--%>
		<%--&nbsp;-&nbsp;--%>
		<%--<a href="<%=basePath%>activities.html">Activities</a>--%>
		<%--&nbsp;-&nbsp;--%>
		<a href="#" target="_self">Open Positions</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>contact.html" target="_self">Contact Us</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2020 Next Generation Internet Center , Win Laboratory , Beijing University of Posts and Telecommunications (BUPT)/div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/en/ngoiopensitions.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>