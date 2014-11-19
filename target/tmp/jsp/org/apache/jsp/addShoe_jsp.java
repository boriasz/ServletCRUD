package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ServletCRUD.data.runningShoes;

public final class addShoe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      com.ServletCRUD.dataStorage.DataStorage storage = null;
      synchronized (application) {
        storage = (com.ServletCRUD.dataStorage.DataStorage) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.ServletCRUD.dataStorage.DataStorage();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      com.ServletCRUD.data.runningShoes shoe = null;
      synchronized (session) {
        shoe = (com.ServletCRUD.data.runningShoes) _jspx_page_context.getAttribute("shoe", PageContext.SESSION_SCOPE);
        if (shoe == null){
          shoe = new com.ServletCRUD.data.runningShoes();
          _jspx_page_context.setAttribute("shoe", shoe, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"showShoe.jsp\">\n");
      out.write("\n");
      out.write("  Brand :<input type=\"text\" name=\"brand\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br />\n");
      out.write("  Model :<input type=\"text\"  name=\"model\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.model}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br />\n");
      out.write("  Foot Type: <select name=\"footType\">\n");
      out.write("  <option value=\"Pronation\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.footType == 'Pronation' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Pronation</option> \n");
      out.write("  <option value=\"Neutral\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.footType == 'Neutral' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Neutral</option>\n");
      out.write("  <option value=\"Supination\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.footType == 'Supination' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Supination</option>\n");
      out.write("  </select>\n");
      out.write("  Foot Type: <select name=\"runnersWeight\">\n");
      out.write("  <option value=\"60\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.runnersWeight == '60' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">60</option> \n");
      out.write("  <option value=\"70\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.runnersWeight == '70' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">70</option>\n");
      out.write("  <option value=\"80\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.runnersWeight == '80' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">80</option>\n");
      out.write("  <option value=\"90\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.runnersWeight == '90' ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">80+</option>\n");
      out.write("  </select>\n");
      out.write("  Price :<input type=\"text\"  name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br />\n");
      out.write("  Color :<input type=\"text\"  name=\"color\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${runningShoes.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br />\n");
      out.write("  <input type=\"submit\" value=\" OK \">\n");
      out.write("  \t\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("\t<a href=\"index.jsp\">Back to menu</a>\n");
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
