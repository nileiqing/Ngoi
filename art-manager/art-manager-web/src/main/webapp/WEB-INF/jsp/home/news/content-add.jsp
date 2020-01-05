<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="contentAddForm" class="itemForm" method="post">
		<input type="hidden" name="categoryId"  id="categoryId"/>
	    <table cellpadding="5">
			<tr >
				<td id="J_title1">内容标题:</td>
				<td id="J_title2"><input class="easyui-textbox" type="text" id="title"  name="title" data-options="required:true" style="width: 280px;"/></td>
			</tr>
			<tr>
				<td id="J_subTitle1">日期:</td>
				<td id="J_subTitle2"><input class="easyui-textbox" type="text" id="subTitle" name="subTitle" style="width: 280px;"/></td>
			</tr>
			<tr>
				<td id="J_titleDesc1">内容简介:</td>
				<td id="J_titleDesc2"><input class="easyui-textbox" name="titleDesc" id="titleDesc" data-options="multiline:true,validType:'length[0,300]'" style="height:60px;width: 280px;"/>
				</td>
			</tr>
			<tr>
				<td id="J_pic">图片:</td>
				<td id="photo">
					<input type="hidden" id="pic" name="pic" />
					<a href="javascript:void(0)" class="easyui-linkbutton onePicUpload">图片上传</a>
				</td>
			</tr>
			<tr>
				<td id="J_content1">内容:</td>
				<td id="J_content2">
					<textarea style="width:1000px;height:400px;visibility:hidden;" id="content" name="content"></textarea>
				</td>
			</tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentAddPage.submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentAddPage.clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	var contentAddEditor ;
	$(function(){
		$("#contentAddForm [name=categoryId]").val(${categoryId});
		contentAddEditor = TT.createEditor("#contentAddForm [name=content]");
		TT.initOnePicUpload();
		TT.initOneFileUpload();


	});
	
	var contentAddPage  = {
			submitForm : function (){
				contentAddEditor.sync();
				$.post("/content/save",$("#contentAddForm").serialize(), function(data){
					if(data.status == 200){
    					$("#news_en_List").datagrid("reload");
    					TT.closeCurrentWindow();
    					$.messager.alert('提示','新增内容成功!');
					}
				});
			},
			clearForm : function(){
				$('#contentAddForm').form('reset');
				contentAddEditor.html('');
			}
	};
</script>
