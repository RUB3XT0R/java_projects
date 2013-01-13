/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import control.AcompanhamentoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Acompanhamento;

/**
 *
 * @author Lucas Biason
 */
public class upAcompanhamento extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("id"));
            String descricao = request.getParameter("descricao");
            Float preco = Float.parseFloat(request.getParameter("preco"));
            int qtde = Integer.parseInt(request.getParameter("qtde"));
            
            //construção do link de retorno
            String goPage = "/LanchoneteJSP/acompanhamentos.jsp?";
            
            //operações
            AcompanhamentoDao dao = new AcompanhamentoDao();
            
           Acompanhamento i = new Acompanhamento();
           i.setId(id);
           i.setDescricao(descricao);
           i.setPreco(preco);
           i.setQtde(qtde);
           goPage+= dao.update(i)? "msg=ok" : "msg=not" ;
           
           response.sendRedirect(goPage);
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
