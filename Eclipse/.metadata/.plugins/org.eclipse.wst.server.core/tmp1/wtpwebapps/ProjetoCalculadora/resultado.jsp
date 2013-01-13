<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Resultado</title>
    </head>
<body>
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
   </body>
</html>