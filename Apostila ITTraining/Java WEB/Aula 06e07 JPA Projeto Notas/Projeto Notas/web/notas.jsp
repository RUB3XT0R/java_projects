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
             onClick="location.href='index.jsp'"/>
      <h4>Adicionando nova Nota :</h4>
      <form name="nota" action="notasControl" method="post">
         <input type="hidden" name="operacao" value="novo"/>
         Aluno:
         <select name="aluno">
            <option value=""></option>
            <% for (Aluno a : new alunoControl().getList()) {%>
            <option value="<%= a.getRa()%>"><%= a.getNome()%></option>
            <%}%>
         </select><br/>
         Curso:
         <select name="curso">
            <option value=""></option>
            <% for (Curso c : new cursoControl().getLista()) {%>
            <option value="<%= c.getId()%>"><%= c.getNome()%></option>
            <%}%>
         </select><br/>
         --Notas:--<br/>
         | 01= <input type="text" value="" name="nota1"/><br/>
         | 02= <input type="text" value="" name="nota2"/><br/>
         | 03= <input type="text" value="" name="nota3"/><br/>
         | 04= <input type="text" value="" name="nota4"/><br/>
         <input type="button" value="Adicionar >>"
                onClick="document.forms.nota.submit()"/>
      </form>
      <hr/>
      <% for (Curso c : new cursoControl().getLista()) {%>
      <h3>Notas do curso : <b><%= c.getNome()%></b></h3>
      <p>
         <% for (Notas n : c.getNotas()) {%>
         Aluno: <b><%= n.getChave().getAluno().getNome()%></b> | 
         <%= n.getNota_1()%> | <%= n.getNota_2()%> | <%= n.getNota_3()%> | <%= n.getNota_4()%> | 
         <input type="button" onclick="location.href='notasControl?operacao=deleta&aluno=<%= n.getChave().getAluno().getRa()%>&curso=<%= n.getChave().getCurso().getId()%>'" value="Deletar >>"><br/>
         <% }%>
      </p>
      <%}%>    
      <jsp:include page="footer.html"/>
   </body>
</html>
