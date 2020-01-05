/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-03 01:35:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.research;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div data-options=\"region:'center'\" style=\"padding:5px\">\n");
      out.write("            <table class=\"easyui-datagrid\" id=\"research_List\" data-options=\"toolbar:contentListToolbar,singleSelect:false,collapsible:true,pagination:true,method:'get',pageSize:20,url:'/content/query/list',queryParams:{categoryId:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoryId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("}\">\n");
      out.write("\t\t    <thead>\n");
      out.write("\t\t        <tr>\n");
      out.write("\t\t            <th data-options=\"field:'title',width:550\">内容标题</th>\n");
      out.write("\t\t            <th data-options=\"field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime\">创建日期</th>\n");
      out.write("\t\t            <th data-options=\"field:'updated',width:130,align:'center',formatter:TAOTAO.formatDateTime\">更新日期</th>\n");
      out.write("\t\t        </tr>\n");
      out.write("\t\t    </thead>\n");
      out.write("\t\t</table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\n");
      out.write("});\n");
      out.write("var contentListToolbar = [{\n");
      out.write("    text:'新增',\n");
      out.write("    iconCls:'icon-add',\n");
      out.write("    handler:function(){\n");
      out.write("    \tvar node = $(\"#mainContentCategoryTree\").tree(\"getSelected\");\n");
      out.write("    \tif(!node || !$(\"#mainContentCategoryTree\").tree(\"isLeaf\",node.target)){\n");
      out.write("    \t\t$.messager.alert('提示','新增内容必须选择一个内容分类!');\n");
      out.write("    \t\treturn ;\n");
      out.write("    \t}\n");
      out.write("//此处的path对应的是home/labinfo\n");
      out.write("TT.createWindow({\n");
      out.write("\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/content-add?categoryId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoryId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\",\n");
      out.write("\tonLoad : function(){\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t\t}); \n");
      out.write("    }\n");
      out.write("},{\n");
      out.write("    text:'编辑',\n");
      out.write("    iconCls:'icon-edit',\n");
      out.write("    handler:function(){\n");
      out.write("    \tvar ids = TT.getSelectionsIds(\"#research_List\");\n");
      out.write("    \tif(ids.length == 0){\n");
      out.write("    \t\t$.messager.alert('提示','必须选择一个内容才能编辑!');\n");
      out.write("    \t\treturn ;\n");
      out.write("    \t}\n");
      out.write("    \tif(ids.indexOf(',') > 0){\n");
      out.write("    \t\t$.messager.alert('提示','只能选择一个内容!');\n");
      out.write("    \t\treturn ;\n");
      out.write("    \t}\n");
      out.write("\t\tTT.createWindow({\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/content-edit\",\n");
      out.write("\t\t\tonLoad : function(){\n");
      out.write("\t\t\t\tvar data = $(\"#research_List\").datagrid(\"getSelections\")[0];\n");
      out.write("\t\t\t\t$(\"#contentEditForm\").form(\"load\",data);\n");
      out.write("\t\t\t\t// 实现图片\n");
      out.write("\t\t\t\tif(data.pic){\n");
      out.write("\t\t\t\t\t$(\"#contentEditForm [name=pic]\").after(\"<a href='\"+data.pic+\"' target='_blank'><img src='\"+data.pic+\"' width='80' height='50'/></a>\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(data.pic2){\n");
      out.write("\t\t\t\t\t$(\"#contentEditForm [name=pic2]\").after(\"<a href='\"+data.pic2+\"' target='_blank'><img src='\"+\"http://203.189.232.251/images/2019/file-64.gif\"+\"'width='30px' height='40px'/></a>\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tcontentEditEditor.html(data.content);\n");
      out.write("\t\t\t\tcontentZhCnEditEditor.html(data.contentZhCn);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});    \t\n");
      out.write("    }\n");
      out.write("},{\n");
      out.write("    text:'删除',\n");
      out.write("    iconCls:'icon-cancel',\n");
      out.write("    handler:function(){\n");
      out.write("    \tvar ids = TT.getSelectionsIds(\"#research_List\");\n");
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
      out.write("        \t\t\t\t\t$(\"#research_List\").datagrid(\"reload\");\n");
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
