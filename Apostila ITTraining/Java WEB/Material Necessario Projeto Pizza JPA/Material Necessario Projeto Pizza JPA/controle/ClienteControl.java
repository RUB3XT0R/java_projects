
package controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Cliente;


public class ClienteControl  implements Serializable{
   
   private EntityManagerFactory factory = 
            Persistence.createEntityManagerFactory("ProjetoPizzaPU");
   private EntityManager em = factory.createEntityManager();
   
   public boolean salvar(Cliente c) {
      try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return true;
      }catch(Exception e){
            em.getTransaction().rollback();
            return false;
      }
   }
   public boolean alterar(Cliente c) {
      try{
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
            return true;
      }catch(Exception e){
            em.getTransaction().rollback();
            return false;
      }
    }
    public boolean excluir(Cliente c) {
       try{
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
            return true;
      }catch(Exception e){
            em.getTransaction().rollback();
            return false;
      }
    }
    
    public Cliente get(int codigo){
        return em.find(Cliente.class,codigo);
    }
    public List<Cliente> getList(){
        List l = em.createQuery("from clientes").getResultList();
        LinkedList<Cliente> ll = new LinkedList<Cliente>();
        for(Object o : l) ll.add((Cliente) o);
        return ll;
    }
}
