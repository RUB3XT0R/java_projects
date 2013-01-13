<%-- 
    Document   : addLanche
    Created on : 3/Nov/2011, 8:15:56
    Author     : Lucas Biason
--%>

<%@page import="control.LancheDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="lanche" class="control.LancheControl" scope="session"/>

<% 
   if(new LancheDao().insertLanche(lanche.getLanche(),true)){
        response.sendRedirect("lanches.jsp?msg=ok"); 
        lanche.refresh();
   }else{
        response.sendRedirect("novoLanche.jsp"); 
   }
%>
