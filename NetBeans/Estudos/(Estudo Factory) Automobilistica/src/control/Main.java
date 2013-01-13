
package control;

import model.*;

public class Main {

    public static void main(String[] args) {
        //parâmetro passado como argumento no console
        //pega a instância do tipo do carro
        Carro carro = CarroFactory.getCarro( "Vectra" );
        //mostra o valor
        if( carro != null ) {
            System.out.println( "Preço: " + carro.getPreco() );
        }
    }

}
