/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-07 07:17:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<div class=\"easyui-panel\" title=\"Nested Panel\" data-options=\"width:'100%',minHeight:500,noheader:true,border:false\" style=\"padding:10px;\">\n");
      out.write("    <div class=\"easyui-layout\" data-options=\"fit:true\">\n");
      out.write("        <div data-options=\"region:'west',split:false\" style=\"width:250px;padding:5px\">\n");
      out.write("            <ul id=\"contentCategoryTree\" class=\"easyui-tree\" data-options=\"url:'/content/category/list',animate: true,method : 'GET'\">\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div data-options=\"region:'center'\" style=\"padding:5px\">\n");
      out.write("            <table class=\"easyui-datagrid\" id=\"contentList\" data-options=\"toolbar:contentListToolbar,singleSelect:false,collapsible:true,pagination:true,method:'get',pageSize:20,url:'/content/query/list',queryParams:{categoryId:0}\">\n");
      out.write("\t\t    <thead>\n");
      out.write("\t\t        <tr>\n");
      out.write("\t\t            <th data-options=\"field:'id',width:30\">ID</th>\n");
      out.write("\t\t\t\t\t<th data-options=\"field:'cIndex',width:30\">序号</th>\n");
      out.write("\t\t            <th data-options=\"field:'title',width:120\">内容标题</th>\n");
      out.write("\t\t            <th data-options=\"field:'subTitle',width:100\">内容子标题</th>\n");
      out.write("\t\t            <th data-options=\"field:'titleDesc',width:120\">内容描述</th>\n");
      out.write("\t\t            <!-- <th data-options=\"field:'url',width:60,align:'center',formatter:TAOTAO.formatUrl\">内容连接</th> -->\n");
      out.write("\t\t            <th data-options=\"field:'pic',width:50,align:'center',formatter:TAOTAO.formatUrl\">图片</th>\n");
      out.write("\t\t            <th data-options=\"field:'pic2',width:50,align:'center',formatter:TAOTAO.formatUrl\">图片2</th>\n");
      out.write("\t\t            <th data-options=\"field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime\">创建日期</th>\n");
      out.write("\t\t            <th data-options=\"field:'updated',width:130,align:'center',formatter:TAOTAO.formatDateTime\">更新日期</th>\n");
      out.write("\t\t        </tr>\n");
      out.write("\t\t    </thead>\n");
      out.write("\t\t</table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//去的显示页面的样式，并进行渲染\n");
      out.write("var getpagemodel = function(categoryId){\n");
      out.write("\tvar hiddentype;\n");
      out.write("\tif(categoryId==\"11\"||categoryId==\"12\"||(categoryId>=19&&categoryId<=28)||categoryId==\"34\"||categoryId==\"35\"||categoryId==\"8\"||categoryId==\"9\"){//此处是只有一个内容的情况（其中的内容标题是用来对此词条做描述用的） Lab introduction 实验室介绍+Research 也做成员介绍处的显示 34、35为Event模块 8为Activities模块 9为Open Position模块\n");
      out.write("\t\t\t\n");
      out.write("\t\thiddentype=0;//标题 内容\n");
      out.write("\t\t\t\t\n");
      out.write("\t}else if(categoryId==\"18\"){//news的图片日期简介\n");
      out.write("\n");
      out.write("\t\thiddentype=1;\n");
      out.write("\t}else if(categoryId==\"14\"||categoryId==\"15\"){ //页眉logo\n");
      out.write("\n");
      out.write("\t\thiddentype=3;//只显示一个图片\n");
      out.write("\t\t\t\n");
      out.write("\t}else if(categoryId==\"16\"||categoryId==\"17\"){//sponsors  links\n");
      out.write("\t\t\t\t\n");
      out.write("\t\thiddentype=4;//显示一个URL和显示一个图片\n");
      out.write("\t\t\t\n");
      out.write("\t}else if(categoryId==\"5\"){//显示 标题 Url 内容 研究项目使用\n");
      out.write("\t\thiddentype=5;\n");
      out.write("\t}else if(categoryId==\"10\"){\n");
      out.write("\t\thiddentype=6;\n");
      out.write("\t}else if(categoryId>=29&&categoryId<=33){//显示序号和内容\n");
      out.write("\t\thiddentype=7;\n");
      out.write("\t}\n");
      out.write("\tif(hiddentype==\"0\"){//只显示标题和内容\n");
      out.write("\t\t\tif(categoryId==\"8\"||categoryId==\"9\"){\n");
      out.write("\t\t\t\t$(\"#J_title1\").html(\"标题\");\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$(\"#J_title1\").html(\"内容描述（不显示）\");\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t document.getElementById(\"J_pic\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"photo\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index2\").style.display=\"none\";\n");
      out.write("\t\t}else if(hiddentype==\"1\"){//news的图片 日期 简介\n");
      out.write("\t\t\t$(\"#J_title1\").html(\"标题\");\n");
      out.write("\t\t\t$(\"#J_subTitle1\").html(\"日期\");\n");
      out.write("\t\t\t$(\"#J_titleDesc1\").html(\"内容简述\");\n");
      out.write("\t\t\t document.getElementById(\"J_url1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index2\").style.display=\"none\";\n");
      out.write("\t\t}else if(hiddentype==\"2\"){//单单两个图片\n");
      out.write("\t\t\t document.getElementById(\"J_title1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_title2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_content1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_content2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index2\").style.display=\"none\";\n");
      out.write("\t\t}else if(hiddentype==\"3\"){// 只显示一个图片 （首页ｌｏｇｏ用）\n");
      out.write("\t\t\tdocument.getElementById(\"J_title1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_title2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_content1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_content2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index2\").style.display=\"none\";\n");
      out.write("\t\t}else if(hiddentype==\"4\"){//显示一个URL和显示一个图片（sponsors 和 links使用）\n");
      out.write("\t\t\tdocument.getElementById(\"J_title1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_title2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_content1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_content2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index2\").style.display=\"none\";\n");
      out.write("\t\t}else if(hiddentype==\"5\"){//标题 URL　内容　　　研究项目\n");
      out.write("\t\t\t $(\"#J_title1\").html(\"标题\");\n");
      out.write("\t\t\t document.getElementById(\"J_pic\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"photo\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic2\").style.display=\"none\";\n");
      out.write("\t\t}else if(hiddentype==\"6\"){//只显示内容 Contact用\n");
      out.write("\t\t\tdocument.getElementById(\"J_pic\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"photo\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_title1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_title2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_index2\").style.display=\"none\";\n");
      out.write("\t\t}else if(hiddentype==\"7\"){//显示序号和内容 Publication\n");
      out.write("\t\t\t document.getElementById(\"J_title1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_title2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"photo\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_titleDesc2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_subTitle2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_url2\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic1\").style.display=\"none\";\n");
      out.write("\t\t\t document.getElementById(\"J_pic2\").style.display=\"none\";\n");
      out.write("\t\t}\n");
      out.write("};\n");
      out.write("$(function(){\n");
      out.write("\tvar tree = $(\"#contentCategoryTree\");\n");
      out.write("\tvar datagrid = $(\"#contentList\");\n");
      out.write("\ttree.tree({\n");
      out.write("\t\tonClick : function(node){\n");
      out.write("\t\t\tif(tree.tree(\"isLeaf\",node.target)){\n");
      out.write("\t\t\t\tdatagrid.datagrid('reload', {\n");
      out.write("\t\t\t\t\tcategoryId :node.id\n");
      out.write("\t\t        });\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar datagridinit=function(){\n");
      out.write("\t\t\t\tvar option1=datagrid.datagrid('getColumnOption', 'titleDesc');\n");
      out.write("\t\t\t\tvar option2=datagrid.datagrid('getColumnOption', 'subTitle');\n");
      out.write("\t\t\t\tvar option3=datagrid.datagrid('getColumnOption', 'title');\n");
      out.write("\t\t\t\toption1.title = \"内容描述\";\n");
      out.write("\t\t\t\toption2.title = \"内容子标题\";\n");
      out.write("\t\t\t\toption3.title = \"内容标题\";\n");
      out.write("\t\t\t\tdatagrid.datagrid();\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\tdatagridinit();\n");
      out.write("\t\t\t/*综述：一共是内容页面显示的有8栏，数据库中有11栏（1、URL 2、Content 3、category-id 不进行显示） 8栏中的 ID　created　updated　都不进行变化　所以只剩下５栏：\n");
      out.write("\t\t\t\t是否显示进行变化需要不断的进行赋值，\n");
      out.write("\t\t\t\t是否需要更换标题的名字也是需要不断的进行赋值。\n");
      out.write("\t\t\t\tvar logocid=14;//logo对应的categoryid;\n");
      out.write("\t\t\t\tvar baccid=15;//导航栏背景图片对应的categoryid;\n");
      out.write("\t\t\t\tvar labinfocid=11;//导航栏背景图片对应的categoryid;\n");
      out.write("\t\t\t\tvar resthcid=12;//研究课题的对应categoryid\n");
      out.write("\t\t\t\tvar sponsorscid=16;//赞助商的对应categoryid\n");
      out.write("\t\t\t\tvar linkscid=17;//链接的对应categoryid\n");
      out.write("\t\t\t\tvar innewcid=18;//首页新闻对应的categoryid\n");
      out.write("\t\t\t\t*/\n");
      out.write("\t\t\tvar categoryId=node.id;\n");
      out.write("\t\t\tvar hiddentype;\n");
      out.write("\t\t\tif(categoryId==\"11\"||categoryId==\"12\"||categoryId==\"6\"||categoryId==\"7\"||categoryId==\"8\"||categoryId==\"9\"||categoryId==\"34\"||categoryId==\"35\"){//此处是只有一个内容的情况（其中的内容标题是用来对此词条做描述用的） Lab introduction 实验室介绍+Research thrusts研究课题  Publication Events Activities都用到\n");
      out.write("\t\t\t\tvar option1=datagrid.datagrid('getColumnOption', 'title');\n");
      out.write("\t\t\t\tif(categoryId==\"11\"){//显示的内容栏里边的标题名字进行更改\n");
      out.write("\t\t\t\t\toption1.title = \"Lab introction\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(categoryId==\"12\"){\n");
      out.write("\t\t\t\t\toption1.title = \"Research thrusts\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(categoryId==\"6\"||categoryId==\"7\"){\n");
      out.write("\t\t\t\t\toption1.title = \"内容描述\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tdatagrid.datagrid();\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'cIndex');//隐藏序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic');//隐藏第一个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'title');//显示对应的标题\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'subTitle');//隐藏副标题\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}else if(categoryId==\"18\"){//title subtitle（存放日期） pic content 用来显示首页的新闻信息\n");
      out.write("\t\t\t\tvar option2=datagrid.datagrid('getColumnOption', 'subTitle');//副标题 存放 日期\n");
      out.write("\t\t\t\tvar option3=datagrid.datagrid('getColumnOption', 'pic');\n");
      out.write("\t\t\t\toption2.title = \"Datatime\";\n");
      out.write("\t\t\t\toption3.title = \"Pic\";\n");
      out.write("\t\t\t\tdatagrid.datagrid();\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'cIndex');//隐藏序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'titleDesc');//隐藏标题详述\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'pic');//显示第一个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'title');//显示对应的标题\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'subTitle');//显示副标题\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}else if(categoryId==\"14\"||categoryId==\"15\"||categoryId==\"16\"||categoryId==\"17\"){//只有一个图片（但是编辑中有URL）\n");
      out.write("\t\t\t\tdatagrid.datagrid();\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'cIndex');//隐藏序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'pic');//显示第一个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'title');//显示对应的标题\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'subTitle');//显示副标题\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}else if(categoryId>=19&&categoryId<=28){\n");
      out.write("\t\t\t//此处为成员介绍，因为有模板所以只显示标题即可\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'cIndex');//隐藏序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic');//隐藏第一个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'title');//显示对应的标题\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'subTitle');//隐藏副标题\n");
      out.write("\t\t\t}else if(categoryId==\"10\"){//contact内容\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'cIndex');//隐藏序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic');//隐藏第一个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'title');//隐藏对应的标题\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'subTitle');//隐藏副标题\n");
      out.write("\t\t\t}else if(categoryId>=29&&categoryId<=33){//出版物方面带序号的\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'cIndex');//显示序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic');//隐藏第一个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'title');//显示对应的标题\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'subTitle');//隐藏副标题\n");
      out.write("\t\t\t}else if(categoryId==\"5\"){//Research板块 只显示 标题、序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'cIndex');//显示序号\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'titleDesc');//隐藏标题详述\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic');//隐藏第一个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'pic2');//隐藏对第二个图片\n");
      out.write("\t\t\t\tdatagrid.datagrid('showColumn', 'title');//显示对应的标题\n");
      out.write("\t\t\t\tdatagrid.datagrid('hideColumn', 'subTitle');//隐藏副标题\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("var contentListToolbar = [{\n");
      out.write("    text:'新增',\n");
      out.write("    iconCls:'icon-add',\n");
      out.write("    handler:function(){\n");
      out.write("    \tvar node = $(\"#contentCategoryTree\").tree(\"getSelected\");\n");
      out.write("    \tif(!node || !$(\"#contentCategoryTree\").tree(\"isLeaf\",node.target)){\n");
      out.write("    \t\t$.messager.alert('提示','新增内容必须选择一个内容分类!');\n");
      out.write("    \t\treturn ;\n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("TT.createWindow({\n");
      out.write("\turl : \"/content-add\",\n");
      out.write("\tonLoad : function(){\n");
      out.write("\t\t//综述：再新增和编辑页中7*2 共14个条目\n");
      out.write("\t\tvar categoryId= $(\"#contentCategoryTree\").tree(\"getSelected\").id;\n");
      out.write("\t\tgetpagemodel(categoryId);//调取显示页面，并进行渲染\n");
      out.write("\t}\n");
      out.write("\t\t}); \n");
      out.write("    }\n");
      out.write("},{\n");
      out.write("    text:'编辑',\n");
      out.write("    iconCls:'icon-edit',\n");
      out.write("    handler:function(){\n");
      out.write("    \tvar ids = TT.getSelectionsIds(\"#contentList\");\n");
      out.write("    \tif(ids.length == 0){\n");
      out.write("    \t\t$.messager.alert('提示','必须选择一个内容才能编辑!');\n");
      out.write("    \t\treturn ;\n");
      out.write("    \t}\n");
      out.write("    \tif(ids.indexOf(',') > 0){\n");
      out.write("    \t\t$.messager.alert('提示','只能选择一个内容!');\n");
      out.write("    \t\treturn ;\n");
      out.write("    \t}\n");
      out.write("\t\tTT.createWindow({\n");
      out.write("\t\t\turl : \"/content-edit\",\n");
      out.write("\t\t\tonLoad : function(){\n");
      out.write("\t\t\t\tvar data = $(\"#contentList\").datagrid(\"getSelections\")[0];\n");
      out.write("\t\t\t\t$(\"#contentEditForm\").form(\"load\",data);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t// 实现图片\n");
      out.write("\t\t\t\tif(data.pic){\n");
      out.write("\t\t\t\t\t$(\"#contentEditForm [name=pic]\").after(\"<a href='\"+data.pic+\"' target='_blank'><img src='\"+data.pic+\"' width='80' height='50'/></a>\");\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(data.pic2){\n");
      out.write("\t\t\t\t\t$(\"#contentEditForm [name=pic2]\").after(\"<a href='\"+data.pic2+\"' target='_blank'><img src='\"+data.pic2+\"' width='80' height='50'/></a>\");\t\t\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar categoryId= document.getElementById(\"categoryId\").value;\n");
      out.write("\t\t\t\tgetpagemodel(categoryId);//调取显示页面，并进行渲染\n");
      out.write("\t\t\t\tcontentEditEditor.html(data.content);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});    \t\n");
      out.write("    }\n");
      out.write("},{\n");
      out.write("    text:'删除',\n");
      out.write("    iconCls:'icon-cancel',\n");
      out.write("    handler:function(){\n");
      out.write("    \tvar ids = TT.getSelectionsIds(\"#contentList\");\n");
      out.write("    \tif(ids.length == 0){\n");
      out.write("    \t\t$.messager.alert('提示','未选中内容!');\n");
      out.write("    \t\treturn ;\n");
      out.write("    \t}\n");
      out.write("    \t$.messager.confirm('确认','确定删除ID为 '+ids+' 的内容吗？',function(r){\n");
      out.write("    \t    if (r){\n");
      out.write("    \t    \tvar params = {\"ids\":ids};\n");
      out.write("            \t$.post(\"/content/delete\",params, function(data){\n");
      out.write("        \t\t\tif(data.status == 200){\n");
      out.write("        \t\t\t\t$.messager.alert('提示','删除内容成功!',undefined,function(){\n");
      out.write("        \t\t\t\t\t$(\"#contentList\").datagrid(\"reload\");\n");
      out.write("        \t\t\t\t});\n");
      out.write("        \t\t\t}\n");
      out.write("        \t\t});\n");
      out.write("    \t    }\n");
      out.write("    \t});\n");
      out.write("    }\n");
      out.write("}];\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
