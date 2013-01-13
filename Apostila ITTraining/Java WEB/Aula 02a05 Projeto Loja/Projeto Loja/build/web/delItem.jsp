<%-- 
    Document   : delItem
    Created on : 1/Dez/2011, 20:02:57
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="venda" class="modelo.Venda" scope="session"/>
<%
      int id = Integer.parseInt(request.getParameter("id"));
      venda.delItem(id);
      response.sendRedirect("novaVenda.jsp");
%>
