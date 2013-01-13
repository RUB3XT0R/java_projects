
package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import modelo.Pedido;
import modelo.Pizza;

@Named
@SessionScoped
public class PedidoBean implements Serializable{
   
   private PedidoControl controle = new PedidoControl();
   private Pedido pedido = new  Pedido();
   private DataModel<Pedido> pedidos;
   private DataModel<Pedido> pedidosAEntregar;
   
   private int codPizza;
   private int codCliente;
   
   public void novo(){
      pedido = new Pedido();
   }
    public void selecionar(){
      pedido = pedidosAEntregar.getRowData();
   }
    public void selecionarHist(){
      pedido = pedidos.getRowData();
   }
   public void addItemPedido(){
      Pizza p = new PizzaControl().get(codPizza);
      p.getPedidos().add(pedido);
      pedido.getPizzasPedidas().add(p);
   }
   public String entregar(){
      pedido.entregarPedido(); 
      return alterar();
   }
   public String inserir(){
      pedido.setCliente(new ClienteControl().get(codCliente));
      pedido.setDataPedido(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
      pedido.setEntrega(0);
      return (controle.salvar(pedido)) ? "pedidos" : "falhou";
   }
   public String alterar(){
      return (controle.alterar(pedido)) ? "pedidos" : "falhou";
   }
   public String remover(){
      return (controle.excluir(pedido)) ? "pedidos" : "falhou";
   }
   
   public Pedido getPedido(){
      return pedido;
   }
   public void setPedido(Pedido p){
      pedido = p;
   }
   public DataModel<Pedido> getPedidos(){
      List<Pedido> pizzasList = controle.getListEntregues();
      pedidos = new ListDataModel<Pedido>(pizzasList);
      return pedidos;
   }
   public void setPedidos(DataModel<Pedido> pizzas){
      this.pedidos = pizzas;
   }
   public DataModel<Pedido> getPedidosAEntregar() {
      List<Pedido> pizzasList = controle.getListAEntregar();
      pedidosAEntregar = new ListDataModel<Pedido>(pizzasList);
      return pedidosAEntregar;
   }
   public void setPedidosAEntregar(DataModel<Pedido> pedidosAEntregar) {
      this.pedidosAEntregar = pedidosAEntregar;
   }

   public int getCodCliente() {
      return codCliente;
   }

   public void setCodCliente(int codCliente) {
      this.codCliente = codCliente;
   }
   
   public PedidoControl getControle() {
      return controle;
   }
   public void setControle(PedidoControl controle) {
      this.controle = controle;
   }

   public int getCodPizza() {
      return codPizza;
   }

   public void setCodPizza(int codPizza) {
      this.codPizza = codPizza;
   }
   
   
}
