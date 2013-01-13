<%-- 
    Document   : novaVenda
    Created on : 28/Nov/2011, 14:42:49
    Author     : Lucas Biason
--%>

<%@page import="dao.VendaDao"%>
<%@page import="modelo.Venda"%>
<%@page import="modelo.VendaItem"%>
<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="venda" class="modelo.Venda" scope="application"/>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <input type="button" value="Voltar"
             onClick="location.href='index.jsp'"/> |
      <input type="button" value="Nova >>"
             onClick="location.href='novaVenda.jsp'"/>
      <h3>Lista de Vendas Realizadas</h3>
      <table>
         <tr>
            <td>Data</td><td>Cliente</td><td>Total</td>
         </tr>
         <% for(Venda v : new VendaDao().getAllVendas()){ %>
            <tr>
            <td><%= v.getData_venda() %></td>
            <td><%= v.getCliente().getNome() %></td>
            <td><%= v.getTotal() %></td>
            <td>
               <input type="button" name="Detalhes" value="Ver Detalhes"
                      onclick="location.href='verVendas.jsp?id=<%= v.getCodigo() %>'"/>
            </td>
         </tr>
         <%}%>
      </table>
      <jsp:include page="footer.html"/>
   </body>
</html>
