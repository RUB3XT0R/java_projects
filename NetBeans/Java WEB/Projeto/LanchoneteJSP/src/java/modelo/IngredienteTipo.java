
package modelo;

public enum IngredienteTipo {

    paes("Paes"),
    carnes("Carnes"),
    queijos("Queijos"),
    vegetais("Vegetais"),
    molhos("Molhos"),
    condimentos("Condimentos"),
    outros("Outros");

    private String descricao;

    IngredienteTipo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    
    public String getName(){
        return this.name();
    }
    
}
