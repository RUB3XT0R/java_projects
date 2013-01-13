/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name="address")
public class Address implements Serializable{
   
   @Id
   @Column(name="id",nullable=false)
   private int id;
   @ManyToOne //um endereço pertence a uma pessoa que por sua vez tem varios
   @JoinColumn(name="id_people")
   private People people;
   @Column(name="address",nullable=false)
   private String address;
   @Column(name="number",nullable=false)
   private int number;

   public Address() {
   }

   public Address(int id, People people, String address, int number) {
      this.id = id;
      this.people = people;
      this.address = address;
      this.number = number;
   }
   
   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public People getPeople() {
      return people;
   }

   public void setPeople(People people) {
      this.people = people;
   }
   
   
}
