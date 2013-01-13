<%-- 
    Document   : bebidas
    Created on : 21/Out/2011, 7:19:23
    Author     : Lucas Biason
--%>

<%@page import="control.AcompanhamentoDao"%>
<%@page import="modelo.Acompanhamento"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="control.BebidaDao"%>
<%@page import="modelo.Bebida"%>
<%@page import="modelo.Bebida"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Acompanhamentos</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/validacao.js"></script>
    </head>
    <body>
        <%
            String msg = request.getParameter("msg");
            if (msg == null || "".equals(msg)) {
                msg = "";
            } else if ("ok".equals(msg)) {
                msg = "Operação realizada com sucesso.";
            } else if ("faill".equals(msg)) {
                msg = "O acompanhamento já existe.";
            } else if ("not".equals(msg)) {
                msg = "Não foi possível efetuar a operação.";
            }
        %>
        <div class="content">

            <jsp:include page="menu.jsp"/>

            <div class="tableDatas">
                <table>
                    <caption>Acompanhamentos Cadastrados</caption>
                    <tr>
                        <th>Descrição</th>
                        <th>Preco (R$)</th>
                        <th>Qtde</th>
                        <th>Ações</th>
                    </tr>
                    <% for( Acompanhamento a : new AcompanhamentoDao().getAcompanhamentos() ){%>
                    <tr>
                        <td><%= a.getDescricao() %></td>
                        <td><%= new DecimalFormat("#,###.00").format(a.getPreco()) %></td>
                        <td><%= a.getQtde() %></td>
                        <td>
                            <a href="alterarAcompanhamento.jsp?id=<%= a.getId() %>"><img src="img/bt_update.png" style="height: 21px; width: 21px; " /></a>
                            <a href="removerAcompanhamento.jsp?id=<%= a.getId() %>"><img src="img/bt_delete.png" style="height: 21px; width: 21px; " /></a>
                        </td>
                    </tr>
                    <% } %>
                </table>
            </div>

            <div class="newDatas">
                <form name="novaBebi" action="addAcompanhamento" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Adicionar Novo Acompanhamentos</caption>
                            <tr>
                                <td><label>Descrição</label></td>
                                <td><input type="text" value="" name="descricao"/></td>
                            </tr>
                            <tr>
                                <td><label>Preço R$:</label></td>
                                <td><input type="text" value="" name="preco"/></td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value="" name="qtde"/></td>
                            </tr> 
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Cadastrar >>" class="i2Style" onclick="valBebidas()"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                    <input type="text" value="<%= msg%>" name="msg" style="border: 0px; min-width: 265px; text-align: center; color: #006699; background-color: white;" disabled="disabled"/>
                </form>
            </div>
        </div>
    </body>
</html>