

package controle;

import banco.Artigo_DAO;
import banco.Categoria_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Artigo;


public class InserirArtigo extends HttpServlet {
   
    private Artigo artigo;
    private PrintWriter out;
    private Artigo_DAO dao = new Artigo_DAO();
    private Categoria_DAO c = new Categoria_DAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        artigo = new Artigo();
        artigo.setTitulo(request.getParameter("titulo"));
        artigo.setResumo(request.getParameter("resumo"));
        artigo.setCategoria(c.selecionar(Integer.parseInt(request.getParameter("categoria"))));
        artigo.setConteudo(request.getParameter("conteudo"));
        artigo.setAutor(request.getParameter("autor"));

        
        if( dao.inserir(artigo).equals("sucesso"))
            response.sendRedirect("artigos/artigos.jsp");
        else{
            out = response.getWriter();
            out.print("<HTML>");
            out.print("<h2>Não foi possível inserir o novo artigo!</h2>");
            out.print("<br>");
            out.print("<a href='index.jsp'>Voltar</a>");
            out.print("</HTML>");
        }
    } 

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
