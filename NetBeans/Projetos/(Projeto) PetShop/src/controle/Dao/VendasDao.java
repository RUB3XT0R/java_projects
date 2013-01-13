
package controle.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Venda;
import modelo.VendaItem;

public class VendasDao extends Dao{

    public int addVenda(Venda venda, boolean addComItens) throws SQLException{
        venda.setId(getNextId("vendas"));

        if(addComItens)
            for (VendaItem item : venda.getItens()) addVendaItem(item);

        executeCommand(
                "insert into vendas (id,id_vendedor,datadavenda,total) values(?,?,?,?)",
                venda.getId(),venda.getVendedor().getId(),venda.getDataDaVenda(),getTotalOfSale(venda)
        );
        return venda.getId();
    }

    public int addVendaItem(VendaItem item) throws SQLException {
        item.setId((getNextId("itensvendidos")));
        executeCommand(
                "insert into itensvendidos (id,id_produto,qtde,id_venda) values (?,?,?,?)",
                item.getId(), item.getProduto().getId(), item.getQnt(), item.getVendas().getId()
        );
        return item.getId();
    }

    public void updateVenda(Venda venda, boolean atualizaComItens) throws SQLException{
        if(atualizaComItens)
            for (VendaItem item : venda.getItens()) updateVendaItem(item);

        executeCommand(
                "update vendas set id_vendedor=?,total=? where id=?",
                venda.getVendedor().getId(),getTotalOfSale(venda),venda.getId()
        );
    }

    public void updateVendaItem(VendaItem item) throws SQLException {
        executeCommand(
                "update itensvendidos  set id_produto=?,qtde=? where id=?",
                item.getProduto().getId(), item.getQnt(), item.getId()
         );
    }

    public float getTotalOfSale(Venda venda){
        float totalOfSale = 0f;
        for (VendaItem item : venda.getItens())
            totalOfSale+= item.getProduto().getPreco()*item.getQnt();
        return totalOfSale;
    }

    public void removeVenda(int id) throws SQLException{
        executeCommand("delete from itensvendidos where id_venda=?",id);
        executeCommand("delete from vendas where id=?",id);
    }
    
    public void removeVendaItem(int id) throws SQLException{
        executeCommand("delete from itensvendidos where id=?",id);
    }

    public Venda getVenda(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from vendas where id=?",id);
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
    
    public Venda populateVenda(ResultSet rs, boolean populateComItens) throws SQLException {
        Venda venda = new Venda();
        UsuarioDao vendedor = new UsuarioDao();
        venda.setId(rs.getInt("id"));
        venda.setVendedor(vendedor.getUsuario(rs.getInt("id_vendedor")));
        venda.setDataDaVenda(rs.getDate("datadavenda"));
        venda.setTotal(rs.getFloat("total"));
        if(populateComItens)
            venda.setItens(getVendaItens(venda));
        return venda;
    }

    public VendaItem getVendaItem(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from itensvendidos where id=?",id);
        VendaItem item = (rs.next())?  populateVendaItem(rs) : null;
        rs.close();
        return item;
    }

    public List<VendaItem> getVendaItens(Venda v) throws SQLException{
        List<VendaItem> toreturn = new LinkedList<VendaItem>();
        ResultSet rs = executeQuery("select * from itensvendidos where id_venda=?",v.getId());
        while(rs.next()) toreturn.add(populateVendaItem(rs,v));
        rs.close();
        return toreturn;
    }
    
    public VendaItem populateVendaItem(ResultSet rs, Venda... venda) throws SQLException {
        VendaItem item = new VendaItem();
        ProdutoDao produto = new ProdutoDao();
        item.setId(rs.getInt("id"));
        item.setQnt(rs.getInt("qtde"));
        item.setProduto(produto.getProduto(rs.getInt("id_produto")));
        item.setVendas( (venda!=null && venda.length >0) ?  venda[0] : getVenda(rs.getInt("id_venda")) );
        return item;
    }

    

}
