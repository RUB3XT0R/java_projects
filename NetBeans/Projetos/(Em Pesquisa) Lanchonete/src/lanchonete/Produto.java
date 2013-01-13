
package lanchonete;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String toString(){
        return "("+codigo+") "+descricao+" R$ "+preco;
    }

    public boolean equals(Produto obj) {
        if ((this.descricao == null) ? (obj.descricao != null) : !this.descricao.equals(obj.descricao))
            return false;
        return true;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   

}
