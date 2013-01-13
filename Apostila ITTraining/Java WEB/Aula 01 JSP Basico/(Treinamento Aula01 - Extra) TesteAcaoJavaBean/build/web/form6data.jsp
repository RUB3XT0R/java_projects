<%-- 
    Document   : form6data
    Created on : 10/05/2011, 17:36:41
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="produto" class="classes.Produto" scope="session"/>

<head>
   <title>Produtos</title>
</head>
<body>
   <jsp:include page="topo.html"/>
   <h3>Produto cadastrado</h3>
   <table>
      <tr bgcolor="#cfcfef">
         <td>Código</td>
         <td>${produto.codigo}</td>
      </tr>
      <tr bgcolor="#dfdfdf">
         <td>Descrição</td>
         <td>${produto.descricao}</td>
      </tr>
      <tr bgcolor="#cfcfef">
         <td>Preço</td>
         <td>${produto.preco}</td>
      </tr>
   </table>

   <h3>Produto cadastrado</h3>
   <table>
      <tr bgcolor="#cfcfef">
         <td>Código</td>
         <td><jsp:getProperty name="produto" property="codigo"/></td>
      </tr>
      <tr bgcolor="#dfdfdf">
         <td>Descrição</td>
         <td><jsp:getProperty name="produto" property="descricao"/></td>
      </tr>
      <tr bgcolor="#cfcfef">
         <td>Preço</td>
         <td><jsp:getProperty name="produto" property="preco"/></td>
      </tr>
   </table>
   <input type='button'  value='Voltar' onClick='history.go(-1)'/>
   <jsp:include page="footer.html"/>
</body>
</html>