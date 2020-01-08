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
	<link rel="stylesheet" href="<%=basePath%>css/stylengoi.css">
	<base target="_blank" />
	<style>
		.navbar li:nth-child(2) {
			background-color: #fff;
			border-bottom: 2px solid #52a1d2;
		}
		.navbar li:nth-child(2) a { 
			color: #8b1f30;
			
		}
		* {
			font-family: 'Open Sans'!important;
		}
		/* 单独设置教师的图片样式大小 */
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
				<li><a href="#" target="_self">TEAM</a></li>
				<!-- <li><a href="#" target="_self">AI FOR WIRELESS</a></li> -->
				<li><a href="<%=basePath%>research.html" target="_self">RESEARCH</a></li>
				<li><a href="<%=basePath%>publications.html" target="_self">PUBLICATION</a></li>
				<%--<li><a href="<%=basePath%>events.html" target="_self">EVENTS</a></li>--%>
				<%--<li><a href="<%=basePath%>activities.html" target="_self">ACTIVITY</a></li>--%>
				<li><a href="<%=basePath%>openpositions.html" target="_self">OPENTION POSITION</a></li>
				<li><a href="<%=basePath%>contact.html" target="_self">CONTACT</a></li>
				<li style="float:right"><a href="<%=basePath%>zh/team.html" target="_self">中文版</a></li>
			</ul>
		</div>
	</header>
	<!-- 主体部分 -->
	<div class="main">
			<div class="main-in">
				<!-- 主体左侧内容 -->
				<div class="mainleft">
					<div class="person_instroduction">

	<!-- 					<div class="person_type_title">
		Faculty
	</div>
	<b><hr class="mainlefthr"></b>
	<div class="person_desc">
		<h3>
			<img align="left" height="100" width="100" src="http://www.netsciwis.com/_/rsrc/1484690909715/team/walid.jpg" />
			<span>Walid Saad</span>, <span>Associate Professor, Google Scholar</span>
		</h3>
		<p>Walid Saad (S'07, M'10, SM’15, F'19) received his Ph.D degree from the University of Oslo in 2010. Currently, he is an Associate Professor at the Department of Electrical and Computer Engineering at Virginia Tech, where he leads the Network sciEnce, Wireless, and Security (NEWS@VT) laboratory, within the Wireless@VT research group. Dr. Saad is a Fellow of the IEEE. His research interests include wireless networks, game theory, machine learning, cybersecurity, unmanned aerial vehicles, and cyber-physical systems. Dr. Saad is the recipient of the NSF CAREER award in 2013, the AFOSR summer faculty fellowship in 2014, and the Young Investigator Award from the Office of Naval Research (ONR) in 2015. He was the author/co-author of seven conference best paper awards at WiOpt in 2009, ICIMP in 2010, IEEE WCNC in 2012, IEEE PIMRC in 2015, IEEE SmartGridComm in 2015, EuCNC in 2017, and IEEE GLOBECOM in 2018. He is the recipient of the 2015 Fred W. Ellersick Prize from the IEEE Communications Society. In 2017, Dr. Saad was named College of Engineering Faculty Fellow at Virginia Tech. From 2015 – 2017, Dr. Saad was named the Steven O. Lane Junior Faculty Fellow at Virginia Tech. He currently serves as an editor for the IEEE Transactions on Wireless Communications, IEEE Transactions on Communications, IEEE Transactions on Mobile Computing,  IEEE Transactions on Information Forensics and Security, and IEEE Communications Tutorials & Surveys. </p>
	</div>
	<b><hr class="mainlefthr"></b>
					</div> -->
				</div>
				<!-- 主体右侧内容 -->
				
			</div>
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
		<a href="#" target="_self">Team</a>
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
		<a href="<%=basePath%>openpositions.html" target="_self">Open Positions</a>
		&nbsp;-&nbsp;
		<a href="<%=basePath%>contact.html" target="_self">Contact Us</a>
		</div>
		<b><hr class="lasthr"></b>
		<div class="copyright">© 2020 Next Generation Internet Center , Win Laboratory , Beijing University of Posts and Telecommunications (BUPT)</div>
	</div>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/date.js"></script>
<script type="text/javascript" src="<%=basePath%>js/en/ngoiteamlist.js"></script>
<script type="text/javascript" src="<%=basePath%>js/responsiveslides.min.js"></script>

<script type="text/javascript" src="<%=basePath%>js/wp-embed.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-1.3.7.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easing.pack.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.mousewheel.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/amazeui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/app.js"></script>
</body>
</html>