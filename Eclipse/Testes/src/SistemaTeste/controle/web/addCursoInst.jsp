<%-- 
    Document   : clientes
    Created on : 31/Out/2011, 14:02:30
    Author     : Lucas Biason
--%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Instrutor"%>
<%@page import="modelo.CursoInstrutor"%>
<%@page import="dao.CursoDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="dao.ClienteDao"%>
<%@page import="modelo.ClienteTipo"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="instrutor" class="modelo.Instrutor" scope="session"/>
<%
    if (null != request.getParameter("cpf") && !"".equals(request.getParameter("cpf"))) {
        instrutor.setCpf(request.getParameter("cpf"));
        instrutor.setRg(request.getParameter("rg"));
        instrutor.setNome(request.getParameter("nome"));
        instrutor.setEmail(request.getParameter("email"));
        instrutor.setEmail2(request.getParameter("email2"));
        instrutor.setTelefone(request.getParameter("telefone"));
        instrutor.setTelefone2(request.getParameter("telefone2"));
        instrutor.setCarro_marca(request.getParameter("marca"));
        instrutor.setCarro_modelo(request.getParameter("modelo"));
        instrutor.setCarro_placa(request.getParameter("placa"));
        instrutor.setCarro_cor(request.getParameter("cor"));
        instrutor.setCursosQueLeciona(new LinkedList<CursoInstrutor>());
    }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9"/>
        <title>IT Training :: Sistema de Controle</title>
        <link href="css/ittstyle.css" rel="StyleSheet" type="Text/css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/Validacao.js"></script>
        <script type="text/javascript">
            function validarBox(box){
                if (box.checked){box.value=1;}
                else{box.value=0;}
            }
        </script>
    </head>
    <body>

        <div class="corpo" id="corpo" align="center">
            <jsp:include page="topo.jsp"/>
            <jsp:include page="menu.jsp"/>
            <div class="newDatasCli">
                <form name="novoIns" action="addCurBean.jsp" method="post">
                    <table  bgcolor="white">
                        <caption>Cadastro de Novo Instrutor</caption>
                        <tr><td colspan="2">
                                Adicione um curso que <%= instrutor.getNome()%> ministra:
                            </td></tr>
                        <tr>
                            <td>Curso</td>
                            <td>
                                <select name="curso">
                                    <option value=""></option>
                                    <c:forEach items="<%= new CursoDao().getCursos()%>" var="c">
                                        <option value="${ c.id }">${ c.nome }</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Unidade:</td>
                            <td>
                                <input type="checkbox" name="abc" value='1' checked="checked"  onchange="validarBox(this)"/>ABC
                                <input type="checkbox" name="up" value="0"  onchange="validarBox(this)"/>UP
                            </td>
                        </tr>
                        <tr>
                            <td>Período:</td>
                            <td><select name="periodo">
                                    <option value=""></option>
                                    <option value="Semana">Semana</option>
                                    <option value="Sábado">Sábado</option>
                                    <option value="Domingo">Domingo</option>
                                    <option value="Fim de Semana">Fim de Semana</option>
                                    <option value="Semana e Sábado">Semana e Sábado</option>
                                    <option value="Semana e Domingo">Semana e Domingo</option>
                                    <option value="Todos">Todos</option>
                                </select></td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <p class="formSubmit">
                                    <img src="img/prev.gif" width="25px;" onclick="location.href='instrutores.jsp'"/>Voltar
                                    | Adicionar Curso<img src="img/next.png" width="25px;" onclick="document.forms.novoIns.submit()"/>
                                    Cadastrar Instrutor<img src="img/next.png" width="25px;" onclick="location.href='addInstrutor.jsp'"/>
                                </p>
                            </td>                        
                        </tr>
                    </table>
                    <table>
                        <tr><td colspan="3">
                                Cursos que <%= instrutor.getNome()%> ministra:
                            </td></tr>
                        <tr>
                            <th>Nome</th>
                            <th>Unidades</th>
                            <th>Período</th>
                        </tr>
                        <% for (CursoInstrutor ci : instrutor.getCursosQueLeciona()) {%>
                        <tr>
                            <td><%= ci.getCurso().getNome()%></td>
                            <td><%= ci.getUnidadeABC() ? " ABC " : ""%><%= ci.getUnidadeUP() ? " UP " : ""%></td>
                            <td><%= ci.getPeriodo()%></td>
                            <td>
                                <a href="revCurBean.jsp?idCurso=<%= ci.getCurso().getId()%>"><img src="img/del.png" style="height: 21px; width: 21px; " /></a>
                            </td>
                        </tr>
                        <%}%>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
