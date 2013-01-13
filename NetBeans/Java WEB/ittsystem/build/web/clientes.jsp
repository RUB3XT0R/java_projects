<%-- 
    Document   : clientes
    Created on : 31/Out/2011, 14:02:30
    Author     : Lucas Biason
--%>
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
                    <img src="img/add.png" width="25px;" onclick="location.href='novoCliente.jsp'"/>Novo
                    | Nome:<input type="text" id="filtro"/>
                    <img src="img/fil.png" width="25px;" onclick="location.href='clientes.jsp?nome='+getElementById('filtro').value;"/>Pesquisar
                </p>
            </div>
            <div class="tableDatasCli">
                <% String msg = request.getParameter("msg");%>
                <input type='<%= null == msg ? "hidden" : "text"%>' name="msg" 
                       value="<%= null == msg ? ""
                               : msg.equals("ok") ? "Operação realizada com sucesso."
                               : msg.equals("not") ? "Operação não pode ser realizada." : ""%>" 
                       disabled="disabled" style="border: none; background-color: white; color: steelblue;  width: 400px;"/>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>CPF/CNPJ</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Ações</th>
                    </tr>
                    <% String filtro = request.getParameter("nome");%>
                    <% List<Cliente> clientes = new ClienteDao().getClientes(null != filtro ? filtro : "");%>
                    <% for (Cliente c : clientes) {%>
                    <tr>
                        <td><%= c.getId()%></td>
                        <td><%= c.getCpf_cnpj()%></td>
                        <td><%= c.getNome()%></td>
                        <td><%= c.getEmail()%></td>
                        <td>
                            <a href="alterarCliente.jsp?id=<%= c.getId()%><%=(null != filtro) ? "&nome=" + filtro : ""%>"><img src="img/up.gif" style="height: 21px; width: 21px; " /></a>
                            <a href="removCliente.jsp?id=<%= c.getId()%><%=(null != filtro) ? "&nome=" + filtro : ""%>"><img src="img/del.png" style="height: 21px; width: 21px; " /></a>
                            <a href="visualisarCliente.jsp?id=<%= c.getId()%><%=(null != filtro) ? "&nome=" + filtro : ""%>"><img src="img/view.png" style="height: 21px; width: 21px; " /></a>
                        </td>
                    </tr>
                    <%}%>
                </table>
            </div>
        </div>
    </body>
</html>
