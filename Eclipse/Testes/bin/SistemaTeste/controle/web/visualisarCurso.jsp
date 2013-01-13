<%-- 
    Document   : clientes
    Created on : 31/Out/2011, 14:02:30
    Author     : Lucas Biason
--%>
<%@page import="modelo.Instrutor"%>
<%@page import="dao.InstrutorDao"%>
<%@page import="dao.CursoDao"%>
<%@page import="modelo.Curso"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="dao.ClienteDao"%>
<%@page import="modelo.ClienteTipo"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9"/>
        <title>IT Training :: Sistema de Controle</title>
        <link href="css/ittstyle.css" rel="StyleSheet" type="Text/css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/Validacao.js"></script>
    </head>
    <body>
        <%
            Curso c = new Curso();
            if (null == request.getParameter("id") || "".equals(request.getParameter("id"))) {
                response.sendRedirect("cursos.jsp");
            } else {
                int id = Integer.parseInt(request.getParameter("id"));
                c = new CursoDao().getCurso(id);
        %>
        <div class="corpo" id="corpo" align="center">
            <jsp:include page="topo.jsp"/>
            <jsp:include page="menu.jsp"/>
            <div class="newDatasCli">
                <form name="novoCur" action="addCurso" method="post">
                    <table  bgcolor="white">
                        <caption>Cadastro de Novo Curso</caption>
                        <tr>
                            <td colspan="4">
                                <input type="text" name="msg" style="border: none; width: 100%;" readonly="readonly"/>
                            </td>                        
                        </tr>
                        <tr>
                            <td>Nome:</td>
                            <td><input type="text" name="nome" value="<%= c.getNome()%>"/></td>
                        </tr>
                        <tr>
                            <td>Craga Horária:</td>
                            <td><input type="text" name="hora" value="<%= c.getCargaHora()%>"/></td>
                            <td>Investimento (R$):</td>
                            <td><input type="text" name="inves" value="<%= c.getInvestimento()%>"/></td>
                        </tr>

                        <tr><td colspan="4">Instrutores:</td></tr>
                        <tr>
                                    <th>CPF</th>
                                    <th>Nome</th>
                                    <th>Email</th>
                                    <th>Telefone</th>
                        </tr>
                        <tr><td colspan="4">
                                <% List<Instrutor> instrutores = new InstrutorDao().getInstrutoresByCurso(c.getId());%>
                                <% for (Instrutor i : instrutores) {%>
                                <tr>
                                    <td><%= i.getCpf()%></td>
                                    <td><%= i.getNome()%></td>
                                    <td><%= i.getEmail()%></td>
                                    <td><%= i.getTelefone()%></td>
                                    <td><a href="visualisarInstrutor.jsp?id=<%= i.getId()%>"><img src="img/view.png" style="height: 21px; width: 21px; " /></a></td>
                                </tr>
                                <%}%>      
                            </td></tr>

                        <tr>
                            <td colspan="4">
                                <p class="formSubmit">
                                    <img src="img/prev.gif" width="25px;" onclick="location.href='cursos.jsp'"/>Voltar
                                </p>
                            </td>                        
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <%}%>
    </body>
</html>

