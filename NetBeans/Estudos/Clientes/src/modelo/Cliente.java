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
   
   private int id;
   private String nome;
   private String telefone;
   private String email;

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
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
      if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 29 * hash + (this.nome != null ? this.nome.hashCode() : 0);
      return hash;
   }

   @Override
   public String toString() {
      return "(" + id + ") " + nome + "," + telefone + ", email=" + email;
   }
   
   
}
