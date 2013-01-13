
public class Produto {

    private String nome;
    private String preco;

    public Produto(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    
    @Override
    public String toString() {
        return nome + ", preço: R$" + preco;
    }
    


}
