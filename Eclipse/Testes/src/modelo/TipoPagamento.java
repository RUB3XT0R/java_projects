
package modelo;

public enum TipoPagamento {
        
    cheque("Cheque"),
    cartao("Cartão"),
    dinheiro("Dinheiro"),
    boleto("Boleto");

    private String descricao;

    TipoPagamento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    
}
