<%-- 
    Document   : novoProduto
    Created on : 27/Nov/2011, 14:54:01
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
      <script type="text/javascript" src="validacao.js"></script>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      
      <h3>Cadastrando Novo Produto</h3>
      <form name="produto" method="post" action="controlProduto">
         <input type="hidden" name="operacao" value="novo"/>
         Nome: <input type="text" name="nome"/><br/>
         Valor: <input type="text" name="valor"/><br/>
         <input type="button" value="Enviar >>"
                onclick="validarProduto()"/>
      </form>
      
      <jsp:include page="footer.html"/>
   </body>
</html>
