/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import banco.Artigo_DAO;
import banco.Categoria_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Artigo;

public class AlterarArtigo extends HttpServlet {
   

    private Artigo artigo;
    private PrintWriter out;
    private Artigo_DAO dao = new Artigo_DAO();
    private Categoria_DAO c = new Categoria_DAO();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        artigo = new Artigo();
        artigo.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        artigo.setTitulo(request.getParameter("titulo"));
        artigo.setResumo(request.getParameter("resumo"));
        artigo.setCategoria(c.selecionar(Integer.parseInt(request.getParameter("categoria"))));
        artigo.setConteudo(request.getParameter("conteudo"));
        artigo.setAutor(request.getParameter("autor"));


        if( dao.alterar(artigo).equals("sucesso"))
            response.sendRedirect("artigos/artigos.jsp");
        else{
            out = response.getWriter();
            out.print("<HTML>");
            out.print("<h2>Não foi possível alterar o artigo!</h2>");
            out.print("<br>");
            out.print("<a href='index.jsp'>Voltar</a>");
            out.print("</HTML>");
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
