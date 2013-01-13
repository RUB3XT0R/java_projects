<%-- 
    Document   : delCliente
    Created on : 4/Nov/2011, 17:27:23
    Author     : Lucas Biason
--%>

<%@page import="dao.ClienteDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%
    new ClienteDao().delCliente(Integer.parseInt(request.getParameter("id")));
    response.sendRedirect("clientes.jsp");
%>
