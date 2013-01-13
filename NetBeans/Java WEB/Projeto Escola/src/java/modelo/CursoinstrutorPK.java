/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;


@Embeddable
public class CursoinstrutorPK implements Serializable {
  
   
   @OneToOne
   @JoinColumn(name="idCurso",nullable=false)
   private Curso curso;
   
   @OneToOne
   @JoinColumn(name="idInstrutor",nullable=false)
   private Instrutor instrutor;

   public CursoinstrutorPK() {
      curso = new Curso();
      instrutor = new Instrutor();
   }

   public Curso getCurso() {
      return curso;
   }

   public void setCurso(Curso curso) {
      this.curso = curso;
   }

   public Instrutor getInstrutor() {
      return instrutor;
   }

   public void setInstrutor(Instrutor instrutor) {
      this.instrutor = instrutor;
   }

   public CursoinstrutorPK(Curso curso, Instrutor instrutor) {
      this.curso = curso;
      this.instrutor = instrutor;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final CursoinstrutorPK other = (CursoinstrutorPK) obj;
      if (this.curso != other.curso && (this.curso == null || !this.curso.equals(other.curso))) {
         return false;
      }
      if (this.instrutor != other.instrutor && (this.instrutor == null || !this.instrutor.equals(other.instrutor))) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 89 * hash + (this.curso != null ? this.curso.hashCode() : 0);
      hash = 89 * hash + (this.instrutor != null ? this.instrutor.hashCode() : 0);
      return hash;
   }

   

  
   
}
