
package modelo;

import java.util.LinkedList;
import java.util.List;

public class Lanche implements Vendivel{

    private int id;
    private String descricao;
    private Float preco;
    private List<LancheItens> ingredientes;

    public Lanche() {
        ingredientes = new LinkedList<LancheItens>();
    }

    public Lanche(int id) {
        setId(id);
    }

    public Lanche(String descricao) {
        this.descricao = descricao;
    }
    

    public Lanche(int id, String descricao, Float preco, List<LancheItens> ingredientes) {
        setId(id);
        setDescricao(descricao);
        setPreco(preco);
        setIngredientes(ingredientes);

    }

    public List<LancheItens> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<LancheItens> ingredientes) {
        this.ingredientes = ingredientes;
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
        float total = 0f;
        if (!ingredientes.isEmpty()) {
            for (LancheItens li : getIngredientes()) {
                total += li.getTotal();
            }
        }
        return total;
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
        final Lanche other = (Lanche) obj;
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        return hash;
    }

  
    @Override
    public String toString() {
        return getDescricao();
    }

    public String getTipoProduto() {
        return "lanche";
    }



}
