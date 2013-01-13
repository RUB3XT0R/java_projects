<%-- 
    Document   : index
    Created on : 20/07/2011, 19:20:09
    Author     : lucas biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<html>
   <head>
      <title>Testando Servlets</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <input type="button" value="Acesso >>" 
             onClick="location.href='Acesso.jsp'"/><br/>
      <input type="button" value="Música >>" 
             onClick="location.href='musica.jsp'"/><br/>
      <input type="button" value="Formulários >>" 
             onClick="location.href='varredura.jsp'"/>
      <jsp:include page="footer.html"/>
   </body>
</html>

