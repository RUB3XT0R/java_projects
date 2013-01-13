
package controle.tipos;

public enum Funcao {
    OPERADOR("Operador"),
    DESPACHANTE("Despachante"),
    MOTORISTA("Motorista"),
    ADMIN("Administrador");

   private String descricao;

    Funcao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
