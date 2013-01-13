

package Dao;

import Controle.IngredienteTipo;
import Dao.Dao;
import Modelo.Ingrediente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class IngredienteDao extends Dao{

    public IngredienteDao(){}

    public int insert(Ingrediente i) throws SQLException{
        i.setId(getNextId("ingredientes"));
        executeCommand(
                "insert into ingredientes (id,descricao,preco,tipo)"
                + "values(?,?,?,?)",
                i.getId(),i.getDescricao(),i.getPreco(),i.getTipo().toString()
        );
        return i.getId();
    }

    public void remove(int id) throws SQLException{
        executeCommand("delete from ingredientes where id=?",id);
    }

    public void update(Ingrediente i) throws SQLException{
        executeCommand(
                "update ingredientes set descricao=?,preco=?,tipo=? where id=?",
                i.getDescricao(),i.getPreco(),i.getTipo().toString(),i.getId()
        );
    }

    public Ingrediente getIngrediente(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from ingredientes where id=?",id);
        Ingrediente i = (rs.next())? populateIngrediente(rs) : null;
        rs.close();
        return i;
    }

    public List<Ingrediente> getIngredientes() throws SQLException{
        ResultSet rs = executeQuery("select * from ingredientes");
        return selectList(rs);
    }

    public List<Ingrediente> getIngredientes(String nome) throws SQLException{
        ResultSet rs = executeQuery("select * from ingredientes where descricao like ?","%"+nome+"%");
        return selectList(rs);
    }

    public List<Ingrediente> getIngredientes(IngredienteTipo it) throws SQLException{
        ResultSet rs = executeQuery("select * from ingredientes where tipo = ?",it.toString());
        return selectList(rs);
    }

    public List<Ingrediente> getIngredientes(IngredienteTipo it,String nome) throws SQLException{
        ResultSet rs = executeQuery("select * from ingredientes where tipo = ? and descricao like ?",it.toString(),"%"+nome+"%");
        return selectList(rs);
    }

    private List<Ingrediente> selectList(ResultSet rs) throws SQLException{
        List<Ingrediente> toreturn = new LinkedList<Ingrediente>();
        while (rs.next())
            toreturn.add(populateIngrediente(rs));
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
