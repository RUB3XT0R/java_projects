
package controle;

public class PlacaAmbulanciaValidator{
    public boolean isValid(String value){
        if(value.length()!=8)return false;
        boolean crescente = true;
        int anterior = Character.digit(value.charAt(4),10);
        for (int i = 5;crescente && i<8; i++) {
            int atual = Character.digit(value.charAt(i),10);
            crescente = atual>anterior;
            anterior = atual;
        }
        return crescente;
    }
}
