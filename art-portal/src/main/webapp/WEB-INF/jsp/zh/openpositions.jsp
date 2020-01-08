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
				<li><a href="<%=basePath%>zh/index.html" target="_self">主&nbsp;&nbsp;页</a></li>
				<li><a href="<%=basePath%>zh/team.html" target="_self">成员信息</a></li>
				<li><a href="<%=basePath%>zh/research.html" target="_self">研究项目</a></li>
				<li><a href="<%=basePath%>zh/publications.html" target="_self">研究成果</a></li>
				<li><a href="#" target="_self">招生信息</a></li>
				<li><a href="<%=basePath%>zh/contact.html" target="_self">联系我们</a></li>
				<li style="float:right"><a href="<%=basePath%>openpositions.html" target="_self">English</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
					<div class="openposition_page_first_title">招生信息</div>
					
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
			<a href="<%=basePath%>zh/index.html" target="_self">主 页</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/team.html" target="_self">成员信息</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/research.html" target="_self">研究项目</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/publications.html" target="_self">研究成果</a>
			&nbsp;-&nbsp;
			<a href="#" target="_self">招生信息</a>
			&nbsp;-&nbsp;
			<a href="<%=basePath%>zh/contact.html" target="_self">联系我们</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2020 北京邮电大学,下一代互联网中心 </div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/zh/ngoiopensitions.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>