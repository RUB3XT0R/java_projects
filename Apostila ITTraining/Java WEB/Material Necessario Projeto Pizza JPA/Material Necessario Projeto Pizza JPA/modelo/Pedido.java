/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import java.util.LinkedList;
import javax.persistence.*;

@Entity(name="pedido")
public class Pedido implements Serializable{
   
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="codigo")
   private int codigo;
   
   @ManyToOne
   @JoinColumn(name="cliente_id",nullable=false)
   private Cliente cliente;
   
   @Column(name="data_pedido")
   private String dataPedido;
   
   @Column(name="entrega")
   private int entrega=0;
   
   @ManyToMany(targetEntity=Pizza.class)
   @JoinTable(name="iten_pedido",
           joinColumns=@JoinColumn(name="pedido_codigo"),
           inverseJoinColumns=@JoinColumn(name="pizza_codigo"))
   private List<Pizza> pizzasPedidas;

   public Pedido() {
      pizzasPedidas = new LinkedList<Pizza>();
      cliente = new Cliente();
   }
   
   public int getEntrega() {
      return entrega;
   }

   public void setEntrega(int entrega) {
      this.entrega = entrega;
   }
   
   public void entregarPedido() {
      this.entrega = 1;
   }

   public String getDataPedido() {
      return dataPedido;
   }

   public void setDataPedido(String dataPedido) {
      this.dataPedido = dataPedido;
   }
   
   public Cliente getCliente() {
      return cliente;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   

   public List<Pizza> getPizzasPedidas() {
      return pizzasPedidas;
   }

   public void setPizzasPedidas(List<Pizza> pizzasPedidas) {
      this.pizzasPedidas = pizzasPedidas;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Pedido other = (Pedido) obj;
      if (this.codigo != other.codigo) {
         return false;
      }
      if (this.cliente != other.cliente && (this.cliente == null || !this.cliente.equals(other.cliente))) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 79 * hash + this.codigo;
      hash = 79 * hash + (this.cliente != null ? this.cliente.hashCode() : 0);
      return hash;
   }
   
}
