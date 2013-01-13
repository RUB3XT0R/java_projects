
package Modelo;

import Controle.factoryTableModel.SwingColumn;

public class ComboItens {

    private int id;
    private Combo combo;
    @SwingColumn(description="Lanche")
    private Lanche lanche;
    @SwingColumn(description="qtde")
    private int qtde;
    @SwingColumn(description="Total")
    private float total;

    public ComboItens() {
    }

    public ComboItens(int id) {
        this.id = id;
    }

    public ComboItens(int id, Combo combo, Lanche lanche, int qtde, float total) {
        this.id = id;
        this.combo = combo;
        this.lanche = lanche;
        this.qtde = qtde;
        this.total = total;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getTotal() {
        return qtde*lanche.getPreco();
    }

    public void setTotal() {
        total =qtde*lanche.getPreco();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComboItens other = (ComboItens) obj;
        if (this.lanche != other.lanche && (this.lanche == null || !this.lanche.equals(other.lanche))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.lanche != null ? this.lanche.hashCode() : 0);
        return hash;
    }


    @Override
    public String toString() {
        return lanche.toString();
    }


}
