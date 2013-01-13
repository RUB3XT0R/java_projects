/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lucas Biason
 */
public class CriarSessao extends HttpServlet {
   
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      
      HttpSession sessao = request.getSession(true);
      sessao.setAttribute("nome", "lucas");
      sessao.setMaxInactiveInterval(50);

      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy  - HH:mm:ss");

      String html = "<html><body>"
              + "Sua sessão foi criada com sucesso!<br/>"
              + "Sua  ID  é:  <strong>" + sessao.getId() + "</strong> <br/> "
              + "O  tempo  máximo  de  inatividade  é:  <strong>"
              + sessao.getMaxInactiveInterval()
              + "</strong>  segundo(s)<br/>"
              + "Sessão  criada  em:  <strong>"
              + formato.format(new Date(sessao.getCreationTime()))
              + "</strong><br/>"
              + "Último  acesso  em :  <strong>"
              + formato.format(new Date(sessao.getLastAccessedTime()))
              + "</strong><br/>"
              + "<a  href=\"VisualizarSessao\">Clique  aqui</a>"
              + "  para  ver  a  sessão  na  página  seguinte . "
              + "</body></html>";
      out.print(html);
      out.close();
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
