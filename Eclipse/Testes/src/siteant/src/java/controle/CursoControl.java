package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Curso;

public class CursoControl implements Serializable {

   private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("ProjetoEscolaPU");
   private EntityManager em = factory.createEntityManager();

   public boolean salvar(Curso c) {
      try {
         em.getTransaction().begin();
         em.persist(c);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public boolean alterar(Curso c) {
      try {
         em.getTransaction().begin();
         em.merge(c);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public boolean excluir(Curso c) {
      try {
         em.getTransaction().begin();
         em.createQuery("delete from cursointeressado where idCurso=?")
                 .setParameter(1,c.getId()).executeUpdate();
         em.createQuery("delete from cursoinstrutor where idCurso=?")
                 .setParameter(1,c.getId()).executeUpdate();
         em.createQuery("delete from turma where idCurso=?")
                 .setParameter(1,c.getId()).executeUpdate();
         em.remove(c);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public Curso get(int codigo) {
      return em.find(Curso.class, codigo);
   }

   public List<Curso> getList() {
      List l = em.createQuery("FROM curso").getResultList();
      LinkedList<Curso> ll = new LinkedList<Curso>();
      for (Object o : l) {
         ll.add((Curso) o);
      }
      return ll;
   }
   
}
