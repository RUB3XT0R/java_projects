/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import banco.Categoria_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas Biason
 */
public class RemoverCategoria extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        Categoria_DAO dao = new Categoria_DAO();
        String status = dao.remover(codigo);
        if(status.equals("sucesso")){
            response.sendRedirect("categorias/inserirCategoria.jsp");
        }else{
            PrintWriter out = response.getWriter();
            out.print("<html>");
            out.print("<h2>Não foi possível remover a categoria!</h2>");
            out.print("<br>");
            out.print("<a href='index.jsp'>Voltar</a>");
            out.print("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
