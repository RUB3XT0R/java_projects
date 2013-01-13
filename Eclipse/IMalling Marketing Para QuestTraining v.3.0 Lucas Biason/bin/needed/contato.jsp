<%-- 
    Document   : contato
    Created on : 24/Out/2011, 17:17:24
    Author     : Lucas Biason
--%>

<%@page import="dao.CursoDao"%>
<%@page import="modelo.Curso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script type="text/javascript">
    $(document).ready(function() {

        //seleciona os elementos a com atributo name="modal"
        $('a[name=modal]').click(function(e) {
            //cancela o comportamento padrão do link
            e.preventDefault();

            //armazena o atributo href do link
            var id = $(this).attr('href');

            //armazena a largura e a altura da tela
            var maskHeight = $(document).height();
            var maskWidth = $(window).width();

            //Define largura e altura do div#mask iguais ás dimensões da tela
            $('#mask').css({'width':maskWidth,'height':maskHeight});

            //efeito de transição
            $('#mask').fadeIn(1000);
            $('#mask').fadeTo("slow",0.8);

            //armazena a largura e a altura da janela
            var winH = $(window).height();
            var winW = $(window).width();
            //centraliza na tela a janela popup
            $(id).css('top',  winH/2-$(id).height()/2);
            $(id).css('left', winW/2-$(id).width()/2);
            //efeito de transição
            $(id).fadeIn(2000);
        });

        //se o botãoo fechar for clicado
        $('.window .close').click(function (e) {
            //cancela o comportamento padrão do link
            e.preventDefault();
            $('#mask, .window').hide();
        });

        //se div#mask for clicado
        $('#mask').click(function () {
            $(this).hide();
            $('.window').hide();
        });
    });
</script>
<div id="boxes">
    <!-- #personalize sua janela modal aqui -->
    <div id="dialog" class="window">
        <form name="contato" action="enviarEmail" method="post">
            <p id="titleForm">Formulário de Contato:</p>
            <p id="FormL">
                <label>Nome:</label>
                <input type="text" name="nome" value="" /><br/>
                <label>Tel. Comercial:</label><input type="text" name="telcom" value=""/><br/>
                <label>Tel. Residencial:</label><input type="text" name="telres" value=""/><br/>
                <label>Celular:</label><input type="text" name="celular" value="" /><br/>
                <label>E-mail:</label><input type="text" name="email" value="" /><br/>
                <label>Unidades:</label><br/>
                <label><b>- ABC:</b></label><input type="checkbox" name="abc" value="1" checked="checked" onchange="validarBox(this)"><br/>
                <label><b>- UP:</b></label><input type="checkbox" name="up" value="0" onchange="validarBox(this)"><br/>
                <label>Período:</label>
                <select name="periodo">
                    <option value=""></option>
                    <option value="Semana">Semana</option>
                    <option value="Sábado">Sábado</option>
                    <option value="Domingo">Domingo</option>
                    <option value="Fim de Semana">Fim de Semana</option>
                    <option value="Semana e Sábado">Semana e Sábado</option>
                    <option value="Semana e Domingo">Semana e Domingo</option>
                    <option value="Todos">Todos</option>
                </select><br/>
                <label>Mensagem:</label><textarea name="mensagem" rows="4" cols="20"> </textarea><br/>
            </p>
            <p id="FormR">
                <label><b>Sistemas SAP</b></label><br/>
                <% for (Curso c : new CursoDao().getCursosByCategoria("SAP")) {%>
                <label><%= c.getNome()%></label>
                <input type="checkbox" name="curso" value="<%= c.getId()%>"/><br/>
                <% }%>
            </p>
            <p id="FormR2">
                <label><b>Desenvolvimento de Sistemas</b></label><br/>
                <% for (Curso c : new CursoDao().getCursosByCategoria("Desenvolvimento de Sistemas")) {%>
                <label><%= c.getNome()%></label>
                <input type="checkbox" name="curso" value="<%= c.getId()%>"/><br/>
                <% }%>
            </p>
            <p id="FormR3">
                <label><b>Formação Oracle</b></label><br/>
                <% for (Curso c : new CursoDao().getCursosByCategoria("Oracle")) {%>
                <label><%= c.getNome()%></label>
                <input type="checkbox" name="curso" value="<%= c.getId()%>"/><br/>
                <% }%>
            </p>
            <p id="FormR4">
                <label><b>Tecnologia da Informação</b></label><br/>
                <% for (Curso c : new CursoDao().getCursosByCategoria("Gestão")) {%>
                <label><%= c.getNome()%></label>
                <input type="checkbox" name="curso" value="<%= c.getId()%>"/><br/>
                <% }%>
            </p>
            <p id="formSubmit">
                <input type="submit"/>
                <input type="reset" value="Limpar"/> 
                <input type="button" onclick="location.href='index.jsp'" value="Fechar"/>
            </p>
            <img src="img/email.png"/>
        </form>
    </div>
    <!-- Não remova o div#mask, pois ele é necessário para preencher toda a janela -->
    <div id="mask"></div>
</div>
