/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2019-05-26 13:13:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.static_.TaskFourTeen;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/Program%20Files/.m2/repository/org/apache/tiles/tiles-jsp/3.0.8/tiles-jsp-3.0.8.jar!/META-INF/tld/tiles-extras-jsp.tld", Long.valueOf(1506776884000L));
    _jspx_dependants.put("file:/D:/Program%20Files/.m2/repository/org/apache/tiles/tiles-jsp/3.0.8/tiles-jsp-3.0.8.jar", Long.valueOf(1557672202093L));
    _jspx_dependants.put("jar:file:/D:/Program%20Files/.m2/repository/org/apache/tiles/tiles-jsp/3.0.8/tiles-jsp-3.0.8.jar!/META-INF/tld/tiles-jsp.tld", Long.valueOf(1506776884000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"/static/TaskFourTeen/page/company.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <style>\r\n");
      out.write("        @media screen and (max-width: 1200px) {}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"container-fluid footer-bottom\" style=\" padding: 0 10vw 0 10vw;\r\n");
      out.write("            background-color: rgb(38, 162, 111);\r\n");
      out.write("            border-bottom: 0.5px solid white;\">\r\n");
      out.write("        <div class=\"container-fluid main-four\" id=\"yunwei\"/>");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg footer-bottom-left\">\r\n");
      out.write("                <span class=\"footer-bottom-left-top\">技能树-改变你我</span>\r\n");
      out.write("                <div class=\"footer-bottom-left-end\">\r\n");
      out.write("                    <a href=\"\" class=\"footer-bottom-left-a-one\">关于我们</a>\r\n");
      out.write("                    <a href=\"\" class=\"footer-bottom-left-a-two\">联系我们</a>\r\n");
      out.write("                    <a href=\"\">合作企业</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg footer-bottom-center\">\r\n");
      out.write("                <a href=\"\" class=\"footer-bottom-center-top\">旗下网站</a>\r\n");
      out.write("                <div class=\"footer-bottom-center-center\">\r\n");
      out.write("                    <a href=\"\">操船云孵化器</a>\r\n");
      out.write("                    <a href=\"\">最强IT特训营</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-bottom-center-end\">\r\n");
      out.write("                    <a href=\"\">葡萄藤轻游戏</a>\r\n");
      out.write("                    <a href=\"\">桌游精灵</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg footer-bottom-end\">\r\n");
      out.write("                <span class=\"footer-bottom-end-top\">微信公众平台</span>\r\n");
      out.write("                <div class=\"footer-bottom-end-end\"><img\r\n");
      out.write("                        src=\"/static/TaskEight/TaskEightInexSrc/qrcode_for_gh_32213eeb65ba_1280.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"andi\">\r\n");
      out.write("        <div>Copyright&nbsp;2015技能书&nbsp;</div>\r\n");
      out.write("        <div>www.jishu.com&nbsp;All&nbsp;Right&nbsp;Reserved&nbsp;|</div>\r\n");
      out.write("        <div>&nbsp;京ICP备13005880号</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
