/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-03 02:50:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.publication.patents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<form id=\"contentEditForm\" class=\"itemForm\" method=\"post\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"categoryId\" id=\"categoryId\"/>\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" />\n");
      out.write("\t    <table cellpadding=\"5\">\n");
      out.write("\t\t\t<tr >\n");
      out.write("\t\t\t\t<td id=\"J_index1\">序号:</td>\n");
      out.write("\t\t\t\t<td id=\"J_index2\"><input class=\"easyui-textbox\" type=\"text\" id=\"cIndex\"  name=\"cIndex\" data-options=\"required:true\" style=\"width: 280px;\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td id=\"J_file1\">文件:</td>\n");
      out.write("\t\t\t\t<td id=\"J_file2\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"pic2\" name=\"pic2\" />\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton oneFileUpload\">文件上传</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t        <tr>\n");
      out.write("\t            <td id=\"J_content1\">英文内容:</td>\n");
      out.write("\t            <td id=\"J_content2\">\n");
      out.write("\t                <textarea style=\"width:1000px;height:400px;visibility:hidden;\" id=\"content\" name=\"content\"></textarea>\n");
      out.write("\t            </td>\n");
      out.write("\t        </tr>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t    </table>\n");
      out.write("\t</form>\n");
      out.write("\t<div style=\"padding:5px\">\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"contentEditPage.submitForm()\">提交</a>\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"contentEditPage.clearForm()\">重置</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t/*\n");
      out.write("\t* 注意:\n");
      out.write("\t* \t给对应的Textarea创建kindeditor 名字不能相同,整个TT中共用的同一个命名空间,\n");
      out.write("\t* \t对应的tab中也会命名重复导致开启kindeditor冲突\n");
      out.write("\t*\n");
      out.write("\t* */\n");
      out.write("\tvar contentEditEditor ;\n");
      out.write("//\tvar contentZhCnEditEditor;\n");
      out.write("$(function(){\n");
      out.write("\tcontentEditEditor = TT.createEditor(\"#contentEditForm [name=content]\");\n");
      out.write("//\tcontentZhCnEditEditor = TT.createEditor(\"#contentEditForm [name=contentZhCn]\");\n");
      out.write("\tTT.initOneFileUpload();\n");
      out.write("});\n");
      out.write("var contentEditPage = {\n");
      out.write("\t\tsubmitForm : function(){\n");
      out.write("\n");
      out.write("\t\t\tcontentEditEditor.sync();\n");
      out.write("//\t\t\tcontentZhCnEditEditor.sync();\n");
      out.write("\t\t\t$.post(\"/content/edit\",$(\"#contentEditForm\").serialize(), function(data){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(data.status == 200){\n");
      out.write("\t\t\t\t\t$(\"#patents_List\").datagrid(\"reload\");\n");
      out.write("\t\t\t\t\tTT.closeCurrentWindow();\n");
      out.write("\t\t\t\t\t$.messager.alert('提示','编辑内容成功!');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t},\n");
      out.write("\t\t\tclearForm : function(){\n");
      out.write("\t\t\t\t$.messager.confirm('确认','确定重置所有内容吗？',function(r){\n");
      out.write("\t\t\t\t\tif(r){\n");
      out.write("\t\t\t\t\t\t$('#contentEditForm').form('reset');\n");
      out.write("\t\t\t\t\t\tcontentEditEditor.html('');\n");
      out.write("//\t\t\t\t\t\tcontentZhCnEditEditor.html('');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\n");
      out.write("};\n");
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
