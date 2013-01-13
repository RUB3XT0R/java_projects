<%-- 
    Document   : Acesso
    Created on : 05/05/2011, 16:44:47
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<html>
   <head>
      <title>Testando Servlets</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <form name="principal" action="Teste" method="post">
         Primeiro Nome: <input type="text" name="primeironome"><br/>
         Segundo Nome: <input type="text" name="segundonome"><br/>
         <input type="submit" value="Enviar">
         <input type='button'  value='Voltar' onClick='history.go(-1)'/>
      </form>
      <jsp:include page="footer.html"/>
   </body>
</html>

