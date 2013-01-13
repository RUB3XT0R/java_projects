<%-- 
    Document   : visualisarFuncionario
    Created on : 22/Out/2011, 20:19:24
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@page import="control.FuncionariosDao"%>
<%@page import="modelo.Funcionario"%>
<%@page import="java.util.List"%>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Funcionários</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/validacao.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.1/jquery.min.js"></script> 
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            Funcionario f = new FuncionariosDao().getFuncionario(id);
            if (null == f) {
                response.sendRedirect("funcionarios.jsp");
            } else {
        %>
        <div class="content">

            <jsp:include page="menu.jsp"/>

            <div class="newDatas">
                <form name="novoFunci" action="funcionarios.jsp" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Dados do Funcionário </caption>
                            <tr>
                                <td><label>CPF</label></td>
                                <td><input type="text" value="<%= f.getCpf()%>" name="cpf" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>Nome</label></td>
                                <td><input type="text" value="<%= f.getNome()%>" name="nome" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>E-mail</label></td>
                                <td><input type="text" value="<%= f.getEmail()%>" name="email" readonly="readonly"/></td>
                            </tr> 
                            <tr>
                                <td><label>Telefone</label></td>
                                <td><input type="text" value="<%= f.getTelefone()%>" name="telefone" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>Salário</label></td>
                                <td><input type="text" value="<%= f.getSalario()%>" name="salario" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>Cargo</label></td>
                                <td><input type="text" value="<%= f.getCargo()%>" name="cargo" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>Cidade</label></td>
                                <td><input type="text" value="<%= f.getCidade()%>" name="cidade" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>Estado</label></td>
                                <td><input type="text" value="<%= f.getEstado()%>" name="uf" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>Endereço</label></td>
                                <td><input type="text" value="<%= f.getEndereco()%>" name="endereco" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td><label>Login:</label></td>
                                <td><input type="text" value="<%= f.getLogin()%>" name="endereco" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Voltar" class="i2Style" onclick="location.href='funcionarios.jsp'"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                </form>
            </div>

            <%}//fim do else%>
        </div>
    </body>
</html>
