
package modelo;

import java.util.List;

public class ListaCompra {
    
    private int mes;
    private String total_estimado;
    private List<ItemCompra> itens;
    
    public ListaCompra() {
    }

    public ListaCompra(int mes) {
        this.mes = mes;
    }

    public ListaCompra(int mes, String total_estimado, List<ItemCompra> itens) {
        this.mes = mes;
        this.total_estimado = total_estimado;
        this.itens = itens;
    }

    public ItemCompra getItem(int codigo){
        for(ItemCompra ic : itens){
            if(ic.getProduto().getCodigo() == codigo) return ic;
        }
        return new ItemCompra();
    }
    
    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getTotal_estimado() {
        return total_estimado;
    }

    public void setTotal_estimado(String total_estimado) {
        this.total_estimado = total_estimado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaCompra other = (ListaCompra) obj;
        if (this.mes != other.mes) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.mes;
        return hash;
    }

    @Override
    public String toString() {
        return mes+"";
    }
    
    
}
