
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
         float resultado = 0;

         if (operacao.equals("Soma")) {
            resultado = valor1 + valor2;
         } else if (operacao.equals("Subtracao")) {
            resultado = valor1 - valor2;
         } else if (operacao.equals("Multiplicacao")) {
            resultado = valor1 * valor2;
         } else if (operacao.equals("Divisao")) {
            resultado = valor1 / valor2;
         }

      %>
      <h1>Resultado da <%= operacao%>!</h1>

      <p>O valor da <%= operacao%> dos números (<%= valor1%> e <%= valor2%>) é: <%= resultado%></p>
      <input type='button'  value='Voltar' onClick='history.go(-1)'/>
      <jsp:include page="footer.html"/>
   </body>
</html>
