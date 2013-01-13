
package model;

public class Volkswagen extends Fabricante {
    public Volkswagen() {
        name = "Volkswagen";
    }

    public Carro getCarro( String marca ) {
        if( marca == null ) {
            return null;
        }
        else if( marca.equals("Gol") ) {
            return new Gol();
        }
        else if( marca.equals("Golf") ) {
            return new Golf();
        }
        else {
            return null;
        }
    }
}