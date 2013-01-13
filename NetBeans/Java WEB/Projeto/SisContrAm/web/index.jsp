
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<jsp:useBean id="funcionariosBean" scope="session" class="controle.FuncionariosControl"/>--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <link href="styles/PageStyle.css" rel="StyleSheet" type="Text/css"/>
        <link href="styles/StyleClasses.css" rel="StyleSheet" type="Text/css"/>
        <title>SisContrAm - Sistema de Controle de Frota de Ambulância</title>
    </head>
    <body>
        <jsp:include flush="true" page="header.jsp"></jsp:include>
        <h2>Bem-Vindo ao SisContrAm</h2>
        <p>Seja bem-vindo ao Sistema de Controle sw Ambulâncias</p>
        <jsp:include flush="true" page="footer.jsp"></jsp:include>
    </body>
</html>
