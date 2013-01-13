<%@page import="modelos.Categoria"%>
<%@page import="banco.Categoria_DAO"%>
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
            <h1>Alterando o artigo</h1>
            <%
                            List<Categoria> categorias = Categoria_DAO.listar();

                            Artigo a = Artigo_DAO.selecionar(Integer.parseInt(request.getParameter("codigo")));
            %>
            <form action ="../AlterarArtigo" method="POST">
                <input type="hidden" name="codigo" value="<%= a.getCodigo()%>">
                Título: <input type="text" name="titulo" value="<%= a.getTitulo()%>">
                Autor: <input type="text" name="autor" value="<%= a.getAutor()%>">
                Categoria:
                <select name="categoria">
                    <% for(Categoria categoria : categorias){ %>
                    <option value="<%= categoria.getCodigo() %>" <%= (categoria.getCodigo() == a.getCategoria().getCodigo()) ? "selected" : "" %>>
                        <%= categoria.getNome()%>
                    </option>
                    <% } %>
                </select><br/>
                Resumo:
                <br/><textarea name="resumo" cols="68"><%= a.getResumo()%></textarea><br/>
                Escreva aqui seu artigo: <br/>
                <textarea name="conteudo" cols="68" rows="20" ><%= a.getConteudo()%>"</textarea><br/>

                <input type="submit" value="Inserir">
            </form>
            <a href="artigos.jsp">Voltar</a>
        </div>
    </body>
</html>
