<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="easyui-panel" title="Nested Panel" data-options="width:'100%',minHeight:500,noheader:true,border:false" style="padding:10px;">
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'west',split:false" style="width:250px;padding:5px">
            <ul id="contentCategoryTree" class="easyui-tree" data-options="url:'/content/category/list',animate: true,method : 'GET'">
            </ul>
        </div>
        <div data-options="region:'center'" style="padding:5px">
            <table class="easyui-datagrid" id="contentList" data-options="toolbar:contentListToolbar,singleSelect:false,collapsible:true,pagination:true,method:'get',pageSize:20,url:'/content/query/list',queryParams:{categoryId:0}">
		    <thead>
		        <tr>
		            <th data-options="field:'id',width:30">ID</th>
		            <th data-options="field:'title',width:120">内容标题</th>
		            <th data-options="field:'subTitle',width:100">内容子标题</th>
		            <th data-options="field:'titleDesc',width:120">内容描述</th>
		            <!-- <th data-options="field:'url',width:60,align:'center',formatter:TAOTAO.formatUrl">内容连接</th> -->
		            <th data-options="field:'pic',width:50,align:'center',formatter:TAOTAO.formatUrl">图片</th>
		            <th data-options="field:'pic2',width:50,align:'center',formatter:TAOTAO.formatUrl">图片2</th>
		            <th data-options="field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建日期</th>
		            <th data-options="field:'updated',width:130,align:'center',formatter:TAOTAO.formatDateTime">更新日期</th>
		        </tr>
		    </thead>
		</table>
        </div>
    </div>
</div>
<script type="text/javascript">
//去的显示页面的样式，并进行渲染
var getpagemodel = function(categoryId){
	var hiddentype;
	if(categoryId=="11"||categoryId=="12"||(categoryId>=19&&categoryId<=28)||(categoryId>=29&&categoryId<=33)||categoryId=="34"||categoryId=="35"||categoryId=="8"||categoryId=="9"){//此处是只有一个内容的情况（其中的内容标题是用来对此词条做描述用的） Lab introduction 实验室介绍+Research 也做成员介绍处的显示 34、35为Event模块 8为Activities模块 9为Open Position模块
			
		hiddentype=0;//标题 内容
				
	}else if(categoryId=="18"){//news的图片日期简介

		hiddentype=1;
	}else if(categoryId=="14"||categoryId=="15"){ //页眉logo

		hiddentype=3;//只显示一个图片
			
	}else if(categoryId=="16"||categoryId=="17"){//sponsors  links
				
		hiddentype=4;//显示一个URL和显示一个图片
			
	}else if(categoryId=="5"){//显示 标题 Url 内容 研究项目使用
		hiddentype=5;
	}else if(categoryId=="10"){
		hiddentype=6;
	}
	if(hiddentype=="0"){//只显示标题和内容
			if(categoryId=="8"||categoryId=="9"){
				$("#J_title1").html("标题");
			}else{
				$("#J_title1").html("内容描述（不显示）");	
			}
			 document.getElementById("J_pic").style.display="none";
			 document.getElementById("photo").style.display="none";
			 document.getElementById("J_titleDesc1").style.display="none";
			 document.getElementById("J_titleDesc2").style.display="none";
			 document.getElementById("J_subTitle1").style.display="none";
			 document.getElementById("J_subTitle2").style.display="none";
			 document.getElementById("J_url1").style.display="none";
			 document.getElementById("J_url2").style.display="none";
			 document.getElementById("J_pic1").style.display="none";
			 document.getElementById("J_pic2").style.display="none";
		}else if(hiddentype=="1"){//news的图片 日期 简介
			$("#J_title1").html("标题");
			$("#J_subTitle1").html("日期");
			$("#J_titleDesc1").html("内容简述");
			 document.getElementById("J_url1").style.display="none";
			 document.getElementById("J_url2").style.display="none";
			 document.getElementById("J_pic1").style.display="none";
			 document.getElementById("J_pic2").style.display="none";
		}else if(hiddentype=="2"){//单单两个图片
			document.getElementById("J_title1").style.display="none";
			 document.getElementById("J_title2").style.display="none";
			 document.getElementById("J_titleDesc1").style.display="none";
			 document.getElementById("J_titleDesc2").style.display="none";
			 document.getElementById("J_subTitle1").style.display="none";
			 document.getElementById("J_subTitle2").style.display="none";
			 document.getElementById("J_url1").style.display="none";
			 document.getElementById("J_url2").style.display="none";
			 document.getElementById("J_content1").style.display="none";
			 document.getElementById("J_content2").style.display="none";
		}else if(hiddentype=="3"){// 只显示一个图片 （首页ｌｏｇｏ用）
			document.getElementById("J_title1").style.display="none";
			 document.getElementById("J_title2").style.display="none";
			 document.getElementById("J_titleDesc1").style.display="none";
			 document.getElementById("J_titleDesc2").style.display="none";
			 document.getElementById("J_subTitle1").style.display="none";
			 document.getElementById("J_subTitle2").style.display="none";
			 document.getElementById("J_url1").style.display="none";
			 document.getElementById("J_url2").style.display="none";
			 document.getElementById("J_pic1").style.display="none";
			 document.getElementById("J_pic2").style.display="none";
			 document.getElementById("J_content1").style.display="none";
			 document.getElementById("J_content2").style.display="none";
		}else if(hiddentype=="4"){//显示一个URL和显示一个图片（sponsors 和 links使用）
			document.getElementById("J_title1").style.display="none";
			 document.getElementById("J_title2").style.display="none";
			 document.getElementById("J_titleDesc1").style.display="none";
			 document.getElementById("J_titleDesc2").style.display="none";
			 document.getElementById("J_subTitle1").style.display="none";
			 document.getElementById("J_subTitle2").style.display="none";
			 document.getElementById("J_pic1").style.display="none";
			 document.getElementById("J_pic2").style.display="none";
			 document.getElementById("J_content1").style.display="none";
			 document.getElementById("J_content2").style.display="none";
		}else if(hiddentype=="5"){//标题 URL　内容　　　研究项目
			 $("#J_title1").html("标题");
			 document.getElementById("J_pic").style.display="none";
			 document.getElementById("photo").style.display="none";
			 document.getElementById("J_titleDesc1").style.display="none";
			 document.getElementById("J_titleDesc2").style.display="none";
			 document.getElementById("J_subTitle1").style.display="none";
			 document.getElementById("J_subTitle2").style.display="none";
			 document.getElementById("J_pic1").style.display="none";
			 document.getElementById("J_pic2").style.display="none";
		}else if(hiddentype=="6"){//只显示内容 Contact用
			document.getElementById("J_pic").style.display="none";
			 document.getElementById("photo").style.display="none";
			 document.getElementById("J_title1").style.display="none";
			 document.getElementById("J_title2").style.display="none";
			 document.getElementById("J_titleDesc1").style.display="none";
			 document.getElementById("J_titleDesc2").style.display="none";
			 document.getElementById("J_subTitle1").style.display="none";
			 document.getElementById("J_subTitle2").style.display="none";
			 document.getElementById("J_url1").style.display="none";
			 document.getElementById("J_url2").style.display="none";
			 document.getElementById("J_pic1").style.display="none";
			 document.getElementById("J_pic2").style.display="none";
		}
};
$(function(){
	var tree = $("#contentCategoryTree");
	var datagrid = $("#contentList");
	tree.tree({
		onClick : function(node){
			if(tree.tree("isLeaf",node.target)){
				datagrid.datagrid('reload', {
					categoryId :node.id
		        });
			}
			var datagridinit=function(){
				var option1=datagrid.datagrid('getColumnOption', 'titleDesc');
				var option2=datagrid.datagrid('getColumnOption', 'subTitle');
				var option3=datagrid.datagrid('getColumnOption', 'title');
				option1.title = "内容描述";
				option2.title = "内容子标题";
				option3.title = "内容标题";
				datagrid.datagrid();
			};
			datagridinit();
			/*综述：一共是内容页面显示的有8栏，数据库中有11栏（1、URL 2、Content 3、category-id 不进行显示） 8栏中的 ID　created　updated　都不进行变化　所以只剩下５栏：
				是否显示进行变化需要不断的进行赋值，
				是否需要更换标题的名字也是需要不断的进行赋值。
				var logocid=14;//logo对应的categoryid;
				var baccid=15;//导航栏背景图片对应的categoryid;
				var labinfocid=11;//导航栏背景图片对应的categoryid;
				var resthcid=12;//研究课题的对应categoryid
				var sponsorscid=16;//赞助商的对应categoryid
				var linkscid=17;//链接的对应categoryid
				var innewcid=18;//首页新闻对应的categoryid
				*/
			var categoryId=node.id;
			var hiddentype;
			if(categoryId=="11"||categoryId=="12"||categoryId=="5"||categoryId=="6"||categoryId=="7"||categoryId=="8"||categoryId=="9"||categoryId=="34"||categoryId=="35"){//此处是只有一个内容的情况（其中的内容标题是用来对此词条做描述用的） Lab introduction 实验室介绍+Research thrusts研究课题  Publication Events Activities都用到
				var option1=datagrid.datagrid('getColumnOption', 'title');
				if(categoryId=="11"){//显示的内容栏里边的标题名字进行更改
					option1.title = "Lab introction";
				}
				if(categoryId=="12"){
					option1.title = "Research thrusts";
				}
				if(categoryId=="6"||categoryId=="7"){
					option1.title = "内容描述";
				}
				datagrid.datagrid();
				datagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述
				datagrid.datagrid('hideColumn', 'pic');//隐藏第一个图片
				datagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片
				datagrid.datagrid('showColumn', 'title');//显示对应的标题
				datagrid.datagrid('hideColumn', 'subTitle');//隐藏副标题
				
			}else if(categoryId=="18"){//title subtitle（存放日期） pic content 用来显示首页的新闻信息
				var option2=datagrid.datagrid('getColumnOption', 'subTitle');//副标题 存放 日期
				var option3=datagrid.datagrid('getColumnOption', 'pic');
				option2.title = "Datatime";
				option3.title = "Pic";
				datagrid.datagrid();
				datagrid.datagrid('showColumn', 'titleDesc');//隐藏标题详述
				datagrid.datagrid('showColumn', 'pic');//显示第一个图片
				datagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片
				datagrid.datagrid('showColumn', 'title');//显示对应的标题
				datagrid.datagrid('showColumn', 'subTitle');//显示副标题
				
			}else if(categoryId=="14"||categoryId=="15"||categoryId=="16"||categoryId=="17"){//只有一个图片（但是编辑中有URL）
				datagrid.datagrid();
				datagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述
				datagrid.datagrid('showColumn', 'pic');//显示第一个图片
				datagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片
				datagrid.datagrid('hideColumn', 'title');//显示对应的标题
				datagrid.datagrid('hideColumn', 'subTitle');//显示副标题
				
			}else if(categoryId>=19&&categoryId<=28){
			//此处为成员介绍，因为有模板所以只显示标题即可
				datagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述
				datagrid.datagrid('hideColumn', 'pic');//显示第一个图片
				datagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片
				datagrid.datagrid('showColumn', 'title');//显示对应的标题
				datagrid.datagrid('hideColumn', 'subTitle');//显示副标题
			}else if(categoryId=="10"){
				datagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述
				datagrid.datagrid('hideColumn', 'pic');//显示第一个图片
				datagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片
				datagrid.datagrid('hideColumn', 'title');//显示对应的标题
				datagrid.datagrid('hideColumn', 'subTitle');//显示副标题
			}
			
				
			
		}
	});
});
var contentListToolbar = [{
    text:'新增',
    iconCls:'icon-add',
    handler:function(){
    	var node = $("#contentCategoryTree").tree("getSelected");
    	if(!node || !$("#contentCategoryTree").tree("isLeaf",node.target)){
    		$.messager.alert('提示','新增内容必须选择一个内容分类!');
    		return ;
    	}

TT.createWindow({
	url : "/content-add",
	onLoad : function(){
		//综述：再新增和编辑页中7*2 共14个条目
		var categoryId= $("#contentCategoryTree").tree("getSelected").id;
		getpagemodel(categoryId);//调取显示页面，并进行渲染
	}
		}); 
    }
},{
    text:'编辑',
    iconCls:'icon-edit',
    handler:function(){
    	var ids = TT.getSelectionsIds("#contentList");
    	if(ids.length == 0){
    		$.messager.alert('提示','必须选择一个内容才能编辑!');
    		return ;
    	}
    	if(ids.indexOf(',') > 0){
    		$.messager.alert('提示','只能选择一个内容!');
    		return ;
    	}
		TT.createWindow({
			url : "/content-edit",
			onLoad : function(){
				var data = $("#contentList").datagrid("getSelections")[0];
				$("#contentEditForm").form("load",data);
				
				// 实现图片
				if(data.pic){
					$("#contentEditForm [name=pic]").after("<a href='"+data.pic+"' target='_blank'><img src='"+data.pic+"' width='80' height='50'/></a>");	
				}
				if(data.pic2){
					$("#contentEditForm [name=pic2]").after("<a href='"+data.pic2+"' target='_blank'><img src='"+data.pic2+"' width='80' height='50'/></a>");					
				}
				var categoryId= document.getElementById("categoryId").value;
				getpagemodel(categoryId);//调取显示页面，并进行渲染
				contentEditEditor.html(data.content);
			}
		});    	
    }
},{
    text:'删除',
    iconCls:'icon-cancel',
    handler:function(){
    	var ids = TT.getSelectionsIds("#contentList");
    	if(ids.length == 0){
    		$.messager.alert('提示','未选中内容!');
    		return ;
    	}
    	$.messager.confirm('确认','确定删除ID为 '+ids+' 的内容吗？',function(r){
    	    if (r){
    	    	var params = {"ids":ids};
            	$.post("/content/delete",params, function(data){
        			if(data.status == 200){
        				$.messager.alert('提示','删除内容成功!',undefined,function(){
        					$("#contentList").datagrid("reload");
        				});
        			}
        		});
    	    }
    	});
    }
}];


</script>