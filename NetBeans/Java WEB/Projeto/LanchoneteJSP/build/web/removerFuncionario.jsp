<%-- 
    Document   : removerFuncionario
    Created on : 29/Out/2011, 20:22:05
    Author     : Lucas Biason
--%>

<%@page import="modelo.Funcionario"%>
<%@page import="control.FuncionariosDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
        
        <title>Funcionários</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/validacao.js"></script> 
    </head>
    <body>
        <%
            if (request.getParameter("id") == null && "".equals(request.getParameter("id"))) response.sendRedirect("index.jsp");
            String id = request.getParameter("id");
            Funcionario funcionario = new FuncionariosDao().getFuncionario(id);
            if(null==funcionario){response.sendRedirect("funcionarios.jsp");
            }else if(funcionario.getCargo().equalsIgnoreCase("ADMIN")){response.sendRedirect("funcionarios.jsp");
            }else{
        %>
        <div class="content">
            <jsp:include page="menu.jsp"/>
            <div class="newDatas">
                <form name="novoFunci" action="delFuncionario" method="post">
                    <input type="hidden" value="<%= funcionario.getCpf() %>" name="cpf"/>
                    <fieldset width="200px">
                        <table border='0'>
                            <caption>Tem certeza que deseja remover o Funcionário</caption>
                            <tr>
                                <td>Nome</td>
                                <td><input type="text" value="<%= funcionario.getNome() %>" name="descricao" disabled/></td>
                            </tr>
                            <tr>
                                <td>Cargo</td>
                                <td><input type="text" value="<%= funcionario.getCargo() %>" name="preco" disabled/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="submit" value="Remover >>" class="i2Style"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                    <span>Para cancelar utilize o menu ao lado</span>
                </form>
            </div>
            <%}%>
        </div>
    </body>
</html>
