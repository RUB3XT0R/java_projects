package controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Livro;
import org.primefaces.event.DragDropEvent;


@ManagedBean
@SessionScoped
public class LivroController {

    private List<Livro> listaLivros = new ArrayList();
    private List<Livro> carrinho = new ArrayList();
    private Livro livroSelecionado;
    private double valorTotal;

    public LivroController() {
        carregaLivros();
    }

    private void carregaLivros() {
        listaLivros.add(new Livro("Java Como Programar", "8576050196", "DEITEL", 1152, "6 Edicao", "Pearson Education", "pq730400.jpg", 189.9));
        listaLivros.add(new Livro("Java Como Programar", "7584788874", "DEITEL", 1152, "8 Edicao", "Pearson Education", "pq21803096.jpg", 205.9));
        listaLivros.add(new Livro("SCJP - CERTIFICAÇÃO PROGRAMADOR JAVA", "9382938003", "KATY SIERRA", 496, "1 Edicao", "Alta Books", "pq21498837.jpg", 109.9));
        listaLivros.add(new Livro("JAVA EFETIVO", "9788576082804", "JOSHUA BLOCK", 320, "2 Edicao", "Alta Books", "pq21471152.jpg", 90.9));
        listaLivros.add(new Livro("JAVA NA WEB COM JSF", "9788573936575", "YURI MARX P. GOMES", 192, "1 Edicao", "Alta Books", "pq21332231.jpg", 22.9));
        listaLivros.add(new Livro("C# PARA PROGRAMADORES JAVA", "8588745410", "STEPHEN GOLDBERG", 544, "1 Edicao", "Alta Books", "pq177589.jpg", 60.9));

    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adicionarLivroNoCarrinho(DragDropEvent ddEvent) {
        Livro livro = ((Livro) ddEvent.getData());

        carrinho.add(livro);
        valorTotal = valorTotal + livro.getPreco();
        listaLivros.remove(livro);
    }

    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public void setLivroSelecionado(Livro livroSelecionado) {
        this.livroSelecionado = livroSelecionado;
    }

    public List<Livro> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Livro> carrinho) {
        this.carrinho = carrinho;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }
}
