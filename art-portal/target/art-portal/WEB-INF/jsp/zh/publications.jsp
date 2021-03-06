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
		.navbar li:nth-child(4) {
			background-color: #fff;
			border-bottom: 2px solid #52a1d2;
		}
		.navbar li:nth-child(4) a {
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
				<li><a href="#" target="_self">研究成果</a></li>
				<li><a href="<%=basePath%>zh/openpositions.html" target="_self">招生信息</a></li>
				<li><a href="<%=basePath%>zh/contact.html" target="_self">联系我们</a></li>
				<li style="float:right"><a href="<%=basePath%>publications.html" target="_self">English</a></li>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
		<div class="main-in">
			<!-- 主体左侧内容 -->
			<div class="mainleft">
					<div class="publication_page_first_title">研究成果</div>
					
					<div class="publication_list">

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
			<a href="#" target="_self">研究成果</a>
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
<script type="text/javascript" src="<%=basePath%>js/zh/ngoipublications.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>