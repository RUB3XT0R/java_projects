
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity(name="peopleinfo")
public class PeopleInfo implements Serializable{
   
   @Id
   private Integer id;
   
   @OneToOne
   @JoinColumn(name="id_people")
   private People people;
   
   @Column(name="obs")
   private String obs;
   @Column(name="nameOfPet")
   private String nameOfPet;
   @Column(name="typeOfPet")
   private String TypeOfPet;


   public PeopleInfo() {
   }

   public PeopleInfo(Integer id, People people, String obs, String nameOfPet, String TypeOfPet) {
      this.id = id;
      this.people = people;
      this.obs = obs;
      this.nameOfPet = nameOfPet;
      this.TypeOfPet = TypeOfPet;
   }

   public String getTypeOfPet() {
      return TypeOfPet;
   }

   public void setTypeOfPet(String TypeOfPet) {
      this.TypeOfPet = TypeOfPet;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNameOfPet() {
      return nameOfPet;
   }

   public void setNameOfPet(String nameOfPet) {
      this.nameOfPet = nameOfPet;
   }

   public String getObs() {
      return obs;
   }

   public void setObs(String obs) {
      this.obs = obs;
   }

   public People getPeople() {
      return people;
   }

   public void setPeople(People people) {
      this.people = people;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final PeopleInfo other = (PeopleInfo) obj;
      if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
      return hash;
   }
    
   
   
}
