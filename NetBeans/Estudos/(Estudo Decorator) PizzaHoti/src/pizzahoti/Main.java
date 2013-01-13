
package pizzahoti;

import model.*;

public class Main {

    public static void main(String[] args) {

        Pizza p = new Pizza("Pizza Completa");
        p.add(new Queijo());
        p.add(new Calabreza());
        viewLanch(p);

        Pizza pi = new Pizza("Pizzaa");
        pi.add(new Queijo());
        pi.add(new Oregano());
        viewLanch(pi);
        HotDog dog = new HotDog("Hot Dog");
        dog.add(new Queijo());
        dog.add(new Calabreza());
        viewLanch(dog);
    }

    public static void viewLanch(Refeicao r) {
        System.out.println("Descricao: " + r.getDescricao());
        System.out.println("Condimentos: " + r.getCondimentos());
        System.out.println("Total:  R$ " + r.getCusto());
    }
}
