<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="contentEditForm" class="itemForm" method="post">
		<input type="hidden" name="categoryId" id="categoryId"/>
		<input type="hidden" name="id" />
	    <table cellpadding="5">
			<tr >
				<td id="J_index1">序号:</td>
				<td id="J_index2"><input class="easyui-textbox" type="text" id="cIndex"  name="cIndex" data-options="required:true" style="width: 280px;"/></td>
			</tr>
			<tr>
				<td id="J_file1">文件:</td>
				<td id="J_file2">
					<input type="hidden" id="pic2" name="pic2" />
					<a href="javascript:void(0)" class="easyui-linkbutton oneFileUpload">文件上传</a>
				</td>
			</tr>
	        <tr>
	            <td id="J_content1">英文内容:</td>
	            <td id="J_content2">
	                <textarea style="width:1000px;height:400px;visibility:hidden;" id="content" name="content"></textarea>
	            </td>
	        </tr>
			<%--<tr>--%>
				<%--<td id="J_content_zh1">中文内容:</td>--%>
				<%--<td id="J_content_zh2">--%>
					<%--<textarea style="width:1000px;height:400px;visibility:hidden;" id="contentZhCn" name="contentZhCn"></textarea>--%>
				<%--</td>--%>
			<%--</tr>--%>
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
	var contentEditEditor ;
//	var contentZhCnEditEditor;
$(function(){
	contentEditEditor = TT.createEditor("#contentEditForm [name=content]");
//	contentZhCnEditEditor = TT.createEditor("#contentEditForm [name=contentZhCn]");
	TT.initOneFileUpload();
});
var contentEditPage = {
		submitForm : function(){

			contentEditEditor.sync();
//			contentZhCnEditEditor.sync();
			$.post("/content/edit",$("#contentEditForm").serialize(), function(data){
				
				if(data.status == 200){
					$("#pub_books_List").datagrid("reload");
					TT.closeCurrentWindow();
					$.messager.alert('提示','编辑内容成功!');
				}
			});
		},
			clearForm : function(){
				$.messager.confirm('确认','确定重置所有内容吗？',function(r){
					if(r){
						$('#contentEditForm').form('reset');
						contentEditEditor.html('');
//						contentZhCnEditEditor.html('');
					}
				});
				
			}
		
};

</script>