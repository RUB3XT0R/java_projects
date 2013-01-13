/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity(name = "turma")
public class Turma implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "idTurma")
   private Integer idTurma;
   
   @ManyToOne
   @JoinColumn(name = "idCurso")
   private Curso curso;
   
   @Column(name = "unidade")
   private String unidade;
   @Column(name = "data_inicio")
   @Temporal(TemporalType.DATE)
   private Date dataInicio;
   @Column(name = "data_fim")
   @Temporal(TemporalType.DATE)
   private Date dataFim;
   @Column(name = "duracao")
   private String duracao;
   @Column(name="sala")
   private int sala;

   public Turma() {
   }

   public Turma(Integer idTurma) {
      this.idTurma = idTurma;
   }

   public Curso getCurso() {
      return curso;
   }

   public void setCurso(Curso curso) {
      this.curso = curso;
   }

   public Date getDataFim() {
      return dataFim;
   }

   public void setDataFim(Date dataFim) {
      this.dataFim = dataFim;
   }

   public Date getDataInicio() {
      return dataInicio;
   }

   public void setDataInicio(Date dataInicio) {
      this.dataInicio = dataInicio;
   }

   public String getDuracao() {
      return duracao;
   }

   public void setDuracao(String duracao) {
      this.duracao = duracao;
   }

   public Integer getIdTurma() {
      return idTurma;
   }

   public void setIdTurma(Integer idTurma) {
      this.idTurma = idTurma;
   }

   public String getUnidade() {
      return unidade;
   }

   public void setUnidade(String unidade) {
      this.unidade = unidade;
   }

   public int getSala() {
      return sala;
   }

   public void setSala(int sala) {
      this.sala = sala;
   }

   
   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Turma other = (Turma) obj;
      if (this.idTurma != other.idTurma && (this.idTurma == null || !this.idTurma.equals(other.idTurma))) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 3;
      hash = 11 * hash + (this.idTurma != null ? this.idTurma.hashCode() : 0);
      return hash;
   }

   
   
}
