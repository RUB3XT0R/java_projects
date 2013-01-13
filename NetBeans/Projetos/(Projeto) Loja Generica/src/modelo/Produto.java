
package modelo;

import controle.ferramentas.SwingColumn;

public class Produto {

    @SwingColumn(description="Id")
    private long id;
    @SwingColumn(description="Nome")
    private String nome;
    private int qtdeEstoque;
    private double preco_inicial;
    @SwingColumn(description="Preço")
    private double preco_venda;
    private Fornecedor fornecedor;
    private String foto;

    public Produto() {
    }

    public Produto(long id) {
        this.id = id;
    }

    public Produto(long id, String nome, int qtdeEstoque, double preco_inicial, double preco_venda, Fornecedor fornecedor, String foto) {
        this.id = id;
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.preco_inicial = preco_inicial;
        this.preco_venda = preco_venda;
        this.fornecedor = fornecedor;
        this.foto = foto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco_inicial() {
        return preco_inicial;
    }

    public void setPreco_inicial(double preco_inicial) {
        this.preco_inicial = preco_inicial;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }


    
}
