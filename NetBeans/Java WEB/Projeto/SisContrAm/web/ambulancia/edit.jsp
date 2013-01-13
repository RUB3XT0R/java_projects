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
        <script language="JavaScript" src="../scripts/validarFuncionario.js"></script>
        <title>SisContrAm - Sistema de Controle de Frota de Ambulância</title>
    </head>
    <body>
        <jsp:include flush="true" page="../header.jsp"></jsp:include>

        <%Funcionario f = funcionariosBean.getFuncionario(Integer.parseInt(request.getParameter("id")));%>
        <h2>Utualizando funcionário nº<%= f.getId()%></h2>
        <form name="principal" action="Upded.jsp" method="get">
            <input type="hidden" name="id"value="<%= f.getId()%>">
            Nome :<input type="text" name="nome" value="<%= f.getNome()%>"><br/>
            Login :<input type="text" name="login" value="<%= f.getLogin()%>"><br/>
            Senha :<input type="text" name="senha" value="<%= f.getSenha()%>"><br/>
            Funções:<br/><select name="funcao">
                <% for (Funcao funcao : Funcao.values()) {%>
                <OPTION VALUE="<%= funcao.toString()%>" <%= funcao == f.getFuncao() ? "selected" : ""%>><%= funcao.toString()%>
                    <% }%>
            </select>
            <br/><input type="button" onClick="validar()" value="Atualizar"> <input type="reset">
        </form>
        <a href="funcionarios.jsp"><img  class="linkHome1"></a><br/><br/>

        <jsp:include flush="true" page="../footer.jsp"></jsp:include>
    </body>
</html>
