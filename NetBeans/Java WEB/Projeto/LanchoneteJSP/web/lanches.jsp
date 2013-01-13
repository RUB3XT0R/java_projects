<%-- 
    Document   : lanches
    Created on : 29/Out/2011, 20:49:44
    Author     : Lucas Biason
--%>

<%@page import="java.text.DecimalFormat"%>
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
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/validacao.js"></script>
    </head>
    <body>
        <%           
            lanche.refresh();
            String msg = request.getParameter("msg");
            if (msg == null || "".equals(msg))  msg = "";
            else if ("ok".equals(msg)) msg = "Operação realizada com sucesso.";
            else if ("faill".equals(msg)) msg = "O lanche já existe.";
            else if ("not".equals(msg)) msg = "Não foi possível efetuar a operação.";
        %>
        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="tableDatas">
                <table>
                    <caption>Lanches Cadastrados</caption>
                    <tr>
                        <th>Descrição</th>
                        <th>Preco (R$)</th>
                        <th>Ações</th>
                    </tr>
                    <% for (Lanche l : lanche.getLanches()) { %>
                    <tr>
                        <td><%= l.getDescricao() %></td>
                        <td><%= new DecimalFormat("#,###.00").format(l.getPreco()) %></td>
                        <td>
                            <a href="alterarLanche.jsp?id=<%= l.getId() %>"><img src="img/up.gif" style="height: 21px; width: 21px; " /></a>
                            <a href="removerLanche.jsp?id=<%= l.getId() %>"><img src="img/del.png" style="height: 21px; width: 21px; " /></a>
                            <a href="visualizarLanche.jsp?id=<%= l.getId() %>"><img src="img/view.png" style="height: 21px; width: 21px; " /></a>
                        </td>
                    </tr>
                    <% } %>
                </table>
            </div>
            
            <div class="newDatas">
                <form name="novoLanche" action="novoLanche.jsp" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Adicionar Novo Lanche:</caption>
                            <tr>
                                <td><label>Descrição:</label></td>
                                <td><input type="text" value='' name="nome"  maxlength="25"/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Cadastrar >>" class="i2Style" onclick=<%= lanche.newLanche() %>/>
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
