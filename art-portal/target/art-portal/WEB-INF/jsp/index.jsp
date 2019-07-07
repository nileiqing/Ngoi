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
    <link rel="stylesheet" href="<%=basePath%>css/newmediatalk.css">
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
<p id="allurl" style="display:none;"><%=basePath%></p>
<header class="am-topbar">
	<div class="top-left" style="float: left;position: absolute;left: 2rem;top: 0;line-height: 60px;">
		<!-- 按钮触发器， 需要指定 target -->
		<a class="mb-menu" href="http://sodcn.jiangnan.edu.cn/#doc-oc-demo1" data-am-offcanvas="{effect: &#39;push&#39;}"><i style="font-size: 1.8rem;" class="am-icon-bars"></i></a>
		<!-- 侧边栏内容 -->
		<div id="doc-oc-demo1" class="am-offcanvas">
  			<div class="am-offcanvas-bar">
    			<div class="am-offcanvas-content">
    				<a class="left-logo" href="<%=basePath%>show.html">
    					<img id="headerimgleft" src=""/>
    				</a>
    				<form style="float:left;padding-left:1em;width:100%;" method="post" action="<%=basePath%>search.html">
						<input type="text" name="keyword" style="line-height:22px;margin:17px 5px;float:left;border:solid 1px #171616;width: 150px;"/>
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
			<input type="text" name="keyword" style="width:100px;line-height:20px;margin:18px 10px;float:left;border:solid 1px #aaa;"/>
			<input type="submit" value="搜索" style="line-height:22px;margin:17px 0px;float:left;background-color:#6699CC;color:white;border:solid 1px #6699CC;"/>
		</form>
		<div class="right pc-menu">
			<ul class="headernav"></ul>
		</div>
	</div>
</header>

<div class="slidenavs">
	<ul class="rslides" id="slidenavbar"></ul>
</div><br/>

<div class="container am-g">
	<div class="content page-home">
		<div class="am-g" style="margin-bottom: 2rem;">
			<section class="school-news am-u-md-4">
				<h3 class="mtitle">
					<img src="<%=basePath%>images/01.png" />Notice
					<span>通知公告</span>
					<a href="<%=basePath%>category/89.html">更多</a>
				</h3>
				<div class="inner" id="notice"></div>
			</section>
			<section class="school-news am-u-sm-12 am-u-md-4 am-u-lg-4">
				<h3 class="mtitle">
					<img src="<%=basePath%>images/02.png" />News
					<span>学院新闻</span>
					<a href="<%=basePath%>category/79.html">更多</a>
				</h3>
				<div class="inner" id="news"></div>
			</section>
			<section class="school-news am-u-sm-12 am-u-md-4 am-u-lg-4">
				<h3 class="mtitle">
					<img src="<%=basePath%>images/03.png" />Online Design
					<span>在线展示</span>
					<a href="<%=basePath%>category/50.html">更多</a> 
				</h3>
				<div class="inner" id="onlineshow"></div>
			</section>
			<section class="school-news am-u-sm-12 am-u-md-4 am-u-lg-4">
				<h3 class="mtitle">
					<img src="<%=basePath%>images/04.png" />Activity
					<span>学院特色</span>
					<a href="<%=basePath%>school/special.html">更多</a>
				</h3>
				<div class="inner" id="trend"></div>
			</section>
			<section class="school-news am-u-sm-12 am-u-md-4 am-u-lg-4">
				<h3 class="mtitle">
					<img src="<%=basePath%>images/05.png" />Events
					<span>展览讲座</span>
					<a href="<%=basePath%>category/91.html">更多</a>
				</h3>
				<div class="inner" id="display"></div>
			</section>
			<section class="school-news am-u-sm-12 am-u-md-4 am-u-lg-4">
				<h3 class="mtitle">
					<i class="am-icon-link" style="background-color:#a12af1"></i>Links
					<span>新媒体说</span>
					<!-- <a href="#">更多</a> -->
				</h3>
				<!-- <div class="inner" id="site"></div>-->
				<div class="page_container" style="background-color: #fff;width: 345px">
					<div id="pic1" class="tlg-xmt" style="width: 152px;float: left;height: 152px">
						<ul>
							<li>
								<a href="#" title="身边热心的学姐"><img src="<%=basePath%>images/1.jpg"></a>
								<div class="mask">
									<div class="pic">
										<div class="pic-title">身边热心的学姐</div>
										<div class="pic-date">2017-01-06</div>
										<a class="pic-ckxq" href="">查看详情</a>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<div id="pic2" class="tlg-xmt" style="width: 192px;float: right;height: 152px">
						<ul>
							<li>
								<a href="#" title="燕鸣湖边静静守候的木椅"><img src="<%=basePath%>images/2.jpg"></a>
								<div class="mask">
									<div class="pic">
										<div class="pic-title">燕鸣湖边静静守候的木椅</div>
										<div class="pic-date">2017-01-06</div>
										<a class="pic-ckxq" href="">查看详情</a>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<div style="height: 1px;clear: both"></div>
					<div id="pic3" class="tlg-xmt" style="width: 192px;float: left;height: 152px">
						<ul>
							<li>
								<a href="#" title="教学楼里的热水带来更多暖意"><img src="<%=basePath%>images/3.jpg"></a>
								<div class="mask">
									<div class="pic">
										<div class="pic-title">教学楼里的热水带来更多暖意</div>
										<div class="pic-date">2017-01-06</div>
										<a class="pic-ckxq" href="">查看详情</a>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<div id="pic4" class="tlg-xmt" style="width: 152px;float: right;height: 152px">
						<ul>
							<li>
								<a href="#" title="我是一个傲娇的小雪人"><img src="<%=basePath%>images/4.jpg"></a>
								<div class="mask">
									<div class="pic">
										<div class="pic-title">我是一个傲娇的小雪人</div>
										<div class="pic-date">2017-01-06</div>
										<a class="pic-ckxq" href="">查看详情</a>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</section>
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
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jsonajaxindex.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>