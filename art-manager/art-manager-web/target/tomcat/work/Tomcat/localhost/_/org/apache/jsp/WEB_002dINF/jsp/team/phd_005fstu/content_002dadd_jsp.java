/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-16 13:44:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.team.phd_005fstu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"/js/kindeditor-4.1.10/themes/default/default.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/kindeditor-4.1.10/kindeditor-all-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/kindeditor-4.1.10/lang/zh_CN.js\"></script>\n");
      out.write("<div style=\"padding:10px 10px 10px 10px\">\n");
      out.write("\t<form id=\"contentAddForm\" class=\"itemForm\" method=\"post\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"categoryId\"  id=\"categoryId\"/>\n");
      out.write("\t    <table cellpadding=\"5\">\n");
      out.write("\t        <tr >\n");
      out.write("\t            <td id=\"J_title1\">姓名:</td>\n");
      out.write("\t            <td id=\"J_title2\"><input class=\"easyui-textbox\" type=\"text\" id=\"title\"  name=\"title\" data-options=\"required:true\" style=\"width: 280px;\"/></td>\n");
      out.write("\t        </tr>\n");
      out.write("\t        <tr>\n");
      out.write("\t            <td id=\"J_content1\">英文内容:</td>\n");
      out.write("\t            <td id=\"J_content2\">\n");
      out.write("\t                <textarea style=\"width:1000px;height:400px;visibility:hidden;\" id=\"content\" name=\"content\"></textarea>\n");
      out.write("\t            </td>\n");
      out.write("\t        </tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td id=\"J_content_zh1\">中文内容:</td>\n");
      out.write("\t\t\t\t<td id=\"J_content_zh2\">\n");
      out.write("\t\t\t\t\t<textarea style=\"width:1000px;height:400px;visibility:hidden;\" id=\"contentZhCn\" name=\"contentZhCn\"></textarea>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t    </table>\n");
      out.write("\t</form>\n");
      out.write("\t<div style=\"padding:5px\">\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"contentAddPage.submitForm()\">提交</a>\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"contentAddPage.clearForm()\">重置</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar contentAddEditor ;\n");
      out.write("\tvar contentZhCnAddEditor;\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$(\"#contentAddForm [name=categoryId]\").val(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoryId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(");\n");
      out.write("\t\tcontentAddEditor = TT.createEditor(\"#contentAddForm [name=content]\");\n");
      out.write("\t\tcontentZhCnAddEditor = TT.createEditor(\"#contentAddForm [name=contentZhCn]\");\n");
      out.write("\t\tTT.initOnePicUpload();\n");
      out.write("\t\tTT.initOneFileUpload();\n");
      out.write("\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tvar contentAddPage  = {\n");
      out.write("\t\t\tsubmitForm : function (){\n");
      out.write("\t\t\t\tcontentAddEditor.sync();\n");
      out.write("\t\t\t\tcontentZhCnAddEditor.sync();\n");
      out.write("\t\t\t\t$.post(\"/content/save\",$(\"#contentAddForm\").serialize(), function(data){\n");
      out.write("\t\t\t\t\tif(data.status == 200){\n");
      out.write("    \t\t\t\t\t$(\"#phd_stu_List\").datagrid(\"reload\");\n");
      out.write("    \t\t\t\t\tTT.closeCurrentWindow();\n");
      out.write("    \t\t\t\t\t$.messager.alert('提示','新增内容成功!');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tclearForm : function(){\n");
      out.write("\t\t\t\t$('#contentAddForm').form('reset');\n");
      out.write("\t\t\t\tcontentAddEditor.html('');\n");
      out.write("\t\t\t\tcontentZhCnAddEditor.html('');\n");
      out.write("\t\t\t}\n");
      out.write("\t};\n");
      out.write("</script>\n");
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
