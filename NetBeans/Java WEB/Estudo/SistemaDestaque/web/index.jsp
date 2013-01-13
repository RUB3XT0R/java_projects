
<%@page import="banco.DestaquesDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Destaque"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="banco.Dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title></title>
        <link href="css/destaque.css" rel="StyleSheet" type="Text/css"/>
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/jquery.cycle.all.min.js"></script>
        <script language="JavaScript" src="js/jquery.destaques.js"></script>
    </head>
    <body>

        <div id="blocoDestaques">
            <a class="faixa" href="#" title=""><!-- --></a>
            <ul>
                <%
                            DestaquesDAO dao = new DestaquesDAO();
                            List<Destaque> destaques = dao.getDestaques();
                            for (Destaque d : destaques) {
                %>

                <li>
                    <a href="<%= d.getLink()%>" title="<%= d.getTitulo()%>">
                        <img src="<%= d.getImagem()%>" alt="<%= d.getTitulo()%>" />
                    </a>
                    <div class="fundo"><!--  --></div>
                    <p><a href="<%= d.getLink()%>" title="<%= d.getTitulo()%>"><%= d.getTitulo()%></a></p>
                </li>

                <% }%>
            </ul>
        </div>
        <div>
            <form name="uploadImagem" action="uploadfiles.jsp" method="post">
                <table>
                    <caption>Sistema de Criação de Destaques</caption>
                    <tr>
                        <td></td>
                    </tr>
                Imagem:<input type="file"  name="caminho" onchange="document.forms.uploadImagem.imagem.value=document.forms.uploadImagem.caminho.value"/><br>
                <input type="text" name="imagem" onchange="document.forms.uploadImagem.preview.src=document.forms.uploadImagem.imagem.value"/><br/>
                Titulo:<input type="text" name="titulo"/><br/>
                Link:<input type="text" name="link"/><br/>
                <input type="submit" value="Enviar >>"/>
                </table>
            </form>
        </div>

        <div>
            <p>Adicionar comentário</p>
            <form id=”addCommentForm” method=”post” action=”">
                <div>
                    <label for=”name”>Seu nome</label>
                    <input id=”name” />
                    <label for=”email”>Seu Email</label>
                    <input name=”email” />
                    <label for=”url”>Website</label>
                    <input name=”url” />
                    <label for=”body”>Comentário</label>
                    <textarea id=”body” cols=”20″ rows=”5″></textarea>
                    <input id=”submit” value=”Submit” />
                </div>
            </form>
        </div>


    </body>
</html>
