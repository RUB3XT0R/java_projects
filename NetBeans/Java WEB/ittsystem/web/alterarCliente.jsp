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
                <%
                    Cliente c = new Cliente();
                    if (null == request.getParameter("id") || "".equals(request.getParameter("id"))) {
                        response.sendRedirect("clientes.jsp");
                    } else {
                        int id = Integer.parseInt(request.getParameter("id"));
                        c = new ClienteDao().getCliente(id);
                %>
                <% String filtro = request.getParameter("nome");%>
                <form name="novoCli" action="upCliente" method="post">
                    <table  bgcolor="white">
                        <caption>Alteração do Cliente </caption>
                        <tr>
                            <td colspan="4">
                                <input type="text" name="msg" style="border: none; width: 100%;" readonly="readonly"/>
                            </td>                        
                        </tr>
                        <tr>
                            <input type="hidden" name="id" value="<%= c.getId() %>"/>
                            <td>CPF/CNPJ:</td>
                            <td><input type="text" name="cpf" value="<%= c.getCpf_cnpj() %>" OnKeyPress="formatar(this, '###.###.###-##')" maxlength="14"/></td>
                            <td>Nome:</td>
                            <td><input type="text" name="nome" value="<%= c.getNome() %>"/></td>
                        </tr>
                        <tr>
                            <td>E-mail:</td>
                            <td><input type="text" name="email" value="<%= c.getEmail() %>"/></td>
                            <td>Email (2):</td>
                            <td><input type="text" name="email2" value="<%= c.getEmail2() %>"/></td>
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
                        </tr>
                        <tr>
                            <td>UF:</td>
                            <td><input type="text" name="uf" value="<%= c.getUf() %>" maxlength="2"/></td>
                            <td>RG:</td>
                            <td><input type="text" name="rg" value="<%= c.getRg() %>"  OnKeyPress="formatar(this, '##.###.###-#')"/></td>
                        </tr>
                        <tr>
                            <td>Bairro:</td>
                            <td><input type="text" name="bairro" value="<%= c.getBairro() %>"/></td>
                            <td>Endereço:</td>
                            <td><input type="text" name="endereco" value="<%= c.getLogradouro() %>"/></td>
                        </tr>
                        <tr>
                            <td>Cidade:</td>
                            <td><input type="text" name="cidade" value="<%= c.getCidade() %>"/></td>
                            <td>CEP:</td>
                            <td><input type="text" name="cep" value="<%= c.getCep() %>"  OnKeyPress="formatar(this, '#####-###')"/></td>
                        </tr>
                        <tr><th colspan="4"><label>Telefones</label></th></tr>
                        <tr>
                            <td>Telefone Residencial:</td>
                            <td><input type="text" name="telR" value="<%= c.getTelefoneResidencial() %>"  OnKeyPress="formatar(this, '####-####')"/></td>
                            <td>Telefone Comercial:</td>
                            <td><input type="text" name="telCo" value="<%= c.getTelefoneComercial() %>"  OnKeyPress="formatar(this, '####-####')"/></td>
                        </tr>
                        <tr>
                            <td>Telefone Celular:</td>
                            <td><input type="text" name="telCe" value="<%= c.getTelefoneCelular() %>"  OnKeyPress="formatar(this, '####-####')"/></td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <p class="formSubmit">
                                    <img src="img/prev.gif" width="25px;" onclick="location.href='clientes.jsp<%=(null != filtro) ? "?nome="+filtro : ""%>'"/>Voltar
                                    | Alterar<img src="img/next.png" width="25px;" onclick="valCliente();"/>
                                </p>
                            </td>                        
                        </tr>
                    </table>
                </form>
                <% }%>
            </div>
        </div>
    </body>
</html>
