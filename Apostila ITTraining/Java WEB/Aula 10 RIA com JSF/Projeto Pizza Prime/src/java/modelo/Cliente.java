/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity(name="clientes")
public class Cliente implements Serializable{
   
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="codigo")
   private int codigo;
   @Column(name="nome")
   private String nome;
   @Column(name="telefone")
   private String telefone;
   @Column(name="endereco")
   private String endereco;
   
   @OneToMany(cascade= CascadeType.ALL)
   @JoinColumn(name="cliente_id")
   private List<Pedido> pedidos;

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
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

   public List<Pedido> getPedidos() {
      return pedidos;
   }

   public void setPedidos(List<Pedido> pedidos) {
      this.pedidos = pedidos;
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
      if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 41 * hash + this.codigo;
      hash = 41 * hash + (this.nome != null ? this.nome.hashCode() : 0);
      return hash;
   }
   
   
}
