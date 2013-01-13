
package modelo;

import controle.ferramentas.SwingColumn;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class Venda implements java.io.Serializable{

    private Integer id;
    @SwingColumn(description="Data")
    private Date dataDaVenda;
    @SwingColumn(description="Total")
    private float total;
    @SwingColumn(description="Vendedor")
    private Funcionario vendedor;
    @SwingColumn(description="Cliente")
    private Cliente cliente;
    private List<VendaItem> itens = new LinkedList<VendaItem>();
    
    public Venda() {
    }

    public Venda(Integer id) {
        this.id = id;
    }

    public Venda(Integer id, Funcionario vendedor, Date dataDaVenda, float total) {
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

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public List<VendaItem> getItens() {
        return itens;
    }

    public void setItens(List<VendaItem> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        int hash = 5;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }


}
