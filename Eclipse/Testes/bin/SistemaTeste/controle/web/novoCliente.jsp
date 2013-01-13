<%-- 
    Document   : clientes
    Created on : 31/Out/2011, 14:02:30
    Author     : Lucas Biason
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="dao.ClienteDao"%>
<%@page import="modelo.ClienteTipo"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9"/>
        <title>IT Training :: Sistema de Controle</title>
        <link href="css/ittstyle.css" rel="StyleSheet" type="Text/css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/Validacao.js"></script>
    </head>
    <body>

        <div class="corpo" id="corpo" align="center">
            <jsp:include page="topo.jsp"/>
            <jsp:include page="menu.jsp"/>
            <div class="newDatasCli">
                <form name="novoCli" action="addCliente" method="post">
                    <table  bgcolor="white">
                        <caption>Cadastro de Novo Cliente</caption>
                        <tr>
                            <td colspan="4">
                                <input type="text" name="msg" style="border: none; width: 100%;" readonly="readonly"/>
                            </td>                        
                        </tr>
                        <tr>
                            <td>CPF/CNPJ:</td>
                            <td><input type="text" name="cpf" value="" OnKeyPress="formatar(this, '###.###.###-##')" maxlength="14"/></td>
                            <td>Nome:</td>
                            <td><input type="text" name="nome" value=""/></td>
                        </tr>
                        <tr>
                            <td>E-mail:</td>
                            <td><input type="text" name="email" value=""/></td>
                            <td>Email (2):</td>
                            <td><input type="text" name="email2" value=""/></td>
                        </tr>
                        <tr>
                            <td>Tipo:</td>
                            <td>
                                <select name="tipo">
                                    <option value=""></option>
                                    <c:forEach items="<%= ClienteTipo.values()%>" var="i">
                                        <option value="${ i.name }">${ i.descricao }</option>
                                    </c:forEach>
                                </select></td>
                            <td>Data de Cadastro:</td>
                            <% SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");%>
                            <td><input type="text" name="data" value="<%= sd.format(new java.util.Date())%>" readonly="readonly"/></td>
                        </tr>
                        <tr>
                            <td>UF:</td>
                            <td><input type="text" name="uf" value="" maxlength="2"/></td>
                            <td>RG:</td>
                            <td><input type="text" name="rg" value=""  OnKeyPress="formatar(this,'##.###.###-#')"/></td>
                        </tr>
                        <tr>
                            <td>Bairro:</td>
                            <td><input type="text" name="bairro" value=""/></td>
                            <td>Endereço:</td>
                            <td><input type="text" name="endereco" value=""/></td>
                        </tr>
                        <tr>
                            <td>Cidade:</td>
                            <td><input type="text" name="cidade" value=""/></td>
                            <td>CEP:</td>
                            <td><input type="text" name="cep" value=""  OnKeyPress="formatar(this, '#####-###')"/></td>
                        </tr>
                        <tr><th colspan="4"><label>Telefones</label></th></tr>
                        <tr>
                            <td>Telefone Residencial:</td>
                            <td><input type="text" name="telR" value=""  OnKeyPress="formatar(this, '####-####')"/></td>
                            <td>Telefone Comercial:</td>
                            <td><input type="text" name="telCo" value=""  OnKeyPress="formatar(this, '####-####')"/></td>
                        </tr>
                        <tr>
                            <td>Telefone Celular:</td>
                            <td><input type="text" name="telCe" value=""  OnKeyPress="formatar(this, '####-####')"/></td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <p class="formSubmit">
                                    <img src="img/prev.gif" width="25px;" onclick="location.href='clientes.jsp'"/>Voltar
                                    | Cadastrar<img src="img/next.png" width="25px;" onclick="valCliente();"/>
                                </p>
                            </td>                        
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
