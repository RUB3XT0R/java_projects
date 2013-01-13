
package controle;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Cliente;

public abstract class ClienteControle {
    
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("LojaJSPPU");
    protected EntityManager em= emf.createEntityManager();  
    
    public void salvar(Cliente c){  doTransaction(1,c); }
    public void alterar(Cliente c){ doTransaction(2,c); }
    public void excluir(int i){ doTransaction(3,i); }
    
    private void doTransaction(int op,Object o){
        em.getTransaction().begin();
        switch(op){
            case 1 : em.persist(o); break;
            case 2 : em.merge(o); break;
            case 3 : em.remove(getCliente((Integer)o)); break;
        }
        em.getTransaction().commit();
    }
    public Cliente getCliente(int codigo){
        return em.find(Cliente.class,codigo);
    }
    public List<Cliente> getClientes(){
        List l = em.createQuery("from cliente").getResultList();
        LinkedList<Cliente> ll = new LinkedList<Cliente>();
        for(Object o : l){
            ll.add((Cliente) o);
        }
        return ll;
    }
    
}
