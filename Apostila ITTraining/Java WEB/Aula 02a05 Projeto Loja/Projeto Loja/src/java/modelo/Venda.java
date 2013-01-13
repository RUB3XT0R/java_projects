
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
   
   private int codigo;
   private Cliente cliente;
   private Date data_venda;
   private float total;

   private List<VendaItem> itens;
   
   public Venda(){
       itens = new ArrayList<VendaItem>();
   }
   
   public List<VendaItem> getItens() {
      return itens;
   }

   public void addItens(VendaItem vi){
      if(null==vi) return;
      if(!getItens().contains(vi))
         getItens().add(vi);
   }
   
   public void delItem(int i){
       int tam = itens.size();
       for(int y = 0; y<tam; y++)
         if(itens.get(y).getProduto().getCodigo()==i)
             getItens().remove(itens.get(y));
   }
   public void delItem(VendaItem vi){
      if(null==vi) return;
      getItens().remove(vi);
   }
   
   public void setItens(List<VendaItem> itens) {
      this.itens = itens;
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

   public Date getData_venda() {
      return data_venda;
   }

   public void setData_venda(Date data_venda) {
      this.data_venda = data_venda;
   }

   public float getTotal() {
      float t = 0f;
      for(VendaItem v : getItens())
         t+= v.getQtde()*v.getProduto().getValor();
      return t;
   }

   public void setTotal(float total) {
      this.total = total;
   }

   @Override
   public String toString() {
      return "Venda{" + "codigo=" + codigo + ", cliente=" + cliente + ", data_venda=" + data_venda + ", total=" + total + ", itens=" + itens + '}';
   }
   
   
   
}
