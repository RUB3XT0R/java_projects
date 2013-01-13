

package control;

import modelo.Lanche;
import modelo.LancheItens;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class LancheDao extends Dao {
    
    public LancheDao(){}
    
    public boolean insertLanche(Lanche lanche,boolean addComItens){
        try {
            executeCommand("insert into lanche (descricao,preco)"
                    + "values(?,?)",
                    lanche.getDescricao(),lanche.getPreco() );
            int id = getIDFromLastInsert("lanche");
            System.out.println(id);
            if(addComItens)
                for (LancheItens item : lanche.getIngredientes()) 
                    insertLancheItem(item,id);
            
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean insertLancheItem(LancheItens item,int idLanche){
        try {
            executeCommand(
                    "insert into lanche_ingredientes (id_lanche,id_ingrediente,qtde)"
                    + "values(?,?,?)",
                    idLanche, item.getIngrediente().getId(), item.getQtde()
            );
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean updateLanche(Lanche lanche, boolean atualizaComItens){
        try {
            if(atualizaComItens)
                for (LancheItens item : lanche.getIngredientes()) updateLancheItem(item);

            executeCommand(
                    "update lanche set descricao=?,preco=? where id=?",
                    lanche.getDescricao(),lanche.getPreco(),lanche.getId()
            );
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean updateLancheItem(LancheItens item){
        try {
            executeCommand(
                    "update lanche_ingredientes set id_lanche=?,id_ingrediente=?,qtde=? where ",
                    item.getLanche().getId(),item.getIngrediente().getId(),item.getQtde(),item.getId()
             );
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public float getTotalDoLanche(Lanche lanche) {
        float TotalDoLanche = 0f;
        for (LancheItens item : lanche.getIngredientes()) {
            TotalDoLanche += item.getIngrediente().getPreco() * item.getQtde();
        }
        return TotalDoLanche;
    }

    public boolean removeLanche(int lancheID){
        try {
            executeCommand("delete from lanche_ingredientes where id_lanche=?", lancheID);
            executeCommand("delete from lanche where id=?", lancheID);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean removeLancheItem(int lancheID,int ingredienteID){
        try {
            executeCommand("delete from lanche_ingredientes where id_lanche=? and id_ingrediente=?", lancheID,ingredienteID);
             return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean contain(int id){
        try {
            return contain("lanche","id",id);
        } catch (SQLException ex) {
            return true;
        }
    }
    
    public Lanche getLanche(int id){
        try {
            ResultSet rs = executeQuery("select * from lanche where id=?",id);
            Lanche lanche = (rs.next())?  populateLanche(rs, true) : null;
            rs.close();
            return lanche;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Lanche> getAllLanches(){
        try {
            ResultSet rs = executeQuery("Select * from lanche");
            List<Lanche> toreturn =new LinkedList<Lanche>();
            while(rs.next()){
                toreturn.add(populateLanche(rs,true));
            }
            rs.close();
            return toreturn;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Lanche> getLanches(String str){
        try {
            ResultSet rs = executeQuery("Select * from lanche where descricao like ?","%"+str+"%");
            List<Lanche> toreturn =new LinkedList<Lanche>();
            while(rs.next()){
                toreturn.add(populateLanche(rs,true));
            }
            rs.close();
            return toreturn;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Lanche populateLanche(ResultSet rs, boolean populateComItens){
        try {
            Lanche lanche = new Lanche();
            lanche.setId(rs.getInt("id"));
            lanche.setDescricao(rs.getString("descricao"));
            lanche.setPreco(rs.getFloat("preco"));
            if(populateComItens)
                lanche.setIngredientes(getLancheItens(lanche));
            return lanche;
        } catch (SQLException ex) {
            return null;
        }
    }

    public LancheItens getLancheItens(int id){
        try {
            ResultSet rs = executeQuery("select * from lanche_ingredientes where id_lanche=?",id);
            LancheItens item = (rs.next())?  populateLancheItem(rs) : null;
            rs.close();
            return item;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<LancheItens> getLancheItens(Lanche l){
        try {
            List<LancheItens> toreturn = new LinkedList<LancheItens>();
            ResultSet rs = executeQuery("select * from lanche_ingredientes where id_lanche=?",l.getId());
            while(rs.next()) toreturn.add(populateLancheItem(rs,l));
            rs.close();
            return toreturn;
        } catch (SQLException ex) {
            return null;
        }
    }

    public LancheItens populateLancheItem(ResultSet rs, Lanche... lanche) throws SQLException {
        LancheItens item = new LancheItens();
        IngredienteDao ingrediente = new IngredienteDao();
        item.setQtde(rs.getInt("qtde"));
        item.setIngrediente(ingrediente.getIngrediente(rs.getInt("id_ingrediente")));
        item.setLanche( (lanche!=null && lanche.length >0) ?  lanche[0] : getLanche(rs.getInt("id_lanche")) );
        return item;
    }

}
