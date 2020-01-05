<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>下一代互联网中心官网后台管理系统</title>
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="css/art.css" />
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<style type="text/css">
	.content {
		padding: 10px 10px 10px 10px;
	}
</style>
</head>
<body class="easyui-layout">
    <div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
		<ul id="mainContentCategoryTree" class="easyui-tree" style="margin-left: 5px;" data-options="url:'/content/category/list',animate: true,method : 'GET'">
		</ul>
    	<ul id="menu" class="easyui-tree" style="margin-left: 5px;">
         	<%--<li>--%>
         		<%--<span>网站内容管理</span>--%>
         		<%--<ul>--%>
	         		<%--<!-- <li data-options="attributes:{'url':'content-category'}">内容分类管理</li> -->--%>
	         		<%--<li data-options="attributes:{'url':'content'}">内容管理</li>--%>
	         	<%--</ul>--%>
         	<%--</li>--%>
         	<li>
         		<span>人员管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'user-add'}">添加人员</li>
	         		<li data-options="attributes:{'url':'user-editjsp'}">修改信息</li>
	         	</ul>
         	</li>
         </ul>
                     	<div style="padding:5px">
	    <a href="/logout" class="easyui-linkbutton">安全退出</a>
	</div>
    </div>
    <div data-options="region:'center',title:''">
    	<div id="tabs" class="easyui-tabs">
		</div>
    </div>
<script type="text/javascript">
$(function(){
	$('#mainContentCategoryTree').tree({
		onClick: function(node){
			var n_url = node.url+"?categoryId="+node.id;
			if($('#mainContentCategoryTree').tree("isLeaf",node.target)){
				var tabs = $("#tabs");
				var tab = tabs.tabs("getTab",node.text);
				if(tab){
					tabs.tabs("select",node.text);
				}else{
					tabs.tabs('add',{
						title:node.text,
						href: n_url,
						closable:true,
						bodyCls:"content"
					});
				}
			}
		}
	});
	$('#menu').tree({
		onClick: function(node){
			if($('#menu').tree("isLeaf",node.target)){
				var tabs = $("#tabs");
				var tab = tabs.tabs("getTab",node.text);
				if(tab){
					tabs.tabs("select",node.text);
				}else{
					tabs.tabs('add',{
						title:node.text,
						href: node.attributes.url,
						closable:true,
						bodyCls:"content"
					});
				}
			}
		}
	});
});

</script>
</body>
</html>