<%@page import="modelos.Artigo"%>
<%@page import="banco.Artigo_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../topo.jsp" %>

<html>
    <head>
        <title>Mini Blog - Mini Curso Java WEB</title>
        <link href="../style/estiloMontagem.css" rel="stylesheet" type="text/css" />
    <body>

        <div id="cntdPrincipal">
            <h1>Excluir o artigo:</h1>

                <%
                            Artigo c = Artigo_DAO.selecionar(Integer.parseInt(request.getParameter("codigo")));
                %>

                <p>
                    Deseja realamente excluir o artigo <%= c.getTitulo()%>?<br/>
            <form action ="../RemoverArtigo" method="POST">
                <input type="hidden" value="<%= c.getCodigo() %>" name="codigo">
                <input type="submit" value="Excluir">
            </form>
                <a href="artigos.jsp">Cancelar</a>

        </div>

    </body>
</html>
