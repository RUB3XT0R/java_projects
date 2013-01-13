<%@page import="controle.FuncionariosControl"%>
<%@page import="modelo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="funcionariosBean" scope="session" class="controle.FuncionariosControl"/>


<html>
    <head>
        <link href="../styles/StyleMyApp.css" rel="StyleSheet" type="Text/css"/>
        <link href="../styles/PageStyle.css" rel="StyleSheet" type="Text/css"/>
        <link href="../styles/StyleClasses.css" rel="StyleSheet" type="Text/css"/>
        <title>SisContrAm - Sistema de Controle de Frota de Ambulância</title>
    </head>
    <body>
        <jsp:include flush="true" page="../header.jsp"></jsp:include>
        <%
            Funcionario f = funcionariosBean.getFuncionario(Integer.parseInt(request.getParameter("id")));
        %>
        <form name="principal" action="Deleted.jsp" method="post">
            <p>Você tem absoluta certeza de que quer excluir o Funcionario <%= f.getNome() %>?</p>
            <input type="hidden" name="id" value="<%= f.getId()%>"><br/>
            <input type="button" value="Sim" onClick="submit()"><input type="button" value="Cancelar" onclick="location.href='funcionarios.jsp'">
        </form>
        <jsp:include flush="true" page="../footer.jsp"></jsp:include>
    </body>
</html>
