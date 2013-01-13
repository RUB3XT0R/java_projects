<%-- 
    Document   : destaques
    Created on : 21/Out/2011, 15:34:46
    Author     : Lucas Biason
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script type="text/javascript" src="js/jquery.cycle.all.min.js"></script>
<script language="JavaScript" src="js/jquery.destaques.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.1/jquery.min.js"></script> 

<jsp:include page="contato.jsp"/>

<th>
    <img src="img/contato.png"/><br/>
    <a href="#dialog" name="modal"><img src="img/emailbtn.png"/></a>
</th>
<th>

<div id="blocoDestaques">
    <a class="faixa" href="#" title=""><!-- --></a>
    <ul>
        <li>
            <a href="csharp.jsp" title="Destaque 1">
                <img src="img/destaque1.jpg" alt="Destaque 1" />
            </a>
            <div class="fundo"><!--  --></div>
            <p><a href="csharp.jsp" title="Destaque 1">O Visual C# tem dominado o mercado corporativo de Sistemas Web nos últimos anos.</a></p>
        </li>	

        <li>
            <a href="sap.jsp" title="Destaque 2">
                <img src="img/destaque2.jpg" alt="Destaque 2" />
            </a>
            <div class="fundo"><!--  --></div>
            <p><a href="sap.jsp" title="Destaque 2">A SAP é líder mundial em software de gestão empresarial.</a></p>
        </li>

        <li>
            <a href="oracle.jsp" title="Destaque 3">
                <img src="img/destaque3.jpg" alt="Destaque 3" />
            </a>
            <div class="fundo"><!--  --></div>
            <p><a href="oracle.jsp" title="Destaque 3">A Oracle é líder Mundial em software de banco de dados.</a></p>
        </li>

        <li>
            <a href="#" title="Destaque 4">
                <img src="img/destaque4.jpg" alt="Destaque 4" />
            </a>
            <div class="fundo"><!--  --></div>
            <p><a href="#" title="Destaque 4">Veja nossos Clientes...</a></p>
        </li>

        <li>
            <a href="java.jsp" title="Destaque 5"><img src="img/destaque5.jpg" alt="Destaque 5" /></a>
            <div class="fundo"><!--  --></div>
            <p><a href="java.jsp" title="Destaque 5">Java é a escolha mais utilizada para sistemas robustos, confiaveis e portáteis</a></p>
        </li>
    </ul>
</div>

</th>