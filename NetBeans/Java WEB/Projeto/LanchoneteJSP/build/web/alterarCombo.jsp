<%-- 
    Document   : lanches
    Created on : 29/Out/2011, 20:49:44
    Author     : Lucas Biason
--%>

<%@page import="modelo.Acompanhamento"%>
<%@page import="modelo.Bebida"%>
<%@page import="control.AcompanhamentoDao"%>
<%@page import="control.BebidaDao"%>
<%@page import="modelo.Combo"%>
<%@page import="control.ComboDao"%>
<%@page import="control.LancheDao"%>
<%@page import="modelo.Lanche"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

            <div class="newDatas">
                <form name="novoCombo" action="upCombo" method="post">
                    <fieldset>
                        <table border='0'>
                            <%
                                int id = Integer.parseInt(request.getParameter("id"));
                                Combo combo = new ComboDao().getCombo(id);
                                if (null == combo) {
                                    response.sendRedirect("combos.jsp");
                                } else {
                            %>
                            <caption>Adicionar Novo Combo:</caption>
                            <input type="hidden" name="id" value="<%= combo.getId() %>"/>
                            <tr>
                                <td><label>Descrição:</label></td>
                                <td><input type="text" value='<%= combo.getDescricao() %>' name="nome"  maxlength="25" size="15"/></td>
                            </tr>
                            <tr><td colspan="2"><label>Lanche:</label></td></tr>
                            <tr>
                                <td colspan="2">
                                    <select name="lanche">
                                        <option value=""></option>
                                        <% for (Lanche l : new LancheDao().getAllLanches()) {%>
                                        <option value="<%= l.getId()%>" 
                                                <%= l.getDescricao().equals(combo.getLanche().getDescricao()) ? "selected='selected'" : ""%>>
                                            <%= l.getDescricao()%>, R$ <%= l.getPreco()%></option>
                                            <%}%>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value='<%= combo.getQtde_lanche()%>' name="qtdeLanche"  maxlength="25" size="5"/></td>
                            </tr>
                            <tr><td colspan="2"><label>Bebida:</label></td></tr>
                            <tr>
                                <td colspan="2">
                                    <select name="bebida">
                                        <option value=""></option>
                                        <% for (Bebida b : new BebidaDao().getBebidas()) {%>
                                        <option value="<%= b.getId()%>" 
                                                <%= b.getDescricao().equals(combo.getBebida().getDescricao()) ? "selected='selected'" : ""%>>
                                            <%= b.getDescricao()%>, R$ <%= b.getPreco()%></option>
                                            <%}%>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value='<%= combo.getQtde_bebida()%>' name="qtdeBebida"  maxlength="25" size="5"/></td>
                            </tr>
                            <tr><td colspan="2"><label>Acompanhamento:</label></td></tr>
                            <tr>
                                <td colspan="2">
                                    <select name="acompanhamento">
                                        <option value=""></option>
                                        <% for (Acompanhamento a : new AcompanhamentoDao().getAcompanhamentos()) {%>
                                        <option value="<%= a.getId()%>" 
                                                <%= a.getDescricao().equals(combo.getAcompanhamento().getDescricao()) ? "selected='selected'" : ""%>>
                                            <%= a.getDescricao()%>, R$ <%= a.getPreco()%></option>
                                            <%}%>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value='<%= combo.getQtde_acompanhamento()%>' name="qtdeAcomp"  maxlength="25" size="5"/></td>
                            </tr>
                            <tr>
                                <td>Preço (R$):</td>
                                <td><input type="text" value='<%= combo.getPreco() %>' name="total"  maxlength="25" size="5" /></td>
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
            <%}%>
        </div>
    </body>
</html>

