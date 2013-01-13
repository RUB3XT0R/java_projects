package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Cursoinstrutor;
import modelo.Instrutor;

public class InstrutorControl implements Serializable {

   private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("EscolaPU");
   private EntityManager em = factory.createEntityManager();

   public boolean salvar(Instrutor c) {
      try {
         em.getTransaction().begin();
         em.persist(c);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         System.out.println(e);
         em.getTransaction().rollback();
         return false;
      }
   }

   public boolean alterar(Instrutor c) {
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

   public boolean excluir(Instrutor c) {
      try {
         em.getTransaction().begin();
         em.createQuery("delete from cursoinstrutor where idInstrutor=?")
                 .setParameter(1,c.getId()).executeUpdate();
         em.remove(c);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public Instrutor get(int codigo) {
      return em.find(Instrutor.class, codigo);
   }

   public List<Instrutor> getList() {
      List l = em.createQuery("FROM instrutor").getResultList();
      LinkedList<Instrutor> ll = new LinkedList<Instrutor>();
      for (Object o : l) {
         ll.add((Instrutor) o);
      }
      return ll;
   }
}
