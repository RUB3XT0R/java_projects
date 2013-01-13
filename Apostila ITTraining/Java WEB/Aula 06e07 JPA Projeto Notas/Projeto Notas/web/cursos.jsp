<%-- 
    Document   : produtos
    Created on : 27/Nov/2011, 13:10:46
    Author     : Lucas Biason
--%>

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
      <h4>Adicionando novo curso:</h4>
      <form name="curso" action="cursoControl" method="post">
         <input type="hidden" name="operacao" value="novo"/>
         Nome:<input type="text" value="" name="nome"/>
         <input type="button" value="Adicionar >>"
                onClick="document.forms.curso.submit()"/>
      </form>
      <hr>
      <h3>Lista de Cursos Cadastrados</h3>
      <table>
         <tr>
            <td>Código</td>
            <td>Nome</td>
         </tr>

         <% for (Curso c : new cursoControl().getLista()) {%>
         <tr>
            <td><%= c.getId()%></td>
            <td><%= c.getNome()%></td>
            <td><input type="button" value="Deletar"
                       onClick="location.href='cursoControl?operacao=deleta&id=<%=c.getId()%>'"/></td>
            <td><input type="button" value="Alterar"
                       onClick="location.href='upCurso.jsp?id=<%=c.getId()%>'"/></td>
            <td><input type="button" value="Visualizar Notas"
                       onClick="location.href='viewCurso.jsp?id=<%=c.getId()%>'"/></td>
         </tr>
         <% }%>
      </table>

      <jsp:include page="footer.html"/>
   </body>
</html>
