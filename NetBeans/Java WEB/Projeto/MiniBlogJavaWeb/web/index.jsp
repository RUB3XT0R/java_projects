

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="topo.jsp" %>
<%@include file="menulateral.jsp" %>
<%@include file="rodape.jsp" %>
<%@include file="menu.jsp"%>

<html>
    <head>
        <title>Mini Blog - Mini Curso Java WEB</title>
        <link href="style/estiloMontagem.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="cntdPrincipal">
            <%@include file="artigos/visualizarArtigos.jsp" %>
        </div>
    </body>
</html>
