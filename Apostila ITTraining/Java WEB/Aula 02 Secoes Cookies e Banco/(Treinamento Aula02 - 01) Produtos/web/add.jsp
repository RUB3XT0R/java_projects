

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Adicionando um Produto</title>
        <script language="JavaScript" src="validar.js"></script>
    </head>
    <body>
        <jsp:include page="topo.html"/>
        <form name="principal" action="adProduto.jsp" method="post">
            Entre com o nome do produto:<input text="text" name="nome" value=""><br/>
            Entre com o valor do produto:<input  text="text" name="valor" value=""><br/>
            <input type="button" value="Adicionar" onclick="validar()">
        </form>
        <jsp:include page="footer.html"/>
    </body>
</html>
