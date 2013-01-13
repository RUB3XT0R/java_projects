 <%-- 
    Document   : produtos
    Created on : 27/Nov/2011, 13:10:46
    Author     : Lucas Biason
--%>

<%@page import="dao.ProdutoDao"%>
<%@page import="modelo.Produto"%>
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
             onClick="location.href='novoProduto.jsp'"/>
      <h3>Lista de Produtos Cadastrados</h3>
      <table>
         
         <tr>
            <td>Código</td>
            <td>Nome</td>
            <td>Valor (R$)</td>
            <td></td>
         </tr>
         
         <% for(Produto atual : new ProdutoDao().getLista()){ %>
         <tr>
            <td><%= atual.getCodigo() %></td>
            <td><%= atual.getNome() %></td>
            <td><%= atual.getValor() %></td>
            <td>
               <input type="button" value="Alterar >"
               onClick="location.href='upProduto.jsp?cod=<%=atual.getCodigo()%>'"/>
               <input type="button" value="Deletar >"
               onClick="location.href='delProduto.jsp?cod=<%=atual.getCodigo()%>'"/>
            </td>
         </tr>
         <% } %>
      </table>
      
      <jsp:include page="footer.html"/>
   </body>
</html>
