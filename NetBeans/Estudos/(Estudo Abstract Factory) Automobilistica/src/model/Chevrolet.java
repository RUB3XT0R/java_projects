
package model;

public class Chevrolet extends Fabricante {
    public Chevrolet() {
        name = "Chevrolet";
    }

    public Carro getCarro( String marca ) {
        if( marca == null ) {
            return null;
        }
        else if( marca.equals("Vectra") ) {
            return new Vectra();
        }
        else if( marca.equals("Omega") ) {
            return new Omega();
        }
        else {
            return null;
        }
    }
}