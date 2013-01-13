
package controle;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import modelo.Pizza;

@Named
@SessionScoped
public class PizzaBean implements  Serializable{
   
   private PizzaControl controle = new PizzaControl();
   private Pizza pizza = new Pizza();
   private DataModel<Pizza> pizzas;
   
   public void novo(){
      pizza = new Pizza();
   }
   public String inserir(){
      return (controle.salvar(pizza)) ? "pizzas" : "falhou";
   }
   public void selecionar(){
      pizza = pizzas.getRowData();
   }
   public String alterar(){
      return (controle.alterar(pizza)) ? "pizzas" : "falhou";
   }
   public String remover(){
      return (controle.excluir(pizza)) ? "pizzas" : "falhou";
   }
   public Pizza getPizza(){
      return pizza;
   }
   public void setPizza(Pizza p){
      pizza = p;
   }
   public DataModel<Pizza> getPizzas(){
      List<Pizza> pizzasList = controle.getList();
      pizzas = new ListDataModel<Pizza>(pizzasList);
      return pizzas;
   }
   public void setPizzas(DataModel<Pizza> pizzas){
      this.pizzas = pizzas;
   }   
}
