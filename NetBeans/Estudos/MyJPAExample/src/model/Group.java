/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity(name="groups")
public class Group implements Serializable{
   
   @Id
   @Column(nullable=false,name="id")
   private Integer id;
   @Column(nullable=false,name="name")
   private String name;

   
   @ManyToMany(targetEntity=People.class)
   @JoinTable(name="people_groups",
           joinColumns=@JoinColumn(name="id_people"),
           inverseJoinColumns=@JoinColumn(name="id_group"))
   private List<People> peoples;

   
   public List<People> getPeoples() {
      return peoples;
   }

   public void setPeoples(List<People> peoples) {
      this.peoples = peoples;
   }   
   
   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
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
      final Group other = (Group) obj;
      if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
         return false;
      }
      if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
      hash = 23 * hash + (this.name != null ? this.name.hashCode() : 0);
      return hash;
   }
   
   
   
   
}
