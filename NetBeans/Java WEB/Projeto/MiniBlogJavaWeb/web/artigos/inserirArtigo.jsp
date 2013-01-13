<%-- 
    Document   : inserirArtigo
    Created on : 16/04/2011, 16:08:16
    Author     : Lucas Biason
--%>

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
            <h1>Artigos</h1>
            <form action ="../InserirArtigo" method="POST">
                Título: <input type="text" name="titulo">
                Autor: <input type="text" name="autor">
                Categoria:
                <select name="categoria">
                    <%
                        List<Categoria> categorias = Categoria_DAO.listar();
                        for(Categoria categoria : categorias){
                    %>
                    <option value="<%= categoria.getCodigo() %>"><%= categoria.getNome()%></option>
                    <%}%>
                </select><br/>
                Resumo:
                <br/><textarea name="resumo" cols="68"></textarea><br/>
                Escreva aqui seu artigo: <br/>
                <textarea name="conteudo" cols="68" rows="20"></textarea><br/>
                
                <input type="submit" value="Inserir">
            </form>
            <a href="artigos.jsp">Voltar</a>
        </div>
    </body>
</html>
