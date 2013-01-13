<%-- 
    Document   : upIngrediente
    Created on : 21/Out/2011, 22:24:11
    Author     : Lucas Biason
--%>

<%@page import="modelo.Ingrediente"%>
<%@page import="modelo.IngredienteTipo"%>
<%@page import="control.IngredienteDao"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Ingredientes</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/sliding_effect.js"></script>
        <script type="text/javascript" src="js/validacao.js"></script>
    </head>
    <body>
        <%
            if (request.getParameter("id") == null && "".equals(request.getParameter("id"))) response.sendRedirect("index.jsp");
            int id = Integer.parseInt(request.getParameter("id"));
            Ingrediente ingrediente = new IngredienteDao().getIngrediente(id);
            if(null==ingrediente){response.sendRedirect("ingredientes.jsp");
            }else{
        %>

        <div class="content">
            <jsp:include page="menu.jsp"/>

            <div class="newDatas">
                <form name="novoIngred" action="upIngrediente" method="post">
                    <input type="hidden" value="<%= ingrediente.getId()%>" name="id"/>
                    <fieldset width="200px">
                        <table border='0'>
                            <caption>Alterar Ingrediente</caption>
                            <tr>
                                <td>Descrição</td>
                                <td><input type="text" value="<%= ingrediente.getDescricao()%>" name="descricao" /></td>
                            </tr>
                            <tr>
                                <td>Preço R$:</td>
                                <td><input type="text" value="<%= ingrediente.getPreco() %>" name="preco"/></td>
                            </tr>
                            <tr>
                                <td>Tipo:</td>
                                <td>
                                    <select name="tipo" >
                                        <option value=""></option>
                                        <% for (IngredienteTipo i : IngredienteTipo.values()) {%>
                                        <option value="<%= i.name()%>" <%= ingrediente.getTipo().name().equals(i.name()) ? "SELECTED" : ""%>>
                                            <%= i.getDescricao()%>
                                        </option>
                                        <% }%>
                                    </select>
                                </td>
                            </tr> 
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Alterar >>" class="i2Style" onclick="valIngredientes()"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                    <input type="hidden" value="" name="msg" style="border: 0px; min-width: 265px; text-align: center; color: #006699; background-color: white;" disabled="disabled"/>
                    <span><p>Para cancelar utilize o menu ao lado</p></span>
                </form>
            </div>
<%}%>
        </div>
    </body>
</html>
