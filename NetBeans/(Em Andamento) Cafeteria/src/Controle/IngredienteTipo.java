
package Controle;

public enum IngredienteTipo {

    paes("Paes"),
    carnes("Carnes"),
    queijos("Queijos"),
    vegetais("Vegetais"),
    molhos("Molhos"),
    condimentos("Condimentos"),
    acompanhamentos("Acompanhamentos"),
    bebidas("Bebidas"),
    outros("Outros");

    private String descricao;

    IngredienteTipo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
