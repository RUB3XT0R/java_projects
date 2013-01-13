<%@page import="controle.FuncionariosControl"%>
<%@page import="modelo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="ambulanciasBean" scope="session" class="controle.AmbulanciaControl"/>

<html>
    <head>
        <link href="../styles/StyleMyApp.css" rel="StyleSheet" type="Text/css"/>
        <link href="../styles/PageStyle.css" rel="StyleSheet" type="Text/css"/>
        <link href="../styles/StyleClasses.css" rel="StyleSheet" type="Text/css"/>
        <script language="JavaScript" src="../scripts/jquery-1.4.2.min.js"></script>
        <script language="JavaScript" src="../scripts/scriptTables.js"></script>
        <title>SisContrAm - Sistema de Controle de Frota de Ambulância</title>
    </head>
    <body>
        <jsp:include  page="../header.jsp"></jsp:include>

        <h2>As Ambulâncias</h2>
        <table align="center">
            <thead>
            <tr class="tabletdtitle">
                <th>Número</th>
                <th>Placa</th>
                <th>Opções:</th>
            </tr>
            </thead>
            <c:forEach items="${ambulanciasBean.allAmbulancias}" var="ambulancia">
                <tr>
                      <td>${ambulancia.numero}</td>
                      <td>${ambulancia.placa}</td>
                      <td>
                          <a href="show.jsp?id=${ambulancia.numero}"><img  src="../img/show.png"></a>
                          <a href="del.jsp?id=${ambulancia.numero}"><img  src="../img/excluir.png"></a>
                      </td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <a href="addF.jsp"><img  src="../img/add.png"></a>
        <a href="../index.jsp"><img  class="linkHome1"></a>

        <jsp:include  page="../footer.jsp"></jsp:include>
    </body>
</html>
