<%-- 
    Document   : topo
    Created on : 13/05/2011, 17:15:57
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="css/tudo.css" rel="StyleSheet" type="Text/css"/>
<script type="text/javascript" src="css/jquery-latest.js"></script>

<script language="JavaScript">
    $(document).ready(function(){

        $("ul.subnav").parent().append("<span></span>"); //Only shows drop down trigger when js is enabled (Adds empty span tag after ul.subnav*)

        $("ul.topnav li span").click(function() { //When trigger is clicked...

            //Following events are applied to the subnav itself (moving subnav up and down)
            $(this).parent().find("ul.subnav").slideDown('fast').show(); //Drop down the subnav on click

            $(this).parent().hover(function() {
            }, function(){
                $(this).parent().find("ul.subnav").slideUp('slow'); //When the mouse hovers out of the subnav, move it back up
            });

            //Following events are applied to the trigger (Hover events for the trigger)
        }).hover(function() {
            $(this).addClass("subhover"); //On hover over, add class "subhover"
        }, function(){  //On Hover Out
            $(this).removeClass("subhover"); //On hover out, remove class "subhover"
        });

    });
</script>

    <ul class="topnav">
        <li><a href="index.jsp">Home</a></li>
        <li>
            <a href="#">Tutorials</a>
            <ul class="subnav">
                <li><a href="#">Sub Nav Link</a></li>
                <li><a href="#">Sub Nav Link</a></li>
            </ul>
        </li>
        <li>
            <a href="#">Resources</a>
            <ul class="subnav">
                <li><a href="#">Sub Nav Link</a></li>
                <li><a href="#">Sub Nav Link</a></li>
            </ul>
        </li>
        <li><a href="#" class='osx demo'>Sobre</a></li>
        <li><a href="#">Advertise</a></li>
    </ul>