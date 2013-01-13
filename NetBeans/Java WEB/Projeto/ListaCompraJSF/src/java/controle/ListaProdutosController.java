
package controle;

import dao.ProdutoDao;
import java.io.Serializable;
import javax.faces.bean.*;
import java.util.*;
import javax.inject.Named;
import modelo.Produto;
import org.primefaces.event.DragDropEvent;

@Named
@SessionScoped
public class ListaProdutosController  implements Serializable{
    
    private List<Produto> listaProdutos;
    private List<Produto> carrinho = new ArrayList();
    private Produto produtoSelecionado;
    private double valorTotal;
    
    public ListaProdutosController() {
        carregaProdutos();
    }

    private void carregaProdutos() {
        listaProdutos = new ProdutoDao().getProdutos();
    }
    
    public void adicionarLivroNoCarrinho(DragDropEvent ddEvent) {
        Produto produto = ((Produto) ddEvent.getData());

        carrinho.add(produto);
        valorTotal = valorTotal + produto.getPreco_maximo_anterior();
        listaProdutos.remove(produto);
    }
    

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Produto getProdutoSelecionado() {
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}

