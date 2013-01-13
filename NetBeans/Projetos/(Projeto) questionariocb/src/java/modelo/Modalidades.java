
package modelo;

import java.util.LinkedList;
import java.util.List;


public class Modalidades {

    private List<String> modalidades = new LinkedList<String>();

    public Modalidades() {
        modalidades.add("Ambiental");
        modalidades.add("Civil");
        modalidades.add("Computação");
        modalidades.add("Eletrônica");
        modalidades.add("Materiais");
        modalidades.add("Mecânica");
        modalidades.add("Produção");
    }

    public List<String> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<String> modalidades) {
        this.modalidades = modalidades;
    }



}
