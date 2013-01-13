




public class Utils {

    public static double gerarHipotenusa(double x1, double y1, double x2, double y2 ) {
        double x = Math.abs( x1 - x2 );
        double y = Math.abs( y1 - y2 );
        return Math.sqrt( Math.pow( x, 2 ) + Math.pow( y, 2 ) );

    }

    // para sistema carteziano normal
    private static int detectarQuadrante(double x1, double y1, double x2, double y2 ) {
        if ( x2 >= x1 && y2 >= y1 ) return 1;
        if ( x2 <  x1 && y2 >  y1 ) return 2;
        if ( x2 <= x1 && y2 <= y1 ) return 3;
        return 4;
    }

    
    private static int gerarIncrementoAngulo(double x1, double y1,double x2, double y2 ) {
        int q = detectarQuadrante( x1, y1, x2, y2 );
        switch(q){
            case 1: return 0;
            case 2: return 90;
            case 3: return 180;
            default: return 270;
        }
    }

    //inutil, ocorre um erro - vide explicação na documentação.
    public static double obtemGrauRelativo(double x1, double y1,double x2, double y2 ) {
        double x = Math.abs(x1-x2);
        double y = Math.abs(y1-y2);
        return gerarIncrementoAngulo( x1, y1, x2, y2 ) + Math.toDegrees( Math.atan2( y, x ) );
    }

    // adaptado, erro concertado aplicando uma adptação nos 2º e 4º quadrantes
    public static double obtemGrauRelativoJava(double x1, double y1, double x2, double y2 ) {
        double x = Math.abs(x1-x2);
        double y = Math.abs(y1-y2);
        double ang = Math.toDegrees( Math.atan2( y, x ) );
        int incr = gerarIncrementoAngulo( x1, y1, x2, y2 );
        if ( incr == 90 || incr == 270 ) ang = 90 - ang;
        return incr + ang;

    }


}
