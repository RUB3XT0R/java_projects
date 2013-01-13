
package controle.tipos;

public enum AnimalTipo {

    dog("Cachorro"),cat("Gato");
    private String descricao;

    AnimalTipo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public String toString(){
        return descricao;
    }
}
