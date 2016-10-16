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
    /*if (request.getParameter("subpesquisar") != null){
        int tam = Database.getFornecedores().size();
        String pesq = request.getParameter("txtpesquisar");
        try{
            for (int i = 0; i < tam; i++){
                if (pesq == f.getNome()){
                }
            
            }
            
        } catch (Exception e){
            System.out.println("Registro não encontrado");
        }
    }*/

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Controle de Cadastro - Fornecedor</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        <h1>Cadastro Fornecedor</h1><br>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"text\" name=\"txtpesquisar\">\n");
      out.write("            <input type=\"submit\" name=\"subpesquisar\" value=\"Pesquisar\">\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Entrada de Dados</legend>\n");
      out.write("            <form>\n");
      out.write("                Nome: <input type=\"text\" name=\"nmFornecedor\"><br>\n");
      out.write("                Razão Social: <input type=\"text\" name=\"razaoSocialFornecedor\"><br>\n");
      out.write("                CNPJ: <input type=\"text\" name=\"cnpjFornecedor\"><br>\n");
      out.write("                Email: <input type=\"text\" name=\"emailFornecedor\"><br>\n");
      out.write("                Telefone: <input type=\"text\" name=\"telFornecedor\"><br>\n");
      out.write("                Endereço: <input type=\"text\" name=\"endFornecedor\"><br>\n");
      out.write("                <input type=\"submit\" name=\"incluir\" value=\"Incluir\">\n");
      out.write("            </form>\n");
      out.write("        </fieldset>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("            <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Razão Social</th>\n");
      out.write("                <th>CNPJ</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Telefone</th>\n");
      out.write("                <th>Endereço</th>\n");
      out.write("                <th>Comandos</th>\n");
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
