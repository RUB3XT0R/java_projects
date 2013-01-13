<%-- 
    Document   : topoSlide
    Created on : 13/05/2011, 17:13:26
    Author     : Lucas Biason
--%>

<%@page import="modelo.Destaque"%>
<%@page import="java.util.List"%>
<%@page import="banco.DestaquesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="css/tudo.css" rel="StyleSheet" type="Text/css"/>
<link href="css/destaque.css" rel="StyleSheet" type="Text/css"/>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jquery.cycle.all.min.js"></script>
<script language="JavaScript" src="js/jquery.destaques.js"></script>

<center>
    <div id ="blocoSlide">
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
    </div>
</center>
