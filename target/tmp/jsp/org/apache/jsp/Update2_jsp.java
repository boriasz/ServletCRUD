package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.UUID;
import java.lang.Integer.*;

public final class Update2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      com.ServletCRUD.dataStorage.DataStorage storage = null;
      synchronized (application) {
        storage = (com.ServletCRUD.dataStorage.DataStorage) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.ServletCRUD.dataStorage.DataStorage();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
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
      com.ServletCRUD.data.runningShoes toEdit = null;
      synchronized (session) {
        toEdit = (com.ServletCRUD.data.runningShoes) _jspx_page_context.getAttribute("toEdit", PageContext.SESSION_SCOPE);
        if (toEdit == null){
          toEdit = new com.ServletCRUD.data.runningShoes();
          _jspx_page_context.setAttribute("toEdit", toEdit, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\n");
      out.write("\t");
 
		String brand = request.getParameter("brand");
		String model = request.getParameter("model");
		String footType = request.getParameter("footType");
		String runnersWeight = request.getParameter("runnersWeight");
		int waga = Integer.parseInt(runnersWeight);
		String price = request.getParameter("price");
		float cena = Float.parseFloat(price);
		String color = request.getParameter("color");
		
		String idToUpdate = request.getParameter("id");
		UUID id = UUID.fromString(idToUpdate);
		toEdit.setId(id);
		toEdit.setBrand(brand);
		toEdit.setModel(model);
		toEdit.setFootType(footType);
		toEdit.setRunnersWeight(waga);
		toEdit.setPrice(cena);
		toEdit.setColor(color);
		System.out.print(runningShoes.getPrice());
		storage.updateShoes(toEdit);
		response.sendRedirect("index.jsp");
	
      out.write("\n");
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
