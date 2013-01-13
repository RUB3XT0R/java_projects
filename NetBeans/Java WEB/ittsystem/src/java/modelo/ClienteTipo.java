
package modelo;

public enum ClienteTipo {
     
    juridico("Jurídico"),
    fisico("Físico");

    private String descricao;

    ClienteTipo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    
    public String getName(){
        return this.name();
    }
}   

