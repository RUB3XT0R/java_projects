
package modelo;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.*;
import java.util.List;

@Entity(name="aluno")
public class Aluno implements Serializable{
   
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="ra")
   private int ra;
   
   @Column(name="nome")
   private String nome;
   
   @Column(name="email")
   private String email;
   
   @OneToMany
   @JoinColumn(name="ra",updatable=false)
   private List<Notas> notas = new LinkedList<Notas>();
   
   //getters e setters  

   public List<Notas> getNotas() {
      return notas;
   }

   public void setNotas(List<Notas> notas) {
      this.notas = notas;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getRa() {
      return ra;
   }

   public void setRa(int ra) {
      this.ra = ra;
   }

   
}
