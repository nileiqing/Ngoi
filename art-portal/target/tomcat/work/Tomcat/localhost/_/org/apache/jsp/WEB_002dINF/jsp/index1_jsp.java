/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-07 08:17:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Network sciEnce, Wireless, and Security (NEWS) Group</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/stylengoi.css\">\n");
      out.write("\t<base target=\"_blank\" />\n");
      out.write("\t<style>\n");
      out.write("\t\t.navbar li:first-child {\n");
      out.write("\t\t\tbackground-color: #fff;\n");
      out.write("\t\t\tborder-bottom: 2px solid #52a1d2;\n");
      out.write("\t\t}\n");
      out.write("\t\t.navbar li:first-child a { \n");
      out.write("\t\t\tcolor: #8b1f30;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t* {\n");
      out.write("\t\t\tfont-family: 'Open Sans'!important;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<p id=\"allurl\" style=\"display:none;\">");
      out.print(basePath);
      out.write("</p>\n");
      out.write("\t<header>\n");
      out.write("\t\t<!-- 头部logo及背景图 -->\n");
      out.write("\t\t<div class=\"nav\">\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t<img src=\"\" alt=\"\" id=\"headerlogo\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- 头部导航栏 -->\n");
      out.write("\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"#\" target=\"_self\">HOME</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("team.html\" target=\"_self\">TEAM</a></li>\n");
      out.write("\t\t\t\t<!-- <li><a href=\"#\" target=\"_self\">AI FOR WIRELESS</a></li> -->\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("research.html\" target=\"_self\">RESEARCH</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("publications.html\" target=\"_self\">PUBLICATION</a></li>\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("openpositions.html\" target=\"_self\">OPENTION POSITION</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("contact.html\" target=\"_self\">CONTACT</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- 主体部分 -->\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"main-in\">\n");
      out.write("\t\t\t<!-- 主体左侧内容 -->\n");
      out.write("\t\t\t<div class=\"mainleft\">\n");
      out.write("\t\t\t\t<!-- 上半部分：实验室简介 -->\n");
      out.write("\t\t\t\t<div class=\"labins\">\n");
      out.write("\t\t\t\t\t<div class=\"labinfo\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div></div>\n");
      out.write("\t\t\t\t\t<div>We are currently focused on several research thrusts:</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<span id=\"spanvacancy\">We are always looking for new students and postdocs within our area of research, broader information is found <a href=\"");
      out.print(basePath);
      out.write("openpositions.html\">here.</a></span><!-- 实验室简介 -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- 下半部分：新闻 -->\n");
      out.write("\t\t\t\t<div class=\"ltr\">\n");
      out.write("\t\t\t\t\t<div class=\"news\">News</div>\n");
      out.write("\t\t\t\t\t<b><hr class=\"mainlefthr\"></b>\n");
      out.write("\t\t\t\t\t<div class=\"newslist\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"seemore\">See&nbsp;\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(basePath);
      out.write("home/newslist.html\">more&nbsp;news</a>&nbsp;...\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- 主体右侧内容 -->\n");
      out.write("\t\t\t<div class=\"mainright\">\n");
      out.write("\t\t\t\t<div class=\"sponsors\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"ulinks\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<b><hr class=\"mainlefthr\"></b>\n");
      out.write("\t\t<div class=\"fnavbar\">\n");
      out.write("\t\t<a href=\"#\">Home</a>\n");
      out.write("\t\t&nbsp;-&nbsp;\n");
      out.write("\t\t<a href=\"");
      out.print(basePath);
      out.write("team.html\">Team</a>\n");
      out.write("\t\t&nbsp;-&nbsp;\n");
      out.write("\t\t<!-- <a href=\"#\">Ai For Wireless</a>\n");
      out.write("\t\t&nbsp;-&nbsp; -->\n");
      out.write("\t\t<a href=\"");
      out.print(basePath);
      out.write("research.html\">Research</a>\n");
      out.write("\t\t&nbsp;-&nbsp;\n");
      out.write("\t\t<a href=\"");
      out.print(basePath);
      out.write("publications.html\">Publication</a>\n");
      out.write("\t\t&nbsp;-&nbsp;\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\n");
      out.write("\t\t<a href=\"");
      out.print(basePath);
      out.write("openpositions.html\">Open Positions</a>\n");
      out.write("\t\t&nbsp;-&nbsp;\n");
      out.write("\t\t<a href=\"");
      out.print(basePath);
      out.write("contact.html\">Contact Us</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<b><hr class=\"lasthr\"></b>\n");
      out.write("\t\t<div class=\"copyright\">© 2019 Network Science, Wireless, and Security Group (NetSciWiS), Virginia Tech</div>\n");
      out.write("\t</div>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/date.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ngoiajaxindex.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/responsiveslides.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/wp-embed.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery.fancybox-1.3.7.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery.easing.pack.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery.mousewheel.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/amazeui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/app.js\"></script>\n");
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
