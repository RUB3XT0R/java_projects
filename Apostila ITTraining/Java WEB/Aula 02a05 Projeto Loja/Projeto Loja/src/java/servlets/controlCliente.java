/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ClienteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author Lucas Biason
 */
public class controlCliente extends HttpServlet {

   private Cliente c;
   private ClienteDao dao = new ClienteDao();
   
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try {
         String operacao = request.getParameter("operacao");
         
         if(null==operacao)response.sendRedirect("clientes.jsp");
         
         if("novo".equalsIgnoreCase(operacao)){
            novo(request, response);
         }else if("altera".equalsIgnoreCase(operacao)){
            altera(request, response);
         }else if("deleta".equalsIgnoreCase(operacao)){
            deleta(request, response);
         }
            
         response.sendRedirect("clientes.jsp");
         
      } finally {         
         out.close();
      }
   }

   private void novo(HttpServletRequest request, HttpServletResponse response){
      c = new Cliente();
      c.setCpf(request.getParameter("cpf"));
      c.setNome(request.getParameter("nome"));
      c.setEndereco(request.getParameter("endereco"));
      c.setTelefone(request.getParameter("telefone"));
      dao.adiciona(c);
   }
   
   private void altera(HttpServletRequest request, HttpServletResponse response){
      c = new Cliente();
      c.setCodigo(Integer.parseInt(request.getParameter("cod")));
      c.setCpf(request.getParameter("cpf"));
      c.setNome(request.getParameter("nome"));
      c.setEndereco(request.getParameter("endereco"));
      c.setTelefone(request.getParameter("telefone"));
      dao.altera(c);
   }
   
   private void deleta(HttpServletRequest request, HttpServletResponse response){
      int id = Integer.parseInt(request.getParameter("cod"));
      dao.remove(id);
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
