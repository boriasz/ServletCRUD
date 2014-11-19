package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showShoe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Added shoes</title>\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write(" <script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<body>\n");
      out.write("\t");
      com.ServletCRUD.data.runningShoes runningShoes = null;
      synchronized (session) {
        runningShoes = (com.ServletCRUD.data.runningShoes) _jspx_page_context.getAttribute("runningShoes", PageContext.SESSION_SCOPE);
        if (runningShoes == null){
          runningShoes = new com.ServletCRUD.data.runningShoes();
          _jspx_page_context.setAttribute("runningShoes", runningShoes, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("runningShoes"), request);
      out.write(" \n");
      out.write("\t");
      com.ServletCRUD.dataStorage.DataStorage storage = null;
      synchronized (application) {
        storage = (com.ServletCRUD.dataStorage.DataStorage) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.ServletCRUD.dataStorage.DataStorage();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\n");
      out.write("\t");

		storage.addShoe(runningShoes);
	
      out.write("\n");
      out.write("\t<p>Model: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("\t<p>Brand: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.model}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("\t<p>Foot Type: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.footType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("\t<p>Runner's weight: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.runnersWeight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t<p>Price: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("\t<p>Color: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\n");
      out.write("\t\t<a href=\"index.jsp\">Back to menu</a>\n");
      out.write("\t\n");
      out.write("</body>\n");
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
