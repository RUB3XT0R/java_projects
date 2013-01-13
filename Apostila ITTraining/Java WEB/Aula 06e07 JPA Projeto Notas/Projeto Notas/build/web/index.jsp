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
      
      <input type="button" value="Cursos >>"
             onClick="location.href='cursos.jsp'"/>
      | 
      <input type="button" value="Alunos >>"
             onClick="location.href='alunos.jsp'"/>
      | 
      <input type="button" value="Inserir Notas >>"
             onClick="location.href='notas.jsp'"/>
      
      <jsp:include page="footer.html"/>
   </body>
</html>
