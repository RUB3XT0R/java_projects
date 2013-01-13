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
<jsp:useBean id="instrutor" class="modelo.Instrutor" scope="session"/>

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
                <form name="novoIns" action="addCursoInst.jsp" method="post">
                    <table  bgcolor="white">
                        <caption>Cadastro de Novo Instrutor</caption>
                        <tr>
                            <td colspan="4">
                                <input type="text" name="msg" style="border: none; width: 100%;" readonly="readonly"/>
                            </td>                        
                        </tr>
                        <tr>
                            <td>CPF:</td>
                            <td><input type="text" name="cpf" value="" OnKeyPress="formatar(this, '###.###.###-##')" maxlength="14"/></td>
                            <td>RG:</td>
                            <td><input type="text" name="rg" value=""  OnKeyPress="formatar(this,'##.###.###-#')"  maxlength="12"/></td>
                        </tr>
                        <tr><td>Nome:</td>
                            <td colspan="3"><input type="text" name="nome" value="" size="63"/></td>
                        </tr>
                        <tr><td colspan="4">Emails<small> (forneça pelo menos um)</small></td></tr>
                        <tr>
                            <td>E-mail:</td>
                            <td><input type="text" name="email" value=""/></td>
                            <td>Email (2):</td>
                            <td><input type="text" name="email2" value=""/></td>
                        </tr>
                        <tr>
                            <td>Telefone:</td>
                            <td><input type="text" name="telefone" value=""  OnKeyPress="formatar(this, '####-####')"/></td>
                            <td>Telefone(2):</td>
                            <td><input type="text" name="telefone2" value=""  OnKeyPress="formatar(this, '####-####')"/></td>
                        </tr>
                        <tr><td colspan="4">Detalhes do Carro</td></tr>
                        <tr>
                            <td>Marca</td>
                            <td><input type="text" name="marca" value=""/></td>
                            <td>Modelo</td>
                            <td><input type="text" name="modelo" value=""/></td>
                        </tr>
                        <tr>
                            <td>Placa</td>
                            <td><input type="text" name="placa" value="" OnKeyPress="formatar(this, '###-####')"/></td>
                            <td>Cor</td>
                            <td><input type="text" name="cor" value=""/></td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <p class="formSubmit">
                                    <img src="img/prev.gif" width="25px;" onclick="location.href='clientes.jsp'"/>Voltar
                                    | Próximo<img src="img/next.png" width="25px;" onclick="valInstrutores()"/>
                                </p>
                            </td>                        
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
