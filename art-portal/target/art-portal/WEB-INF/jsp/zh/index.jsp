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
				<li><a href="#" target="_self">主&nbsp;&nbsp;页</a></li>
				<li><a href="<%=basePath%>zh/team.html" target="_self">成员信息</a></li>
				<li><a href="<%=basePath%>zh/research.html" target="_self">研究项目</a></li>
				<li><a href="<%=basePath%>zh/publications.html" target="_self">研究成果</a></li>
				<li><a href="<%=basePath%>zh/openpositions.html" target="_self">招生信息</a></li>
				<li><a href="<%=basePath%>zh/contact.html" target="_self">联系我们</a></li>
				<li style="float:right"><a href="<%=basePath%>index.html" target="_self">English</a></li>
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
					<div>我们现阶段的研究方向:</div>
					<div>
						<ul>
							
						</ul>
						<span id="spanvacancy"> 若你对我们的研究方向感兴趣，并想要加入我们团队的话，请点击 <a href="<%=basePath%>zh/openpositions.html">这里.</a></span><!-- 实验室简介 -->
					</div>
				</div>
				<!-- 下半部分：新闻 -->
				<div class="ltr">
					<div class="news">新闻</div>
					<b><hr class="mainlefthr"></b>
					<div class="newslist"></div>
					<div class="seemore">&nbsp;
						<a href="<%=basePath%>zh/home/newslist.html">更多</a>&nbsp;...
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
		<a href="#" target="_self">主 页</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>zh/team.html" target="_self">成员信息</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>zh/research.html" target="_self">研究项目</a>
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
<script type="text/javascript" src="<%=basePath%>js/zh/ngoiajaxindex.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>