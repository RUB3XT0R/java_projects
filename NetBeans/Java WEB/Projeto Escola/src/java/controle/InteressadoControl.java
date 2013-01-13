
package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Interessado;


public class InteressadoControl  implements Serializable{
   
   private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("EscolaPU");
   private EntityManager em = factory.createEntityManager();;
   
   public boolean salvar(Interessado p){
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
   
   public boolean alterar(Interessado p){
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
   
   public boolean excluir(Interessado p){
      try{
         em.getTransaction().begin();
         em.remove(p);
         em.getTransaction().commit();
         return true;
      }catch(Exception e){
         System.out.println(e);
         em.getTransaction().rollback();
         return false;
      }
   }
   
   public Interessado get(int codigo){
      return em.find(Interessado.class,codigo);
   }
   
   public List<Interessado> getList(){
      List l = em.createQuery("from interessado").getResultList();
      LinkedList<Interessado> pp = new LinkedList<Interessado>();
      for(Object o : l) pp.add((Interessado)o);
      return pp;
   }
   
   
}
