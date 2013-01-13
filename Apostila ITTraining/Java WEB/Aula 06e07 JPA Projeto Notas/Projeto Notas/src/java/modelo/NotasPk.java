
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class NotasPk implements Serializable{
   
   @OneToOne
   @JoinColumn(name="ra",nullable=false)
   private Aluno aluno;
   
   @OneToOne
   @JoinColumn(name="codCurso",nullable=false)
   private Curso curso;

   public NotasPk() {
   }

   public NotasPk(Aluno aluno, Curso curso) {
      this.aluno = aluno;
      this.curso = curso;
   }

   public Aluno getAluno() {
      return aluno;
   }

   public void setAluno(Aluno aluno) {
      this.aluno = aluno;
   }

   public Curso getCurso() {
      return curso;
   }

   public void setCurso(Curso curso) {
      this.curso = curso;
   }

   
   
   
   
}
