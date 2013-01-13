/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

@Entity(name = "interessado")
public class Interessado implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private Integer id;
   @Column(name = "nome")
   private String nome;
   @Column(name = "telcomercial")
   private String telcomercial;
   @Column(name = "telresidencial")
   private String telresidencial;
   @Column(name = "celular")
   private String celular;
   @Column(name = "email")
   private String email;
   @Column(name = "unidadeAbc")
   private boolean unidadeAbc=false;
   @Column(name = "unidadeUP")
   private boolean unidadeUP=false;
   @Column(name = "periodo")
   private String periodo;
   @ManyToMany(targetEntity=Curso.class)
   @JoinTable(name="cursointeressado",
           joinColumns=@JoinColumn(name="idInteressado"),
           inverseJoinColumns=@JoinColumn(name="idCurso"))
   private List<Curso> cursos;

   public Interessado() {
      cursos = new LinkedList<Curso>();
   }

   public Interessado(Integer id) {
      this.id = id;
      cursos = new LinkedList<Curso>();
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getTelcomercial() {
      return telcomercial;
   }

   public void setTelcomercial(String telcomercial) {
      this.telcomercial = telcomercial;
   }

   public String getTelresidencial() {
      return telresidencial;
   }

   public void setTelresidencial(String telresidencial) {
      this.telresidencial = telresidencial;
   }

   public String getCelular() {
      return celular;
   }

   public void setCelular(String celular) {
      this.celular = celular;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public boolean isUnidadeAbc() {
      return unidadeAbc;
   }

   public void setUnidadeAbc(boolean unidadeAbc) {
      this.unidadeAbc = unidadeAbc;
   }

   public boolean isUnidadeUP() {
      return unidadeUP;
   }

   public void setUnidadeUP(boolean unidadeUP) {
      this.unidadeUP = unidadeUP;
   }

   
   public String getPeriodo() {
      return periodo;
   }

   public void setPeriodo(String periodo) {
      this.periodo = periodo;
   }

   public List<Curso> getCursos() {
      return cursos;
   }

   public void setCursos(List<Curso> cursos) {
      this.cursos = cursos;
   }
   public void setCursos(Curso[] curso) {
      cursos = new LinkedList<Curso>();
      cursos.addAll(Arrays.asList(curso));
   }


   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Interessado)) {
         return false;
      }
      Interessado other = (Interessado) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "modelo.Interessado[ id=" + id + " ]";
   }
   
}
