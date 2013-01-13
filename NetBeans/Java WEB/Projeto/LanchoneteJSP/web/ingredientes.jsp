<%-- 
    Document   : ingredientes
    Created on : 11/Out/2011, 13:20:12
    Author     : Lucas
--%>


<%@page import="java.text.DecimalFormat"%>
<%@page import="modelo.IngredienteTipo"%>
<%@page import="control.IngredienteDao"%>
<%@page import="modelo.Ingrediente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Lanches</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/validacao.js"></script>
    </head>
    <body>
        <%
            String type = request.getParameter("fil");
            String msg = request.getParameter("msg");
            if (msg == null || "".equals(msg)) {
                msg = "";
            } else if ("ok".equals(msg)) {
                msg = "Operação realizada com sucesso.";
            } else if ("faill".equals(msg)) {
                msg = "Ingrediente já existe.";
            } else if ("not".equals(msg)) {
                msg = "Não foi possível efetuar a operação.";
            }
        %>

        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="tableDatas">
                <table>
                    <caption>Ingredientes Cadastrados</caption>
                    <tr>
                        <th colspan="4"><label>Filtro:</label>
                            <select name="fil" onchange="location.href='ingredientes.jsp?fil='+this.value">
                                <option value=""></option>
                                <c:forEach items="<%= IngredienteTipo.values()%>" var="i">
                                    <option value="${ i.name }">${ i.descricao }</option>
                                </c:forEach>
                            </select>
                        </th>
                    </tr>
                    <% if(null!= type & type!=""){ %>
                        <tr>
                            <th>Descrição</th>
                            <th>Preco (R$)</th>
                            <th>Tipo</th>
                            <th>Ações</th>
                        </tr>
                        <% for( Ingrediente i : new IngredienteDao().getIngredientes(IngredienteTipo.valueOf(type)) ){%>
                            <tr>
                                <td><%= i.getDescricao() %></td>
                                <td><%= new DecimalFormat("#,###.00").format(i.getPreco()) %></td>
                                <td><%= i.getTipo() %></td>
                                <td>
                                    <a href="alterarIngrediente.jsp?id=<%= i.getId() %>"><img src="img/bt_update.png" style="height: 21px; width: 21px; " /></a>
                                    <a href="removerIngrediente.jsp?id=<%= i.getId() %>"><img src="img/bt_delete.png" style="height: 21px; width: 21px; " /></a>
                                </td>
                            </tr>
                        <%}%>
                    <% } %>
                </table>
            </div>

            <div class="newDatas">
                <form name="novoIngred" action="addIngrediente" method="post">
                    <fieldset width="200px">
                        <table border='0'>
                            <caption>Adicionar Novo Ingrediente</caption>
                            <tr>
                                <td>Descrição</td>
                                <td><input type="text" value="" name="descricao"/></td>
                            </tr>
                            <tr>
                                <td>Preço R$:</td>
                                <td><input type="text" value="" name="preco"/></td>
                            </tr>
                            <tr>
                                <td>Tipo:</td>
                                <td>
                                    <select name="tipo">
                                        <option value=""></option>
                                        <c:forEach items="<%= IngredienteTipo.values()%>" var="i">
                                            <option value="${ i.name }">${ i.descricao }</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr> 
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Cadastrar >>" class="i2Style" onclick="valIngredientes()"/>
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
