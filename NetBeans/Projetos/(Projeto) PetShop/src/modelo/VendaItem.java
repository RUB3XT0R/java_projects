
package modelo;

import controle.SwingColumn;

public class VendaItem implements java.io.Serializable {

    private Integer id;
    @SwingColumn(description="Produto")
    private Produto produto;
    private Venda vendas;
    @SwingColumn(description="Quantidade")
    private int qnt;
    @SwingColumn(description="Total R$")
    private Float subtotal;

    public VendaItem() {
    }

    public VendaItem(Integer id) {
        this.id = id;
    }

    public VendaItem(Integer id, Produto produto, Venda vendas, int qnt) {
        this.id = id;
        this.produto = produto;
        this.vendas = vendas;
        this.qnt = qnt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public Venda getVendas() {
        return vendas;
    }

    public void setVendas(Venda vendas) {
        this.vendas = vendas;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VendaItem other = (VendaItem) obj;
        if (this.produto != other.produto && (this.produto == null || !this.produto.equals(other.produto))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.produto != null ? this.produto.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return produto.toString();
    }

    public Float getSubtotal() {
        if(getProduto()!=null){
            return getProduto().getPreco()*getQnt();
        }
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }


    
}
