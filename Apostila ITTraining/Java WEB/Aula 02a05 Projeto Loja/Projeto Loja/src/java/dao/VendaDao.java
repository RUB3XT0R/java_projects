
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import modelo.Venda;
import modelo.VendaItem;

public class VendaDao extends Dao{
   
   public void addVenda(Venda venda, boolean addComItens){
      try {
         SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
         venda.setData_venda(new java.util.Date());
         executeCommand("insert into vendas set cliente=?, data_venda=?, total=?",
                 venda.getCliente().getCodigo(), sd.format(venda.getData_venda()), venda.getTotal());
         int id = getIDFromLastInsert("vendas","codigo");
         if(addComItens)
             for (VendaItem item : venda.getItens()) addVendaItem(item,id);         
 
      } catch (SQLException ex) {
         System.out.println(ex);
         throw new RuntimeException(ex);
      }
    }
   
   public void addVendaItem(VendaItem item,int vendaId) throws SQLException {
        executeCommand("insert into itens set produto=?, venda=?, qtde=?",
                item.getProduto().getCodigo(),vendaId,item.getQtde());
    }

    public float getTotalOfSale(Venda venda){
        float totalOfSale = 0f;
        for (VendaItem item : venda.getItens())
            totalOfSale+= item.getProduto().getValor()*item.getQtde();
        return totalOfSale;
    }
   
    public void removeVenda(int codigo) throws SQLException{
        executeCommand("delete from itens where venda=?",codigo);
        executeCommand("delete from vendas where codigo=?",codigo);
    }
    
    public void removeVendaItem(int venda, int produto) throws SQLException{
        executeCommand("delete from itens where venda=? and produto=?",venda,produto);
    }

    public Venda getVenda(int codigo) throws SQLException{
        ResultSet rs = executeQuery("select * from vendas where codigo=?",codigo);
        Venda venda = (rs.next())?  populateVenda(rs, true) : null;
        rs.close();
        return venda;
    }

    public List<Venda> getAllVendas() throws SQLException{
        ResultSet rs = executeQuery("Select * from vendas");
        List<Venda> toreturn =new LinkedList<Venda>();
        while(rs.next()){
            toreturn.add(populateVenda(rs,true));
        }
        rs.close();
        return toreturn;
    }
    
    private Venda venda;
    public Venda populateVenda(ResultSet rs, boolean populateComItens) throws SQLException {
        venda = new Venda();
        venda.setCodigo(rs.getInt("codigo"));
        venda.setCliente(new ClienteDao().get(rs.getInt("cliente")));
        venda.setData_venda(rs.getDate("data_venda"));
        venda.setTotal(rs.getFloat("total"));
        if(populateComItens)
            venda.setItens(getVendaItens(venda));
        return venda;
    }

    public VendaItem getVendaItem(int venda,int produto) throws SQLException{
        ResultSet rs = executeQuery("select * from itens where venda=? and produto=?",venda,produto);
        VendaItem item = (rs.next())?  populateVendaItem(rs) : null;
        rs.close();
        return item;
    }

    public List<VendaItem> getVendaItens(Venda v) throws SQLException{
        List<VendaItem> toreturn = new LinkedList<VendaItem>();
        ResultSet rs = executeQuery("select * from itens where venda=?",v.getCodigo());
        while(rs.next()) toreturn.add(populateVendaItem(rs,v));
        rs.close();
        return toreturn;
    }
    
    public VendaItem populateVendaItem(ResultSet rs, Venda... venda) throws SQLException {
        VendaItem item = new VendaItem();
        item.setProduto(new ProdutoDao().get(rs.getInt("produto")));
        item.setQtde(rs.getInt("qtde"));
        item.setVenda( (venda!=null && venda.length >0) ?  venda[0] : getVenda(rs.getInt("venda")) );
        return item;
    }

    


}
