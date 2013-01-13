<%-- 
    Document   : index
    Created on : 23/Nov/2011, 9:47:22
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>Projeto ITTraining</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      
      <input type="button" value="Produtos >>"
             onClick="location.href='produtos.jsp'"/>
         
      <!-- exercício -->
      <input type="button" value="Clientes >>"
             onClick="location.href='clientes.jsp'"/>
      
      <!-- aula, depois do exercício acima -->
      <input type="button" value="Vendas >>"
             onClick="location.href='vendas.jsp'"/>
      
      <jsp:include page="footer.html"/>
   </body>
</html>
