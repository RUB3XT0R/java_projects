<%-- 
    Document   : visualizarLanche
    Created on : 3/Nov/2011, 8:21:24
    Author     : Lucas Biason
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="modelo.LancheItens"%>
<%@page import="control.LancheDao"%>
<%@page import="modelo.Lanche"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            int id = Integer.parseInt(request.getParameter("id"));
            Lanche lanche = new LancheDao().getLanche(id);
        %>
        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="tableDatas">
                <table>
                    <caption>Ingredientes do lanche</caption>
                    <tr>
                        <th>Descrição</th>
                        <th>Qtde</th>
                        <th>Total (R$)</th>
                    </tr>
                    <% for( LancheItens l : lanche.getIngredientes()){ %>
                    <tr>
                        <td><%= l.getIngrediente().getDescricao() %></td>
                        <td><%= l.getQtde() %></td>
                        <td><%= new DecimalFormat("#,###.00").format(l.getTotal()) %></td>
                     </tr>
                    <%}%>
                     <tr>
                        <th>Total</th>
                        <th colspan="2">R$<%= lanche.getPreco() %></th>
                    </tr>
                </table>
            </div>
            
            <div class="newDatas">
                <form name="novoFunci" action="novoLanche.jsp" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Lanche:</caption>
                            <tr>
                                <td><label>Descrição:</label></td>
                                <td><input type="text" value='<%= lanche.getDescricao() %>' name="nome" disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Voltar" class="i2Style" onClick="location.href='lanches.jsp'"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                 </form>
            </div>
            
        </div>
    </body>
</html>
