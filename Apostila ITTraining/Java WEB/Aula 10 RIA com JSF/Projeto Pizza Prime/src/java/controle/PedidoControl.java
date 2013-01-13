
package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Pedido;


public class PedidoControl  implements Serializable{
    private EntityManagerFactory factory =
           Persistence.createEntityManagerFactory("ProjetoPizzaPU");
   private EntityManager em = factory.createEntityManager();
   
   public boolean salvar(Pedido p){
      try{    
         em.getTransaction().begin();
         em.persist(p);
         em.getTransaction().commit();
         return true;
      }catch(Exception e){
         System.out.println(e);
         em.getTransaction().rollback();
         return false;
      }
   }
   
   public boolean alterar(Pedido p){
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
   
   public boolean excluir(Pedido p){
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
   
   public Pedido get(int codigo){
      return em.find(Pedido.class,codigo);
   }
   
   public List<Pedido> getList(){
      List l = em.createQuery("from pedido").getResultList();
      LinkedList<Pedido> pp = new LinkedList<Pedido>();
      for(Object o : l) pp.add((Pedido)o);
      return pp;
   }
   public List<Pedido> getListAEntregar(){
      List l = em.createQuery("from pedido where entrega=0 order by data_pedido").getResultList();
      LinkedList<Pedido> pp = new LinkedList<Pedido>();
      for(Object o : l) pp.add((Pedido)o);
      return pp;
   }
   public List<Pedido> getListEntregues(){
      List l = em.createQuery("from pedido where entrega=1 order by data_pedido").getResultList();
      LinkedList<Pedido> pp = new LinkedList<Pedido>();
      for(Object o : l) pp.add((Pedido)o);
      return pp;
   }
   
}
