<%--
    Document   : alterarCliente
    Created on : 25/10/2016, 11:29:32
    Author     : BrunoNistico
--%>

<%@page import="br.com.fatecpg.cadastros.Fornecedor"%>
<%@page import="br.com.fatecpg.cadastros.Cliente"%>
<%@page import="br.com.fatecpg.cadastros.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
            



%>
            
        <h1>Alterar dados de cliente</h1>
        
        <fieldset>
            <legend>Entrada de Dados</legend>
            <form>
                 <% for (Cliente c: Database.getClientes()){ %>
                 <% int i = Database.getClientes().indexOf(c); %>
                        <input type="text" name="i" value="<%=i%>"/>
                        <input type="text" name="cNome" value="<%=c.getNome()%>"/>
                        <input type="text" name="Cpf" value="<%=c.getCpf()%>"/>
                        <input type="text" name="Rg" value="<%=c.getRg()%>"/>
                        <input type="text" name="Email" value="<%=c.getEmail()%>"/>
                        <input type="text" name="Telefone" value="<%=c.getTelefone()%>"/>
                        <input type="text" name="Endereço" value="<%=c.getEndereço()%>"/>
                <input type="submit" name="incluir" value="Incluir">
            </form>
        </fieldset>
    </body>
</html>
