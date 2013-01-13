<%@page import="java.util.List"%>
<%@page import="java.sql.Date"%>
<%@page import="modelos.Artigo"%>
<%@page import="banco.Artigo_DAO"%>

<div id="cntdPrincipal">
            <%
                List<Artigo> lista = Artigo_DAO.listar(new java.sql.Date((new java.util.Date()).getTime()));
                for(Artigo atual : lista){
            %>
            <h2><%= atual.getTitulo() %></h2>
            <h4><%= atual.getAutor() %> - <%= atual.getDataHora() %></h4>
            <hr>
                <p>
                    <%= atual.getResumo()%>
                </p>
            <hr>
            <a href="http://localhost:8080/MiniBlogJavaWeb/artigos/verArtigo.jsp?codigo=<%= atual.getCodigo()%>">Continuar Lendo...</a>
            <br/><br/>
            <%}%>
</div>