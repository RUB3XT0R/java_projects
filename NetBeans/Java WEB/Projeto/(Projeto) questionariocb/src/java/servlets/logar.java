

package servlets;

import controle.AlunoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Aluno;


public class logar extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        AlunoDao dao = new AlunoDao();

        String ra = request.getParameter("ra");
        String cpf = request.getParameter("cpf");
        Aluno aluno = dao.getAluno(ra, cpf);

        if( dao.login(ra, cpf)){
            response.sendRedirect("inicio.jsp?ra="+ra+"&cpf="+cpf+"&modalidade="+aluno.getModalidade());
        }else{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print("<html>");
            out.print("<body>");
            out.print("<h2>Não foi possível se logar, o Ra e/ou o CPF não existe!</h2>");
            out.print("<a href='index.jsp'>Voltar</a>");
            out.print("</body>");
            out.print("</html>");
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
