/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Maquina;

class MaquinaControl  implements Serializable {

   private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("EscolaPU");
   private EntityManager em = factory.createEntityManager();

   public boolean salvar(Maquina c) {
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

   public boolean alterar(Maquina c) {
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

   public boolean excluir(Maquina c) {
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

   public Maquina get(int codigo) {
      return em.find(Maquina.class, codigo);
   }

   public List<Maquina> getList() {
      List l = em.createQuery("FROM maquinas").getResultList();
      LinkedList<Maquina> ll = new LinkedList<Maquina>();
      for (Object o : l) {
         ll.add((Maquina) o);
      }
      return ll;
   }
   
}
