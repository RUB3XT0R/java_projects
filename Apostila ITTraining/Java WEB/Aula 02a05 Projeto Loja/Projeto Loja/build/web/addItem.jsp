<%-- 
    Document   : addItem
    Created on : 1/Dez/2011, 16:41:59
    Author     : Lucas Biason
--%>

<%@page import="dao.ProdutoDao"%>
<%@page import="modelo.VendaItem"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="venda" class="modelo.Venda" scope="session"/>
<!DOCTYPE html>
<%
      int id = Integer.parseInt(request.getParameter("produto"));
      int qtde = Integer.parseInt(request.getParameter("qtde"));
      VendaItem vi = new VendaItem();
      vi.setProduto(new ProdutoDao().get(id));
      vi.setQtde(qtde);
      venda.addItens(vi);
      response.sendRedirect("novaVenda.jsp");
%>
