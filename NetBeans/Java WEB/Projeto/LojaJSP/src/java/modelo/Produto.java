
package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name="produto")
public class Produto implements Serializable {
    
    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "qtde")
    private int qtde=1;
    
    @Column(name = "valor")
    private double valor;
    
    @Column(name = "qtdeMin")
    private int qtdeMin=1;
    
    @Column(name = "qtdeMaxCompra")
    private int qtdeMaxCompra;
    
    @Column(name = "fornecedor")
    private int fornecedor;

    public Produto() {
    }

    public Produto(long codigo) {
        this.codigo = codigo;
    }

    public Produto(String descricao, double valor, int qtdeMaxCompra, int fornecedor) {
        this.descricao = descricao;
        this.valor = valor;
        this.qtdeMaxCompra = qtdeMaxCompra;
        this.fornecedor = fornecedor;
    }

    public Produto(String descricao, int qtde, double valor, int qtdeMin, int qtdeMaxCompra, int fornecedor) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.valor = valor;
        this.qtdeMin = qtdeMin;
        this.qtdeMaxCompra = qtdeMaxCompra;
        this.fornecedor = fornecedor;
    }

    public Produto(long codigo, String descricao, int qtde, double valor, int qtdeMin, int qtdeMaxCompra, int fornecedor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtde = qtde;
        this.valor = valor;
        this.qtdeMin = qtdeMin;
        this.qtdeMaxCompra = qtdeMaxCompra;
        this.fornecedor = fornecedor;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public int getQtdeMaxCompra() {
        return qtdeMaxCompra;
    }

    public void setQtdeMaxCompra(int qtdeMaxCompra) {
        this.qtdeMaxCompra = qtdeMaxCompra;
    }

    public int getQtdeMin() {
        return qtdeMin;
    }

    public void setQtdeMin(int qtdeMin) {
        this.qtdeMin = qtdeMin;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
}
