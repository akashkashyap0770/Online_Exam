package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 30px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                width: 530px;\n");
      out.write("                height: 530px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body><center>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"AdminChangePassword\">\n");
      out.write("                <h1>Admin Change Password</h1>\n");
      out.write("                <br>\n");
      out.write("                <span>Old Password : <input type=\"password\" name=\"opswd\" value=\"\"></span>\n");
      out.write("                <br>\n");
      out.write("                <span>New Password : <input type=\"password\" name=\"npswd\" value=\"\"></span>\n");
      out.write("                <br>\n");
      out.write("                <span>Confirm Password : <input type=\"password\" name=\"cpswd\" value=\"\"></span>\n");
      out.write("                <br>\n");
      out.write("                <button>Submit</button><button>Reset</button>\n");
      out.write("            </form>    \n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
