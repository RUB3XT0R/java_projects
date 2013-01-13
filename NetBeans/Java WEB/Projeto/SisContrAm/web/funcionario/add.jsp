<%@page import="controle.tipos.Funcao"%>
<%@page import="modelo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <link href="../styles/StyleMyApp.css" rel="StyleSheet" type="Text/css"/>
        <link href="../styles/PageStyle.css" rel="StyleSheet" type="Text/css"/>
        <link href="../styles/StyleClasses.css" rel="StyleSheet" type="Text/css"/>
        <script language="JavaScript" src="../scripts/validarFuncionario.js"></script>
        <title>SisContrAm - Sistema de Controle de Frota de Ambulância</title>
        
    </head>
    <body>
        <jsp:include flush="true" page="../header.jsp"></jsp:include>

        <h2>Cadastrando novo funcionário</h2>
        <form name="principal" action="Added.jsp" method="get">
            Nome :<input type="text" name="nome"><br/>
            Login :<input type="text" name="login"><br/>
            Senha :<input type="text" name="senha"><br/>
            Funções:<br/><select name="funcao">
            <% for (Funcao funcao : Funcao.values()) { %>
                <OPTION VALUE="<%= funcao.toString()%>"><%= funcao.toString()%>
            <% } %>
            </select>
            <br/><input type="button" onClick="validar()"> <input type="reset">
        </form>
        <a href="funcionarios.jsp"><img  class="linkHome1"></a><br/><br/>

        <jsp:include flush="true" page="../footer.jsp"></jsp:include>
    </body>
    </html>
