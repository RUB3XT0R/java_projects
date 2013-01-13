<%@page import="modelos.Artigo"%>
<%@page import="banco.Artigo_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../topo.jsp" %>
<%@include file="../rodape.jsp" %>
<%@include file="../menu.jsp"%>

<html>
    <head>
        <title>Mini Blog - Mini Curso Java WEB</title>
        <link href="../style/estiloMontagem.css" rel="stylesheet" type="text/css" />
    <body>

        <div id="cntdPrincipal">
            <%
                        int codigo = Integer.parseInt(request.getParameter("codigo"));
                        Artigo atual = Artigo_DAO.selecionar(codigo);
            %>
            <h1><%= atual.getTitulo() %></h1>
            <h4><%= atual.getAutor() %> - <%= atual.getDataHora() %></h4>
            <hr>
                <p>
                    <%= atual.getConteudo()%>
                </p>
            <hr>
            <a href="../index.jsp">Voltar</a>
        </div>
    </body>
</html>
