
package controle.tipos;

public enum AgendaTipo {

    banho("Dar Banho"), tosa("Tosar");
    
    private String descricao;
    AgendaTipo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
