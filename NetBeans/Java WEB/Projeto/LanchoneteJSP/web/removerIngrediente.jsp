<%-- 
    Document   : removerIngrediente
    Created on : 21/Out/2011, 22:33:48
    Author     : Lucas Biason
--%>

<%@page import="modelo.Ingrediente"%>
<%@page import="control.IngredienteDao"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        
        <title>Ingredientes</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/sliding_effect.js"></script>
    </head>
    <body>
        <% 
            if (request.getParameter("id") == null && "".equals(request.getParameter("id"))) response.sendRedirect("index.jsp");
            
            int id = Integer.parseInt(request.getParameter("id"));
            Ingrediente ingrediente = new IngredienteDao().getIngrediente(id);
            if(null==ingrediente){response.sendRedirect("ingredientes.jsp");}
            else{
       %>
        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="newDatas">
                <form name="novoIngred" action="delIngrediente" method="post">
                    <input type="hidden" value="<%= id %>" name="id"/>
                    <fieldset width="200px">
                        <table border='0'>
                            <caption>Tem certeza que deseja remover o Ingrediente</caption>
                            <tr>
                                <td>Descrição</td>
                                <td><input type="text" value="<%= ingrediente.getDescricao()%>" name="descricao" disabled/></td>
                            </tr>
                            <tr>
                                <td>Preço R$:</td>
                                <td><input type="text" value="<%= ingrediente.getPreco() %>" name="preco" disabled/></td>
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
