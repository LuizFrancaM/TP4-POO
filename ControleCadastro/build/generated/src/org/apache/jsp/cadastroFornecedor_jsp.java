package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.cadastros.Fornecedor;
import br.com.fatecpg.cadastros.Database;

public final class cadastroFornecedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    if (request.getParameter("incluir") != null){
        Fornecedor f = new Fornecedor ();
        f.setNome(request.getParameter("nmFornecedor"));
        f.setRazaoSocial(request.getParameter("razaoSocialFornecedor"));
        f.setCnpj (request.getParameter("cnpjFornecedor"));
        f.setEmail(request.getParameter("emailFornecedor"));
        f.setTelefone (request.getParameter("telFornecedor"));
        f.setEndereço(request.getParameter("endFornecedor"));
        Database.getFornecedores().add(f);
        response.sendRedirect(request.getRequestURI());
    }
    if (request.getParameter("excluir") != null){
        String par = request.getParameter("i");
        int i = Integer.parseInt(par);
        Database.getFornecedores().remove(i);
        response.sendRedirect(request.getRequestURI());
    }
        if (request.getParameter("alterar") != null){
        String par = request.getParameter("i");
        int i = Integer.parseInt(par);
        
        Fornecedor f = new Fornecedor ();
        f.setNome(request.getParameter("nmFornecedor"));
        f.setRazaoSocial(request.getParameter("razaoSocialFornecedor"));
        f.setCnpj (request.getParameter("cnpjFornecedor"));
        f.setEmail(request.getParameter("emailFornecedor"));
        f.setTelefone (request.getParameter("telFornecedor"));
        f.setEndereço(request.getParameter("endFornecedor"));
        Database.getFornecedores().set(i,f);
        
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilocadastro.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilocliente.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <title>Controle de Cadastro - Fornecedor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("          <br>\n");
      out.write("          <ul class=\"nav nav-pills nav-justified\">\n");
      out.write("            <center><img src=\"img/logo.jpg\"></center>\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\n");
      out.write("            <li><a href=\"cadastroCliente.jsp\">Cadastrar Cliente</a></li>\n");
      out.write("            <li class=\"active\"><a href=\"cadastroFornecedor.jsp\">Cadastrar Fornecedor</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </html>\n");
      out.write("       \n");
      out.write("        <h1 class=\"titulo2\">Cadastro Fornecedor</h1><br>\n");
      out.write("            <div id=\"conteudo\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Entrada de Dados</legend>\n");
      out.write("            <form>\n");
      out.write("                <label class=\"cliente\">Nome </label><input type=\"text\" name=\"nmFornecedor\"><br>\n");
      out.write("                <label class=\"clientes\">Razão Social</label> <input type=\"text\" name=\"razaoSocialFornecedor\"><br>\n");
      out.write("                <label class=\"cliente\">CNPJ </label><input type=\"text\" name=\"cnpjFornecedor\"><br>\n");
      out.write("                <label class=\"cliente\">Email </label><input type=\"text\" name=\"emailFornecedor\"><br>\n");
      out.write("                <label class=\"cliente\">Telefone </label><input type=\"text\" name=\"telFornecedor\"><br>\n");
      out.write("                <label class=\"cliente\">Endereço </label><input type=\"text\" name=\"endFornecedor\"><br>\n");
      out.write("                <input class=\"incluir\" type=\"submit\" name=\"incluir\" value=\"Incluir\"><br>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </fieldset>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("        <div id=\"conteudo-right2\">\n");
      out.write("             <fieldset>\n");
      out.write("            <legend>Alteração de Dados</legend>\n");
      out.write("            <form>\n");
      out.write("                <label class=\"cliente\">ID </label><input type=\"text\" name=\"i\"/><br>               \n");
      out.write("                <label class=\"cliente\">Nome </label><input type=\"text\" name=\"nmFornecedor\"/><br>\n");
      out.write("                <label class=\"cliente\">Razão Social</label><input type=\"text\" name=\"razaoSocialFornecedor\"><br>\n");
      out.write("                <label class=\"cliente\">CNPJ </label><input type=\"text\" name=\"cnpjFornecedor\"><br>\n");
      out.write("                <label class=\"cliente\">Email </label><input type=\"text\" name=\"emailFornecedor\"/><br>\n");
      out.write("                <label class=\"cliente\">Telefone </label><input type=\"text\" name=\"telFornecedor\"/><br>\n");
      out.write("                <label class=\"cliente\">Endereço </label><input type=\"text\" name=\"endFornecedor\"/><br>\n");
      out.write("                <input class=\"altera\" type=\"submit\" name=\"alterar\" value=\"Alterar\"/>\n");
      out.write("            </form>\n");
      out.write("             </fieldset>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("            <table id=\"table\" class=\"table table-bordered\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Razão Social</th>\n");
      out.write("                <th>CNPJ</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Telefone</th>\n");
      out.write("                <th>Endereço</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 for (Fornecedor f: Database.getFornecedores()){ 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                ");
 int i = Database.getFornecedores().indexOf(f); 
      out.write("\n");
      out.write("                <td>");
      out.print( i );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( f.getNome() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( f.getRazaoSocial() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( f.getCnpj() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( f.getEmail() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( f.getTelefone() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( f.getEndereço() );
      out.write("</td>         \n");
      out.write("                <td><form>\n");
      out.write("                    <input type=\"hidden\" name=\"i\" value=\"");
      out.print( i );
      out.write("\"/>\n");
      out.write("                    <input class=\"altera2\" type=\"submit\" name=\"excluir\" value=\"Excluir\"/>\n");
      out.write("                    </form>\n");
      out.write("                </td> \n");
      out.write("            </tr>\n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("           </table>\n");
      out.write("           </div>\n");
      out.write("    ");
      out.write("<div class=\"footer\">\n");
      out.write("  Concretizado cativantemente para o ensino de POO.<br> Fatec PG - 2016\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
