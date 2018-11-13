import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnold
 */

    public final class jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>   \n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Login Styling.css\">\n");
      out.write("        <link type=\"text/css\" href=\"css/navigation-bar.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/jquery-3.3.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("               $(\"#timeout_message\").hide();\n");
      out.write("               \n");
      out.write("            ");
if(session.getAttribute("requestedUrl") != null){
      out.write("\n");
      out.write("                $(\"#timeout_message\").show();\n");
      out.write("            ");
}
      out.write("\n");
      out.write("               \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("   <div class=\"title\">The Art Gallery. Create & Share</div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("   \n");
      out.write("        <div class=\"loginBox\">\n");
      out.write("         <!--I need a target and probably a method on click()-->   \n");
      out.write("         \n");
      out.write("         <form id=\"loginForm\" method=\"POST\" action=\"login\">\n");
      out.write("             \n");
      out.write("             <p class=\"heading\">Login</p>\n");
      out.write("         \n");
      out.write("             <p id=\"timeout_message\">Session timed out. Please log in again.</p>\n");
      out.write("             \n");
      out.write("             <label for=\"username\">Username</label>\n");
      out.write("             <input type=\"text\" name=\"username\" id=\"username\" placeholder=\"Enter your email address\" value=\"\" required>\n");
      out.write("             \n");
      out.write("            <br>\n");
      out.write("             <label for=\"password\">Password</label>    \n");
      out.write("             <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Enter Password\" required>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"submitBtn\" id=\"submitBtn\" value=\"Log in \"/>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("         \n");
      out.write("         <p id=\"link\"> \n");
      out.write("<!--             <a href=\"Reset Password/verify_email.php\" class=\"linksBelow\">Forgot your password?</a>\n");
      out.write("             <br><br>-->\n");
      out.write("             <a href=\"registration.jsp\" class=\"linksBelow\">New here? Create an account</a>\n");
      out.write("         </p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        \n");
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