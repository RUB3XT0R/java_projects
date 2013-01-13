
package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Pizza;


public class PizzaControl  implements Serializable{
   
   private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("ProjetoPizzaPU");
   private EntityManager em = factory.createEntityManager();
   
   public boolean salvar(Pizza p){
      try{
         em.getTransaction().begin();
         em.persist(p);
         em.getTransaction().commit();
         return true;
      }catch(Exception e){
         em.getTransaction().rollback();
         return false;
      }
   }
   
   public boolean alterar(Pizza p){
      try{
         em.getTransaction().begin();
         em.merge(p);
         em.getTransaction().commit();
         return true;
      }catch(Exception e){
         em.getTransaction().rollback();
         return false;
      }
   }
   
   public boolean excluir(Pizza p){
      try{
         em.getTransaction().begin();
         em.remove(p);
         em.getTransaction().commit();
         return true;
      }catch(Exception e){
         em.getTransaction().rollback();
         return false;
      }
   }
   
   public Pizza get(int codigo){
      return em.find(Pizza.class,codigo);
   }
   
   public List<Pizza> getList(){
      List l = em.createQuery("from pizza").getResultList();
      LinkedList<Pizza> pp = new LinkedList<Pizza>();
      for(Object o : l) pp.add((Pizza)o);
      return pp;
   }
   
}
