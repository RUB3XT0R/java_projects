
package control;

import java.sql.SQLException;
import java.util.List;
import modelo.Ingrediente;
import modelo.Lanche;
import modelo.LancheItens;


public class LancheControl {
    
    //lista de lanches
    private List<Lanche> lanches;
    //novo lanche
    private Lanche lanche  = new Lanche();
    //controle
    private LancheDao dao;
    
    public LancheControl(){
        dao = new LancheDao();
        lanches = dao.getAllLanches();
    }
    public void refresh(){
        lanches = dao.getAllLanches();
    }
    //Manipular lanche
    public String newLanche(){
        lanche = new Lanche();
        return "\"document.forms.novoLanche.submit()\"";
    }
    public Lanche getLanche() {return lanche;}
    public void setLanche(Lanche lanche) {this.lanche = lanche;}
    public List<LancheItens> getItems() {return lanche.getIngredientes();}
    public void addItem(int id, int qtde){
        try {
            Ingrediente ingre = new IngredienteDao().getIngrediente(id);
            if(null == ingre) return; 
            for(LancheItens li : lanche.getIngredientes()){
                if(li.getIngrediente().equals(ingre)) return;
            }
            lanche.getIngredientes().add(new LancheItens(lanche,ingre,qtde));
        } catch (SQLException ex) {
            return;
        }
    }
    public String delItem(int id){
        for(LancheItens li : lanche.getIngredientes()){
            if(li.getIngrediente().getId()==id) lanche.getIngredientes().remove(li);
        }
        return "\"location.href='novoLanche.jsp?id="+id+"'\"";
    }
    public LancheItens getItem(String nome){
       for(LancheItens li : lanche.getIngredientes()){
            if(li.getIngrediente().getDescricao().equals(nome)) return li;
        }
        return null;
    }
    public LancheItens getItem(int id){
       for(LancheItens li : lanche.getIngredientes()){
            if(li.getIngrediente().getId()==id) return li;
        }
        return null;
    }
    public float getTotal(){
        float total=0f;
        for(LancheItens li : lanche.getIngredientes()){
            total+=li.getTotal();
        }
        lanche.setPreco(total);
        return total;
    }
        
    //manipular lanches
    public boolean contain(String nome){return lanches.contains(new Lanche(nome));}
    public LancheDao getDao(){return dao;}
    public void setDao(LancheDao dao) {this.dao = dao;}
    public List<Lanche> getLanches() {return lanches;}
    public void setLanches(List<Lanche> lanches) {this.lanches = lanches;}
    
    
    
}
