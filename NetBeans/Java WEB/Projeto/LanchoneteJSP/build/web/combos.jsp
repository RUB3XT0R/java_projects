<%-- 
    Document   : lanches
    Created on : 29/Out/2011, 20:49:44
    Author     : Lucas Biason
--%>

<%@page import="control.AcompanhamentoDao"%>
<%@page import="control.BebidaDao"%>
<%@page import="modelo.Combo"%>
<%@page import="control.ComboDao"%>
<%@page import="control.LancheDao"%>
<%@page import="modelo.Lanche"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="combo" class="modelo.Combo" scope="session"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-9" />
        <title>Combos</title>
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
                msg = "O Combo já existe.";
            } else if ("not".equals(msg)) {
                msg = "Não foi possível efetuar a operação.";
            }
        %>
        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="tableDatas">
                <table>
                    <caption>Combos Cadastrados</caption>
                    <tr>
                        <th>Descrição</th>
                        <th>Preco (R$)</th>
                        <th>Ações</th>
                    </tr>
                    <% for (Combo c : new ComboDao().getAllCombos()) {%>
                    <tr>
                        <td><%= c.getDescricao()%></td>
                        <td><%= c.getPreco()  %></td>
                        <td>
                            <a href="alterarCombo.jsp?id=<%= c.getId() %>"><img src="img/up.gif" style="height: 21px; width: 21px; " /></a>
                            <a href="removerCombo.jsp?id=<%= c.getId() %>"><img src="img/del.png" style="height: 21px; width: 21px; " /></a>
                            <a href="visualisarCombo.jsp?id=<%= c.getId() %>"><img src="img/view.png" style="height: 21px; width: 21px; " /></a>
                        </td>
                    </tr>
                    <% }%>
                </table>
            </div>

            <div class="newDatas">
                <form name="novoCombo" action="novoCombo.jsp" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Adicionar Novo Combo:</caption>
                            <tr>
                                <td><label>Descrição:</label></td>
                                <td><input type="text" value='' name="nome"  maxlength="25" size="15"/></td>
                            </tr>
                            <tr><td colspan="2"><label>Lanche:</label></td></tr>
                            <tr>
                                <td colspan="2">
                                    <select name="lanche">
                                        <option value=""></option>
                                        <c:forEach items="<%= new LancheDao().getAllLanches()%>" var="l">
                                            <option value="${ l.id }">${ l.descricao }, R$ ${ l.preco }</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value='' name="qtdeLanche"  maxlength="25" size="5"/></td>
                            </tr>
                            <tr><td colspan="2"><label>Bebida:</label></td></tr>
                            <tr>
                                <td colspan="2">
                                    <select name="bebida">
                                        <option value=""></option>
                                        <c:forEach items="<%= new BebidaDao().getBebidas()%>" var="l">
                                            <option value="${ l.id }">${ l.descricao }, R$ ${ l.preco }</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value='' name="qtdeBebida"  maxlength="25" size="5"/></td>
                            </tr>
                            <tr><td colspan="2"><label>Acompanhamento:</label></td></tr>
                            <tr>
                                <td colspan="2">
                                    <select name="acompanhamento">
                                        <option value=""></option>
                                        <c:forEach items="<%= new AcompanhamentoDao().getAcompanhamentos()%>" var="l">
                                            <option value="${ l.id }">${ l.descricao }, R$ ${ l.preco }</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value='' name="qtdeAcomp"  maxlength="25" size="5"/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Cadastrar >>" class="i2Style" onclick="valCombos()"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                    <input type="text" value="<%=msg%>" name="msg" style="border: 0px; min-width: 265px; text-align: center; color: #006699; background-color: white;" disabled="disabled"/>
                </form>
            </div>

        </div>
    </body>
</html>
