<%-- 
    Document   : ProcessarAcesso
    Created on : 04/05/2011, 17:09:48
    Author     : Lucas Biason

        Explicar e mostrar, detectar o erro e ai sim corrigir e explicar a materia.
        Bem-vindo, <%= request.getParameter("nome") %>, a segunda p�gina.<br/>
        Seu telefone � : <%= request.getParameter("telefone") %>
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<html>
   <head>
      <title>Resultado</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      
      Bem-vindo, <%= application.getAttribute("nome")%>, a segunda p�gina.<br/>
      Seu telefone � : <%= application.getAttribute("telefone")%>
   
      <br/>
      <input type='button'  value='Voltar' onClick='history.go(-1)'/>
      <jsp:include page="footer.html"/>
   </body>
</html>
