<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="contentEditForm" class="itemForm" method="post">
		<input type="hidden" name="categoryId" id="categoryId"/>
		<input type="hidden" name="id" />
	    <table cellpadding="5">
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
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	/*
	* 注意:
	* 	给对应的Textarea创建kindeditor 名字不能相同,整个TT中共用的同一个命名空间,
	* 	对应的tab中也会命名重复导致开启kindeditor冲突
	*
	* */
$(function(){
	//如果是新闻页面则将内容的大小改为600
	TT.initOnePicUpload();
	$("#contentEditForm [name=pic]").eq(1).remove();
	$("#photo a:eq(1)").remove();
});
var contentEditPage = {
		submitForm : function(){
			$.post("/content/edit",$("#contentEditForm").serialize(), function(data){
				
				if(data.status == 200){
					$("#top_bac_pic_List").datagrid("reload");
					TT.closeCurrentWindow();
					$.messager.alert('提示','编辑内容成功!');
				}
			});
		},
			clearForm : function(){
				$.messager.confirm('确认','确定重置所有内容吗？',function(r){
					if(r){
						$('#contentEditForm').form('reset');
					}
				});
				
			}
		
};

</script>