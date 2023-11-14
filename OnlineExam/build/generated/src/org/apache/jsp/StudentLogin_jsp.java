package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("        .box{\n");
      out.write("            background-color:black;\n");
      out.write("            width: 400px;\n");
      out.write("            height: 400px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            margin-top: 100px;\n");
      out.write("            box-shadow: 12px 12px yellow  ;\n");
      out.write("         }\n");
      out.write("         #login{\n");
      out.write("             color:yellow;\n");
      out.write("             padding-top: 20px;\n");
      out.write("             \n");
      out.write("         }\n");
      out.write("         .table{\n");
      out.write("             width: 300px;\n");
      out.write("             height: 180px;\n");
      out.write("            color: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            font-size: 25px;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: white;\n");
      out.write("                     }\n");
      out.write("                     #button{\n");
      out.write("                         width: 300px;\n");
      out.write("                         height:50px ;\n");
      out.write("                         background: yellow ;\n");
      out.write("                         border-radius: 13px;\n");
      out.write("                         font-size: 33px;\n");
      out.write("                          }\n");
      out.write("                          #td input\n");
      out.write("                          {\n");
      out.write("                         width: 300px;\n");
      out.write("                         height:43px ;\n");
      out.write("                         background: white;\n");
      out.write("                         border-radius: 13px;\n");
      out.write("                         font-size: 33px;\n");
      out.write("\n");
      out.write("                          }\n");
      out.write("                        #td select\n");
      out.write("                        {\n");
      out.write("                         width: 305px;\n");
      out.write("                         height:43px ;\n");
      out.write("                         background: white;\n");
      out.write("                         border-radius: 13px;\n");
      out.write("                         font-size: 33px; \n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("    </style>\n");
      out.write("</head> \n");
      out.write("<body bgcolor=\"\t#383838\">\n");
      out.write("    \n");
      out.write("   <center><div class=\"box\"><h1 id=\"login\"> Admin Login </h1><hr>\n");
      out.write("           <form action=\"StudentLoginConf\">\n");
      out.write("    <table class=\"table\" id=\"td\">\n");
      out.write("        <td><select name=\"usertype\"><option>Student</option></select></td></tr>\n");
      out.write("<tr><td><input type=\"email\" name=\"email\" placeholder=\"Email\"></td></tr>\n");
      out.write("<tr><td><input type=\"password\" name=\"password\" placeholder=\"Password\"></td></tr>\n");
      out.write("</table>\n");
      out.write(" <input type=\"submit\" name=\"login\" value=\"Login\" id=\"button\">\n");
      out.write("    <hr>\n");
      out.write("    <label style=\"color: white; margin-right: 120px; font-size: 17px;\">\n");
      out.write("        <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me  </label> \n");
      out.write("        <label style=\"color: white; font-size: 17px;\">Forget Password?\n");
      out.write("      </label>\n");
      out.write("    Forget Password?\n");
      out.write("   \n");
      out.write("</form>\n");
      out.write("</div></center> </body>\n");
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
