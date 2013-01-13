<%-- 
    Document   : clientes
    Created on : 31/Out/2011, 14:02:30
    Author     : Lucas Biason
--%>
<%@page import="dao.CursoDao"%>
<%@page import="modelo.Curso"%>
<%@page import="modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="dao.ClienteDao"%>
<%@page import="modelo.ClienteTipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>IT Training :: Sistema de Controle</title>
        <link href="css/ittstyle.css" rel="StyleSheet" type="Text/css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/Validacao.js"></script>
    </head>
    <body>

        <div class="corpo" id="corpo" align="center">

            <jsp:include page="topo.jsp"/>
            <jsp:include page="menu.jsp"/>
            <div class="menu">
                <p class="formSubmit">
                    <img src="img/add.png" width="25px;" onclick="location.href='novoCurso.jsp'"/>Novo
                </p>
            </div>
            <div class="tableDatasCur">
                <% String msg = request.getParameter("status");%>
                <input type='<%= null == msg ? "hidden" : "text"%>' name="msg" 
                       value="<%= null == msg ? ""
                               : msg.equals("ok") ? "Operação realizada com sucesso."
                               : msg.equals("not") ? "Operação não pode ser realizada." : ""%>" 
                       disabled="disabled" style="border: none; background-color: white; color: steelblue;  width: 400px;"/>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Carga Horária</th>
                        <th>Investimento</th>
                        <th>Ações</th>
                    </tr>
                    <% List<Curso> cursos = new CursoDao().getCursos(); %>
                    <% for (Curso c : cursos) {%>
                    <tr>
                        <td><%= c.getId()%></td>
                        <td><%= c.getNome() %></td>
                        <td><%= c.getCargaHora()%></td>
                        <td><%= c.getInvestimento() %></td>
                        <td>
                            <a href="alterCurso.jsp?id=<%= c.getId()%>"><img src="img/up.gif" style="height: 21px; width: 21px; " /></a>
                            <a href="removCurso.jsp?id=<%= c.getId()%>"><img src="img/del.png" style="height: 21px; width: 21px; " /></a>
                            <a href="visualisarCurso.jsp?id=<%= c.getId()%>"><img src="img/view.png" style="height: 21px; width: 21px; " /></a>
                        </td>
                    </tr>
                    <%}%>
                </table>
            </div>
        </div>
    </body>
</html>
