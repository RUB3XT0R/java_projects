
package modelo;

import controle.SwingColumn;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class Venda implements java.io.Serializable{

    @SwingColumn(description="Id")
    private Integer id;
    @SwingColumn(description="Data")
    private Date dataDaVenda;
    @SwingColumn(description="Vendedor")
    private Usuario vendedor;
    @SwingColumn(description="Total")
    private float total;
    private List<VendaItem> itens = new LinkedList<VendaItem>();


    public Venda() {
    }

    public Venda(Integer id) {
        this.id = id;
    }

    public Venda(Integer id, Usuario vendedor, Date dataDaVenda, float total) {
        this.id = id;
        this.vendedor = vendedor;
        this.dataDaVenda = dataDaVenda;
        this.total = total;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public List<VendaItem> getItens() {
        return itens;
    }

    public void setItens(List<VendaItem> itens) {
        this.itens = itens;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    
}
