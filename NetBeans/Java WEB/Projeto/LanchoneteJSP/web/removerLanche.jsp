<%-- 
    Document   : removerBebida
    Created on : 22/Out/2011, 11:00:00
    Author     : Lucas Biason
--%>

<%@page import="control.LancheDao"%>
<%@page import="modelo.Lanche"%>
<%@page import="modelo.Bebida"%>
<%@page import="control.BebidaDao"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

        <title>>Lanche</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/sliding_effect.js"></script>
    </head>
    <body>
        <%
            if (request.getParameter("id") == null && "".equals(request.getParameter("id"))) {
                response.sendRedirect("lanches.jsp");
            }

            int id = Integer.parseInt(request.getParameter("id"));
            Lanche lanche = new LancheDao().getLanche(id);
            if (null == lanche) {
                response.sendRedirect("lanches.jsp");
            } else {

        %>
        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="newDatas">
                <form name="" action="delLanche" method="post">
                    <input type="hidden" value="<%= id%>" name="id"/>
                    <fieldset width="200px">
                        <table border='0'>
                            <caption>Tem certeza que deseja remover o Lanche</caption>
                            <tr>
                                <td>Descrição</td>
                                <td><input type="text" value="<%= lanche.getDescricao()%>" name="descricao" disabled/></td>
                            </tr>
                            <tr>
                                <td>Preço R$:</td>
                                <td><input type="text" value="<%= lanche.getPreco() %>" name="preco" disabled/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="submit" value="Remover >>" class="i2Style"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                    <span><p>Para cancelar utilize o menu ao lado</p></span>
                </form>
            </div>
            <%}%>
        </div>
    </body>
</html>
