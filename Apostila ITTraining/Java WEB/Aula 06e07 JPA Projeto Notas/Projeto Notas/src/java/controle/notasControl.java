/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Aluno;
import modelo.Curso;
import modelo.Notas;
import modelo.NotasPk;
import java.util.*;
/**
 *
 * @author Lucas Biason
 */
public class notasControl extends HttpServlet {

   private EntityManagerFactory factory = 
            Persistence.createEntityManagerFactory("Projeto_NotasPU");
    private EntityManager em = factory.createEntityManager();
   
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try {
         String operacao = request.getParameter("operacao");
         if("novo".equalsIgnoreCase(operacao))
            salvar(request);
         else if("altera".equalsIgnoreCase(operacao))
            alterar(request);
         else if("deleta".equalsIgnoreCase(operacao))
             excluir(Integer.parseInt(request.getParameter("aluno")),
                     Integer.parseInt(request.getParameter("curso")));
         response.sendRedirect("notas.jsp");
         
      } finally {         
         out.close();
      }
   }
   public Notas populate(HttpServletRequest request){
      int idAluno = Integer.parseInt(request.getParameter("aluno"));
      Aluno a = new alunoControl().get(idAluno);
      int idCurso = Integer.parseInt(request.getParameter("curso"));
      Curso c = new cursoControl().get(idCurso);
      Notas n = new Notas(new NotasPk(a,c));
      n.setNota_1(Float.parseFloat(request.getParameter("nota1")));
      n.setNota_2(Float.parseFloat(request.getParameter("nota2")));
      n.setNota_3(Float.parseFloat(request.getParameter("nota3")));
      n.setNota_4(Float.parseFloat(request.getParameter("nota4")));
      return n;
   }
   public void salvar(HttpServletRequest request) {
      try{
            em.getTransaction().begin();
            em.persist(populate(request));
            em.getTransaction().commit();
      }catch(Exception e){
            em.getTransaction().rollback();
      }
   }
   public void alterar(HttpServletRequest request) {
      try{
            em.getTransaction().begin();
            em.merge(populate(request));
            em.getTransaction().commit();
      }catch(Exception e){
            em.getTransaction().rollback();
      }
    }
    public void excluir(int idAluno, int idCurso) {
       try{
            em.getTransaction().begin();
            em.remove(get(idAluno,idCurso));
            em.getTransaction().commit();
      }catch(Exception e){
            em.getTransaction().rollback();
      }
    }
    
    public Notas get(int idAluno, int idCurso){       
      Aluno a = new alunoControl().get(idAluno);
      Curso c = new cursoControl().get(idCurso);
      return (Notas) em.find(Notas.class,new NotasPk(a,c));
    }
    public List<Notas> getProdutos(){
        List l = em.createQuery("from notas").getResultList();
        LinkedList<Notas> ll = new LinkedList<Notas>();
        for(Object o : l) ll.add((Notas) o);
        return ll;
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
