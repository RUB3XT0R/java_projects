package servlet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.InstrutorDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Instrutor;

/**
 *
 * @author Lucas Biason
 */
public class upInstrutor extends HttpServlet {

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
            
            Instrutor inst = new Instrutor();
            inst.setId(Integer.parseInt(request.getParameter("id")));
            inst.setCpf(request.getParameter("cpf"));
            inst.setRg(request.getParameter("rg"));
            inst.setNome(request.getParameter("nome"));
            inst.setEmail(request.getParameter("email"));
            inst.setEmail2(request.getParameter("email2"));
            inst.setTelefone(request.getParameter("telefone"));
            inst.setTelefone2(request.getParameter("telefone2"));
            inst.setCarro_marca(request.getParameter("marca"));
            inst.setCarro_modelo(request.getParameter("modelo"));
            inst.setCarro_placa(request.getParameter("placa"));
            inst.setCarro_cor(request.getParameter("cor"));
            
            
            String params;
            InstrutorDao dao = new InstrutorDao();
            if( dao.contains(inst.getNome())){
                if(dao.upInstrutor(inst,false)) response.sendRedirect("alterCursoInst.jsp?id="+inst.getId());
                else response.sendRedirect("instrutores.jsp?status=faill");
            }else response.sendRedirect("instrutores.jsp?status=not");
            
            
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
