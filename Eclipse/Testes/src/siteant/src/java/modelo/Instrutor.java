/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

@Entity(name = "instrutor")
public class Instrutor implements Serializable {
  
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private Integer id;
   @Column(name = "nome")
   private String nome;
   @Column(name = "cpf")
   private String cpf;
   @Column(name = "email")
   private String email;
   @Column(name = "telefone")
   private String telefone;
   @Column(name = "email2")
   private String email2;
   @Column(name = "telefone2")
   private String telefone2;
   @Column(name = "carro_modelo")
   private String carroModelo;
   @Column(name = "rg")
   private String rg;
   @Column(name = "carro_placa")
   private String carroPlaca;
   @Column(name = "carro_cor")
   private String carroCor;
   @Column(name = "carro_marca")
   private String carroMarca;
   
   @OneToMany
   @JoinColumn(name="idInstrutor")
   private List<Cursoinstrutor> cursoinstrutorList;

   public Instrutor() {
      cursoinstrutorList = new LinkedList<Cursoinstrutor>();
   }

   public Instrutor(Integer id) {
      this.id = id;
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

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public String getEmail2() {
      return email2;
   }

   public void setEmail2(String email2) {
      this.email2 = email2;
   }

   public String getTelefone2() {
      return telefone2;
   }

   public void setTelefone2(String telefone2) {
      this.telefone2 = telefone2;
   }

   public String getCarroModelo() {
      return carroModelo;
   }

   public void setCarroModelo(String carroModelo) {
      this.carroModelo = carroModelo;
   }

   public String getRg() {
      return rg;
   }

   public void setRg(String rg) {
      this.rg = rg;
   }

   public String getCarroPlaca() {
      return carroPlaca;
   }

   public void setCarroPlaca(String carroPlaca) {
      this.carroPlaca = carroPlaca;
   }

   public String getCarroCor() {
      return carroCor;
   }

   public void setCarroCor(String carroCor) {
      this.carroCor = carroCor;
   }

   public String getCarroMarca() {
      return carroMarca;
   }

   public void setCarroMarca(String carroMarca) {
      this.carroMarca = carroMarca;
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
      if (!(object instanceof Instrutor)) {
         return false;
      }
      Instrutor other = (Instrutor) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "modelo.Instrutor[ id=" + id + " ]";
   }


   public List<Cursoinstrutor> getCursoinstrutorList() {
      return cursoinstrutorList;
   }

   public void setCursoinstrutorList(List<Cursoinstrutor> cursoinstrutorList) {
      this.cursoinstrutorList = cursoinstrutorList;
   }

  
   
}
