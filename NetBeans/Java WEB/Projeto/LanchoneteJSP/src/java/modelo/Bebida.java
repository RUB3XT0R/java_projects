
package modelo;

public class Bebida implements Vendivel{
    
    private int id;
    private String descricao;
    private Float preco;
    private float qtde;

    public Bebida() {
    }

    public Bebida(int id) {
        this.id = id;
    }

    public Bebida(String descricao, Float preco, float qtde) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtde = qtde;
    }

    public Bebida(int id, String descricao, Float preco, float qtde) {
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

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
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
        final Bebida other = (Bebida) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public String getTipoProduto() {
        return "bebida";
    }

    
    
}
