/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-20 05:05:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>下一代互联网中心后台管理系统</title>\n");
      out.write("    <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"css/jquery.ui.tabs.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.8.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/login.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/blur.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        .MainBg {\n");
      out.write("            background: url('../images/backimg.jpg') no-repeat center center;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        #login_button {\n");
      out.write("            border-width: 0;\n");
      out.write("            background: rgba(0, 0, 0, 0.15);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body style=\"padding-top: 100px;\">\n");
      out.write("<div class=\"Head\">\n");
      out.write("   <div class=\"logo\">\n");
      out.write("        <a href=\"#\" target=\"_blank\">\n");
      out.write("            <img style=\"border:0 none;display: block;height: 45px;width: 300px;\"  src=\"../images/logo.jpg\" alt=\"Coreart 下一代互联网中心\">\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"Main\" id=\"Main\">\n");
      out.write("    <div class=\"MainBg\" id=\"MainBg\">\n");
      out.write("        <form id=\"loginForm\" method=\"post\" action=\"/checkuser\" >\n");
      out.write("            <div class=\"MainL\"></div>\n");
      out.write("            <div id=\"mainRCommon\">\n");
      out.write("                <div class=\"MainR\" style=\"width: 335px; background-attachment: scroll; background-position: -572px -40px; \">\n");
      out.write("                    <div class=\"Header\">\n");
      out.write("                        <div class=\"title\" style=\"font-size: 20px;font-weight: 500\">登录</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"logArea\" class=\"tab-content\">\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"inptr\">\n");
      out.write("                            <input type=\"text\" id=\"username\" name=\"username\" class=\"inpUser\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"inptr\">\n");
      out.write("                            <input type=\"password\" id=\"password\" name=\"password\" class=\"inpPW\" autocomplete=\"off\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"inpB\">\n");
      out.write("                            <div>\n");
      out.write("                                <button name=\"action:login\" type=\"submit\" class=\"Button\" id=\"login_button\">登录</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Bottom\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"TLine\" style=\"display: none;\"></div>\n");
      out.write("                            <label id=\"faceSelectOption\">\n");
      out.write("                                <a href=\"javascript:void(0);\" onclick=\"displayFacePanel(this)\">\n");
      out.write("                                </a>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"copyright\" id=\"copyright\">\n");
      out.write("        <a>Copyright © 2019 下一代互联网中心版权所有 </a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
