/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Interessado;

/**
 *
 * @author Lucas Biason
 */
public class enviarEmail extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Interessado c = new Interessado();
            c.setNome(request.getParameter("nome"));
            c.setCelular(request.getParameter("celular"));
            c.setEmail(request.getParameter("email"));
            c.setUnidadeABC(null != request.getParameter("abc"));
            c.setUnidadeUP(null != request.getParameter("up"));
            String mensagem = request.getParameter("mensagem");


            Properties p = new Properties();  
            p.put("mail.smtp.host", "mail.ittraining.com.br");
            p.put("mail.smtp.auth", "true");
            Authenticator auth = new Authenticator() {
                     @Override
                     public PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("lucas@ittraining.com.br", "cdf2525");
                     }
            };
            Session session = Session.getInstance(p, auth);  
            MimeMessage msg = new MimeMessage(session); 
            msg.setFrom(new InternetAddress("lucas@ittraining.com.br","Lucas Biason"));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress("lucas@ittraining.com.br", "Lucas Biason"));
            msg.setSubject("Contato do site - Ittraining");
            msg.setContent("", "text/html");
            Transport.send(msg);
            
            response.sendRedirect("index.jsp");
           
        } catch (MessagingException ex) {
            Logger.getLogger(enviarEmail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
