/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import control.AcompanhamentoDao;
import control.BebidaDao;
import control.ComboDao;
import control.LancheDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Combo;

/**
 *
 * @author Lucas Biason
 */
public class upCombo extends HttpServlet {

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
            Combo combo = new Combo();
            //descrição do combo
            int id = Integer.parseInt(request.getParameter("id"));
            combo.setId(id);
            Float total= Float.parseFloat(request.getParameter("total"));
            combo.setDescricao(request.getParameter("nome"));
            //setando acompanhamento do combo
            int idAcomp = Integer.parseInt(request.getParameter("acompanhamento"));
            combo.setAcompanhamento( new AcompanhamentoDao().getAcompanhamento(idAcomp));
            int qtdeAcomp = Integer.parseInt(request.getParameter("qtdeAcomp"));
            combo.setQtde_acompanhamento(qtdeAcomp);
            
            //setando bebida do combo
            int idBebid = Integer.parseInt(request.getParameter("bebida"));
            combo.setBebida( new BebidaDao().getBebida(idBebid));
            int qtdeBebida = Integer.parseInt(request.getParameter("qtdeBebida"));
            combo.setQtde_bebida(qtdeBebida);
            
            //setando lanche do combo
            int idlanche = Integer.parseInt(request.getParameter("lanche"));
            combo.setLanche( new LancheDao().getLanche(idlanche));
            int qtdeLanche = Integer.parseInt(request.getParameter("qtdeLanche"));
            combo.setQtde_lanche(qtdeLanche);
            
            //construção do link de retorno
            String goPage = "/LanchoneteJSP/combos.jsp?";
            goPage+= new ComboDao().updateCombo(combo,total) ? "msg=ok" : "msg=not" ;
            
            response.sendRedirect(goPage);
        } catch (SQLException ex) {
            Logger.getLogger(upCombo.class.getName()).log(Level.SEVERE, null, ex);
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
