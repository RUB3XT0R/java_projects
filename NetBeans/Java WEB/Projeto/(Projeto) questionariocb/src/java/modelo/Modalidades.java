
package modelo;

import java.util.LinkedList;
import java.util.List;


public class Modalidades {

    private List<String> modalidades = new LinkedList<String>();

    public Modalidades() {
        modalidades.add("Ambiental");
        modalidades.add("Civil");
        modalidades.add("Computa��o");
        modalidades.add("Eletr�nica");
        modalidades.add("Materiais");
        modalidades.add("Mec�nica");
        modalidades.add("Produ��o");
    }

    public List<String> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<String> modalidades) {
        this.modalidades = modalidades;
    }



}
