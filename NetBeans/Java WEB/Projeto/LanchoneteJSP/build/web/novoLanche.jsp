<%-- 
    Document   : lanches
    Created on : 29/Out/2011, 20:49:44
    Author     : Lucas Biason
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="modelo.LancheItens"%>
<%@page import="modelo.IngredienteTipo"%>
<%@page import="control.IngredienteDao"%>
<%@page import="control.LancheDao"%>
<%@page import="modelo.Lanche"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="lanche" class="control.LancheControl" scope="session"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-9" />
        <title>Lanches</title>
        <%
            String nome = request.getParameter("nome");
            if (null != nome && !"".equals(nome)) {
                if (lanche.contain(nome)) {
                    response.sendRedirect("lanches.jsp?msg=faill");
                }
                lanche.getLanche().setDescricao(nome);
            }
        %>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/validacao.js"></script>
    </head>
    <body>
        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="tableDatas">
                <table>
                    <caption>Ingredientes do Lanche <%= lanche.getLanche().getDescricao()%></caption>
                    <tr>
                        <th>Descrição</th>
                        <th>Qtde</th>
                        <th>Total (R$)</th>
                        <th>Ações</th>
                    </tr>
                    <% for(LancheItens l : lanche.getItems() ){ %>
                        <tr>
                            <td><%= l.getIngrediente().getDescricao() %></td>
                            <td><%= l.getQtde() %></td>
                            <td><%= new DecimalFormat("#,###.00").format(l.getTotal()) %></td>
                            <td>
                                <a href="removerIngredientelanche.jsp?id=<%= l.getIngrediente().getId() %>"><img src="img/bt_delete.png" style="height: 21px; width: 21px; " /></a>
                            </td>
                        </tr>
                    <% } %>
                    <tr>
                        <th>Total</th>
                        <th colspan="2">R$<%= lanche.getTotal()%></th>
                        <th><input type="button" onclick="location.href='addLanche.jsp'" value="OK >" class="i2Style"></th>
                    </tr>
                </table>
            </div>

            <div class="newDatas">
                <form name="novoFunci" action="addNovoIngrediente.jsp" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Adicionar Novo Ingrediente</caption>
                            <tr>
                                <td><label>ID</label></td>
                                <td><input type="text" name="id"  maxlength="25"/></td>
                            </tr>
                            <tr>
                                <td><label>Qtde</label></td>
                                <td><input type="text" name="qtde"  maxlength="25"/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="submit" value="Adicionar >>" class="i2Style"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                    <table>
                        <tr>
                            <th colspan="4"><label>Filtro:</label>
                                <select name="fil" onchange="location.href='novoLanche.jsp?fil='+this.value">
                                    <option value=""></option>
                                    <c:forEach items="<%= IngredienteTipo.values()%>" var="i">
                                        <option value="${ i.name }">${ i.descricao }</option>
                                    </c:forEach>
                                </select>
                            </th>
                        </tr>
                    </table>
                </form>
            </div>
            <%
                String type = request.getParameter("fil");
                if (null != type & type != "") {
            %>
            <div class =" IngreDatas">
                <table>
                    <caption>Ingredientes Cadastrados</caption>
                    <tr>
                        <th>ID</th>
                        <th>Descrição</th>
                        <th>Preco (R$)</th>
                        <th>Tipo</th>
                    </tr>
                    <c:forEach items="<%= new IngredienteDao().getIngredientes(IngredienteTipo.valueOf(type))%>" var="i">
                        <tr>
                            <td>${ i.id }</td>
                            <td>${ i.descricao }</td>
                            <td>${ i.preco }</td>
                            <td>${ i.tipo }</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <% }%>
        </div>
    </body>
</html>