<%-- 
    Document   : clientes
    Created on : 31/Out/2011, 14:02:30
    Author     : Lucas Biason
--%>
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
            <%
                if (null == request.getParameter("id") || "".equals(request.getParameter("id"))) {
                    response.sendRedirect("clientes.jsp");
                } else {

                    Cliente cliente = new ClienteDao().getCliente(Integer.parseInt(request.getParameter("id")));
            %>
            <% String filtro = request.getParameter("nome");%>
            <jsp:include page="topo.jsp"/>
            <jsp:include page="menu.jsp"/>
            <div class="newDatasCli">
                <table  bgcolor="white">
                    <caption>Cadastro de Novo Cliente</caption>
                    <tr>
                        <th>CPF/CNPJ:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getCpf_cnpj()%>" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <th>Nome:</th>
                        <td colspan="3"><input type="text" name="cpf" value="<%= cliente.getNome()%>" size="61px" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <th>E-mail:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getEmail()%>" readonly="readonly"/></td>
                        <th>Email (2):</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getEmail2()%>" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <th>Tipo:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getTipo()%>" readonly="readonly"/></td>
                        <th>Data de Cadastro:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getCadastro()%>" readonly="readonly"/></td>
                    </tr> 
                    <tr>
                        <th>UF:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getUf()%>" readonly="readonly" /></td>
                        <th>RG:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getRg()%>" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <th>Bairro:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getBairro()%>" readonly="readonly" /></td>
                        <th>Endereço:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getLogradouro()%>" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <th>Cidade:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getCidade()%>" readonly="readonly" /></td>
                        <th>CEP:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getCep()%>" readonly="readonly" /></td>
                    </tr>
                    <tr><td colspan="4"><label>Telefones</label></td></tr>
                    <tr>
                        <th>Telefone Residencial:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getTelefoneResidencial()%>" readonly="readonly"/></td>
                        <th>Telefone Comercial:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getTelefoneComercial()%>" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <th>Telefone Celular:</th>
                        <td><input type="text" name="cpf" value="<%= cliente.getTelefoneCelular()%>" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <p class="formSubmit">
                                <img src="img/prev.gif" width="25px;" 
                                     onclick="location.href='clientes.jsp<%=(null != filtro) ? "?nome=" + filtro : ""%>'"/>Voltar
                            </p>
                        </td>                        
                    </tr>

                </table>
                <% }%>
            </div>
        </div>
    </body>
</html>
