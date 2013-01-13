package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Curso;
import modelo.Cursoinstrutor;
import modelo.CursoinstrutorPK;
import modelo.Instrutor;

public class CursoinstrutorControl implements Serializable{

   private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("EscolaPU");
   private EntityManager em = factory.createEntityManager();

   public boolean salvar(Cursoinstrutor c) {
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

   public boolean alterar(Cursoinstrutor c) {
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

   public boolean excluir(Cursoinstrutor c) {
      try {
         em.getTransaction().begin();
         em.remove(c);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public Cursoinstrutor get(int idInstrutor, int idCurso) {
      Instrutor i = new InstrutorControl().get(idInstrutor);
      Curso c = new CursoControl().get(idCurso);
      return em.find(Cursoinstrutor.class, new CursoinstrutorPK(c, i));
   }

   public List<Cursoinstrutor> getList() {
      List l = em.createQuery("FROM cursoinstrutor").getResultList();
      LinkedList<Cursoinstrutor> ll = new LinkedList<Cursoinstrutor>();
      for (Object o : l) {
         ll.add((Cursoinstrutor) o);
      }
      return ll;
   }
}
