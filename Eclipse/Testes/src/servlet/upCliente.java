/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ClienteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import modelo.ClienteTipo;

/**
 *
 * @author Lucas Biason
 */
public class upCliente extends HttpServlet {

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
            //captura dos parametros
            Cliente c = new Cliente();
            c.setBairro(request.getParameter("bairro"));
            c.setCep(request.getParameter("cep"));
            c.setCidade(request.getParameter("cidade"));
            c.setCpf_cnpj(request.getParameter("cpfcnpj"));
            c.setEmail(request.getParameter("email"));
            c.setEmail2(request.getParameter("email2"));
            c.setLogradouro(request.getParameter("endereco"));
            c.setNome(request.getParameter("nome"));
            c.setNumero(request.getParameter("numero"));
            c.setTelefoneCelular(request.getParameter("celular"));
            c.setTelefoneComercial(request.getParameter("comercial"));
            c.setTelefoneResidencial(request.getParameter("residencial"));
            c.setTipo(ClienteTipo.valueOf(request.getParameter("tipo")));
            c.setUf(request.getParameter("uf"));
            c.setRg(request.getParameter("rg"));
            String params;
            ClienteDao dao = new ClienteDao();
            if( dao.contains(c.getId()))
                params= dao.upCliente(c) ? "?status=ok" : "?status=faill" ;
            else params="?status=not";
            
            response.sendRedirect("clientes.jsp"+params);
            
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
