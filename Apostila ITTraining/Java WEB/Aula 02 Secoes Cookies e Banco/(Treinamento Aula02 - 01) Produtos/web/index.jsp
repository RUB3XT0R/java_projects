<%@page import="classes.produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.ListaProdutos" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="listaProduto" scope="application" class="classes.ListaProdutos"/>

<html>
    <head>
        <title>Produtos</title>
    </head>
    <body>
      <jsp:include page="topo.html"/>
        <table border="1">
            <tr>
                <td>Nome:</td>
                <th>Valor:</th>
            </tr>
            <c:forEach items="${listaProduto.produtos}" var="produto">
                <tr>
                    <td>${ produto.nome}</td>
                    <th>${ produto.valor}</th>
                </tr>
            </c:forEach>
        </table>
        <a href="add.jsp">Novo Produto</a>
        
      <jsp:include page="footer.html"/>
    </body>
</html>
