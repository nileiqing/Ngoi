<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>下一代互联网中心后台管理系统</title>
    <link href="css/login.css" rel="stylesheet" type="text/css">
    <link href="css/jquery.ui.tabs.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
    <script type="text/javascript" src="js/blur.js"></script>
    <style>
        .MainBg {
            background: url('../images/backimg.jpg') no-repeat center center;

        }
        #login_button {
            border-width: 0;
            background: rgba(0, 0, 0, 0.15);
        }
    </style>
</head>
<body style="padding-top: 100px;">
<div class="Head">
   <div class="logo">
        <a href="#" target="_blank">
            <img style="border:0 none;display: block;height: 45px;width: 300px;"  src="../images/logo.jpg" alt="Coreart 下一代互联网中心">
        </a>
    </div>
</div>

<div class="Main" id="Main">
    <div class="MainBg" id="MainBg">
        <form id="loginForm" method="post" action="/checkuser" >
            <div class="MainL"></div>
            <div id="mainRCommon">
                <div class="MainR" style="width: 335px; background-attachment: scroll; background-position: -572px -40px; ">
                    <div class="Header">
                        <div class="title" style="font-size: 20px;font-weight: 500">登录</div>
                    </div>
                    <div id="logArea" class="tab-content">
                        <br>
                        <div class="inptr">
                            <input type="text" id="username" name="username" class="inpUser" value="">
                        </div>
                        <br>
                        <div class="inptr">
                            <input type="password" id="password" name="password" class="inpPW" autocomplete="off" value="">
                        </div>
                        <br>
                        <div class="inpB">
                            <div>
                                <button name="action:login" type="submit" class="Button" id="login_button">登录</button>
                            </div>
                        </div>
                    </div>
                    <div class="Bottom">
                        <div>
                            <div class="TLine" style="display: none;"></div>
                            <label id="faceSelectOption">
                                <a href="javascript:void(0);" onclick="displayFacePanel(this)">
                                </a>
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>

<div class="footer">
    <div class="copyright" id="copyright">
        <a>Copyright © 2019 下一代互联网中心版权所有 </a>
    </div>
</div>
</body>
</html>