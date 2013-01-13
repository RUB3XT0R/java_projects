<%-- 
    Document   : funcionarios
    Created on : 22/Out/2011, 17:57:04
    Author     : Lucas Biason
--%>

<%@page import="control.FuncionariosDao"%>
<%@page import="modelo.Funcionario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Funcionários</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/validacao.js"></script> 
    </head>
    <body>
        <%
            String msg = request.getParameter("msg");
            if (msg == null || "".equals(msg)) {
                msg = "";
            } else if ("ok".equals(msg)) {
                msg = "Operação realizada com sucesso.";
            } else if ("faill".equals(msg)) {
                msg = "O funcionário já existe.";
            } else if ("not".equals(msg)) {
                msg = "Não foi possível efetuar a operação.";
            }
        %>
        <div class="content">

            <jsp:include page="menu.jsp"/>

            <div class="tableDatas">
                <table>
                    <caption>Funcionários Cadastrados</caption>
                    <tr>
                        <th>CPF</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Cargo</th>
                        <th>Ações</th>
                    </tr>
                    <c:forEach items="<%= new FuncionariosDao().getAllFuncionarios()%>" var="b">
                        <tr>
                            <td>${ b.cpf }</td>
                            <td>${ b.nome }</td>
                            <td>${ b.cargo }</td>
                            <td>${ b.email }</td>
                            <td><c:if test='${ b.cargo ne "ADMIN"}'>
                                    <a href="alterarFuncionario.jsp?id=${ b.cpf }"><img src="img/bt_update.png" style="height: 21px; width: 21px; " /></a>
                                    <a href="removerFuncionario.jsp?id=${ b.cpf }"><img src="img/bt_delete.png" style="height: 21px; width: 21px; " /></a>
                                    </c:if>
                                <a href="visualisarFuncionario.jsp?id=${ b.cpf }"><img src="img/lupa.png" style="height: 21px; width: 21px; " /></a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

            <div class="newDatas">
                <form name="novoFunci" action="addFuncionario" method="post">
                    <fieldset>
                        <table border='0'>
                            <caption>Adicionar Novo Funcionário</caption>
                            <tr>
                                <td><label>CPF</label></td>
                                <td><input type="text" value='' name="cpf" 
                                           OnKeyPress="formatar(this, '###.###.###-##')" maxlength="14"/></td>
                            </tr>
                            <tr>
                                <td><label>Nome</label></td>
                                <td><input type="text" value="" name="nome" maxlength="50"/></td>
                            </tr>
                            <tr>
                                <td><label>E-mail</label></td>
                                <td><input type="text" value="" name="email" maxlength="50"/></td>
                            </tr> 
                            <tr>
                                <td><label>Telefone</label></td>
                                <td><input type="text" value="" name="telefone" 
                                           OnKeyPress="formatar(this,'####-####')" maxlength="9"/></td>
                            </tr>
                            <tr>
                                <td><label>Salário</label></td>
                                <td><input type="text" value="" name="salario" /></td>
                            </tr>
                            <tr>
                                <td><label>Cargo</label></td>
                                <td><input type="text" value="" name="cargo" maxlength="30"/></td>
                            </tr>
                            <tr>
                                <td><label>Cidade</label></td>
                                <td><input type="text" value="" name="cidade" maxlength="50"/></td>
                            </tr>
                            <tr>
                                <td><label>Estado</label></td>
                                <td><input type="text" value="" name="uf" maxlength="2"/></td>
                            </tr>
                            <tr>
                                <td><label>Endereço</label></td>
                                <td><input type="text" value="" name="endereco" maxlength="255"/></td>
                            </tr>
                            <tr><th colspan="2"><small>Login e senha exigem permissão de Administrador 
                                        ou o login e senha não serão cadastrados.</small></th></tr>
                            <tr>
                                <td><label>Login</label></td>
                                <td><input type="text" value="" name="login" maxlength="45"/></td>
                            </tr>
                            <tr>
                                <td><label>Senha</label></td>
                                <td><input type="password" value="" name="senha" maxlength="45"/></td>
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
                    <input type="text" value="<%= msg%>" name="msg" style="border: 0px; min-width: 265px; text-align: center; color: #006699; background-color: white;" disabled="disabled"/>
                </form>
            </div>
        </div>
    </body>
</html>
