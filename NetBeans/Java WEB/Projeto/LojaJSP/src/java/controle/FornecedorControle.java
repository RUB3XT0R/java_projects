
package controle;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Fornecedor;

public class FornecedorControle {
    
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("LojaJSPPU");
    protected EntityManager em= emf.createEntityManager();  
    
    public void salvar(Fornecedor f){  doTransaction(1,f); }
    public void alterar(Fornecedor f){ doTransaction(2,f); }
    public void excluir(int i){ doTransaction(3,i); }
    
    private void doTransaction(int op,Object o){
        em.getTransaction().begin();
        switch(op){
            case 1 : em.persist(o); break;
            case 2 : em.merge(o); break;
            case 3 : em.remove(getProduto((Integer)o)); break;
        }
        em.getTransaction().commit();
    }
    public Fornecedor getProduto(int codigo){
        return em.find(Fornecedor.class,codigo);
    }
    public List<Fornecedor> getProdutos(){
        List l = em.createQuery("from fornecedor").getResultList();
        LinkedList<Fornecedor> ll = new LinkedList<Fornecedor>();
        for(Object o : l){
            ll.add((Fornecedor) o);
        }
        return ll;
    }
    
}
