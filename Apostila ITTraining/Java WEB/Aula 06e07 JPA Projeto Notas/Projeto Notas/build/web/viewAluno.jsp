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
      <h4>Notas do aluno:</h4>
      <% Aluno a = new alunoControl().get(Integer.parseInt(request.getParameter("ra")));%>
      Aluno:<%= a.getNome()%><br/>
      E-mail:<%= a.getEmail()%><br/>
      <% for (Notas n : a.getNotas()) {%>
      <% Curso c = n.getChave().getCurso();%>
      <p><b><%= c.getNome()%></b><br/>
         --Notas:--<br/>
         | <%= n.getNota_1()%>
         | <%= n.getNota_1()%>
         | <%= n.getNota_1()%>
         | <%= n.getNota_1()%><br/></p>
      <hr>
      <% }%>
      <jsp:include page="footer.html"/>
   </body>
</html>
