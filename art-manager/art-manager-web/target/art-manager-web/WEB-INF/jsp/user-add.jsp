<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="adduserForm" class="itemForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>用户名:</td>
	            <td><input class="easyui-textbox" type="text" name="username" id="username"  data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>密码:</td>
	            <td><input class="easyui-textbox" type="password" name="password" id="password" data-options="required:true" style="width: 280px;" ></input></td>
	        </tr>
	         <tr>
	            <td>确认密码:</td>
	            <td><input class="easyui-textbox" type="password" name="surepwd" id="surepwd" data-options="required:true"style="width: 280px;" ></input></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="adduserPage.submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="adduserPage.clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
var adduserPage = {
		submitForm : function(){
			if(!$('#adduserForm').form('validate')){
				$.messager.alert('提示','表单还未填写完成!');
				return ;
			}
			if($('#password').val()!=$('#surepwd').val()){
				$.messager.alert('提示','两次密码输入不一致!');
				return ;
			}
			$.post("/adduser",$("#adduserForm").serialize(), function(data){
				
				if(data.status == 200){
					$("#contentList").datagrid("reload");
					TT.closeCurrentWindow();
					$.messager.alert('提示','添加人员成功!');
				}
				else if(data.status == 300){
					$.messager.alert('提示','用户名已存在!');
				}
				else
					$.messager.alert('提示','添加人员失败!');
			});
		},
		clearForm : function(){
			$('#adduserForm').form('clear');
		}	
};
</script>
