package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="peoplecp")
public class PeopleCP implements Serializable{

   //não pode colocar mais de im Id, (chave composta), para isso, 
   //usa-se uma classe que a represente
    @EmbeddedId
    private PeopleCPPK id;

    @Column(nullable=false, name = "name")
    private String name;


    public PeopleCP() {
    }

    public PeopleCPPK getId() {
        return id;
    }

    public void setId(PeopleCPPK id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PeopleCP other = (PeopleCP) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    

}
