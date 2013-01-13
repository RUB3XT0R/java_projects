

package modelo;


public class Ingrediente{

    private int id;
    private String descricao;
    private Float preco;
    private IngredienteTipo tipo;

    public Ingrediente() {
    }

    public Ingrediente(int id) {
        setId(id);
    }

    public Ingrediente(int id, String descricao, Float preco, IngredienteTipo tipo) {
        setId(id);
        setDescricao(descricao);
        setPreco(preco);
        setTipo(tipo);
    }

    public IngredienteTipo getTipo() {
        return tipo;
    }

    public void setTipo(IngredienteTipo tipo) {
        this.tipo = tipo;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingrediente other = (Ingrediente) obj;
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        return hash;
    }

    
    
    @Override
    public String toString() {
        return descricao;
    }


}
