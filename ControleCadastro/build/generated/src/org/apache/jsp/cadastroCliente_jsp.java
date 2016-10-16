package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.cadastros.Fornecedor;
import br.com.fatecpg.cadastros.Cliente;
import br.com.fatecpg.cadastros.Database;

public final class cadastroCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (request.getParameter("incluir") != null){
        Cliente c = new Cliente ();
        c.setNome(request.getParameter("nmCliente"));
        c.setCpf(request.getParameter("cpfCliente"));
        c.setRg (request.getParameter("rgCliente"));
        c.setEmail(request.getParameter("emailCliente"));
        c.setTelefone (request.getParameter("telCliente"));
        c.setEndereço(request.getParameter("enderecoCliente"));
        Database.getClientes().add(c);
        response.sendRedirect(request.getRequestURI());
    }
    if (request.getParameter("excluir") != null){
        String par = request.getParameter("i");
        int i = Integer.parseInt(par);
        Database.getClientes().remove(i);
        response.sendRedirect(request.getRequestURI());
    }
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Controle de Cadastro - Fornecedor</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        <h1>Cadastro Cliente</h1><br>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Entrada de Dados</legend>\n");
      out.write("            <form>\n");
      out.write("                Nome: <input type=\"text\" name=\"nmCliente\"><br>\n");
      out.write("                Razão Social: <input type=\"text\" name=\"cpfCliente\"><br>\n");
      out.write("                CNPJ: <input type=\"text\" name=\"rgCliente\"><br>\n");
      out.write("                Email: <input type=\"text\" name=\"emailCliente\"><br>\n");
      out.write("                Telefone: <input type=\"text\" name=\"telCliente\"><br>\n");
      out.write("                Endereço: <input type=\"text\" name=\"enderecoCliente\"><br>\n");
      out.write("                <input type=\"submit\" name=\"incluir\" value=\"Incluir\">\n");
      out.write("            </form>\n");
      out.write("        </fieldset>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("            <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>CPF</th>\n");
      out.write("                <th>RG</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Telefone</th>\n");
      out.write("                <th>Endereço</th>\n");
      out.write("                <th>Comandos</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 for (Cliente c: Database.getClientes()){ 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                ");
 int i = Database.getFornecedores().indexOf(c); 
      out.write("\n");
      out.write("                <td>");
      out.print( i );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( c.getNome() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( c.getCpf() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( c.getRg() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( c.getEmail() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( c.getTelefone() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( c.getEndereço() );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <form>\n");
      out.write("                        <input type=\"hidden\" name=\"i\" value=\"");
      out.print(i);
      out.write("\"/>\n");
      out.write("                        <input type=\"submit\" name=\"excluir\" value=\"Excluir\"/>\n");
      out.write("                    </form>\n");
      out.write("                </td>                \n");
      out.write("            </tr>\n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("           </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
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
