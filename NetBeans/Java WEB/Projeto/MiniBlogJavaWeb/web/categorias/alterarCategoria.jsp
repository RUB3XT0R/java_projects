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
            <h1>Alterando nome da categoria:</h1>

                <%
                    Categoria c = Categoria_DAO.selecionar(Integer.parseInt(request.getParameter("codigo")));
                %>

                <p>
                    Entre com um nome para alterar a categoria:
                <form action ="../AlterarCategoria" method="POST">
                <input type="hidden" value="<%= c.getCodigo() %>" name="codigo">
                Nome: <input type="text" name="nome" value="<%= c.getNome() %>">
                <input type="submit" value="Inserir">
            </form>
                <a href="inserirCategoria.jsp">Voltar</a>

        </div>

    </body>
</html>
