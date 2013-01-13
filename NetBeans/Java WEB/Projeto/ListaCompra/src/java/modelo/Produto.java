
package modelo;

public class Produto {
    
    private int codigo;
    private String nome;
    private String descricao;
    private String unidade_compra;
    private float qtde_prevista_mes;
    private float preco_maximo_anterior;

    public Produto() {
    }

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(String nome, String descricao, String unidade_compra, float qtde_prevista_mes, float preco_maximo_anterior) {
        this.nome = nome;
        this.descricao = descricao;
        this.unidade_compra = unidade_compra;
        this.qtde_prevista_mes = qtde_prevista_mes;
        this.preco_maximo_anterior = preco_maximo_anterior;
    }

    public Produto(int codigo, String nome, String descricao, String unidade_compra, float qtde_prevista_mes, float preco_maximo_anterior) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.unidade_compra = unidade_compra;
        this.qtde_prevista_mes = qtde_prevista_mes;
        this.preco_maximo_anterior = preco_maximo_anterior;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco_maximo_anterior() {
        return preco_maximo_anterior;
    }

    public void setPreco_maximo_anterior(float preco_maximo_anterior) {
        this.preco_maximo_anterior = preco_maximo_anterior;
    }

    public float getQtde_prevista_mes() {
        return qtde_prevista_mes;
    }

    public void setQtde_prevista_mes(float qtde_prevista_mes) {
        this.qtde_prevista_mes = qtde_prevista_mes;
    }

    public String getUnidade_compra() {
        return unidade_compra;
    }

    public void setUnidade_compra(String unidade_compra) {
        this.unidade_compra = unidade_compra;
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
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
