

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<html>
    <head>
        <title>Resultado</title>
    </head>
    <body>
      <jsp:include page="topo.html"/>
        <h1>Resultado da soma!</h1>
        <%
            int valor1 = Integer.parseInt(request.getParameter("valor1"));
            int valor2 = Integer.parseInt(request.getParameter("valor2"));
        %>
        <p>O valor da Soma dos números (<%= valor1 %> e <%= valor2%>) é: <%= (valor1+valor2)%></p>
        <input type='button'  value='Voltar' onClick='history.go(-1)'/>
      <jsp:include page="footer.html"/>
    </body>
</html>
