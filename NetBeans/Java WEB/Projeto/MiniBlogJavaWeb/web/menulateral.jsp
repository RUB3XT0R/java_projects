



<%@page import="modelos.Artigo"%>
<%@page import="modelos.Categoria"%>
<%@page import="java.util.List"%>
<%@page import="banco.Artigo_DAO"%>
<%@page import="banco.Categoria_DAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="daoCategoria" scope="application" class="banco.Categoria_DAO"/>

<div id="cntdLateral">
    <c:forEach items="<%= Categoria_DAO.listar() %>" var="categoria">
            <h3>${ categoria.nome }</h3>
            <c:forEach items="${ categoria.artigos }" var="artigo">
                <li>
                <a href="http://localhost:8080/MiniBlogJavaWeb/artigos/verArtigo.jsp?codigo=${ artigo.codigo }">
                    ${ artigo.titulo }</a>
                </li>
            </c:forEach>
    </c:forEach>
</div>

