/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ClienteDao;
import dao.ProdutoDao;
import dao.VendaDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Venda;
import modelo.VendaItem;

public class controlVenda extends HttpServlet {

   
   private VendaDao dao = new VendaDao();
   private Venda v;
   
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try {
         String operacao = request.getParameter("operacao");
         if("nova".equalsIgnoreCase(operacao)){
            nova(request);
         }else if("deleta".equalsIgnoreCase(operacao)){
            deleta(request);
         }
         response.sendRedirect("vendas.jsp");
      } catch (SQLException ex) {
         Logger.getLogger(controlVenda.class.getName()).log(Level.SEVERE, null, ex);
      }finally {         
         out.close();
      }
   }
   
   private HttpSession s;
   private void nova(HttpServletRequest request) throws SQLException{
      int idcli = Integer.parseInt(request.getParameter("cliente"));
      s = request.getSession();
      v = (Venda) s.getAttribute("venda");
      v.setCliente(new ClienteDao().get(idcli));
      dao.addVenda(v, true);
   }
   
   private void deleta(HttpServletRequest request){
      try {
         int idvenda = Integer.getInteger(request.getParameter("cod"));
         dao.removeVenda(idvenda);
      } catch (SQLException ex) {
         throw new RuntimeException();
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
