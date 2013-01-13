/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ProdutoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Produto;

public class controlProduto extends HttpServlet {

   private Produto p;
   private ProdutoDao dao = new ProdutoDao();
   
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try {
         String operacao = request.getParameter("operacao");
         if ("novo".equalsIgnoreCase(operacao)) {
            novo(request, response);
         } else if ("altera".equalsIgnoreCase(operacao)) {
            altera(request, response);
         } else if ("deleta".equalsIgnoreCase(operacao)) {
            deleta(request, response);
         } 
         response.sendRedirect("produtos.jsp");
      } finally {         
         out.close();
      }
   }
   
   private void novo(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException {
      p = new Produto();
      p.setNome(request.getParameter("nome"));
      p.setValor(Float.parseFloat(request.getParameter("valor")));
      dao.adiciona(p);
   }
   
   private void altera(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException {
      p = new Produto();
      p.setCodigo(Integer.parseInt(request.getParameter("cod")));
      p.setNome(request.getParameter("nome"));
      p.setValor(Float.parseFloat(request.getParameter("valor")));
      dao.altera(p); 
   }
   
   private void deleta(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException {
      int cod = Integer.parseInt(request.getParameter("cod"));
      dao.remove(cod);
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
