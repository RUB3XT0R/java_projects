/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucas Biason
 */
public class Cliente {
   
   private int codigo;
   private String cpf;
   private String nome;
   private String telefone;
   private String endereco;

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public String getEndereco() {
      return endereco;
   }

   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Cliente other = (Cliente) obj;
      if (this.codigo != other.codigo) {
         return false;
      }
      if ((this.cpf == null) ? (other.cpf != null) : !this.cpf.equals(other.cpf)) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 83 * hash + this.codigo;
      hash = 83 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
      return hash;
   }

   @Override
   public String toString() {
      return nome + ", " + telefone;
   }
   
   
}
