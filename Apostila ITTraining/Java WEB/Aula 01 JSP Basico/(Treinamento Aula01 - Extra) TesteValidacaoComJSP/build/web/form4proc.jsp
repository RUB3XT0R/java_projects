<%-- 
    Document   : form4proc
    Created on : 07/05/2011, 20:38:02
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% //capturo os parâmetros
        int erro = 0, idade = -1;
        String nome = request.getParameter("nome");
%>
<% //defino o erro
        if (nome == null || nome.length() == 0) erro = 1;
        else {
         try {idade = Integer.parseInt(request.getParameter("idade"));} 
         catch (NumberFormatException exc) { erro = 2; }
         if (idade < 0)  erro = 2;
        }
%>
<% //redireciono para para a página correta utilizando diretiva forward
        if (erro > 0) { %>
        <jsp:forward page="index.jsp">
           <jsp:param name="msg" value="<%= erro%>"/>
        </jsp:forward>
<%          }
   String pagina = (idade < 18) ? "form4menor.jsp" : "form4maior.jsp";
%>
            <jsp:forward page="<%= pagina %>">
                <jsp:param name="nome" value="${param.nome}"/>
                <jsp:param name="idade" value="${param.idade}"/>
            </jsp:forward>