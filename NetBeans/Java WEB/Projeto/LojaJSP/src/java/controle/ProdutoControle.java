
package controle;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import modelo.Produto;

public class ProdutoControle{
    
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("LojaJSPPU");
    protected EntityManager em= emf.createEntityManager();  
    
    public void salvar(Produto p){  doTransaction(1,p); }
    public void alterar(Produto p){ doTransaction(2,p); }
    public void excluir(long i){ doTransaction(3,i); }
    
    private void doTransaction(int op,Object o){
        em.getTransaction().begin();
        switch(op){
            case 1 : em.persist(o); break;
            case 2 : em.merge(o); break;
            case 3 : em.remove(getProduto((Long)o)); break;
        }
        em.getTransaction().commit();
    }
    public Produto getProduto(long codigo){
        return em.find(Produto.class,codigo);
    }
    public List<Produto> getProdutos(){
        List l = em.createQuery("from produto").getResultList();
        LinkedList<Produto> ll = new LinkedList<Produto>();
        for(Object o : l){
            ll.add((Produto) o);
        }
        return ll;
    }
}
