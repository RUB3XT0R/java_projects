
package modelo;

public class ItemCompra {
    
    private ListaCompra lista;
    private Produto produto;
    private float qtde=1;
    private float precomax;

    public ItemCompra() {
    }

    public ItemCompra(ListaCompra lista, Produto produto, float qtde, float precomax) {
        this.lista = lista;
        this.produto = produto;
        this.qtde = qtde;
        this.precomax = precomax;
    }
    
    public ListaCompra getLista() {
        return lista;
    }

    public void setLista(ListaCompra lista) {
        this.lista = lista;
    }

    public float getPrecomax() {
        return precomax;
    }

    public void setPrecomax(float precomax) {
        this.precomax = precomax;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
        final ItemCompra other = (ItemCompra) obj;
        if (this.lista != other.lista && (this.lista == null || !this.lista.equals(other.lista))) {
            return false;
        }
        if (this.produto != other.produto && (this.produto == null || !this.produto.equals(other.produto))) {
            return false;
        }
        if (Float.floatToIntBits(this.qtde) != Float.floatToIntBits(other.qtde)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.lista != null ? this.lista.hashCode() : 0);
        hash = 97 * hash + (this.produto != null ? this.produto.hashCode() : 0);
        hash = 97 * hash + Float.floatToIntBits(this.qtde);
        return hash;
    }

    @Override
    public String toString() {
        return lista.getMes() + ", " + produto + ", qtde=" + qtde;
    }
    
    
    
}
