<%-- 
    Document   : cobol
    Created on : 24/Out/2011, 13:13:32
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>COBOL Mainframe</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link href="css/ittstyle.css" rel="StyleSheet" type="Text/css"/>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    </head>

    <body>
        
        <div class="corpo" id="corpo" align="center">
            <table border="0">
                <tr><jsp:include page="hMenu.jsp"/></tr>
                <tr><jsp:include page="destaques.jsp"/></tr>
                <tr>
                    <td rowspan="2" valign="top"><jsp:include page="menu.jsp"/></td>
                    <td>

                        <div class="box">

                            <ul class="clearfix">
                                <li class="active">COBOL</li>
                                <li>Refresh COBOL DB2</li>
                            </ul>
                                
                            <div class="content">
                                <jsp:include page="cobolc.jsp"/>
                                <jsp:include page="refreshcobol.jsp"/>       
                           </div>                                                                                                                                                                    
                    </td>
                </tr>
            </table>
            <img src="img/footer.png" width="720" height="110"/>
        </div>
                    
    </body>
</html>