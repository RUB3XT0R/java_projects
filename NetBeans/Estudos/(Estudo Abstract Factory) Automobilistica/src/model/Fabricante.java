

package model;
public abstract class Fabricante {
    protected String name;

    public abstract Carro getCarro( String marca );

    public static Fabricante getInstance( String fabricante ) {
        if( fabricante == null ) {
            return null;
        }
        else if(fabricante.equals("Chevrolet")) {
            return new Chevrolet();
        }
        else if(fabricante.equals("Volkswagen")) {
            return new Volkswagen();
        }
        else {
            return null;
        }
    }
}