
package modelo;

import controle.SwingColumn;

public class Produto implements java.io.Serializable{

    @SwingColumn(description="ID")
    private Integer id;
    @SwingColumn(description="Nome")
    private String nome;
    @SwingColumn(description="Preço")
    private float preco;
    @SwingColumn(description="Estoque")
    private int estoque;

    public Produto() {}

    public Produto(Integer id) {
        this.id = id;
    }
    
    public Produto(Integer id, String nome, float preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    

    @Override
    public String toString() {
        return nome;
    }


}
