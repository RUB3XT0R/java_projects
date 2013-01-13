<%-- 
    Document   : varredura
    Created on : 2/Nov/2011, 11:23:28
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<html> 
   <head> 
      <meta  http-equiv="Content-Type"  content="text/html;  charset=ISO-8859-1"  /> 
      <title>Trabalhando  com  outros  métodos  de  HttpServletRequest</title> 
   </head> 

   <body> 
      <jsp:include page="topo.html"/>
      <form  action= "VarrendoTodosObjetos"  method="post" > 
         <h2>Cadastre-se  aqui:</h2> 
         Nome:<input  name="nome"  type="text"/><br/> 
         E-mail:<input  name="email"  type="text"/><br/> 
         Site:<input  name="site"  type="text"/> <br/> 
         <br/> 
         <input  type="submit"  name="Enviar"  value="Enviar"/>
         <input type='button'  value='Voltar' onClick='history.go(-1)'/> 
      </form> 
      <jsp:include page="footer.html"/>
   </body> 
</html> 


