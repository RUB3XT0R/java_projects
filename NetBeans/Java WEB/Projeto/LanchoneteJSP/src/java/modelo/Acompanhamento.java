
package modelo;


public class Acompanhamento implements Vendivel{
    
    private int id;
    private String descricao;
    private Float preco;
    private int qtde;

    public Acompanhamento() {
    }

    public Acompanhamento(int id) {
        this.id = id;
    }

    public Acompanhamento(String descricao, Float preco, int qtde) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtde = qtde;
    }

    public Acompanhamento(int id, String descricao, Float preco, int qtde) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Acompanhamento other = (Acompanhamento) obj;
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.qtde != other.qtde) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 97 * hash + this.qtde;
        return hash;
    }

    public String getTipoProduto() {
        return "acompanhamento";
    }

    
    
}
