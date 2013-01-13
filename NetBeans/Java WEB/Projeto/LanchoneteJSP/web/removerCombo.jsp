<%-- 
    Document   : lanches
    Created on : 29/Out/2011, 20:49:44
    Author     : Lucas Biason
--%>

<%@page import="modelo.Acompanhamento"%>
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
            //descrição do combo

            int id = Integer.parseInt(request.getParameter("id"));
            Combo combo = new ComboDao().getCombo(id);
            if (null == combo) {
                response.sendRedirect("combos.jsp");
            } else {
        %>

        <jsp:include page="menu.jsp"/>
        <div class="newDatas">
            <form name="novoCombo" action="delCombo" method="get">
                <fieldset>
                    <table border='0'>
                        <caption>Deseja realmente remover o combo abaixo?</caption>
                        <input type="hidden" value="<%= combo.getId() %>" name="id"/>
                        <tr><td colspan="2"><label>Descrição:</label></td></tr>
                        <tr>
                            <td colspan="2"><input type="text" value='<%= combo.getDescricao()%>' name="nome"  maxlength="25" size="15" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Lanche:</label></td></tr>
                        <tr>
                            <td><input type="text" value='<%= combo.getLanche().getDescricao()%>' name=""  maxlength="25" size="15" readonly="readonly"/></td>
                            <td>x<input type="text" value='<%= combo.getQtde_lanche()%>' name="qtdeLanche"  maxlength="25" size="5" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Bebida:</label></td></tr>
                        <tr>
                            <td><input type="text" value='<%= combo.getBebida().getDescricao()%>' name=""  maxlength="25" size="15" readonly="readonly"/></td>
                            <td>x<input type="text" value='<%= combo.getQtde_bebida()%>' name="qtdeBebida"  maxlength="25" size="5" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Acompanhamento:</label></td></tr>
                        <tr>
                            <td><input type="text" value='<%= combo.getAcompanhamento().getDescricao()%>' name=""  maxlength="25" size="15" readonly="readonly"/></td>
                            <td>x<input type="text" value='<%= combo.getQtde_acompanhamento()%>' name="qtdeAcomp"  maxlength="25" size="5" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Total</label></td></tr>
                        <tr>
                            <td>Preço (R$):</td>
                            <td><input type="text" value='<%= combo.getPreco() %>' name="total"  maxlength="25" size="5" readonly="readonly"/></td>
                        </tr>
                        <tr>
                            <th colspan="2">
                                <input type="button" value="Voltar" class="i2Style" onclick="location.href='combos.jsp'"/>
                                | <input type="submit" value="Remover" class="i2Style"/>
                            </th>                    
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
        <% }
        %>
    </body>
</html>
