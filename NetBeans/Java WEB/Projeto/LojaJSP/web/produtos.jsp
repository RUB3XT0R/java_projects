<%-- 
    Document   : produtos
    Created on : 26/07/2011, 14:07:17
    Author     : lucas biason
--%>

<%@page import="controle.ProdutoControle"%>
<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Produtos</h1>
        <h4>Lista de Produtos</h4>
        <table border="0">
            <tr>
                <th>Código</th>
                <th>Descricao</th>
                <th>Valor</th>
                <th>Detalhes</th>
                <th>Alterar</th>
                <th>Deletar</th>
            </tr>
            <c:forEach items="<%= (new ProdutoControle()).getProdutos()%>" var="p">
            <tr>
                <td>${p.codigo}</td>
                <td>${p.descricao}</td>
                <td>${p.valor}</td>
                <th><input type="button" onclick="location.href='viewProduto.jsp?cod=${p.codigo}'"/></th>
                <th><input type="button" onclick="location.href='altProduto.jsp?cod=${p.codigo}'"/></th>
                <th><input type="button" onclick="location.href='delProduto.jsp?cod=${p.codigo}'"></th>
            </tr>
            </c:forEach>
        </table>
        <hr/>
        <h4>Formulário para cadastro de um novo Produto</h4>
        <form name="novoProd" action="addProduto" method="post">
            Descrição<input type="text" name="descricao"/><br/>
            Quantidade<input type="text" name="qtde"/><br/>
            Valor<input type="text" name="valor"/><br/>
            Quantidade Mínima<input type="text" name="qtdeMin"/><br/>
            Quantidade Máxima por compra<input type="text" name="qtdeMax"/><br/>
            Fornecedor<input type="text" name="Fornecedor"/><br/>
            <input type="submit" value="Adicionar"/>
        </form>
    </body>
</html>
