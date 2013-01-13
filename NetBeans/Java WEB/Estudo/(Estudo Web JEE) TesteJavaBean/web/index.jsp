<%-- 
    Document   : index
    Created on : 04/05/2011, 21:33:35
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="listaProduto" scope="session" class="classes.ListaProdutos"/>

<html>
    <head>
    </head>
    <body>
        <h1>Manipulando Produtos!</h1>
        <table border="0">
            <caption>Lista de Produtos</caption>
            
            <tr>
                <th>Nome</th>
                <th>Valor</th>
            </tr>
        <c:forEach items="${listaProduto.produtos}" var="produto">

            <tr>
                <td>${produto.nome}</td>
                <td>${produto.valor}</td>
            </tr>

        </c:forEach>
        </table>

        <a href="Adiciona.jsp">AdicionarNovo</a>
    </body>
</html>
