
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classe.Calculadora" %>

<html>
   <head>
      <title>Resultado</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <%
         int valor1 = Integer.parseInt(request.getParameter("valor1"));
         int valor2 = Integer.parseInt(request.getParameter("valor2"));
         String operacao = request.getParameter("operacao");
         Calculadora c = new Calculadora(valor1, valor2, operacao);
      %>
      <h1>Resultado da <%= operacao%>!</h1>

      <p>O valor da <%= operacao%> dos números (<%= valor1%> e <%= valor2%>) é: 
         <%= c.getResultado()%></p>
      <input type='button'  value='Voltar' onClick='history.go(-1)'/>
      <jsp:include page="footer.html"/>
   </body>
</html>
