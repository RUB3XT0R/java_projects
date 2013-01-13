
package control;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Venda;
import modelo.VendaItem;


public class VendaControl {
    //lista de lanches
    private List<Venda> vendas;
    //novo lanche
    private Venda venda  = new Venda();
    //controle
    private VendasDao dao;
    
    public VendaControl(){
        try {
            dao = new VendasDao();
            vendas = dao.getAllVendas();
        } catch (SQLException ex) {
            vendas = new LinkedList<Venda>();
        }
    }
    public void refresh(){
        try {
            vendas = dao.getAllVendas();
        } catch (SQLException ex) {
            vendas = new LinkedList<Venda>();
        }
    }
    //Manipular Venda
    public String newVenda(){
        venda = new Venda();
        return "\"document.forms.novoVenda.submit()\"";
    }
    public Venda getVenda() {return venda;}
    public void setVenda(Venda venda) {this.venda = venda;}
    public List<VendaItem> getItems() {return venda.getItens();}
    public void addItem(int id, int qtde,String tipo){
        try {
           
            VendaItem vi = new VendaItem();
            
            if(tipo.equalsIgnoreCase("bebida")){
                vi.setProduto( new BebidaDao().getBebida(id));
            }else if(tipo.equalsIgnoreCase("combo")){
                vi.setProduto( new ComboDao().getCombo(id));
            }else if(tipo.equalsIgnoreCase("lanche")){
                vi.setProduto( new LancheDao().getLanche(id));
            }else{
                vi.setProduto( new AcompanhamentoDao().getAcompanhamento(id));
            }
            
            vi.setVendas(venda);
            vi.setQtde(qtde);
            
            if(venda.getItens().contains(vi)) return;
            
            venda.getItens().add(vi);
            
        } catch (SQLException ex) {
            return;
        }
    }
    public String delItem(int id){
        for(VendaItem vi : venda.getItens()){
            if(vi.getProduto().getId()==id) venda.getItens().remove(vi);
        }
        return "\"location.href='novaVenda.jsp?id="+id+"'\"";
    }
    public VendaItem getItem(String nome){
       for(VendaItem vi : venda.getItens()){
            if(vi.getProduto().getDescricao().equalsIgnoreCase(nome)) return vi;
        }
        return null;
    }
    public VendaItem getItem(int id){
       for(VendaItem vi : venda.getItens()){
            if(vi.getProduto().getId()==id) return vi;
        }
        return null;
    }
    public float getTotal(){
        float total=0f;
        for(VendaItem vi : venda.getItens()){
            total+= vi.getProduto().getPreco()*vi.getQtde();
        }
        venda.setTotal(total);
        return total;
    }
        
    //manipular lanches

    public VendasDao getDao() {
        return dao;
    }

    public void setDao(VendasDao dao) {
        this.dao = dao;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
      
    
}
