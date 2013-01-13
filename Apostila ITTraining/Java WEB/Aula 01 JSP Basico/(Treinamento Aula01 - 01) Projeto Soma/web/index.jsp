

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>

<html>
    <head>
        <title>Soma de dois números</title>
    </head>
    <body>
       <jsp:include page="topo.html"/>
        <form action="resultado.jsp" method="GET">
            Digite o primeiro valor:<input type="text" name="valor1"><br/>
            Digite o segundo valor:<input type="text" name="valor2"><br/>
            <input type="submit" value="Somar">
        </form>
        <jsp:include page="footer.html"/>
    </body>
</html>
