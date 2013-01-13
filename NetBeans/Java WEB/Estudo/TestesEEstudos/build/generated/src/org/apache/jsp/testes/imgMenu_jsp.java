package org.apache.jsp.testes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imgMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title></title>\n");
      out.write("    <style>.qitem {\n");
      out.write("\twidth:126px;\n");
      out.write("\theight:126px;\n");
      out.write("\tborder:4px solid #222;\n");
      out.write("\tmargin:5px 5px 5px 0;\n");
      out.write("\tbackground: url('bg.gif') no-repeat;\n");
      out.write("\n");
      out.write("\n");
      out.write("\t/* required to hide the image after resized */\n");
      out.write("\toverflow:hidden;\n");
      out.write("\n");
      out.write("\t/* for child absolute position */\n");
      out.write("\tposition:relative;\n");
      out.write("\n");
      out.write("\t/* display div in line */\n");
      out.write("\tfloat:left;\n");
      out.write("\tcursor:hand; cursor:pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t.qitem img {\n");
      out.write("\t\tborder:0;\n");
      out.write("\n");
      out.write("\t\t/* allow javascript moves the img position*/\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\tz-index:200;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.qitem .caption {\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\tz-index:0;\n");
      out.write("\t\tcolor:#ccc;\n");
      out.write("\t\tdisplay:block;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\t.qitem .caption h4 {\n");
      out.write("\t\t\tfont-size:12px;\n");
      out.write("\t\t\tpadding:10px 5px 0 8px;\n");
      out.write("\t\t\tmargin:0;\n");
      out.write("\t\t\tcolor:#369ead;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.qitem .caption p {\n");
      out.write("\t\t\tfont-size:10px;\n");
      out.write("\t\t\tpadding:3px 5px 0 8px;\n");
      out.write("\t\t\tmargin:0;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Setting for corners */\n");
      out.write("\n");
      out.write(".topLeft, .topRight, .bottomLeft, .bottomRight {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tfloat:left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topLeft {\n");
      out.write("\tbackground-position: top left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topRight {\n");
      out.write("\tbackground-position: top right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottomLeft {\n");
      out.write("\tbackground-position: bottom left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottomRight {\n");
      out.write("\tbackground-position: bottom right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".clear {\n");
      out.write("\tclear:both;\n");
      out.write("}</style>\n");
      out.write("\n");
      out.write("    <script></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\" />\n");
      out.write("    <script language=\"JavaScript\"  src=\"js/jquery-1.3.1.min.js\" ></script>\n");
      out.write("    <script language=\"JavaScript\"  src=\"js/jquery.easing.1.3.js\" ></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"qitem\">\n");
      out.write("        <a href=\"http://www.google.com\"><img src=\"img/1.gif\" alt=\"Test 1\" title=\"\" width=\"126\" height=\"126\"/></a>\n");
      out.write("        <span class=\"caption\"><h4>Night Club</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"qitem\">\n");
      out.write("        <a href=\"#\"><img src=\"img/2.gif\" alt=\"Test 1\" title=\"\" width=\"126\" height=\"126\"/></a>\n");
      out.write("        <span class=\"caption\"><h4>Umbrella</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"qitem\">\n");
      out.write("        <a href=\"#\"><img src=\"img/4.gif\" alt=\"Test 1\" title=\"\" width=\"126\" height=\"126\"/></a>\n");
      out.write("        <span class=\"caption\"><h4>litle Blackbird</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"qitem\">\n");
      out.write("        <a href=\"#\"><img src=\"img/5.gif\" alt=\"Test 1\" title=\"\" width=\"126\" height=\"126\"/></a>\n");
      out.write("        <span class=\"caption\"><h4>infinity crime</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
