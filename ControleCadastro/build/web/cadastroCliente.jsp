<%-- 
    Document   : cadastroFornecedor
    Created on : 12/10/2016, 22:14:28
    Author     : Luiz
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
        <title>Controle de Cadastro - Fornecedor</title>
    </head>
    
        <h1>Cadastro Cliente</h1><br>
        
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
        
            <table border="1">
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
                </td>                
            </tr>
           <% } %>
           </table>
        
        
    
</html>
