<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="js cssanimations">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>燕山大学艺术与设计学院</title>

    <!-- Set render engine for 360 browser -->
    <meta name="renderer" content="webkit">

    <!-- No Baidu Siteapp-->
    <meta http-equiv="Cache-Control" content="no-siteapp">

    <link rel="icon" type="image/png" href="#">

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
  
    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Amaze UI">
  
    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileColor" content="#0e90d2">

    <link rel="stylesheet" href="<%=basePath%>css/amazeui.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/style.css">
  
    <!-- All in One SEO Pack 2.3.9.2 by Michael Torbert of Semper Fi Web Design[281,324] -->
    <meta name="description" content="燕山大学艺术与设计学院">

    <script src="<%=basePath%>js/wp-emoji-release.min.js" type="text/javascript"></script>
	<style type="text/css">
		img.wp-smiley,
		img.emoji {
			display: inline !important;
			border: none !important;
			box-shadow: none !important;
			height: 1em !important;
			width: 1em !important;
			margin: 0 .07em !important;
			vertical-align: -0.1em !important;
			background: none !important;
			padding: 0 !important;
		}
	</style>
	<link rel="stylesheet" id="rs-plugin-settings-css" href="<%=basePath%>css/settings.css" type="text/css" media="all">
    <link rel="stylesheet" id="wp-pagenavi-css" href="<%=basePath%>css/pagenavi-css.css" type="text/css" media="all">
    <link rel="stylesheet" id="fancybox-css" href="<%=basePath%>css/jquery.fancybox-1.3.7.css" type="text/css" media="screen">
	<link rel="stylesheet" property="stylesheet" id="rs-icon-set-fa-icon-css" href="<%=basePath%>css/font-awesome.css" type="text/css" media="all">	

	<script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery-migrate.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.themepunch.tools.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.themepunch.revolution.min.js"></script>

</head>
<body>
<p id="nodeid" style="display:none;">${nodeid }</p>
<p id="allurl" style="display:none;"><%=basePath%></p>
<header class="am-topbar">
	<div class="top-left" style="float: left;position: absolute;left: 2rem;top: 0;line-height: 60px;">
		<!-- 按钮触发器， 需要指定 target -->
		<a class="mb-menu" href="http://sodcn.jiangnan.edu.cn/#doc-oc-demo1" data-am-offcanvas="{effect: &#39;push&#39;}"><i style="font-size: 1.8rem;" class="am-icon-bars"></i></a>
		<!-- 侧边栏内容 -->
		<div id="doc-oc-demo1" class="am-offcanvas">
			<div class="am-offcanvas-bar">
				<div class="am-offcanvas-content">
					<a class="left-logo" href="#">
						<img id="headerimgleft" src=""/>
					</a>
					<form style="float:left;padding-left:1em;width:100%;" method="post" action="<%=basePath%>search.html">
						<input type="text" value="" style="line-height:22px;margin:17px 5px;float:left;border:solid 1px #171616;width: 150px;"/>
						<input type="submit" value="搜索" style="line-height:22px;margin:17px 0px;float:left;background-color:#6699CC;color:white;border:solid 1px #6699CC;"/>
					</form>
					<div class="right mb-menu" style="margin-top:60px;">
						<ul class="headernav"></ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="top-mid" style="">
		<a class="logo mb-logo" href="<%=basePath%>show.html"><img id="headerimgtop" src=""></a>
		<form id="topsearchform" style="float:right;padding-right:1.5em;" method="post" action="<%=basePath%>search.html">
			<input type="text" value="" style="width:100px;line-height:20px;margin:18px 10px;float:left;border:solid 1px #aaa;"/>
			<input type="submit" value="搜索" style="line-height:22px;margin:17px 0px;float:left;background-color:#6699CC;color:white;border:solid 1px #6699CC;"/>
		</form>
		<div class="right pc-menu">
			<ul class="headernav"></ul>
		</div>
	</div>
</header>

<div class="page-title" style="background-image:url(<%=basePath%>images/back03.png);">
	<div class="mask"></div>
	<div class="container">
		<h3 class="am-u-sm-12 mtitle">
			<div class="am-g">
				<div class="am-u-md-3" style="padding-left:0px;">
					<i class="am-icon-newspaper-o" style="background-color: #EB2222"></i>NEWS<span class="newsmodeltitle"></span>
				</div>
				<div class="am-u-md-9">
					<div class="breadcrumbs" typeof="BreadcrumbList" vocab="http://schema.org/">
						<span property="itemListElement" typeof="ListItem">
							<a property="item" typeof="WebPage" title="Go to 燕山大学设计学院." href="<%=basePath%>show.html" class="home">
								<span property="name">首页</span>
							</a>
							<meta property="position" content="1">
						</span> &gt;
						<span property="itemListElement" typeof="ListItem">
							<span property="name" class="newsmodeltitle"></span>
							<meta property="position" content="2">
						</span> &gt;
						<span property="itemListElement" typeof="ListItem">
							<span property="name" id="newsmodelnexttitle"></span>
							<meta property="position" content="3">
						</span>
						<span property="itemListElement" typeof="ListItem">
							<span property="name" id="newsmodelthirdtitle"></span>
							<meta property="position" content="4">
						</span>
					</div>
				</div>
			</div>
		</h3>
	</div>
</div>

<div class="am-g">
	<div class="side-bar am-u-md-3">
		<div class="links am-g" style="margin-bottom: 3rem;">
			<h3 class="am-u-sm-12 mtitle"><i class="am-icon-link" style="background-color:#a12af1"></i><b class="newsmodeltitle"></b><span>NEWS</span></h3>
			<div class="inner am-u-sm-12">
				<ul id="newsmodel"></ul>
			</div>
		</div>
		<div class="events am-g" style="margin-bottom: 3rem;">
			<h3 class="am-u-sm-12 mtitle">
				<img src="<%=basePath%>images/04.png" />Activity
				<span>学院特色</span>
				<a style="float:right;margin-top: 10px;" href="<%=basePath%>category/33.html"><i class="am-icon-link elink"></i></a>
			</h3>
			<div class="inner am-u-sm-12">
				<ul id="trendsmodel"></ul>
			</div>
		</div>
	</div>
	<div class="am-u-md-9">
		<div class="am-g">
			<h3 class="am-u-sm-12 mtitle"><a href="<%=basePath%>show.html"><i class="am-icon-home backhome"></i></a><b id="detailtitle"></b></h3>
			<div class="am-u-sm-12 page-content page-keyan">
				<div class="inner" id="cont"></div>
			</div>
		</div>
	</div>
</div>

<footer>
	<div class="container am-g">
		<div class="content">
			<div class="am-g">
				<div class="am-u-md-4 contact">
					<a class="logo" href="javascript:void(0);"><img id="footerlogo" src=""></a>
					<ul id="footerleft"></ul>
				</div>
				<div class="am-u-md-5 f-link">
					<h3>相关链接
						<a href="#" style="float:right;color:#888 !important;font-size:1.4rem !important;font-weight:normal;display:none;">更多</a>
					</h3>
					<div id="footercenter"></div>
				</div>
				<div class="am-u-md-3 side-bar" id="footerright"></div>
			</div>	
		</div>
	</div>
	<div class="container" style="margin-top: 2.5rem;padding: 0 2.5rem 1.5rem 2.5rem;">
		<hr>
		<p class="cop" style="font-size: 1.2rem;color: #888;text-align:center;">Copyright2013   燕山大学艺术学院    ALL Rights Reserved   电话0335-8074530
			<a href="javascript:void(0);" target="_blank" title="VIVA" style="color:#666;border-bottom: 1px dashed #ddd;">VIVA</a>
			<span data-am-smooth-scroll="" class="am-fr cop-top" style="cursor: pointer"><i class="am-icon-angle-up"></i> 返回顶部</span>
		</p>
	</div>
</footer>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jsonajaxcontent.js"></script>
<script src="<%=basePath%>js/date.js" type="text/javascript"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>