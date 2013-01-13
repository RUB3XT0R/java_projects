
package calculo;

import java.text.DecimalFormat;

public class FuncaoCalc {

        public String resultCalc(double a, double b, double c,double x){
            DecimalFormat df =new DecimalFormat("#,###.00");
            double resp=(a*x*x + b*x + c);
            return df.format(resp);
        }
}
