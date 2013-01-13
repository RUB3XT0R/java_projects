

package Modelo;

import Controle.factoryTableModel.SwingColumn;


public class LancheItens {

    @SwingColumn(description="Id")
    private int id;
    private Lanche lanche;
    @SwingColumn(description="Ingrediente")
    private Ingrediente ingrediente;
    @SwingColumn(description="qtde")
    private int qtde;
    @SwingColumn(description="Total")
    private float total;

    public LancheItens() {
    }

    public LancheItens(int id) {
        this.id = id;
    }

    public LancheItens(int id, Lanche lanche, Ingrediente ingrediente, int qtde) {
        this.id = id;
        this.lanche = lanche;
        this.ingrediente = ingrediente;
        this.qtde = qtde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setTotal(){
        total =qtde*ingrediente.getPreco();
    }
    public float getTotal() {
        return qtde*ingrediente.getPreco();
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LancheItens other = (LancheItens) obj;
        if (this.ingrediente != other.ingrediente && (this.ingrediente == null || !this.ingrediente.equals(other.ingrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.ingrediente != null ? this.ingrediente.hashCode() : 0);
        return hash;
    }

    

    @Override
    public String toString() {
        return ingrediente.toString();
    }


}
