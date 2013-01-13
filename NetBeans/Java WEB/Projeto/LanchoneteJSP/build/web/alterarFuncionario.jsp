<%-- 
    Document   : alterarFuncionario
    Created on : 29/Out/2011, 19:52:26
    Author     : Lucas Biason
--%>

<%@page import="control.FuncionariosDao"%>
<%@page import="modelo.Funcionario"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
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
                <form name="novoFunci" action="upFuncionario" method="post">
                    <input type="hidden" value="<%= funcionario.getCpf() %>" name="id"/>
                    <fieldset>
                        <table border='0'>
                            <caption>Adicionar Novo Funcionário</caption>
                            <tr>
                                <td><label>CPF</label></td>
                                <td><input type="text" value='<%= funcionario.getCpf() %>' name="cpf" 
                                           OnKeyPress="formatar(this, '###.###.###-##')" maxlength="14"/></td>
                            </tr>
                            <tr>
                                <td><label>Nome</label></td>
                                <td><input type="text" value="<%= funcionario.getNome() %>" name="nome" maxlength="50"/></td>
                            </tr>
                            <tr>
                                <td><label>E-mail</label></td>
                                <td><input type="text" value="<%= funcionario.getEmail() %>" name="email" maxlength="50"/></td>
                            </tr> 
                            <tr>
                                <td><label>Telefone</label></td>
                                <td><input type="text" value="<%= funcionario.getTelefone() %>" name="telefone" 
                                           OnKeyPress="formatar(this,'####-####')" maxlength="9"/></td>
                            </tr>
                            <tr>
                                <td><label>Salário</label></td>
                                <td><input type="text" value="<%= funcionario.getSalario() %>" name="salario" /></td>
                            </tr>
                            <tr>
                                <td><label>Cargo</label></td>
                                <td><input type="text" value="<%= funcionario.getCargo() %>" name="cargo" maxlength="30"/></td>
                            </tr>
                            <tr>
                                <td><label>Cidade</label></td>
                                <td><input type="text" value="<%= funcionario.getCidade() %>" name="cidade" maxlength="50"/></td>
                            </tr>
                            <tr>
                                <td><label>Estado</label></td>
                                <td><input type="text" value="<%= funcionario.getEstado() %>" name="uf" maxlength="2"/></td>
                            </tr>
                            <tr>
                                <td><label>Endereço</label></td>
                                <td><input type="text" value="<%= funcionario.getEndereco() %>" name="endereco" maxlength="255"/></td>
                            </tr>
                            <tr><th colspan="2"><small>Login e senha exigem permissão de Administrador 
                                        ou o login e senha não serão cadastrados.</small></th></tr>
                            <tr>
                                <td><label>Login</label></td>
                                <td><input type="text" value="<%= funcionario.getLogin() %>" name="login" maxlength="45"/></td>
                            </tr>
                            <tr>
                                <td><label>Senha</label></td>
                                <td><input type="password" value="<%= funcionario.getSenha() %>" name="senha" maxlength="45"/></td>
                            </tr>
                            <tr>
                                <td><label>Login ADMIN</label></td>
                                <td><input type="text" value="" name="loginADMIN" maxlength="45"/></td>
                            </tr>
                            <tr>
                                <td><label>Senha ADMIN</label></td>
                                <td><input type="password" value="" name="senhaADMIN" maxlength="45"/></td>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <input type="button" value="Cadastrar >>" class="i2Style" onclick="valFuncionarios()"/>
                                </th>                    
                            </tr>
                        </table>
                    </fieldset>
                    <input type="text" value="" name="msg" style="border: 0px; min-width: 265px; text-align: center; color: #006699; background-color: white;" disabled="disabled"/>
                    <span>Para cancelar utilize o menu ao lado</span>
                </form>
            </div>
            <%}%>
        </div>
    </body>
</html>
