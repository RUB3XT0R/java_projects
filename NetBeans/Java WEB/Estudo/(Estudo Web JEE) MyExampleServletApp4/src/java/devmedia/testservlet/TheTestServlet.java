/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.testservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class TheTestServlet extends HttpServlet {
   
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
            out.println("The id is "+request.getSession().getId()+"<br/>");
            out.println("The created is "+request.getSession().getCreationTime()+"<br/>");
            out.println("The last access is "+request.getSession().getLastAccessedTime()+"<br/>");
            if (request.getSession().getAttribute("count") == null) {
                request.getSession().setAttribute("count", 0);
            }

            Integer count = (Integer) request.getSession().getAttribute("count");
            count++;
            out.println("<br/><br/><br/>");
            out.println("The count is "+count);
            request.getSession().setAttribute("count", count);
            boolean found = false;
            String valueOfCookei  = "0";
            for (Cookie ck : request.getCookies()) {
                if (ck.getName().equals("countCookie")) {
                    Integer value = Integer.parseInt(ck.getValue());
                    ck.setValue(String.valueOf(value+1));
                    valueOfCookei= ck.getValue();
                    response.addCookie(ck);
                    found = true;
                }
            }
            if (!found) {
                Cookie ck = new Cookie("countCookie", valueOfCookei);
            }
            out.println("<br/><br/><br/>");
            out.println("The Cookie count is "+count);
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
