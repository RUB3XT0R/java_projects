
package modelo;

import java.text.DecimalFormat;


public class Item {

    private Comida prato;
    private int qtde;
    private float preco;

    private DecimalFormat df = new DecimalFormat("#.00");

    public Item() {
    }

    public Item(Comida prato, int qtde, float preco) {
        this.prato = prato;
        this.qtde = qtde;
        this.preco = preco;
    }

    public Comida getPrato() {
        return prato;
    }

    public void setPrato(Comida prato) {
        this.prato = prato;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return prato.getNome() +" - "+ qtde +" - R$"+df.format(preco*qtde);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.prato != other.prato && (this.prato == null || !this.prato.equals(other.prato))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.prato != null ? this.prato.hashCode() : 0);
        return hash;
    }



}
