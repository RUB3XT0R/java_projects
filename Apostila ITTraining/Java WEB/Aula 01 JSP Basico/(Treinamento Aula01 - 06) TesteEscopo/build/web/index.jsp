<%-- 
    Document   : index
    Created on : 03/05/2011, 22:08:06
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<html>
   <head>
      <title>Testando Escopo</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <form name="principal" action="validar.jsp" method="post">
         Nome: <input type="text" name="nome"><br/>
         Telefone: <input type="text" name="telefone"><br/>
         <input type="submit" value="Enviar">
      </form>
      <jsp:include page="footer.html"/>
   </body>
</html>
