<%-- 
    Document   : addNovoIngrediente
    Created on : 2/Nov/2011, 22:09:14
    Author     : Lucas Biason
--%>

<%@page import="modelo.LancheItens"%>
<%@page import="modelo.Ingrediente"%>
<%@page import="control.IngredienteDao"%>
<%@page import="control.IngredienteDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="lanche" class="control.LancheControl" scope="session"/>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    int qtde = Integer.parseInt(request.getParameter("qtde"));
    lanche.addItem(id, qtde);
    response.sendRedirect("novoLanche.jsp");
%>
