<%-- 
    Document   : cadastroCliente
    Created on : 23/10/2016, 20:16:28
    Author     : Bruno
--%>

<%@page import="br.com.fatecpg.cadastros.Fornecedor"%>
<%@page import="br.com.fatecpg.cadastros.Cliente"%>
<%@page import="br.com.fatecpg.cadastros.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
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
    if (request.getParameter("alterar") != null){
        String par = request.getParameter("i");
        int i = Integer.parseInt(par);
        
        Cliente c = new Cliente ();
        c.setNome(request.getParameter("nmCliente"));
        c.setCpf(request.getParameter("cpfCliente"));
        c.setRg (request.getParameter("rgCliente"));
        c.setEmail(request.getParameter("emailCliente"));
        c.setTelefone (request.getParameter("telCliente"));
        c.setEndereço(request.getParameter("enderecoCliente"));
        
        Database.getClientes().set(i,c);
        
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
         </script>
        <title>Controle de Cadastro - Fornecedor</title>
    </head>
    <body>
        <div class="container">

          <br>
          <ul class="nav nav-pills nav-justified">
            <center><img src="img/logo.jpg"></center>
            <li><a href="index.html">Home</a></li>
            <li class="active"><a href="cadastroCliente.jsp">Cadastrar Cliente</a></li>
            <li><a href="cadastroFornecedor.jsp">Cadastrar Fornecedor</a></li>
          </ul>
        </html>
        
        <div id="conteudo">
        <h1 class="titulo">Cadastro Cliente</h1><br>
        
        <fieldset>
            <legend>Entrada de Dados</legend>
            <form>
                <label class="cliente">Nomes </label><input type="text" name="nmCliente"/><br>
                <label class="cliente">CPF </label><input type="text" name="cpfCliente"/><br>
                <label class="cliente">RG </label><input type="text" name="rgCliente"/><br>
                <label class="cliente">Email </label><input type="text" name="emailCliente"/><br>
                <label class="cliente">Telefone </label><input type="text" name="telCliente"/><br>
                <label class="cliente">Endereço </label><input type="text" name="enderecoCliente"/><br>
                <input class="incluir" type="submit" name="incluir" value="Incluir"/><br>
                
                <input id="listar" type="button" name="listar" value="Listar Clientes" onclick="unhide()"/>
            </form>
        </fieldset>
        </div>
        
        <div id="conteudo-right">
             <fieldset>
            <legend>Modificação de Dados</legend>
            <form>
                <label class="cliente">ID </label><input type="text" name="i"/><br>               
                <label class="cliente">Nome </label><input type="text" name="nmCliente"/><br>
                <label class="cliente">CPF </label><input type="text" name="cpfCliente"/><br>
                <label class="cliente">RG </label><input type="text" name="rgCliente"/><br>
                <label class="cliente">Email </label><input type="text" name="emailCliente"/><br>
                <label class="cliente">Telefone </label><input type="text" name="telCliente"/><br>
                <label class="cliente">Endereço </label><input type="text" name="enderecoCliente"/><br>
                <input class="altera" type="submit" name="alterar" value="Alterar"/>
                <input class="altera2" type="submit" name="excluir" value="Excluir"/>
            </form>
             </fieldset>
        </div>
            <table hidden id="table" class="table table-bordered" border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>RG</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Endereço</th>
            </tr>
            
            <% for (Cliente c: Database.getClientes()){ %>
            <tr>
                <% int i = Database.getClientes().indexOf(c); %>
                <td><%= i %></td>
                <td><%= c.getNome() %></td>
                <td><%= c.getCpf() %></td>
                <td><%= c.getRg() %></td>
                <td><%= c.getEmail() %></td>
                <td><%= c.getTelefone() %></td>
                <td><%= c.getEndereço() %></td>              
            </tr>
            
           <% } %>
           </table>
        
        
        </div>
           <%@include file="footer.html"%>
    </body>
</html>
