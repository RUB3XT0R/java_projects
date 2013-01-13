

package controle;

import banco.Categoria_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Categoria;

public class InserirCategoria extends HttpServlet {
   
   private Categoria categoria;
    private PrintWriter out;
    private Categoria_DAO dao = new Categoria_DAO();

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
        categoria = new Categoria();
        categoria.setNome(request.getParameter("nome"));
        if( dao.inserir(categoria).equals("sucesso"))
            response.sendRedirect("categorias/inserirCategoria.jsp");
        else{
            out = response.getWriter();
            out.print("<HTML>");
            out.print("<h2>Não foi possível inserir a nova categoria!</h2>");
            out.print("<br>");
            out.print("<a href='index.jsp'>Voltar</a>");
            out.print("</HTML>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
