<%-- 
    Document   : cadastroFornecedor
    Created on : 12/10/2016, 22:14:28
    Author     : Luiz
--%>

<%@page import="br.com.fatecpg.cadastros.Fornecedor"%>
<%@page import="br.com.fatecpg.cadastros.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
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
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilocadastro.css">
        <link rel="stylesheet" type="text/css" href="css/estilocliente.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script>
            function unhide(){
                document.getElementById("table").removeAttribute("hidden");
                document.getElementById("listar").setAttribute("onclick","hide()");
            }
             function hide(){
                document.getElementById("table").setAttribute("hidden");
                document.getElementById("listar").setAttribute("onclick","unhide()");
                document.getElementById("listar").setAttribute("value","xxxx");
            }
        </script>
        <title>Controle de Cadastro - Fornecedor</title>
    </head>
    <body>

        <div class="container">

          <br>
          <ul class="nav nav-pills nav-justified">
            <center><img src="img/logo.jpg"></center>
            <li><a href="index.html">Home</a></li>
            <li><a href="cadastroCliente.jsp">Cadastrar Cliente</a></li>
            <li class="active"><a href="cadastroFornecedor.jsp">Cadastrar Fornecedor</a></li>
          </ul>
        </html>
       
        <h1 class="titulo2">Cadastro Fornecedor</h1><br>
            <div id="conteudo">
        <fieldset>
            <legend>Entrada de Dados</legend>
            <form>
                <label class="cliente">Nome </label><input type="text" name="nmFornecedor"><br>
                <label class="clientes">Razão Social</label> <input type="text" name="razaoSocialFornecedor"><br>
                <label class="cliente">CNPJ </label><input type="text" name="cnpjFornecedor"><br>
                <label class="cliente">Email </label><input type="text" name="emailFornecedor"><br>
                <label class="cliente">Telefone </label><input type="text" name="telFornecedor"><br>
                <label class="cliente">Endereço </label><input type="text" name="endFornecedor"><br>
                <input class="incluir" type="submit" name="incluir" value="Incluir"><br>
                
                <input id="listar" type="button" name="listar" value="Listar Fornecedores" onclick="unhide()"/>
            </form>
        </fieldset>
            </div>
          
        <div id="conteudo-right2">
             <fieldset>
            <legend>Modificação de Dados</legend>
            <form>
                <label class="cliente">ID </label><input type="text" name="i"/><br>               
            <label class="cliente">Nome </label><input type="text" name="nmCliente"/><br>
                <label class="cliente">Email </label><input type="text" name="emailCliente"/><br>
                <label class="cliente">Telefone </label><input type="text" name="telCliente"/><br>
                <label class="cliente">Endereço </label><input type="text" name="enderecoCliente"/><br>
                <input class="altera" type="submit" name="alterar" value="Alterar"/>
                <input class="altera2" type="submit" name="excluir" value="Excluir"/>
            </form>
             </fieldset>
        </div>
        
        <br>
            <table hidden id="table" class="table table-bordered" border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Razão Social</th>
                <th>CNPJ</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Endereço</th>
            </tr>
            
            <% for (Fornecedor f: Database.getFornecedores()){ %>
            <tr>
                <% int i = Database.getFornecedores().indexOf(f); %>
                <td><%= i %></td>
                <td><%= f.getNome() %></td>
                <td><%= f.getRazaoSocial() %></td>
                <td><%= f.getCnpj() %></td>
                <td><%= f.getEmail() %></td>
                <td><%= f.getTelefone() %></td>
                <td><%= f.getEndereço() %></td>              
            </tr>
           <% } %>
           </table>
           </div>
    <%@include file="footer.html"%>

</body>
</html>
