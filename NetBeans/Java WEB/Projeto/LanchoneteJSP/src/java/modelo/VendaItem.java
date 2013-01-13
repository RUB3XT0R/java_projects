
package modelo;


public class VendaItem{

    private Vendivel produto;
    private Venda vendas;
    private int qtde;
    
    public Vendivel getProduto() {
        return produto;
    }

    public void setProduto(Vendivel produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
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
        if (this.vendas != other.vendas && (this.vendas == null || !this.vendas.equals(other.vendas))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.produto != null ? this.produto.hashCode() : 0);
        hash = 47 * hash + (this.vendas != null ? this.vendas.hashCode() : 0);
        return hash;
    }


    
    
}
