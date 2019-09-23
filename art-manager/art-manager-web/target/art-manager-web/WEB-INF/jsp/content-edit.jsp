<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="contentEditForm" class="itemForm" method="post">
		<input type="hidden" name="categoryId" id="categoryId"/>
		<input type="hidden" name="id" />
		<input type="hidden" name="hiddentype" id="hiddentype" value="${hiddentype}"/>
	    <table cellpadding="5">
	        <tr >
	            <td id="J_title1">内容标题:</td>
	            <td id="J_title2"><input class="easyui-textbox" type="text" id="title" name="title" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
<!-- 	         <tr >
   <td id="J_specialy">学院特色:</td>
   <td id="J_titleDesc1y">
   	<div id="">
   		<input name="titleDesc" type="radio" value="1" />是
   		<input name="titleDesc" type="radio" value="0" />否
   	</div>
   </td>
	        </tr> -->
	        <tr>
	            <td id="J_subTitle1">内容子标题:</td>
	            <td id="J_subTitle2"><input class="easyui-textbox" type="text" id="subTitle" name="subTitle" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td id="J_titleDesc1">内容描述:</td>
	            <td id="J_titleDesc2"><input class="easyui-textbox" name="titleDesc" id="titleDesc" data-options="multiline:true,validType:'length[0,300]'" style="height:60px;width: 280px;"></input>
	            </td>
	        </tr>
	         <tr>
	            <td id="J_url1">URL:</td>
	            <td id="J_url2"><input class="easyui-textbox" type="text" id="url" name="url" style="width: 280px;" value="http://"></input></td>
	        </tr>
	        <tr>
	            <td id="J_pic">图片:</td>
	            <td id="photo">
	                <input type="hidden" name="pic" id="pic" />
	                <a href="javascript:void(0)" class="easyui-linkbutton onePicUpload">图片上传</a>
	            </td>
	        </tr>
	        <tr>
	            <td id="J_pic1">图片2:</td>
	            <td id="J_pic2">
	            	<input type="hidden" name="pic2"  id="pic2"/>
	            	<a href="javascript:void(0)" class="easyui-linkbutton onePicUpload">图片上传</a>
	            </td>
	        </tr>
	        <tr>
	            <td id="J_content1">内容:</td>
	            <td id="J_content2">
	                <textarea style="width:1000px;height:600px;visibility:hidden;" id="content" name="content"></textarea>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
var contentEditEditor ;
$(function(){
	contentEditEditor = TT.createEditor("#contentEditForm [name=content]");
	TT.initOnePicUpload();
	$("#contentEditForm [name=pic]").eq(1).remove();
	$("#photo a:eq(1)").remove();
});
var contentEditPage = {
		submitForm : function(){
			//手动进行校验
			var categoryId= document.getElementById("categoryId").value;
							var hiddentype;
				if(categoryId=="11"||categoryId=="12"){//此处是只有一个内容的情况（其中的内容标题是用来对此词条做描述用的） Lab introduction 实验室介绍+Research 
					
					hiddentype=0;//标题 内容
					
				}else if(categoryId=="18"){

				    hiddentype=1;
				}
				else if(categoryId=="14"){ //页眉logo
					hiddentype=3;//只显示一个图片
				
				}else if(categoryId=="15"||categoryId=="16"||categoryId=="17"){//sponsors  links
					
					hiddentype=4;//显示一个URL和显示一个图片
				
				}else if(categoryId>=29&&categoryId<=33){//出版物版面
					hiddentype=5;
				}
				if(hiddentype=="0"){//标题和内容
					if(document.getElementById("title").value==""){
						$.messager.alert('提示','表单还未填写完成!');
						return ;
					}
				}else if(hiddentype=="1"){//news的图片 日期 简介
					if(document.getElementById("title").value==""||document.getElementById("subTitle").value==""){
						$.messager.alert('提示','表单还未填写完成!');
						return ;
					}
					if(document.getElementById("pic").value==""){
						$.messager.alert('提示','请上传图片!');
						return ;

					}
					
				}else if(hiddentype=="2"){//单单两个图片

					
				}else if(hiddentype=="3"){// 只显示一个图片

					if(document.getElementById("pic").value==""){
						$.messager.alert('提示','请上传图片!');
						return ;

					}

				}else if(hiddentype=="4"){//显示一个标题和显示一个图片
				
					if(document.getElementById("url").value==""||document.getElementById("pic").value==""){
						$.messager.alert('提示','表单还未填写完成!');
						return ;
					}
				}else if(hiddentype==5){//出版物版面 控制title为数字

					var reg=new RegExp(/^[0-9]+$/);
					
					if(reg.test(document.getElementById("title").value)==false){
						$.messager.alert('提示',"序号应该为数字！");
						return ;
					}
				}
			
			contentEditEditor.sync();
			
			$.post("/content/edit",$("#contentEditForm").serialize(), function(data){
				
				if(data.status == 200){
					$("#contentList").datagrid("reload");
					TT.closeCurrentWindow();
					$.messager.alert('提示','编辑内容成功!');
				}
			});
		},
			clearForm : function(){
				$.messager.confirm('确认','确定重置所有内容吗？',function(r){
					if(r){
						$('#contentEditForm').form('reset');
						contentAddEditor.html('');
					}
				});
				
			}
		
};

</script>