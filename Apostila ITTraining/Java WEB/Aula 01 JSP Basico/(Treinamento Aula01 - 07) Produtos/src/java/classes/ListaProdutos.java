

package classes;

import java.util.LinkedList;
import java.util.List;

public class ListaProdutos {

    private List<produto> produtos = new LinkedList<produto>();

    public ListaProdutos(){
        produto p1 = new produto("produto 1",2);
        produto p2 = new produto("produto 2",5);
        produto p3 = new produto("produto 3",7);
        produto p4 = new produto("produto 4",9);
        produto p5 = new produto("produto 5",1);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
    }

    public List<produto> getProdutos() {
        return produtos;
    }



}
