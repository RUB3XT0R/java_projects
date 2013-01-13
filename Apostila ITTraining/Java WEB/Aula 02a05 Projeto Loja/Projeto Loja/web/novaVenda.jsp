<%-- 
    Document   : novaVenda
    Created on : 28/Nov/2011, 14:42:49
    Author     : Lucas Biason
--%>

<%@page import="dao.ClienteDao"%>
<%@page import="modelo.Cliente"%>
<%@page import="modelo.Venda"%>
<%@page import="modelo.VendaItem"%>
<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="venda" class="modelo.Venda" scope="session"/>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <h3>Caixa </h3>
      <form name="vendaForm" action="addItem.jsp" method="post">
         Produto:<select name="produto">
            <option value=""></option>
            <% for(Produto p : new ProdutoDao().getLista()){ %>
               <option value="<%= p.getCodigo() %>"><%= p.getNome() %></option>
            <%}%>
         </select><br/>
         Quantidade:<input type="text" value="" name="qtde" size="3"></br>
         <input type="button" value="Adicionar >>" onClick="document.forms.vendaForm.submit()"/>
      </form>
      <hr/>
      <table>
         <caption>Lista de Itens</caption>
         <tr>
            <th>Nome</th><th>Qtde</th><th>SubTotal</th>
         </tr>
         <% for(VendaItem vi : venda.getItens()){ %>
            <tr>
               <td><%= vi.getProduto().getNome() %></td>
               <td><%= vi.getQtde() %></td>
               <td>x(<%= vi.getProduto().getValor() %>) = 
                  <%= vi.getQtde()*vi.getProduto().getValor() %></td>
               <td><input type="button" value="Deletar" 
                          onClick="location.href='delItem.jsp?id='+<%= vi.getProduto().getCodigo() %>"></td>
            </tr>
         <%}%>
      </table>
      <hr/>
      <form name="vendaDado" method="post" action="controlVenda">
         <input type="hidden" name="operacao" value="nova"/>
         Cliente:<select name="cliente">
            <option value=""></option>
            <% for(Cliente c : new ClienteDao().getLista()){ %>
               <option value="<%= c.getCodigo() %>"><%= c.getNome() %></option>
            <%}%>
         </select><br/>
         <input type="button" value="Concluir Venda" 
                          onClick="document.forms.vendaDado.submit()">
      </form>
      <jsp:include page="footer.html"/>
   </body>
</html>
