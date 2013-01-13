<%-- 
    Document   : produtos
    Created on : 27/Nov/2011, 13:10:46
    Author     : Lucas Biason
--%>

<%@page import="modelo.Cliente"%>
<%@page import="dao.ClienteDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <input type="button" value="Voltar"
             onClick="location.href='index.jsp'"/> |
      <input type="button" value="Novo >>"
             onClick="location.href='novoCliente.jsp'"/>
      <h3>Lista de Clientes Cadastrados</h3>
      <table>
         
         <tr>
            <td>Código</td>
            <td>CPF</td>
            <td>Nome</td>
            <td>Telefone</td>
            <td>Endereço</td>
            <td></td>
         </tr>
         
         <% for(Cliente c : new ClienteDao().getLista()){ %>
         <tr>
            <td><%= c.getCodigo() %></td>
            <td><%= c.getCpf() %></td>
            <td><%= c.getNome() %></td>
            <td><%= c.getTelefone() %></td>
            <td><%= c.getEndereco() %></td>
            <td>
               <input type="button" value="Alterar >"
               onClick="location.href='upCliente.jsp?cod=<%= c.getCodigo() %>'"/>
               <input type="button" value="Deletar >"
               onClick="location.href='delCliente.jsp?cod=<%= c.getCodigo() %>'"/>
            </td>
         </tr>
         <% } %>
      </table>
      
      <jsp:include page="footer.html"/>
   </body>
</html>
