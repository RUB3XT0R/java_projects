<%-- 
    Document   : index
    Created on : 05/05/2011, 19:54:30
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    </head>
    <body>
        <form  action= "testes" method="post">
            <h2>Escolha  as músicas</h2>
            <p>
                <input  name="musica"  type="checkbox"  value="ROCK"  I>  O Rock<br/>
                <input  name="musica"  type="checkbox"  value="POP"  I> POP<br/>
                <input  name="musica"  type="checkbox"  value="DANCE"/> Dance<br/>
                <input  name="musica"  type="checkbox"  value="MPB"  /> MPB<br/>
                <input  name="musica"  type="checkbox"  value="SERTANEJO"  /> Sertanejo
            </p>
            <br/>
            <input  type="submit"  name="btEnviar"  value="Enviar"  />
        </form>


        <form  action= "testes2" method="post">
            <h2>Escolha  as músicas</h2>
            <p>
                Nome: <input name="nome" type="text"/><br/>
                E-mail: <input name="email" type="text"/><br/>
                Site: <input name="site" type="text"/><br/>
            </p>
            <br/>
            <input  type="submit"  name="btEnviar"  value="Enviar"  />
        </form>
    </body>
</html>
