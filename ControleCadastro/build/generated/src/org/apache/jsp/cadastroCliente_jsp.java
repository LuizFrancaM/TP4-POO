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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.html");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

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
    

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">\r\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilocadastro.css\">\r\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilocliente.css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Controle de Cadastro - Fornecedor</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("          <br>\r\n");
      out.write("          <ul class=\"nav nav-pills nav-justified\">\r\n");
      out.write("            <center><img src=\"img/logo.jpg\"></center>\r\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">Cadastrar Cliente</a></li>\r\n");
      out.write("            <li><a href=\"cadastroFornecedor.jsp\">Cadastrar Fornecedor</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </html>\r\n");
      out.write("        \r\n");
      out.write("            <div id=\"conteudo\">\r\n");
      out.write("        <h1 class=\"titulo\">Cadastro Cliente</h1><br>\r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>Entrada de Dados</legend>\r\n");
      out.write("            <form>\r\n");
      out.write("                <label class=\"cliente\">Nome </label><input type=\"text\" name=\"nmCliente\"><br>\r\n");
      out.write("                <label class=\"cliente\">CPF </label><input type=\"text\" name=\"cpfCliente\"><br>\r\n");
      out.write("                <label class=\"cliente\">RG </label><input type=\"text\" name=\"rgCliente\"><br>\r\n");
      out.write("                <label class=\"cliente\">Email </label><input type=\"text\" name=\"emailCliente\"><br>\r\n");
      out.write("                <label class=\"cliente\">Telefone </label><input type=\"text\" name=\"telCliente\"><br>\r\n");
      out.write("                <label class=\"cliente\">Endereço </label><input type=\"text\" name=\"enderecoCliente\"><br>\r\n");
      out.write("                <input class=\"incluir\" type=\"submit\" name=\"incluir\" value=\"Incluir\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table class=\"table table-bordered\" border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ID</th>\r\n");
      out.write("                <th>Nome</th>\r\n");
      out.write("                <th>CPF</th>\r\n");
      out.write("                <th>RG</th>\r\n");
      out.write("                <th>Email</th>\r\n");
      out.write("                <th>Telefone</th>\r\n");
      out.write("                <th>Endereço</th>\r\n");
      out.write("                <th>Comandos</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");
 for (Cliente c: Database.getClientes()){ 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
 int i = Database.getClientes().indexOf(c); 
      out.write("\r\n");
      out.write("                <td>");
      out.print( i );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getNome() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getCpf() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getRg() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getEmail() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getTelefone() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getEndereço() );
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <input type=\"hidden\" name=\"i\" value=\"");
      out.print(i);
      out.write("\"/>\r\n");
      out.write("                        <input type=\"submit\" name=\"excluir\" value=\"Excluir\"/>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>                \r\n");
      out.write("            </tr>\r\n");
      out.write("           ");
 } 
      out.write("\r\n");
      out.write("           </table>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("           ");
      out.write("<div class=\"footer\">\r\n");
      out.write("  Concretizado cativantemente para o ensino de POO.<br> Fatec PG - 2016\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
