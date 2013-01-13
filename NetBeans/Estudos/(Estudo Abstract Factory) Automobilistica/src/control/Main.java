
package control;

import model.Carro;
import model.Fabricante;

public class Main {

    public static void main(String[] args) {
        //parâmetro passado como argumento no console
        //pega a instância do fabricante
        Fabricante fab = Fabricante.getInstance( "Chevrolet" );
        //pega a instância do carro, de acordo com o fabricante
        Carro carro = fab.getCarro( "Omega" );
        //mostra o valor
        if( carro != null ) {
            System.out.println( "Preço: " + carro.getPreco() );
        }
    }

}
