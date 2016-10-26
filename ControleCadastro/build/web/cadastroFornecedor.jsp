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
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <link rel="stylesheet" type="text/css" href="css/estilocadastro.css">
        <link rel="stylesheet" type="text/css" href="css/estilofornecedor.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
       
        <h1 class="titulo">Cadastro Fornecedor</h1><br>
            <div id="conteudo">
        <fieldset>
            <legend>Entrada de Dados</legend>
            <form>
                <label class="func">Nome </label><input type="text" name="nmFornecedor"><br>
                <label class="funcs">Razão Social</label> <input type="text" name="razaoSocialFornecedor"><br>
                <label class="func">CNPJ </label><input type="text" name="cnpjFornecedor"><br>
                <label class="func">Email </label><input type="text" name="emailFornecedor"><br>
                <label class="func">Telefone </label><input type="text" name="telFornecedor"><br>
                <label class="func">Endereço </label><input type="text" name="endFornecedor"><br>
                <input class="incluir" type="submit" name="incluir" value="Incluir"><br>
                
                <label class="func">ID </label><input type="text" name="i"/><br>
                <input type="submit" name="alterar" value="Alterar"/>
                <input type="submit" name="excluir" value="Excluir"/>
            </form>
        </fieldset>
        
        <br>
            <table class="table table-bordered" border="1">
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
        </div>  
                      <%@include file="footer.html"%>

</body>
</html>
