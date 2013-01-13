/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucas Biason
 */
public class Produto {
   
   private int codigo;
   private String nome;
   private float valor;

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public float getValor() {
      return valor;
   }

   public void setValor(float valor) {
      this.valor = valor;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Produto other = (Produto) obj;
      if (this.codigo != other.codigo) {
         return false;
      }
      if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 97 * hash + this.codigo;
      hash = 97 * hash + (this.nome != null ? this.nome.hashCode() : 0);
      return hash;
   }

   @Override
   public String toString() {
      return nome + ", R$ " + valor;
   }
   
   
}
