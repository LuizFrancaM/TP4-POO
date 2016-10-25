package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.cadastros.Fornecedor;
import br.com.fatecpg.cadastros.Cliente;
import br.com.fatecpg.cadastros.Database;

public final class alterarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Alterar dados de cliente</h1>\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Entrada de Dados</legend>\n");
      out.write("            <form>\n");
      out.write("                 ");
 for (Cliente c: Database.getClientes()){ 
      out.write("\n");
      out.write("                 ");
 int i = Database.getClientes().indexOf(c); 
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"i\" value=\"");
      out.print(i);
      out.write("\"/>\n");
      out.write("                        <input type=\"text\" name=\"cNome\" value=\"");
      out.print(c.getNome());
      out.write("\"/>\n");
      out.write("                        <input type=\"text\" name=\"Cpf\" value=\"");
      out.print(c.getCpf());
      out.write("\"/>\n");
      out.write("                        <input type=\"text\" name=\"Rg\" value=\"");
      out.print(c.getRg());
      out.write("\"/>\n");
      out.write("                        <input type=\"text\" name=\"Email\" value=\"");
      out.print(c.getEmail());
      out.write("\"/>\n");
      out.write("                        <input type=\"text\" name=\"Telefone\" value=\"");
      out.print(c.getTelefone());
      out.write("\"/>\n");
      out.write("                        <input type=\"text\" name=\"Endereço\" value=\"");
      out.print(c.getEndereço());
      out.write("\"/>\n");
      out.write("                <input type=\"submit\" name=\"incluir\" value=\"Incluir\">\n");
      out.write("            </form>\n");
      out.write("        </fieldset>\n");
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
