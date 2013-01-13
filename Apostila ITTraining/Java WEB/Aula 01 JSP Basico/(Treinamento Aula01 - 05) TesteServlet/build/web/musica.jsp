

<html  xmlns="http://www.w3.org/1999/xhtml"> 
   <head> 
      <meta  http-equiv="Content-Type"  content="text/htmlj  charset=ISO-8859-1"/> 
      <title>Trabalhando  com  outros  métodos  de  HttpServletRequest</title> 
   </head> 
   <body> 
      <jsp:include page="topo.html"/>
      <form  action= "TrabOutrosMetComServlet"  method="post"> 
         <h2>Escolha  as  músicas</h2> 
         <p> 
            <input  name="musica"  type="checkbox"  value="ROCK"/>
            Rock<br/> 
            <input  name="musica"  type="checkbox"  value="POP"/> 
            POP<br/> 
            <input  name="musica"  type="checkbox"  value="DANCE"/> 
            Dance<br/> 
            <input  name="musica"  type="checkbox"  value="MPB"/> 
            MPB<br/> 
            <input  name=" musica"  type="checkbox"  value="SERTANEJO"/> 
            Sertanejo 
         </p> 
         <br/> 
         <input  type="submit"  name="btEnviar"  value="Enviar"/> 
         <input type='button'  value='Voltar' onClick='history.go(-1)'/>
      </form> 
      <jsp:include page="footer.html"/>
   </body> 
</html>



