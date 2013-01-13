/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.xmlservlet;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Administrador
 */
public class XMLServlet extends HttpServlet {
   
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
        try {
            List<User> users = new LinkedList<User>();

            User usr1 = new User();
            usr1.setId(1);
            usr1.setName("Dyego Souza");
            usr1.setAlive(true);
            usr1.setAge(26);
            usr1.setCreated(new Date());



            User usr2 = new User();
            usr2.setId(1);
            usr2.setName("Dyego Souza");
            usr2.setAlive(true);
            usr2.setAge(26);
            usr2.setCreated(new Date());


            users.add(usr1);
            users.add(usr2);
            ListOfUsers userList = new ListOfUsers(users);
            try {
                JAXBContext context = JAXBContext.newInstance(User.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.marshal(userList, response.getOutputStream());
            } catch (JAXBException ex) {
                Logger.getLogger(XMLServlet.class.getName()).log(Level.SEVERE, null, ex);
            }


        } finally { 
            response.getOutputStream().flush();
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
