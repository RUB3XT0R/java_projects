/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Turma;

public class TurmaControl  implements Serializable {

   private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("ProjetoEscolaPU");
   private EntityManager em = factory.createEntityManager();

   public boolean salvar(Turma t) {
      try {
         em.getTransaction().begin();
         em.persist(t);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public boolean alterar(Turma t) {
      try {
         em.getTransaction().begin();
         em.merge(t);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public boolean excluir(Turma t) {
      try {
         em.getTransaction().begin();
         em.remove(t);
         em.getTransaction().commit();
         return true;
      } catch (Exception e) {
         em.getTransaction().rollback();
         return false;
      }
   }

   public Turma get(int codigo) {
      return em.find(Turma.class, codigo);
   }

   public List<Turma> getList() {
      List l = em.createQuery("FROM turma").getResultList();
      LinkedList<Turma> ll = new LinkedList<Turma>();
      for (Object o : l) ll.add((Turma) o);
      return ll;
   }
   
   public List<Turma> getListABC() {
      List l = em.createQuery("FROM turma where unidade='ABC'").getResultList();
      LinkedList<Turma> ll = new LinkedList<Turma>();
      for (Object o : l) ll.add((Turma) o);
      return ll;
   }
   public List<Turma> getListUP() {
      List l = em.createQuery("FROM turma where unidade='UP'").getResultList();
      LinkedList<Turma> ll = new LinkedList<Turma>();
      for (Object o : l) ll.add((Turma) o);
      return ll;
   }
}
