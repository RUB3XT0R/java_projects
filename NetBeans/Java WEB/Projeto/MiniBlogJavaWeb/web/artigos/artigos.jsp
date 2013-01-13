<%-- 
    Document   : artigos
    Created on : 16/04/2011, 16:21:32
    Author     : Lucas Biason
--%>

<%@page import="modelos.Artigo"%>
<%@page import="java.util.List"%>
<%@page import="banco.Artigo_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../topo.jsp" %>

<html>
    <head>
        <title>Mini Blog - Mini Curso Java WEB</title>
        <link href="../style/estiloMontagem.css" rel="stylesheet" type="text/css" />
    <body>
        <div id="cntdPrincipal">
            <h1>Artigos</h1>
            <table align="center">
                <tr class="tabletdtitle">
                    <td><b>Código</b></td>
                    <td><b>Titulo</b></td>
                    <td><b>Data/Hora</b></td>
                    <td><b>Autor</b></td>
                    </tr>
                <%
                            List<Artigo> artigos = Artigo_DAO.listar();
                            for (Artigo artigo : artigos) {
                %>
                <tr>
                    <td styleClass="tabletd1">
                        <b><%=artigo.getCodigo()%></b>
                    </td>

                    <td styleClass="tabletd2">
                        <%=artigo.getTitulo()%>
                    </td>

                    <td styleClass="tabletd1">
                        <b><%=artigo.getDataHora()%></b>
                    </td>

                    <td styleClass="tabletd2">
                        <%=artigo.getAutor()%>
                    </td>

                    <td>
                        <b><a href="alterarArtigo.jsp?codigo=<%=artigo.getCodigo()%>">Alterar</a></b>
                        <b><a href="removerArtigo.jsp?codigo=<%=artigo.getCodigo()%>">Remover</a></b>
                    </td>
                </tr>
                <%}%>

            </table>
                <a href="inserirArtigo.jsp">Novo Artigo</a>
            <a href="../index.jsp">Voltar</a>
        </div>
    </body>
</html>
