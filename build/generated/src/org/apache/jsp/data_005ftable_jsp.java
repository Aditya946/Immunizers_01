package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class data_005ftable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Vaccination Data Entry</title>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    /* Set default font and background color */\n");
      out.write("body {\n");
      out.write("  font-family: Arial, sans-serif;\n");
      out.write("  background-color: #f7f7f7;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Center the title */\n");
      out.write("h1 {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the form */\n");
      out.write("form {\n");
      out.write("  margin: auto;\n");
      out.write("  max-width: 500px;\n");
      out.write("  padding: 20px;\n");
      out.write("  background-color: #fff;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the input fields */\n");
      out.write("label, input[type=text], input[type=number], input[type=date] {\n");
      out.write("  display: block;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=number], input[type=date] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the submit button */\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  transition: background-color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #3e8e41;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <h1>Vaccination Data Entry</h1>\n");
      out.write("    <form action=\"DCheck\" method=\"post\">\n");
      out.write("      <label for=\"patient-name\">Patient Name:</label>\n");
      out.write("      <input type=\"text\" id=\"patient-name\"  name=\"patname\" required><br>\n");
      out.write("\n");
      out.write("      <label for=\"patient-age\">Patient Age:</label>\n");
      out.write("      <input type=\"number\" id=\"patient-age\"  name=\"patage\" required><br>\n");
      out.write("\n");
      out.write("      <label for=\"vaccine-name\">Vaccine Name:</label>\n");
      out.write("      <input type=\"text\" id=\"vaccine-name\" name=\"vacciname\" required><br>\n");
      out.write("\n");
      out.write("      <label for=\"vaccination-date\">Vaccination Date:</label>\n");
      out.write("      <input type=\"date\" id=\"vaccination-date\" name=\"vaccidate\" required><br>\n");
      out.write("\n");
      out.write("      <label for=\"vaccination-location\">Vaccination Location:</label>\n");
      out.write("      <input type=\"text\" id=\"vaccination-location\" name=\"vaccilocation\" required><br>\n");
      out.write("\n");
      out.write("      <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
