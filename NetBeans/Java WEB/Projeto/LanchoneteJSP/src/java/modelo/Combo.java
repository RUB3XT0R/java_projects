
package modelo;

public class Combo implements Vendivel{

    private int id;
    private String descricao;
    private Float preco;
    private Lanche lanche;
    private Bebida bebida;
    private Acompanhamento acompanhamento;
    private int qtde_lanche;
    private int qtde_bebida;
    private int qtde_acompanhamento;
    

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Float getPreco() {
        return  preco;
    }
    
    public float getTotal(){
        return (acompanhamento.getPreco()*qtde_acompanhamento)+
               (bebida.getPreco()*qtde_bebida)+
               (lanche.getPreco()*qtde_lanche);
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public int getQtde_acompanhamento() {
        return qtde_acompanhamento;
    }

    public void setQtde_acompanhamento(int qtde_acompanhamento) {
        this.qtde_acompanhamento = qtde_acompanhamento;
    }

    public int getQtde_bebida() {
        return qtde_bebida;
    }

    public void setQtde_bebida(int qtde_bebida) {
        this.qtde_bebida = qtde_bebida;
    }

    public int getQtde_lanche() {
        return qtde_lanche;
    }

    public void setQtde_lanche(int qtde_lanche) {
        this.qtde_lanche = qtde_lanche;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Combo other = (Combo) obj;
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        return hash;
    }

    public String getTipoProduto() {
        return "combo";
    }
    
    

}
