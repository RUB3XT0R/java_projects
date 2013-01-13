<%-- 
    Document   : adProduto
    Created on : 24/03/2011, 08:25:14
    Author     : Lucas Biason
--%>

<%@page import="classes.ListaProdutos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="listaProduto" scope="application" class="classes.ListaProdutos"/>

<html>
    <head>
        <title>ADICIONANDO</title>
    </head>
    <body>
       
        <jsp:include page="topo.html"/>
        <%
            String nome= request.getParameter("nome");
            float valor = Float.parseFloat(request.getParameter("valor"));
            listaProduto.addProduto(nome, valor);
        %>
        <p>O produto <%= nome %> foi cadastrado com sucesso.</p>
        <a href="index.jsp">Voltar</a>
        
        <jsp:include page="footer.html"/>
    </body>
</html>
