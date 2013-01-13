

package classes;


public class Produto {

    private long codigo;
    private String descricao;
    private Float preco;

    public Produto() {
    }

    public Produto(long codigo) {
        this.codigo = codigo;
    }

    public Produto(long codigo, String descricao, Float preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    
}
