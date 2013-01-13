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
        <h2>Informações do Funcionário </h2>
        <table align="center">
            <tr>
                <td class="tabletd2">ID :</td>
                <td><%= f.getId()%></td>
            </tr>
            <tr>
                <td class="tabletd1">Nome :</td>
                <td><%= f.getNome()%></td>
            </tr>
            <tr>
                <td class="tabletd1">Login :</td>
                <td><%= f.getLogin()%></td>
            </tr>
            <tr>
                <td class="tabletd1">Senha :</td>
                <td><%= f.getSenha()%></td>
            </tr>
            <tr>
                <td class="tabletdtitle">Funções:</td>
                <td><%= f.getFuncao()%></td>
            </tr>
                
        </table>

        <br/>
        <a href="edit.jsp?id=<%= f.getId()%>"><img  class="linkUpdate"></a>
        <a href="funcionarios.jsp"><img  class="linkHome1"></a>

        <jsp:include flush="true" page="../footer.jsp"></jsp:include>
    </body>
</html>
