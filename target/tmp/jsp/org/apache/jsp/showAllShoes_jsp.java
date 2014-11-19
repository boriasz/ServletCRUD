package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ServletCRUD.data.runningShoes;

public final class showAllShoes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>All shoes</title>\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
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
      out.write("\n");
      out.write("\t\t<table border=\"1\" style=\"width:100%\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td>");
 out.println("Brand"); 
      out.write(" </td>\n");
      out.write("\t\t<td>");
 out.println("Model"); 
      out.write(" </td>\n");
      out.write("\t\t<td>");
 out.println("Foot Type"); 
      out.write(" </td>\n");
      out.write("\t\t<td>");
 out.println("Runner's Weight"); 
      out.write(" </td>\n");
      out.write("\t\t<td>");
 out.println("Price"); 
      out.write(" </td>\n");
      out.write("\t\t<td>");
 out.println("Color"); 
      out.write(" </td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t");

		for(runningShoes shoes : storage.getAllShoes()){
			
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t");
 
			//out.println(shoes.getId()+ "Brand: " +shoes.getBrand()+ "Model: " +shoes.getModel()+ "Foot Type: " +shoes.getFootType()+ "Runner's weight: " +shoes.getRunnersWeight()+ "Price: " +shoes.getPrice()+ "Color" +shoes.getColor());
			
      out.write("\n");
      out.write("\t\t\t<td> ");
 out.println(shoes.getBrand()); 
      out.write(" </td>\n");
      out.write("\t\t\t<td> ");
 out.println(shoes.getModel()); 
      out.write(" </td>\n");
      out.write("\t\t\t<td> ");
 out.println(shoes.getFootType()); 
      out.write(" </td>\n");
      out.write("\t\t\t<td> ");
 out.println(shoes.getRunnersWeight()); 
      out.write(" </td>\n");
      out.write("\t\t\t<td> ");
 out.println(shoes.getPrice()); 
      out.write(" </td>\n");
      out.write("\t\t\t<td> ");
 out.println(shoes.getColor()); 
      out.write(" </td>\t\n");
      out.write("\t\t\t");
 
			String newId = shoes.getId().toString();
			
			
			
      out.write("\n");
      out.write("\t\t\t<td><a href=\"Delete.jsp?deletedid=");
      out.print(newId);
      out.write("\">Delete</a>\n");
      out.write("\t\t\t<a href=\"Update.jsp?updatedid=");
      out.print(newId);
      out.write("\">Update</a></td>\n");
      out.write("\t\t");

		}
	
	
      out.write("\n");
      out.write("\t </table>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write(" \n");
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
