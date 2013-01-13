<%@page import="dao.FuncionarioDao"%>
<%@page import="controle.tipos.Funcao"%>
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
        <%funcionariosBean.removeFuncionario(Integer.parseInt(request.getParameter("id")));%>
        <p>O funcionário foi excluido com sucesso!</p>
        <br/>
        <a href="funcionarios.jsp">Click aqui para voltar aos funcionarios</a><br/><br/>
        <jsp:include flush="true" page="../footer.jsp"></jsp:include>
    </body>
</html>
