<%-- 
    Document   : upCurso
    Created on : 2/Dez/2011, 22:13:53
    Author     : Lucas Biason
--%>

<%@page import="modelo.Aluno"%>
<%@page import="controle.alunoControl"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
      <title>JSP Page</title>
   </head>
   <body>
      <jsp:include page="topo.html"/>
      <% Aluno a = new alunoControl().get(Integer.parseInt(request.getParameter("ra")));%>
      <input type="button" value="Voltar"
             onClick="history.go(-1)"/>
      <h4>Alterando o aluno:</h4>
      <form name="aluno" action="alunoControl" method="post">
         <input type="hidden" name="operacao" value="altera"/>
         <input type="hidden" name="ra" value="<%=a.getRa()%>"/>
         Nome:<input type="text" value="<%=a.getNome()%>" name="nome"/><br/>
         E-mail:<input type="text" value="<%=a.getEmail()%>" name="email"/>
         <input type="button" value="Atualizar >>"
                onClick="document.forms.aluno.submit()"/>
      </form>

      <jsp:include page="footer.html"/>
   </body>
</html>
