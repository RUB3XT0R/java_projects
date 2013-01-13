<%-- 
    Document   : upRemoverIngreLanche
    Created on : 4/Nov/2011, 8:58:11
    Author     : Lucas Biason
--%>


<%@page import="control.LancheDao"%>
<%@page import="modelo.LancheItens"%>
<%@page import="modelo.Ingrediente"%>
<%@page import="control.IngredienteDao"%>
<%@page import="control.IngredienteDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="lanche" class="control.LancheControl" scope="session"/>

<%
    int lid = Integer.parseInt(request.getParameter("lid"));
    int iid = Integer.parseInt(request.getParameter("iid"));
    new LancheDao().removeLancheItem(lid,iid);
    response.sendRedirect("alterarLanche.jsp?id="+lid);
%>
