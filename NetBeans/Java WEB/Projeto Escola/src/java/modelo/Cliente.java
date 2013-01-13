/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;


@Entity(name = "cliente")
public class Cliente implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private Integer id;
   @Column(name = "nome")
   private String nome;
   @Column(name = "cpf_cnpj")
   private String cpfCnpj;
   @Column(name = "RG")
   private String rg;
   @Column(name = "tipo_cliente")
   private String tipoCliente;
   @Column(name = "dataCadastro")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dataCadastro;
   @Column(name = "uf")
   private String uf;
   @Column(name = "endereco")
   private String endereco;
   @Column(name = "bairro")
   private String bairro;
   @Column(name = "cidade")
   private String cidade;
   @Column(name = "cep")
   private String cep;
   @Column(name = "telefoneResidencial")
   private String telefoneResidencial;
   @Column(name = "telefoneComercial")
   private String telefoneComercial;
   @Column(name = "telefoneCelular")
   private String telefoneCelular;
   @Column(name = "email")
   private String email;
   @Size(max = 45)
   @Column(name = "email2")
   private String email2;

   public Cliente() {
   }

   public Cliente(Integer id) {
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

   public String getCpfCnpj() {
      return cpfCnpj;
   }

   public void setCpfCnpj(String cpfCnpj) {
      this.cpfCnpj = cpfCnpj;
   }

   public String getRg() {
      return rg;
   }

   public void setRg(String rg) {
      this.rg = rg;
   }

   public String getTipoCliente() {
      return tipoCliente;
   }

   public void setTipoCliente(String tipoCliente) {
      this.tipoCliente = tipoCliente;
   }

   public Date getDataCadastro() {
      return dataCadastro;
   }

   public void setDataCadastro(Date dataCadastro) {
      this.dataCadastro = dataCadastro;
   }

   public String getUf() {
      return uf;
   }

   public void setUf(String uf) {
      this.uf = uf;
   }

   public String getEndereco() {
      return endereco;
   }

   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   public String getBairro() {
      return bairro;
   }

   public void setBairro(String bairro) {
      this.bairro = bairro;
   }

   public String getCidade() {
      return cidade;
   }

   public void setCidade(String cidade) {
      this.cidade = cidade;
   }

   public String getCep() {
      return cep;
   }

   public void setCep(String cep) {
      this.cep = cep;
   }

   public String getTelefoneResidencial() {
      return telefoneResidencial;
   }

   public void setTelefoneResidencial(String telefoneResidencial) {
      this.telefoneResidencial = telefoneResidencial;
   }

   public String getTelefoneComercial() {
      return telefoneComercial;
   }

   public void setTelefoneComercial(String telefoneComercial) {
      this.telefoneComercial = telefoneComercial;
   }

   public String getTelefoneCelular() {
      return telefoneCelular;
   }

   public void setTelefoneCelular(String telefoneCelular) {
      this.telefoneCelular = telefoneCelular;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail2() {
      return email2;
   }

   public void setEmail2(String email2) {
      this.email2 = email2;
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
      if (!(object instanceof Cliente)) {
         return false;
      }
      Cliente other = (Cliente) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "controle.Cliente[ id=" + id + " ]";
   }
   
}
