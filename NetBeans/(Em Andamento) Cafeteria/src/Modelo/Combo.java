
package Modelo;

import Controle.factoryTableModel.SwingColumn;
import java.util.List;


public class Combo {

    @SwingColumn(description="ID")
    private int id;
    @SwingColumn(description="Descrição")
    private String descricao;
    @SwingColumn(description="Preço")
    private float preco;

    private List<ComboItens> lanches;

    public Combo() {
    }

    public Combo(int id) {
        this.id = id;
    }

    public Combo(int id, String descricao, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
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

    public List<ComboItens> getLanches() {
        return lanches;
    }

    public void setLanches(List<ComboItens> lanches) {
        this.lanches = lanches;
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
        final Combo other = (Combo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return descricao;
    }


}
