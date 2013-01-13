<%-- 
    Document   : bebidas
    Created on : 21/Out/2011, 7:19:23
    Author     : Lucas Biason
--%>

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
        <title>Bebidas</title>
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
                msg = "A Bebida já existe.";
            } else if ("not".equals(msg)) {
                msg = "Não foi possível efetuar a operação.";
            }
        %>
        <div class="content">

            <jsp:include page="menu.jsp"/>

            <div class="tableDatas">
                <table>
                    <caption>Bebidas Cadastrados</caption>
                    <tr>
                        <th>Descrição</th>
                        <th>Preco (R$)</th>
                        <th>Qtde (Ml)</th>
                        <th>Ações</th>
                    </tr>
                    <% for( Bebida b : new BebidaDao().getBebidas() ){%>
                    <tr>
                        <td><%= b.getDescricao() %></td>
                        <td><%= new DecimalFormat("#,###.00").format(b.getPreco()) %></td>
                        <td><%= b.getQtde() %></td>
                        <td>
                            <a href="alterarBebida.jsp?id=<%= b.getId() %>"><img src="img/bt_update.png" style="height: 21px; width: 21px; " /></a>
                            <a href="removerBebida.jsp?id=<%= b.getId() %>"><img src="img/bt_delete.png" style="height: 21px; width: 21px; " /></a>
                        </td>
                    </tr>
                    <% } %>
                </table>
            </div>

            <div class="newDatas">
                <form name="novaBebi" action="addBebida" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Adicionar Nova Bebida</caption>
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