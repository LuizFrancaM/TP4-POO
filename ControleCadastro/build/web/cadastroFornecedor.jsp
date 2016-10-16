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
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Cadastro - Fornecedor</title>
    </head>
    
        <h1>Cadastro Fornecedor</h1><br>
        <form>
            <input type="text" name="txtpesquisar">
            <input type="submit" name="subpesquisar" value="Pesquisar">
        </form>
        <br>
        <fieldset>
            <legend>Entrada de Dados</legend>
            <form>
                Nome: <input type="text" name="nmFornecedor"><br>
                Razão Social: <input type="text" name="razaoSocialFornecedor"><br>
                CNPJ: <input type="text" name="cnpjFornecedor"><br>
                Email: <input type="text" name="emailFornecedor"><br>
                Telefone: <input type="text" name="telFornecedor"><br>
                Endereço: <input type="text" name="endFornecedor"><br>
                <input type="submit" name="incluir" value="Incluir">
            </form>
        </fieldset>
        <br>
        
            <table border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Razão Social</th>
                <th>CNPJ</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Endereço</th>
                <th>Comandos</th>
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
