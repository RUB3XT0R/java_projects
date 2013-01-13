

package modelo;

import java.util.*;

public class Evento {

    private String evento;
    private String oe;
    private String data;
    private String horario;
    private String local;
    private int numeroPessoas;
    private List<Item> itens;
    private float total;

    public Evento() {
    }

    public Evento(String evento, String oe, String data, String horario, String local, int numeroPessoas, List<Item> itens, float total) {
        this.evento = evento;
        this.oe = oe;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.numeroPessoas = numeroPessoas;
        this.itens = itens;
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public String getOe() {
        return oe;
    }

    public void setOe(String oe) {
        this.oe = oe;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

   
    @Override
    public String toString() {
        return evento +"  ás "+horario+" em "+data+", local: "+local;
    }


}
