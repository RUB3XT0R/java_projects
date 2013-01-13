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
            //descrição do combo

            combo.setDescricao(request.getParameter("nome"));
            if ("".equals(combo.getDescricao()) || new ComboDao().contain(combo.getDescricao())) {
                response.sendRedirect("combos.jsp?msg=faill");
            } else {
                //setando acompanhamento do combo
                int idAcomp = Integer.parseInt(request.getParameter("acompanhamento"));
                combo.setAcompanhamento(new AcompanhamentoDao().getAcompanhamento(idAcomp));
                if (null == combo.getAcompanhamento()) {
                    response.sendRedirect("combos.jsp?msg=not");
                }
                int qtdeAcomp = Integer.parseInt(request.getParameter("qtdeAcomp"));
                combo.setQtde_acompanhamento(qtdeAcomp);

                //setando bebida do combo
                int idBebid = Integer.parseInt(request.getParameter("bebida"));
                combo.setBebida(new BebidaDao().getBebida(idBebid));
                if (null == combo.getBebida()) {
                    response.sendRedirect("combos.jsp?msg=not");
                }
                int qtdeBebida = Integer.parseInt(request.getParameter("qtdeBebida"));
                combo.setQtde_bebida(qtdeBebida);

                //setando lanche do combo
                int idlanche = Integer.parseInt(request.getParameter("lanche"));
                combo.setLanche(new LancheDao().getLanche(idlanche));
                if (null == combo.getLanche()) {
                    response.sendRedirect("combos.jsp?msg=not");
                }
                int qtdeLanche = Integer.parseInt(request.getParameter("qtdeLanche"));
                combo.setQtde_lanche(qtdeLanche);
        %>

        <jsp:include page="menu.jsp"/>
        <div class="newDatas">
            <form name="novoCombo" action="addCombo" method="post">
                <fieldset>
                    <table border='0'>
                        <caption>Confirma o novo Combo?</caption>

                        <tr><td colspan="2"><label>Descrição:</label></td></tr>
                        <tr>
                            <td colspan="2"><input type="text" value='<%= combo.getDescricao()%>' name="nome"  maxlength="25" size="15" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Lanche:</label></td></tr>
                        <tr>
                        <input type="hidden" value="<%= combo.getLanche().getId()%>" name="lanche"/>
                        <td><input type="text" value='<%= combo.getLanche().getDescricao()%>' name=""  maxlength="25" size="15" readonly="readonly"/></td>
                        <td>x<input type="text" value='<%= combo.getQtde_lanche()%>' name="qtdeLanche"  maxlength="25" size="5" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Bebida:</label></td></tr>
                        <tr>
                        <input type="hidden" value="<%= combo.getBebida().getId()%>" name="bebida"/>
                        <td><input type="text" value='<%= combo.getBebida().getDescricao()%>' name=""  maxlength="25" size="15" readonly="readonly"/></td>
                        <td>x<input type="text" value='<%= combo.getQtde_bebida()%>' name="qtdeBebida"  maxlength="25" size="5" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Acompanhamento:</label></td></tr>
                        <tr>
                        <input type="hidden" value="<%= combo.getAcompanhamento().getId()%>" name="acompanhamento"/>
                        <td><input type="text" value='<%= combo.getAcompanhamento().getDescricao()%>' name=""  maxlength="25" size="15" readonly="readonly"/></td>
                        <td>x<input type="text" value='<%= combo.getQtde_acompanhamento()%>' name="qtdeAcomp"  maxlength="25" size="5" readonly="readonly"/></td>
                        </tr>
                        <tr><td colspan="2"><label>Total</label></td></tr>
                        <tr>
                            <td>Preço Sugerido:</td>
                            <td><input type="text" value='<%= combo.getTotal() %>' name="total"  maxlength="25" size="5"/></td>
                        </tr>
                        <tr><td colspan="2"><small>(Pode ser modificado)</small></td></tr>
                        <tr>
                            <th colspan="2">
                                <input type="submit" value="Cadastrar >>" class="i2Style"/>
                            </th>                    
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
        <% }%>
    </body>
</html>
