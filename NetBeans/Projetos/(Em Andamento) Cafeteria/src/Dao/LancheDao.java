

package Dao;

import Modelo.Lanche;
import Modelo.LancheItens;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class LancheDao extends Dao {
    
    public LancheDao(){}

    public int insertLanche(Lanche lanche,boolean addComItens) throws SQLException{
        lanche.setId(getNextId("lanche"));

        if(addComItens)
            for (LancheItens item : lanche.getIngredientes()) insertLancheItem(item);

        executeCommand(
                "insert into lanche (id,descricao,preco)"
                + "values(?,?,?)",
                lanche.getId(),lanche.getDescricao(),lanche.getPreco()
        );
        return lanche.getId();
    }

    public int insertLancheItem(LancheItens item) throws SQLException {
        item.setId((getNextId("lanche_ingredientes")));
        executeCommand(
                "insert into lanche_ingredientes (id,id_lanche,id_produto,qtde) values (?,?,?,?)",
                item.getId(), item.getLanche().getId(), item.getIngrediente().getId(), item.getQtde()
        );
        return item.getId();
    }

    public void updateLanche(Lanche lanche, boolean atualizaComItens) throws SQLException{
        if(atualizaComItens)
            for (LancheItens item : lanche.getIngredientes()) updateLancheItem(item);

        executeCommand(
                "update lanche set descricao=?,preco=? where id=?",
                lanche.getDescricao(),lanche.getPreco(),lanche.getId()
        );
    }

    public void updateLancheItem(LancheItens item) throws SQLException {
        executeCommand(
                "update lanche_ingredientes set id_lanche=?,id_produto=?,qtde=? where id=?",
                item.getLanche().getId(),item.getIngrediente().getId(),item.getQtde(),item.getId()
         );
    }

    public float getTotalDoLanche(Lanche lanche) {
        float TotalDoLanche = 0f;
        for (LancheItens item : lanche.getIngredientes()) {
            TotalDoLanche += item.getIngrediente().getPreco() * item.getQtde();
        }
        return TotalDoLanche;
    }

    public void removeLanche(int id) throws SQLException {
        executeCommand("delete from lanche_ingredientes where id=?", id);
        executeCommand("delete from lanche where id=?", id);
    }

    public void removeLancheItem(int id) throws SQLException {
        executeCommand("delete from lanche_ingredientes where id=?", id);
    }

    public Lanche getLanche(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from lanche where id=?",id);
        Lanche lanche = (rs.next())?  populateLanche(rs, true) : null;
        rs.close();
        return lanche;
    }

    public List<Lanche> getAllLanches() throws SQLException{
        ResultSet rs = executeQuery("Select * from lanche");
        List<Lanche> toreturn =new LinkedList<Lanche>();
        while(rs.next()){
            toreturn.add(populateLanche(rs,true));
        }
        rs.close();
        return toreturn;
    }

    public List<Lanche> getLanches(String str) throws SQLException{
        ResultSet rs = executeQuery("Select * from lanche where descricao like ?","%"+str+"%");
        List<Lanche> toreturn =new LinkedList<Lanche>();
        while(rs.next()){
            toreturn.add(populateLanche(rs,true));
        }
        rs.close();
        return toreturn;
    }

    public Lanche populateLanche(ResultSet rs, boolean populateComItens) throws SQLException {
        Lanche lanche = new Lanche();
        lanche.setId(rs.getInt("id"));
        lanche.setDescricao(rs.getString("descricao"));
        lanche.setPreco(rs.getFloat("preco"));
        if(populateComItens)
            lanche.setIngredientes(getLancheItens(lanche));
        return lanche;
    }

    public LancheItens getLancheItens(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from lanche_ingredientes where id=?",id);
        LancheItens item = (rs.next())?  populateLancheItem(rs) : null;
        rs.close();
        return item;
    }

    public List<LancheItens> getLancheItens(Lanche l) throws SQLException{
        List<LancheItens> toreturn = new LinkedList<LancheItens>();
        ResultSet rs = executeQuery("select * from lanche_ingredientes where id_lanche=?",l.getId());
        while(rs.next()) toreturn.add(populateLancheItem(rs,l));
        rs.close();
        return toreturn;
    }

    public LancheItens populateLancheItem(ResultSet rs, Lanche... lanche) throws SQLException {
        LancheItens item = new LancheItens();
        IngredienteDao ingrediente = new IngredienteDao();
        item.setId(rs.getInt("id"));
        item.setQtde(rs.getInt("qtde"));
        item.setIngrediente(ingrediente.getIngrediente(rs.getInt("id_produto")));
        item.setLanche( (lanche!=null && lanche.length >0) ?  lanche[0] : getLanche(rs.getInt("id_lanche")) );
        return item;
    }

}
