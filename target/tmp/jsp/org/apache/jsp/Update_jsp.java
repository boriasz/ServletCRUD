package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ServletCRUD.data.runningShoes;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link\n");
      out.write("\thref=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("runningShoes"), request);
      out.write('\n');
      out.write('	');

		runningShoes newShoes = new runningShoes();

		String idToUpdate = request.getParameter("updatedid");
		for (runningShoes shoes : storage.getAllShoes()) {
			if ((shoes.getId().toString()).equals(idToUpdate)) {
				newShoes = shoes;

			}

		}
		toEdit = newShoes;
		String newId = toEdit.getId().toString();
	
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<form action=\"Update2.jsp?\">\n");
      out.write("\t\tID: <input type=\"text\" name=\"id\" value=\"");
      out.print(toEdit.getId());
      out.write("\"\n");
      out.write("\t\t\treadonly /><br /> Brand :<input type=\"text\" name=\"brand\"\n");
      out.write("\t\t\tvalue=\"");
      out.print(toEdit.getBrand());
      out.write("\" /><br /> Model :<input\n");
      out.write("\t\t\ttype=\"text\" name=\"model\" value=\"");
      out.print(toEdit.getModel());
      out.write("\" /><br />\n");
      out.write("\t\tFoot Type: <select name=\"footType\">\n");
      out.write("\t\t\t<option value=\"Pronation\"\n");
      out.write("\t\t\t\t");
      out.print(toEdit.getFootType().equals("Pronation") ? "selected='selected'"
					: "");
      out.write(">Pronation</option>\n");
      out.write("\t\t\t<option value=\"Neutral\"\n");
      out.write("\t\t\t\t");
      out.print(toEdit.getFootType().equals("Neutral") ? "selected='selected'"
					: "");
      out.write(">Neutral</option>\n");
      out.write("\t\t\t<option value=\"Supination\"\n");
      out.write("\t\t\t\t");
      out.print(toEdit.getFootType().equals("Supination") ? "selected='selected'"
					: "");
      out.write(">Supination</option>\n");
      out.write("\t\t</select> Foot Type: <select name=\"runnersWeight\">\n");
      out.write("\t\t\t<option value=\"60\"\n");
      out.write("\t\t\t\t");
      out.print(toEdit.getRunnersWeight() == 60 ? "selected'selected'"
					: "");
      out.write(">60</option>\n");
      out.write("\t\t\t<option value=\"70\"\n");
      out.write("\t\t\t\t");
      out.print(toEdit.getRunnersWeight() == 70 ? "selected'selected'"
					: "");
      out.write(">70</option>\n");
      out.write("\t\t\t<option value=\"80\"\n");
      out.write("\t\t\t\t");
      out.print(toEdit.getRunnersWeight() == 80 ? "selected'selected'"
					: "");
      out.write(">80</option>\n");
      out.write("\t\t\t<option value=\"90\"\n");
      out.write("\t\t\t\t");
      out.print(toEdit.getRunnersWeight() == 90 ? "selected'selected'"
					: "");
      out.write(">80+</option>\n");
      out.write("\t\t</select> Price :<input type=\"text\" name=\"price\"\n");
      out.write("\t\t\tvalue=\"");
      out.print(toEdit.getPrice());
      out.write("\" /><br /> Color :<input\n");
      out.write("\t\t\ttype=\"text\" name=\"color\" value=\"");
      out.print(toEdit.getColor());
      out.write("\" /><br />\n");
      out.write("\n");
      out.write("\t\t<input type=\"submit\" value=\" OK \">\n");
      out.write("\t</form>\n");
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
