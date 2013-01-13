

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Calculadora</title>
    </head>
    <body>
       <jsp:include page="topo.html"/>
        <form action="resultado.jsp" method="GET">
            Digite o primeiro valor:<input type="text" name="valor1"><br/>
            Digite o segundo valor:<input type="text" name="valor2"><br/>
            <select name="operacao">
                <option selected value="Soma" name="Soma">Soma</option>
                <option value="Subtracao" name="Subtracao">Subtração</option>
                <option value="Divisao" name="Divisao">Divisão</option>
                <option value="Multiplicacao" name="Multiplicacao">Multiplicação</option>
            </select>
            <input type="submit" value="Calcular">
        </form>
       <jsp:include page="footer.html"/>
    </body>
</html>
