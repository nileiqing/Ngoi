<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="contentAddForm" class="itemForm" method="post">
		<input type="hidden" name="categoryId"  id="categoryId"/>
	    <table cellpadding="5">
			<tr>
				<td id="J_url1">URL:</td>
				<td id="J_url2"><input class="easyui-textbox" type="text" id="url" name="url" style="width: 280px;" value="http://"/></td>
			</tr>
			<tr>
				<td id="J_pic">图片:</td>
				<td id="photo">
					<input type="hidden" id="pic" name="pic" />
					<a href="javascript:void(0)" class="easyui-linkbutton onePicUpload">图片上传</a>
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
	$(function(){
		$("#contentAddForm [name=categoryId]").val(${categoryId});
		TT.initOnePicUpload();


	});
	
	var contentAddPage  = {
			submitForm : function (){
				$.post("/content/save",$("#contentAddForm").serialize(), function(data){
					if(data.status == 200){
    					$("#sponsors_List").datagrid("reload");
    					TT.closeCurrentWindow();
    					$.messager.alert('提示','新增内容成功!');
					}
				});
			},
			clearForm : function(){
				$('#contentAddForm').form('reset');
			}
	};
</script>
