<%@page import="classes.produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.ListaProdutos" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="listaProduto" scope="session" class="classes.ListaProdutos"/>
<html>
   <head>
      <title>Produtos</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <h2>Lista de Produtos</h2>
      <table border="1">
         <tr>
            <td>Nome:</td>
            <th>Valor:</th>
         </tr>

         <% ListaProdutos lista = new ListaProdutos();%>
         <% for (produto p : lista.getProdutos()) {%>
         <tr>
            <td><%= p.getNome()%></td>
            <th><%= p.getValor()%></th>
         </tr>
         <% }%>

      </table>

      <p>tabela usando o java beans com taglibs :</p>
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
      <p>tabela usando as taglibs sem javabeans:</p>
      <table border="1">
         <tr>
            <td>Nome:</td>
            <th>Valor:</th>
         </tr>

         <c:forEach items="<%= lista.getProdutos()%>" var="pr">
            <tr>
               <td>${ pr.nome}</td>
               <th>${ pr.valor}</th>
            </tr>
         </c:forEach>

      </table>

      <jsp:include page="footer.html"/>
   </body>
</html>
