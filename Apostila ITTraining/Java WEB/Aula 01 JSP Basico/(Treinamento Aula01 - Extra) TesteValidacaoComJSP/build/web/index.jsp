<%-- 
    Document   : index
    Created on : 07/05/2011, 20:18:24
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  //verificar se é a primeira vista a página ou se é o retorno do erro.
   String msg = request.getParameter("msg");
   String msgOut = "";
   if (msg != null && (msg.equals("1") || msg.equals("2"))) {
      msgOut = (msg.equals("1")) ? "Forneça um nome!" : "Forneça idade válida!";
   }
%>
<html>
   <body>
      <jsp:include page="topo.html"/>
      <form action="form4proc.jsp" method="post">
         <table border="0">

            <tr><th colspan="2"><b>Formulário</b></th></tr>

            <tr bgcolor="#dfdfdf">
               <td colspan="2">
                  <font color="red"><%= msgOut%></font>
               </td>
            </tr>

            <tr bgcolor="#dfdfef">
               <td>Nome:</td>
               <td><input type="text" name="nome" value="${param.nome}"></td>
            </tr>

            <tr bgcolor="#efdfdf">
               <td>Idade:</td>
               <td><input type="text" name="idade" value="${param.idade}"></td>
            </tr>

            <tr>
               <td></td>
               <td>
                  <input type="submit" value="OK">
                  <input type="reset" value="Limpar">
               </td>
            </tr>

         </table>

      </form>

      <jsp:include page="footer.html"/>
   </body>
</html>
