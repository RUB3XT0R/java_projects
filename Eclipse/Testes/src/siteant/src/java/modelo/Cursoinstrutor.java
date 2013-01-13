/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity(name = "cursoinstrutor")
public class Cursoinstrutor implements Serializable {
   
   @EmbeddedId
   private CursoinstrutorPK chave;
   @Column(name = "unidadeAbc")
   private Boolean unidadeAbc;
   @Column(name = "periodo")
   private String periodo;
   @Column(name = "unidadeUP")
   private Boolean unidadeUP;

   public Cursoinstrutor() {
      chave = new CursoinstrutorPK();
   }

   public Cursoinstrutor(CursoinstrutorPK cursoinstrutorPK) {
      this.chave = cursoinstrutorPK;
   }

   public CursoinstrutorPK getChavePK() {
      return chave;
   }
   public void setChavePK(Curso c, Instrutor i){
      this.chave = new CursoinstrutorPK(c,i);
   }
   public void setChavePK(CursoinstrutorPK cursoinstrutorPK) {
      this.chave = cursoinstrutorPK;
   }

   public Boolean getUnidadeAbc() {
      return unidadeAbc;
   }

   public void setUnidadeAbc(Boolean unidadeAbc) {
      this.unidadeAbc = unidadeAbc;
   }

   public String getPeriodo() {
      return periodo;
   }

   public void setPeriodo(String periodo) {
      this.periodo = periodo;
   }

   public Boolean getUnidadeUP() {
      return unidadeUP;
   }

   public void setUnidadeUP(Boolean unidadeUP) {
      this.unidadeUP = unidadeUP;
   }

   public CursoinstrutorPK getChave() {
      return chave;
   }

   public void setChave(CursoinstrutorPK chave) {
      this.chave = chave;
   }
   

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (chave != null ? chave.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Cursoinstrutor)) {
         return false;
      }
      Cursoinstrutor other = (Cursoinstrutor) object;
      if ((this.chave == null && other.chave != null) || (this.chave != null && !this.chave.equals(other.chave))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "modelo.Cursoinstrutor[ cursoinstrutorPK=" + chave + " ]";
   }
   
}
