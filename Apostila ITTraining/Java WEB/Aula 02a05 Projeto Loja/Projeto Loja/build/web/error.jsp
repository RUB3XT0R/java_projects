<%-- 
    Document   : error
    Created on : 27/Nov/2011, 17:37:17
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>Relat�rio de Erro</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      
      <h2>Um erro foi encontrado.<br/>
          A opera��o n�o p�de ser conclu�da.</h2>
      <input type="button" value="Voltar"
             onClick="history.go(-1)"/>
         
      <jsp:include page="footer.html"/>
   </body>
</html>
