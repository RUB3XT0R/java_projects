<%-- 
    Document   : produtos
    Created on : 27/Nov/2011, 13:10:46
    Author     : Lucas Biason
--%>

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
      <h4>Adicionando novo aluno:</h4>
      <form name="aluno" action="alunoControl" method="post">
         <input type="hidden" name="operacao" value="novo"/>
         Nome:<input type="text" value="" name="nome"/><br/>
         E-mail:<input type="text" value="" name="email"/>
         <input type="button" value="Adicionar >>"
                onClick="document.forms.aluno.submit()"/>
      </form>
      <hr>
      <h3>Lista de Alunos Cadastrados</h3>
      <table>
         <tr>
            <td>Ra</td>
            <td>Nome</td>
            <td>E-mail</td>
         </tr>

         <% for (Aluno a : new alunoControl().getList()) {%>
         <tr>
            <td><%=a.getRa()%></td>
            <td><%=a.getNome()%></td>
            <td><%=a.getEmail()%></td>
            <td><input type="button" value="Deletar"
                       onClick="location.href='alunoControl?operacao=deleta&ra=<%=a.getRa()%>'"/></td>
            <td><input type="button" value="Alterar"
                       onClick="location.href='upAluno.jsp?ra=<%=a.getRa()%>'"/></td>
            <td><input type="button" value="Visualizar Notas"
                       onClick="location.href='viewAluno.jsp?ra=<%=a.getRa()%>'"/></td>
         </tr>
         <% }%>
      </table>

      <jsp:include page="footer.html"/>
   </body>
</html>
