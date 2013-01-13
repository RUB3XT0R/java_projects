
package controle;

import java.sql.*;
import java.util.*;
import modelo.Comida;

public class ComidaDao extends Dao
{
   public ComidaDao(){}

    public int addComida(Comida prod) throws SQLException{
        prod.setId(getNextId("comidas"));
        executeCommand(
                "insert into comidas (id,nome,tipo) values(?,?,?)",
                prod.getId(),prod.getNome(),prod.getTipo()
        );
        return prod.getId();
    }

    public void removeComida(int id) throws SQLException{
        executeCommand("delete from comidas where id=?",id);
    }

    public void updateComida(Comida prod) throws SQLException{
        executeCommand(
                "update comidas set nome=?, tipo=? where id=?",
                prod.getNome(),prod.getTipo(),prod.getId()
        );
    }

    public Comida getComida(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from comidas where id=?",id);
        Comida prod = (rs.next())? populateComida(rs): null;
        rs.close();
        return prod;
    }

    public static Comida populateComida(ResultSet rs) throws SQLException {
        Comida toreturn = new Comida();
        toreturn.setId(rs.getInt("id"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setTipo(rs.getString("tipo"));
        return toreturn;
    }

    public List<Comida> getAllComidas() throws SQLException{
        List<Comida> toreturn = new LinkedList<Comida>();
        ResultSet rs= executeQuery("select * from comidas");
        while(rs.next())
            toreturn.add(populateComida(rs));
        rs.close();
        return toreturn;
    }

    public List<Comida> getComidaFromTipos(String tipo) throws SQLException{
        List<Comida> toreturn = new LinkedList<Comida>();
        ResultSet rs= executeQuery("select * from comidas where tipo=?",tipo);
        while(rs.next())
            toreturn.add(populateComida(rs));
        rs.close();
        return toreturn;
    }

    public List<String> getTiposExistentes() throws SQLException{
        List<String> toreturn = new LinkedList<String>();
        ResultSet rs= executeQuery("select tipo from comidas");
        String str;
        while(rs.next()){
            str = rs.getString("tipo");
            if(! toreturn.contains(str) )
                toreturn.add(str);
        }
        rs.close();
        return toreturn;
    }
}
