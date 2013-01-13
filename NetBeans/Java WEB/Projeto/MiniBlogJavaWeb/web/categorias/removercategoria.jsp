<%@page import="modelos.Categoria"%>
<%@page import="java.util.List"%>
<%@page import="banco.Categoria_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../topo.jsp" %>

<html>
    <head>
        <title>Mini Blog - Mini Curso Java WEB</title>
        <link href="../style/estiloMontagem.css" rel="stylesheet" type="text/css" />
    <body>
        
        <div id="cntdPrincipal">
            <h1>Excluir a categoria:</h1>

                <%
                            Categoria c = Categoria_DAO.selecionar(Integer.parseInt(request.getParameter("codigo")));
                %>

                <p>
                    Deseja realamente excluir a categoria <%= c.getNome()%>?<br/>
                    Todos os artigos associados a ela serão apagados!!!
            <form action ="../RemoverCategoria" method="POST">
                <input type="hidden" value="<%= c.getCodigo() %>" name="codigo">
                <input type="submit" value="Excluir">
            </form>
                <a href="inserirCategoria.jsp">Cancelar</a>

        </div>

    </body>
</html>
