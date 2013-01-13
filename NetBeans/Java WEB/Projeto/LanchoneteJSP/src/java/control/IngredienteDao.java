/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.IngredienteTipo;
import modelo.Ingrediente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class IngredienteDao extends Dao {

    public IngredienteDao() {
    }
  
    public boolean insert(Ingrediente i) {
        try {
            executeCommand(
                    "insert into ingredientes (descricao,preco,tipo) values(?,?,?)",
                    i.getDescricao(), i.getPreco(), i.getTipo().toString());
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

    }

    public boolean remove(int id) {
        try {
            executeCommand("delete from ingredientes where id=?", id);
            executeCommand("delete from lanche_ingredientes where id_ingrediente=?",id);
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public boolean update(Ingrediente i) {
        try {
            executeCommand(
                    "update ingredientes set descricao=?, preco=?, tipo=? where id=?",
                    i.getDescricao(), i.getPreco(), i.getTipo().name(), i.getId());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean containIngrediente(String descricao){
        try {
            return contain("ingredientes","descricao",descricao);
        } catch (SQLException ex) {
            return true;
        }
    }
    
    public boolean containIngrediente(int id){
        try {
            return contain("ingredientes","id",id);
        } catch (SQLException ex) {
            return true;
        }
    }
    
    public Ingrediente getIngrediente(int id) throws SQLException {
        ResultSet rs = executeQuery("select * from ingredientes where id=?", id);
        Ingrediente ing = (rs.next()) ? populateIngrediente(rs) : null;
        rs.close();
        return ing;
    }

    public List<Ingrediente> getIngredientes() throws SQLException {
        ResultSet rs = executeQuery("select * from ingredientes");
        return selectList(rs);
    }

    public List<Ingrediente> getIngredientes(String nome) throws SQLException {
        ResultSet rs;
         if(null != nome) 
            rs = executeQuery("select * from ingredientes where descricao like ?", "%" + nome + "%");
         else 
            rs = executeQuery("select * from ingredientes");
         return selectList(rs);
    }

    public List<Ingrediente> getIngredientes(IngredienteTipo it) throws SQLException {
        ResultSet rs;
        if(null != it) 
            rs = executeQuery("select * from ingredientes where tipo = ?", it.toString());
        else 
            rs = executeQuery("select * from ingredientes");
        return selectList(rs);
    }

    public List<Ingrediente> getIngredientes(IngredienteTipo it, String nome) throws SQLException {
        ResultSet rs;
        if(null != it && null != nome) 
            rs = executeQuery("select * from ingredientes where tipo = ? and descricao like ?", it.toString(), "%" + nome + "%");
        else 
            rs = executeQuery("select * from ingredientes");
        return selectList(rs);
    }

    private List<Ingrediente> selectList(ResultSet rs) throws SQLException {
        List<Ingrediente> toreturn = new LinkedList<Ingrediente>();
        while (rs.next()) {
            toreturn.add(populateIngrediente(rs));
        }
        rs.close();
        return toreturn;
    }

    public static Ingrediente populateIngrediente(ResultSet rs) throws SQLException {
        Ingrediente toreturn = new Ingrediente();
        toreturn.setId(rs.getInt("id"));
        toreturn.setDescricao(rs.getString("descricao"));
        toreturn.setPreco(rs.getFloat("preco"));
        toreturn.setTipo(IngredienteTipo.valueOf(rs.getString("tipo")));
        return toreturn;
    }
}
