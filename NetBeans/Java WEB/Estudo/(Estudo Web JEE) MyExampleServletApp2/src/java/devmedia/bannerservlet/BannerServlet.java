/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.bannerservlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class BannerServlet extends HttpServlet {
   
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
        Random rand = new Random();

        String theRand = String.valueOf(rand.nextInt(3));
        String savedRand =  (String) request.getSession().getAttribute("banner");
        if (savedRand == null) {

        request.getSession().setAttribute("banner", theRand);
        } else {
            while(theRand.equals(savedRand)) {
                theRand = String.valueOf(rand.nextInt(3));
            }
        }


        try {
           InputStream theImage = BannerServlet.class.getResourceAsStream("banner"+theRand+".jpg");
           byte[] buffer = new byte[4096];
           while ((theImage.read(buffer)) != -1) {
               response.getOutputStream().write(buffer);
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
