
import java.util.LinkedList;


public class Testaproduto {
    public static void main(String[] args) {

        LinkedList<Produto> listaProdutos;
        listaProdutos = new LinkedList<Produto>();

        listaProdutos.add(new Produto("pão","0.2"));
        listaProdutos.add(new Produto("vinho","4.5"));

        for(Produto produto : listaProdutos){
            System.out.println(produto.toString());
        }


    }
}
