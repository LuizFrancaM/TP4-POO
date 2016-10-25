<%-- 
    Document   : cadastroCliente
    Created on : 24/10/2016, 20:13:12
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
%>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="css/estilo.css">
         <link rel="stylesheet" type="text/css" href="css/estilocadastro.css">
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
            <li class="active"><a href="#">Cadastrar Cliente</a></li>
            <li><a href="cadastroFornecedor.jsp">Cadastrar Fornecedor</a></li>
          </ul>
        </html>

        <h1>Cadastro Cliente</h1><br>
        <!--
            Inputs Cadastrar cliente
        -->
        <form>
            <input type="text" name="cNome">
            <input type="submit" name="subpesquisar" value="Pesquisar">
        </form>
        <br>
        <fieldset>
            <legend>Entrada de Dados</legend>
            <form>
                Nome: <input type="text" name="nmCliente"><br>
                CPF: <input type="text" name="cpfCliente"><br>
                RG: <input type="text" name="rgCliente"><br>
                Email: <input type="text" name="emailCliente"><br>
                Telefone: <input type="text" name="telCliente"><br>
                Endereço: <input type="text" name="enderecoCliente"><br>
                <input type="submit" name="incluir" value="Incluir">
            </form>
        </fieldset>
        <br>
            
        <!-- 
            Exibição dados
        -->
        <div class="container">
            <table class="table table-bordered" border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>RG</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Endereço</th>
                <th>Comandos</th>
            </tr>
            
        <!-- 
            Exibição dados
        -->
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
                <td>
                    <form>
                        <input type="hidden" name="i" value="<%=i%>"/>
                        <input type="submit" name="excluir" value="Excluir"/>
                    </form>
                    <form>
                        <input type="hidden" name="i" value="<%=i%>"/>
                        <input type="hidden" name="cNome" value="<%=c.getNome()%>"/>
                        <input type="hidden" name="Cpf" value="<%=c.getCpf()%>"/>
                        <input type="hidden" name="Rg" value="<%=c.getRg()%>"/>
                        <input type="hidden" name="Email" value="<%=c.getEmail()%>"/>
                        <input type="hidden" name="Telefone" value="<%=c.getTelefone()%>"/>
                        <input type="hidden" name="Endereço" value="<%=c.getEndereço()%>"/>
                        <input type="submit" name="alterar" value="Alterar" action="alterarCliente.jsp"/>
                    </form>
                </td>                
            </tr>
           <% } %>
           </table>
        </div>
        
        <%
        if (request.getParameter("Pesquisar") != null){
        String cNome = request.getParameter("cNome");
        for (Cliente c: Database.getClientes()){
            if (c.getNome() == cNome){ %>
            <% int i = Database.getClientes().indexOf(c); %>
            <table>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>RG</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Endereço</th>
                <th>Comandos</th>
            </tr>
            <tr>
                <td><%= i %></td>
                <td><%= c.getNome() %></td>
                <td><%= c.getCpf() %></td>
                <td><%= c.getRg() %></td>
                <td><%= c.getEmail() %></td>
                <td><%= c.getTelefone() %></td>
                <td><%= c.getEndereço() %></td>
            </tr>
            </table>
            <%
        }
    }
}
%>
           
           
</div>
           <%@include file="footer.html"%>
    </body>
</html>
