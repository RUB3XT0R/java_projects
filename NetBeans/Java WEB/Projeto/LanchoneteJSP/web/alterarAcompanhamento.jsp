<%-- 
    Document   : alterarBebida
    Created on : 22/Out/2011, 10:57:33
    Author     : Lucas Biason
--%>

<%@page import="control.AcompanhamentoDao"%>
<%@page import="modelo.Acompanhamento"%>
<%@page import="control.BebidaDao"%>
<%@page import="modelo.Bebida"%>
<%@page import="modelo.Bebida"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
    
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Acompanhamento</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/sliding_effect.js"></script>
        <script type="text/javascript" src="js/validacao.js"></script>
    </head>
    <body>
        <%
            if (request.getParameter("id") == null && "".equals(request.getParameter("id"))) response.sendRedirect("index.jsp");
            int id = Integer.parseInt(request.getParameter("id"));
            Acompanhamento acomp = new AcompanhamentoDao().getAcompanhamento(id);
            if(null==acomp){response.sendRedirect("acompanhamentos.jsp");
            }else{
        %>
        <div class="content">
            
            <jsp:include page="menu.jsp"/>
                
            <div class="newDatas">
                <form name="novaBebi" action="upAcompanhamento" method="post">
                    <input type="hidden" value="<%= acomp.getId() %>" name="id"/>
                    <fieldset>
                        <table border='0'>
                            <caption>Alterar Acompanhamento</caption>
                            <tr>
                                <td><label>Descrição</label></td>
                                <td><input type="text" value="<%= acomp.getDescricao() %>" name="descricao"/></td>
                            </tr>
                            <tr>
                                <td><label>Preço R$:</label></td>
                                <td><input type="text" value="<%= acomp.getPreco() %>" name="preco"/></td>
                            </tr>
                            <tr>
                                <td><label>Qtde:</label></td>
                                <td><input type="text" value="<%= acomp.getQtde() %>" name="qtde"/></td>
                            </tr> 
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Alterar>>" class="i2Style" onclick="valBebidas()"/>
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