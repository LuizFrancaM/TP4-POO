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
      out.write("<!DOCTYPE html>\r\n");

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
    

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilocadastro.css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Controle de Cadastro - Fornecedor</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("          <br>\r\n");
      out.write("          <ul class=\"nav nav-pills nav-justified\">\r\n");
      out.write("            <center><img src=\"img/logo.jpg\"></center>\r\n");
      out.write("            <li><a href=\"index.php\">Home</a></li>\r\n");
      out.write("            <li><a href=\"cadastroCliente.jsp\">Cadastrar Cliente</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">Cadastrar Fornecedor</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </html>\r\n");
      out.write("        \r\n");
      out.write("        <h1>Cadastro Fornecedor</h1><br>\r\n");
      out.write("        <form>\r\n");
      out.write("            <input type=\"text\" name=\"txtpesquisar\">\r\n");
      out.write("            <input type=\"submit\" name=\"subpesquisar\" value=\"Pesquisar\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <br>\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>Entrada de Dados</legend>\r\n");
      out.write("            <form>\r\n");
      out.write("                Nome: <input type=\"text\" name=\"nmFornecedor\"><br>\r\n");
      out.write("                Razão Social: <input type=\"text\" name=\"razaoSocialFornecedor\"><br>\r\n");
      out.write("                CNPJ: <input type=\"text\" name=\"cnpjFornecedor\"><br>\r\n");
      out.write("                Email: <input type=\"text\" name=\"emailFornecedor\"><br>\r\n");
      out.write("                Telefone: <input type=\"text\" name=\"telFornecedor\"><br>\r\n");
      out.write("                Endereço: <input type=\"text\" name=\"endFornecedor\"><br>\r\n");
      out.write("                <input type=\"submit\" name=\"incluir\" value=\"Incluir\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ID</th>\r\n");
      out.write("                <th>Nome</th>\r\n");
      out.write("                <th>Razão Social</th>\r\n");
      out.write("                <th>CNPJ</th>\r\n");
      out.write("                <th>Email</th>\r\n");
      out.write("                <th>Telefone</th>\r\n");
      out.write("                <th>Endereço</th>\r\n");
      out.write("                <th>Comandos</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");
 for (Fornecedor f: Database.getFornecedores()){ 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
 int i = Database.getFornecedores().indexOf(f); 
      out.write("\r\n");
      out.write("                <td>");
      out.print( i );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( f.getNome() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( f.getRazaoSocial() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( f.getCnpj() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( f.getEmail() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( f.getTelefone() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( f.getEndereço() );
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
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
