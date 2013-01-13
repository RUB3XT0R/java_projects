

package classes;

import java.util.LinkedList;
import java.util.List;

public class ListaProdutos {

    private List<produto> produtos = new LinkedList<produto>();

    public ListaProdutos(){
    }

    public List<produto> getProdutos() {
        return produtos;
    }

    public void addProduto(String nome, float valor){
        for(produto p : produtos){
            if(p.getNome().equals(nome)) return;
        }
        produtos.add(new produto(nome,valor));
    }
    public void upProduto(produto pr){
        for(produto p : produtos){
            if(p.getNome().equals(pr.getNome())){
                produtos.remove(p);
                produtos.add(pr);
            }
        }
    }
    public void delProduto(String nome){
        for(produto p : produtos){
            if(p.getNome().equals(nome))
                produtos.remove(p);
        }
    }
    public produto getProduto(String nome){
        for(produto p : produtos){
            if(p.getNome().equals(nome))
                return p;
        }
        return null;
    }
}
