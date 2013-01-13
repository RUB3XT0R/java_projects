/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Curso;
import modelo.Notas;

/**
 *
 * @author Lucas Biason
 */
public class cursoControl extends HttpServlet {

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
             excluir(Integer.parseInt(request.getParameter("id")));
         response.sendRedirect("cursos.jsp");
      } finally {         
         out.close();
      }
   }
   public Curso populate(HttpServletRequest request){
      Curso c= new Curso();
      if(null!= request.getParameter("id"))
         c.setId(Integer.parseInt(request.getParameter("id")));
      c.setNome(request.getParameter("nome"));
      return c;
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
    public void excluir(int id) {
       try{
            em.getTransaction().begin();
            //normal...
            //em.remove(get(id));
            //inserir depois de notas
            Curso c = get(id);
            Query q = em.createQuery ("DELETE FROM notas where codCurso=?")
                    .setParameter(1,c.getId());
            q.executeUpdate ();
            em.remove(c);
            em.getTransaction().commit();
      }catch(Exception e){
            em.getTransaction().rollback();
      }
    }
    
    public Curso get(int id){
        return em.find(Curso.class,id);
    }
    public List<Curso> getLista(){
        List l = em.createQuery("from curso").getResultList();
        LinkedList<Curso> ll = new LinkedList<Curso>();
        for(Object o : l) ll.add((Curso) o);
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
