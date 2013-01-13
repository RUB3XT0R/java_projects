
package modelo;

import controle.tipos.AgendaTipo;
import java.util.Date;
import controle.SwingColumn;

public class Agenda implements java.io.Serializable {

    private Integer id;
    @SwingColumn(description="Data")
    private Date date;
    @SwingColumn(description="Tipo")
    private AgendaTipo tipo;
    @SwingColumn(description="Animal")
    private Animal animal;
    @SwingColumn(description="Total R$")
    private float total;


    public Agenda() {
    }

    public Agenda(Integer id) {
        this.id = id;
    }

    public Agenda(Integer id, Animal animal, Date date, float total, AgendaTipo tipo) {
        this.id = id;
        this.animal = animal;
        this.date = date;
        this.total = total;
        this.tipo = tipo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AgendaTipo getTipo() {
        return tipo;
    }

    public void setTipo(AgendaTipo tipo) {
        this.tipo = tipo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
    
}
