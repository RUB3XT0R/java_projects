<%-- 
    Document   : produtos
    Created on : 27/Nov/2011, 13:10:46
    Author     : Lucas Biason
--%>

<%@page import="modelo.Notas"%>
<%@page import="modelo.Aluno"%>
<%@page import="controle.alunoControl"%>
<%@page import="controle.cursoControl"%>
<%@page import="modelo.Curso"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <input type="button" value="Voltar"
             onClick="history.go(-1)"/>
      <h4>Notas de alunos</h4>
      <% Curso c = new cursoControl().get(Integer.parseInt(request.getParameter("id")));%>
      Curso:<%= c.getNome()%><br/>
      <% for (Notas n : c.getNotas()) {%>
      <% Aluno a = n.getChave().getAluno();%>
      <b><%= a.getNome()%></b> :
      <%= n.getNota_1()%>
      | <%= n.getNota_1()%>
      | <%= n.getNota_1()%>
      | <%= n.getNota_1()%><br/>
      <% }%>
      <jsp:include page="footer.html"/>
   </body>
</html>
