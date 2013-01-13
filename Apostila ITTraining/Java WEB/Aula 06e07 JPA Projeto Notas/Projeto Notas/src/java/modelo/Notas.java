
package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name="notas")
public class Notas implements Serializable {
   
   @EmbeddedId
   private NotasPk chave;
   
   @Column(name="nota_1")
   private float nota_1;
   @Column(name="nota_2")
   private float nota_2;
   @Column(name="nota_3")
   private float nota_3;
   @Column(name="nota_4")
   private float nota_4;
   
   //getters e setters

   public Notas() {
   }

   public Notas(NotasPk chave) {
      this.chave = chave;
   }

   public NotasPk getChave() {
      return chave;
   }

   public void setChave(NotasPk chave) {
      this.chave = chave;
   }

   public float getNota_1() {
      return nota_1;
   }

   public void setNota_1(float nota_1) {
      this.nota_1 = nota_1;
   }

   public float getNota_2() {
      return nota_2;
   }

   public void setNota_2(float nota_2) {
      this.nota_2 = nota_2;
   }

   public float getNota_3() {
      return nota_3;
   }

   public void setNota_3(float nota_3) {
      this.nota_3 = nota_3;
   }

   public float getNota_4() {
      return nota_4;
   }

   public void setNota_4(float nota_4) {
      this.nota_4 = nota_4;
   }

   
   
}
