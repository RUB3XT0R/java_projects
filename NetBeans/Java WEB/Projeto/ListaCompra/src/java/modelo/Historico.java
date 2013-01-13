
package modelo;

import java.util.List;

public class Historico {
    
    private List<ListaCompra> lista;
    private float valorpago;
    private Supermercado supermercado;

    public Historico() {
    }

    public Historico(List<ListaCompra> lista, float valorpago, Supermercado supermercado) {
        this.lista = lista;
        this.valorpago = valorpago;
        this.supermercado = supermercado;
    }

    public List<ListaCompra> getLista() {
        return lista;
    }

    public void setLista(List<ListaCompra> lista) {
        this.lista = lista;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public float getValorpago() {
        return valorpago;
    }

    public void setValorpago(float valorpago) {
        this.valorpago = valorpago;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Historico other = (Historico) obj;
        if (this.lista != other.lista && (this.lista == null || !this.lista.equals(other.lista))) {
            return false;
        }
        if (this.supermercado != other.supermercado && (this.supermercado == null || !this.supermercado.equals(other.supermercado))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.lista != null ? this.lista.hashCode() : 0);
        hash = 29 * hash + (this.supermercado != null ? this.supermercado.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return lista + ", R$" + valorpago + ", " + supermercado;
    }

    
    
}
