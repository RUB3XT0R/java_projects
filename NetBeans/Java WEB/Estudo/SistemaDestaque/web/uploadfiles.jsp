<%@page import="modelo.Destaque"%>
<%@page import="banco.DestaquesDAO"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.File"%>
<%@page import="java.io.File"%>
<%@page import="java.awt.image.BufferedImage"%>
<%
        File file = new File(request.getParameter("imagem"));
        BufferedImage imagem = ImageIO.read(file);
        ImageIO.write(imagem,"JPG",new File("G:/Lucky Biason Files/Trabalhos/Java/SistemaDestaque/web/img/"+file.getName()));
        ImageIO.write(imagem,"JPG",new File("G:/Lucky Biason Files/Trabalhos/Java/SistemaDestaque/build/web/img"+file.getName()));

        DestaquesDAO dao = new DestaquesDAO();
        Destaque d = new Destaque();
        d.setTitulo(request.getParameter("titulo"));
        d.setLink(request.getParameter("link"));
        d.setImagem("img/"+file.getName());
        dao.inserir(d);
        response.sendRedirect("index.jsp");
%>

