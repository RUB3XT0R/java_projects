/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Bebida;

/**
 *
 * @author Lucas Biason
 */
public class BebidaDao extends Dao{
    
    
    public  boolean insert(Bebida  b){
        try {
        executeCommand(
                "insert into bebidas (descricao,preco,qtde_ml) values(?,?,?)",
                b.getDescricao(),b.getPreco(),b.getQtde()
        );
        return true;
        } catch (SQLException ex) {
           return false;
        }
    }

    public boolean remove(int id){
        try {
        executeCommand("delete from bebidas where id=?",id);
        return true;
        } catch (SQLException ex) {
           return false;
        }
    }

    public boolean update(Bebida b){
        try {
        executeCommand(
                "update bebidas set descricao=?,preco=?,qtde_ml=? where id=?",
                b.getDescricao(),b.getPreco(),b.getQtde(),b.getId()
        );
        return true;
        } catch (SQLException ex) {
           return false;
        }
    }
    
    public boolean containBebida(String descricao){
        try {
            return contain("bebidas","descricao",descricao);
        } catch (SQLException ex) {
            return true;
        }
    }
    
    public boolean containBebida(int id){
        try {
            return contain("bebidas","id",id);
        } catch (SQLException ex) {
            return true;
        }
    }
    
    public Bebida getBebida(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from bebidas where id=?",id);
        return  (rs.next())? populateBebida(rs) : null;
    }

    public List<Bebida> getBebidas() throws SQLException{
        ResultSet rs = executeQuery("select * from bebidas");
        return selectList(rs);
    }

   
    public List<Bebida> getBebidas(String nome) throws SQLException{
        ResultSet rs = executeQuery("select * from bebidas where descricao like ?","%"+nome+"%");
        return selectList(rs);
    }

    private List<Bebida> selectList(ResultSet rs) throws SQLException{
        List<Bebida> toreturn = new LinkedList<Bebida>();
        while (rs.next())
            toreturn.add(populateBebida(rs));
        rs.close();
        return toreturn;
    }

    public static Bebida populateBebida(ResultSet rs) throws SQLException {
        Bebida toreturn = new Bebida();
        toreturn.setId(rs.getInt("id"));
        toreturn.setDescricao(rs.getString("descricao"));
        toreturn.setPreco(rs.getFloat("preco"));
        toreturn.setQtde(rs.getFloat("qtde_ml"));
        return toreturn;
    }
}
