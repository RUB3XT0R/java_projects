<%-- 
    Document   : verVendas
    Created on : 1/Dez/2011, 21:22:37
    Author     : Lucas Biason
--%>

<%@page import="modelo.VendaItem"%>
<%@page import="modelo.Venda"%>
<%@page import="dao.VendaDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <% Venda v = new VendaDao().getVenda(Integer.parseInt(request.getParameter("id"))); %>
      
      <jsp:include page="topo.html"/>
      Data :<%= v.getData_venda() %><br/>
      Cliente: <%= v.getCliente().getNome() %></br>
      -     Tel.:<%= v.getCliente().getTelefone() %></br>
      Itens:<br/>
      <% for(VendaItem vi : v.getItens()) { %>
      -     Nome: <%= vi.getProduto().getNome() %>, Qtde: <%= vi.getQtde() %><br/>
      <%}%>
      Total: <%= v.getTotal() %>
      <input type="button" value="Voltar" onClick="history.go(-1)"/> 
      <jsp:include page="footer.html"/>
   </body>
</html>
