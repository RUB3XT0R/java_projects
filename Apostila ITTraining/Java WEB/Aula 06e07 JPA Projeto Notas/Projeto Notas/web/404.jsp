<%-- 
    Document   : newjsp
    Created on : 27/Nov/2011, 17:36:54
    Author     : Lucas Biason
--%>


<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>Relatório de Erro</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      
      <h2>A página que você acessou não existe.</h2>
      <input type="button" value="Voltar"
             onClick="history.go(-1)"/>
         
      <jsp:include page="footer.html"/>
   </body>
</html>

