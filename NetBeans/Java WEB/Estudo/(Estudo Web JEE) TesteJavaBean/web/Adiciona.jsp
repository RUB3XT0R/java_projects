<%-- 
    Document   : Adicionar
    Created on : 05/05/2011, 17:59:39
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="listaProduto" scope="session" class="classes.ListaProdutos"/>
<jsp:useBean id="produto" scope="session" class="classes.produto"/>

<html>
    <head>
    </head>
    <body>
        <form name="principal" action="Adicionado.jsp" method="post">
            Nome:<input type="text" name="nome"><br/>
            Valor:<input type="text" name="valor"><br/>
            <input type="submit" value="Enviar >>">
        </form>
    </body>
</html>
