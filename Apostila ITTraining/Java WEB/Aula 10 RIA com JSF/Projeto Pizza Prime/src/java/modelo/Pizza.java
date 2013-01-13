/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

@Entity(name="pizza")
public class Pizza implements Serializable{
   
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="codigo")
   private int codigo;
   @Column(name="nome")
   private String nome;
   @Column(name="descricao")
   private String descricao;
   @Column(name="preco")
   private float preco;
   @Column(name="n_pedacos")
   private int n_pedacos;
   
   @ManyToMany(cascade= CascadeType.ALL,
           targetEntity=Pedido.class,
           mappedBy="pizzasPedidas")
   @JoinTable(name="iten_pedido")
   private List<Pedido> pedidos;

   public Pizza() {
      pedidos = new LinkedList<Pedido>();
   }

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public int getN_pedacos() {
      return n_pedacos;
   }

   public void setN_pedacos(int n_pedacos) {
      this.n_pedacos = n_pedacos;
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
   
   public int getTotalPedidos(){
      return pedidos.size();
   }

   public float getPreco() {
      return preco;
   }

   public void setPreco(float preco) {
      this.preco = preco;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Pizza other = (Pizza) obj;
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
      hash = 79 * hash + this.codigo;
      hash = 79 * hash + (this.nome != null ? this.nome.hashCode() : 0);
      return hash;
   }

   @Override
   public String toString() {
      return nome+", "+descricao;
   }
   
   
}
