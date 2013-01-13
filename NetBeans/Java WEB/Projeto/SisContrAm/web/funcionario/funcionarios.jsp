
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
        <jsp:include  page="../header.jsp"></jsp:include>

        <h2>Os Funcionários</h2>
        <table align="center">
            <tr class="tabletdtitle">
                <th>ID</th>
                <th>Nome</th>
                <th>Login</th>
                <th>Função</th>
                <th>Opções:</th>
            </tr>
            <% String classe; int cor=1;%>
            <c:forEach items="${funcionariosBean.listOfFuncionarios}" var="funcionario">
                <% classe = (cor % 2)==0 ? "tabletd1" : "tabletd2";%>
                <% cor++;%>
                <tr  class="<%=classe%>">
                      <td>${funcionario.id}</td>
                      <td>${funcionario.nome}</td>
                      <td>${funcionario.login}</td>
                      <td>${funcionario.funcao}</td>
                      <td class="tabletdoptions">
                          <a href="show.jsp?id=${funcionario.id}"><img class="linkShow" ></a>
                          <a href="edit.jsp?id=${funcionario.id}"><img class="linkUpdate"></a>
                          <a href="del.jsp?id=${funcionario.id}"><img  class="linkDelete"></a>
                      </td>
                </tr>
            </c:forEach>

        </table>
        <br/>
        <a href="add.jsp"><img  class="linkAdd"></a>
        <a href="../index.jsp"><img  class="linkHome1"></a>

        <jsp:include  page="../footer.jsp"></jsp:include>
    </body>
</html>
