
package modelo;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity(name="curso")
public class Curso implements Serializable {
   
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="id")
   private int id;
   
   @Column(name="nome")
   private String nome;
   
   @OneToMany()
   @JoinColumn(name="codCurso",updatable=false)
   private List<Notas> notas = new LinkedList<Notas>();

   public List<Notas> getNotas() {
      return notas;
   }

   public void setNotas(List<Notas> notas) {
      this.notas = notas;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   @Override
   public String toString() {
      return "Curso{" + "id=" + id + ", nome=" + nome + '}';
   }
   
   
}
