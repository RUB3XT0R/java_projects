<%-- 
    Document   : clientes
    Created on : 31/Out/2011, 14:02:30
    Author     : Lucas Biason
--%>
<%@page import="dao.InstrutorDao"%>
<%@page import="modelo.Instrutor"%>
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
            if (null == request.getParameter("id") || "".equals(request.getParameter("id"))) {
                response.sendRedirect("instrutores.jsp");
            } else {
                int id = Integer.parseInt(request.getParameter("id"));
                Instrutor inst = new InstrutorDao().getInstrutor(id);
                if (null == inst) {
                    response.sendRedirect("instrutores.jsp");
                } else {
        %>
        <div class="corpo" id="corpo" align="center">
            <jsp:include page="topo.jsp"/>
            <jsp:include page="menu.jsp"/>
            <div class="newDatasCli">
                <form name="novoIns" action="delInstrutor" method="post">
                    <input type="hidden" name="id" value="<%= inst.getId() %>"/>
                    <table  bgcolor="white">
                        <caption>Deseja realmente remover o Instrutor ?</caption>
                        <tr>
                            <td>CPF:</td>
                            <td><input type="text" name="cpf" value="<%= inst.getCpf()%>" readonly="readonly"/></td>
                            <td>RG:</td>
                            <td><input type="text" name="rg" value="<%= inst.getRg()%>" readonly="readonly"/></td>
                        </tr>
                        <tr><td>Nome:</td>
                            <td colspan="3"><input type="text" name="nome" value="<%= inst.getNome()%>" size="63" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="4">Emails<small> (forne�a pelo menos um)</small></td></tr>
                        <tr>
                            <td>E-mail:</td>
                            <td><input type="text" name="email" value="<%= inst.getEmail()%>" readonly="readonly"/></td>
                            <td>Email (2):</td>
                            <td><input type="text" name="email2" value="<%= inst.getEmail2()%>" readonly="readonly"/></td>
                        </tr>
                        <tr>
                            <td>Telefone:</td>
                            <td><input type="text" name="telefone" value="<%= inst.getTelefone()%>" readonly="readonly"/></td>
                            <td>Telefone(2):</td>
                            <td><input type="text" name="telefone2" value="<%= inst.getTelefone2()%>"  readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="4">Detalhes do Carro</td></tr>
                        <tr>
                            <td>Marca</td>
                            <td><input type="text" name="marca" value="<%= inst.getCarro_marca()%>"  readonly="readonly"/></td>
                            <td>Modelo</td>
                            <td><input type="text" name="modelo" value="<%= inst.getCarro_modelo()%>"  readonly="readonly"/></td>
                        </tr>
                        <tr>
                            <td>Placa</td>
                            <td><input type="text" name="placa" value="<%= inst.getCarro_placa()%>"  readonly="readonly"/></td>
                            <td>Cor</td>
                            <td><input type="text" name="cor" value="<%= inst.getCarro_cor()%>"  readonly="readonly"/></td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <p class="formSubmit">
                                    <img src="img/prev.gif" width="25px;" onclick="location.href='instrutores.jsp'"/>Voltar
                                    | Remover <img src="img/next.png" width="25px;" onclick="document.forms.novoIns.submit()"/>
                                </p>
                            </td>                        
                        </tr>
                    </table>
                </form>
            </div>
            <% }
                }%>
        </div>
    </body>
</html>

