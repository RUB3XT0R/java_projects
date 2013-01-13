
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Venda;
import modelo.VendaItem;
import modelo.Vendivel;

public class VendasDao extends Dao{

    public int addVenda(Venda venda, boolean addComItens){
        try {
            executeCommand(
                    "insert into venda set funcionarios_cpf=?,data=?,total=?",
                    venda.getVendedor().getCpf(),venda.getData(),getTotalOfSale(venda)
            );
            int idVenda = getIDFromLastInsert("venda");
            
            if(addComItens)
                for (VendaItem item : venda.getItens()) addVendaItem(item,idVenda);

            return idVenda;
        } catch (SQLException ex) {
            return -1;
        }
    }

    public boolean addVendaItem(VendaItem item,int idVenda){
        try {
            executeCommand(
                    "insert into venda_produtos set id_produto=?, qtde=?, id_venda=?, tipo_produto=?",
                    item.getProduto().getId(),item.getQtde(),idVenda,item.getProduto().getTipoProduto());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean updateVenda(Venda venda, boolean atualizaComItens){
        try {
            executeCommand(
                    "update venda set funcionarios_cpf=?,data=?,total=?"
                    + "where id=?",
                    venda.getId(),venda.getVendedor().getCpf(),venda.getData(),getTotalOfSale(venda)
            );
            
            if(atualizaComItens)
                for (VendaItem item : venda.getItens()) updateVendaItem(item);

            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean updateVendaItem(VendaItem item){
        try {
            executeCommand(
                    "update venda_produtos set id_produto=?, qtde=?, id_venda=?, tipo_produto=?",
                    item.getProduto().getId(),item.getQtde(),item.getVendas().getId(),
                    item.getProduto().getTipoProduto());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public float getTotalOfSale(Venda venda){
        float totalOfSale = 0f;
        for (VendaItem item : venda.getItens())
            totalOfSale+= item.getProduto().getPreco()*item.getQtde();
        return totalOfSale;
    }

    public void removeVenda(int id) throws SQLException{
        executeCommand("delete from venda_produtos where id_venda=?",id);
        executeCommand("delete from venda where id=?",id);
    }
    
    public void removeVendaItem(int idVenda,int idProduto) throws SQLException{
        executeCommand("delete from venda_produtos where id_venda=? and id_produto=?",idVenda,idProduto);
    }

    public Venda getVenda(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from venda where id=?",id);
        Venda venda = (rs.next())?  populateVenda(rs, true) : null;
        rs.close();
        return venda;
    }

    public List<Venda> getAllVendas() throws SQLException{
        ResultSet rs = executeQuery("Select * from venda");
        List<Venda> toreturn =new LinkedList<Venda>();
        while(rs.next()){
            toreturn.add(populateVenda(rs,true));
        }
        rs.close();
        return toreturn;
    }
    
    public Venda populateVenda(ResultSet rs, boolean populateComItens) throws SQLException {
        Venda venda = new Venda();
        venda.setId(rs.getInt("id"));
        venda.setVendedor(new FuncionariosDao().getFuncionario(rs.getString("funcionarios_cpf")));
        venda.setData(rs.getDate("data"));
        venda.setTotal(rs.getFloat("total"));
        if(populateComItens)
            venda.setItens(getVendaItens(venda));
        return venda;
    }

    public VendaItem getVendaItem(int idVenda,int idProduto) throws SQLException{
        ResultSet rs = executeQuery("select * from venda_produtos where id_venda=? and id_produto=?",idVenda,idProduto);
        VendaItem item = (rs.next())?  populateVendaItem(rs) : null;
        rs.close();
        return item;
    }

    public List<VendaItem> getVendaItens(Venda v) throws SQLException{
        List<VendaItem> toreturn = new LinkedList<VendaItem>();
        ResultSet rs = executeQuery("select * from venda_produtos where id_venda=?",v.getId());
        while(rs.next()) toreturn.add(populateVendaItem(rs,v));
        rs.close();
        return toreturn;
    }
    
    public VendaItem populateVendaItem(ResultSet rs, Venda... venda) throws SQLException {
        VendaItem item = new VendaItem();
        item.setQtde(rs.getInt("qtde"));
        item.setVendas( (venda!=null && venda.length >0) ?  venda[0] : getVenda(rs.getInt("id_venda")) );
        
        String tipo = rs.getString("tipo_produto");
        int idProduto = rs.getInt("id_produto");
        
        Vendivel produto;
        if(tipo.equalsIgnoreCase("bebida")){
            produto = new BebidaDao().getBebida(idProduto);
        }else if(tipo.equalsIgnoreCase("acompanhamento")){
            produto = new AcompanhamentoDao().getAcompanhamento(idProduto);
        }else if(tipo.equalsIgnoreCase("lanche")){
            produto = new LancheDao().getLanche(idProduto);
        }else{
            produto = new ComboDao().getCombo(idProduto);
        }
        item.setProduto(produto);
        
        return item;
    }

    

}
