/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

@Entity(name = "curso")
public class Curso implements Serializable{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private Integer id;
   @Column(name = "Nome")
   private String nome;
   @Column(name = "cargaHora")
   private Integer cargaHora;
   @Column(name = "investimento")
   private Float investimento;
   @Column(name = "avista")
   private Float avista;
   @Column(name = "categoria")
   private String categoria;
   @Column(name = "proposta")
   private String proposta;
   @Column(name = "dados")
   private String dados;
   @ManyToMany(cascade= CascadeType.ALL,
           targetEntity=Interessado.class,mappedBy="cursos")
   @JoinTable(name="cursointeressado")
   private List<Interessado> interessados;
   
   @OneToMany
   @JoinColumn(name="idCurso",updatable=false)
   private List<Cursoinstrutor> cursoinstrutorList;
   
   @OneToMany(mappedBy="curso")
   private List<Turma> turmas;
  
   
   public Curso() {
      interessados = new LinkedList<Interessado>();
   }

   public Curso(Integer id) {
      this.id = id;
      interessados = new LinkedList<Interessado>();
   }

   public List<Interessado> getInteressados() {
      return interessados;
   }

   public void setInteressados(List<Interessado> interessados) {
      this.interessados = interessados;
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

   public Integer getCargaHora() {
      return cargaHora;
   }

   public void setCargaHora(Integer cargaHora) {
      this.cargaHora = cargaHora;
   }

   public Float getInvestimento() {
      return investimento;
   }

   public void setInvestimento(Float investimento) {
      this.investimento = investimento;
   }

   public Float getAvista() {
      return avista;
   }

   public void setAvista(Float avista) {
      this.avista = avista;
   }

   public String getCategoria() {
      return categoria;
   }

   public void setCategoria(String categoria) {
      this.categoria = categoria;
   }

   public String getProposta() {
      return proposta;
   }

   public void setProposta(String proposta) {
      this.proposta = proposta;
   }

   public String getDados() {
      return dados;
   }

   public void setDados(String dados) {
      this.dados = dados;
   }

   public List<Turma> getTurmas() {
      return turmas;
   }

   public void setTurmas(List<Turma> turmas) {
      this.turmas = turmas;
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
      if (!(object instanceof Curso)) {
         return false;
      }
      Curso other = (Curso) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return nome;
   }


   public List<Cursoinstrutor> getCursoinstrutorList() {
      return cursoinstrutorList;
   }

   public void setCursoinstrutorList(List<Cursoinstrutor> cursoinstrutorList) {
      this.cursoinstrutorList = cursoinstrutorList;
   }

   public float getDezvezes() {
      return (investimento-(investimento*0.10f))/10;
   }

   public float getQuatrovezes() {
      return (investimento)/4;
   }
   
   public void setDezvezes(float n) {return;}

   public void setQuatrovezes(float n) {return;}
   
   
   
   
}
