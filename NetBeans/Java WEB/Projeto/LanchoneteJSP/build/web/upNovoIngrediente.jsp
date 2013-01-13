<%-- 
    Document   : upNovoIngrediente
    Created on : 6/Nov/2011, 17:14:12
    Author     : Lucas Biason
--%>

<%@page import="modelo.LancheItens"%>
<%@page import="control.LancheDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="lanche" class="control.LancheControl" scope="session"/>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    int qtde = Integer.parseInt(request.getParameter("qtde"));
    lanche.addItem(id,qtde);
    lanche.getDao().insertLancheItem(lanche.getItem(id), lanche.getLanche().getId());
    lanche.getDao().updateLanche(lanche.getLanche(),false);
    response.sendRedirect("alterarLanche.jsp?id="+lanche.getLanche().getId());
%>
