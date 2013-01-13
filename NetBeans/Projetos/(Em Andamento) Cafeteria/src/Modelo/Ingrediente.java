

package Modelo;

import Controle.IngredienteTipo;
import Controle.factoryTableModel.SwingColumn;


public class Ingrediente{

    @SwingColumn(description="Id")
    private int id;
    @SwingColumn(description="Descrição")
    private String descricao;
    @SwingColumn(description="Preço")
    private float preco;
    @SwingColumn(description="Tipo")
    private IngredienteTipo tipo;

    public Ingrediente() {
    }

    public Ingrediente(int id) {
        setId(id);
    }

    public Ingrediente(int id, String descricao, float preco, IngredienteTipo tipo) {
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
        final Ingrediente other = (Ingrediente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return descricao;
    }


}
