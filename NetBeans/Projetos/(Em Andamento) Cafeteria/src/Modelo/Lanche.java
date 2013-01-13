
package Modelo;

import Controle.factoryTableModel.SwingColumn;
import java.util.List;

public class Lanche{

    @SwingColumn(description="Id")
    private int id;
    @SwingColumn(description="Descrição")
    private String descricao;
    @SwingColumn(description="Preço")
    private float preco;
    private List<LancheItens> ingredientes;

    public Lanche() {
    }

    public Lanche(int id) {
        setId(id);
    }

    public Lanche(int id, String descricao, float preco, List<LancheItens> ingredientes) {
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
        final Lanche other = (Lanche) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return getDescricao();
    }



}
