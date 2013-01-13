<%-- 
    Document   : inserirCategoria
    Created on : 22/03/2011, 21:07:37
    Author     : Lucas Biason
--%>

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
            <h1>Categorias</h1>
            <table align="center">
                <tr class="tabletdtitle">
                    <td><b>Código</b></td>
                    <td><b>Nome</b></td>
                    <td><b>Ações</b></td>
                    </tr>
                <%
                            List<Categoria> categorias = Categoria_DAO.listar();
                            for (Categoria categoria : categorias) {
                %>
                <tr>
                    <td styleClass="tabletd1">
                        <b><%=categoria.getCodigo()%></b>
                    </td>

                    <td styleClass="tabletd2">
                        <%=categoria.getNome()%>
                    </td>

                    <td>
                        <b><a href="alterarCategoria.jsp?codigo=<%=categoria.getCodigo()%>">Alterar</a></b>
                        <b><a href="removercategoria.jsp?codigo=<%=categoria.getCodigo()%>">Remover</a></b>
                    </td>
                </tr>
                <%}%>
                
            </table>
                <p>
                    Entre com um nome para criar uma nova categoria:
            <form action ="../InserirCategoria" method="POST">
                Nome: <input type="text" name="nome">
                <input type="submit" value="Inserir">
            </form>
            <a href="../index.jsp">Voltar</a>
        </div>

    </body>
</html>


