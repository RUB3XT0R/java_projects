<%-- 
    Document   : Adicionado
    Created on : 05/05/2011, 18:03:28
    Author     : Lucas Biason
--%>

<%@page import="classes.produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<jsp:useBean id="listaProduto" scope="session" class="classes.ListaProdutos"/>


<%
    String nome = request.getParameter("nome");
    float valor = Float.parseFloat(request.getParameter("valor"));
    listaProduto.addProduto(nome, valor);
    response.sendRedirect("index.jsp");
%>
