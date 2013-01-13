<%-- 
    Document   : upCurso
    Created on : 2/Dez/2011, 22:13:53
    Author     : Lucas Biason
--%>

<%@page import="modelo.Curso"%>
<%@page import="controle.cursoControl"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <% Curso c = new cursoControl().get(Integer.parseInt(request.getParameter("id")));%>
      <input type="button" value="Voltar"
             onClick="history.go(-1)"/>
      <h4>Alterando o curso:</h4>
      <form name="curso" action="cursoControl" method="post">
         <input type="hidden" name="operacao" value="altera"/>
         <input type="hidden" name="id" value="<%= c.getId()%>"/>
         Nome:<input type="text" value="<%= c.getNome()%>" name="nome"/>
         <input type="button" value="Atualizar >>"
                onClick="document.forms.curso.submit()"/>
      </form>

      <jsp:include page="footer.html"/>
   </body>
</html>
