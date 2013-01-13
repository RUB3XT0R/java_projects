<%-- 
    Document   : newjs
    Created on : 3/Nov/2011, 7:40:58
    Author     : Lucas Biason
--%>

<%@page import="modelo.LancheItens"%>
<%@page import="modelo.Ingrediente"%>
<%@page import="control.IngredienteDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="lanche" class="control.LancheControl" scope="session"/>

<%  int id = Integer.parseInt(request.getParameter("id"));
    lanche.delItem(id);
    response.sendRedirect("novoLanche.jsp"); %>