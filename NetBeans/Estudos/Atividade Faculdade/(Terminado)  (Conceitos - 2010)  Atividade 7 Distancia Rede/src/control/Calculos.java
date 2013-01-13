
package control;

import java.util.List;
import model.Nodo;

public class Calculos {
    public static double distancias(List<Nodo> li){
        if(li.isEmpty())return 0;
        double soma=0;
        for(Nodo aux : li)
            soma += aux.DistOrigem();
        return (soma/li.size());
    }
    public static double calculoMediaOrigem(List<Nodo> li){
        if(li.isEmpty())return 0;
        double soma = 0;
        for(Nodo aux : li)
            soma+=distGeral(aux,li);
        return soma/li.size();
    }
    private static double distGeral(Nodo base, List<Nodo> li){
        double soma = 0;
        for(Nodo aux : li)
            soma+= base.getDistancia(aux);
        return soma/(li.size() - 1);
    }
}
