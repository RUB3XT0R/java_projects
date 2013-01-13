
package controle.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.*;

public class UsuarioDao extends Dao{

    public UsuarioDao(){}

    public int addUsuario(Usuario usr) throws SQLException{
        usr.setId(getNextId("usuarios"));
        executeCommand(
                "insert into usuarios (id,nome,login,senha) values (?,?,?,?)",
                usr.getId(),usr.getNome(),usr.getLogin(),usr.getPassword()
        );
        return usr.getId();
    }

    public void removeUsuario(int idUsuario) throws SQLException{
        executeCommand("delete from usuarios where id=?",idUsuario);
    }

    public void updateUsuario(Usuario usr) throws SQLException{
        executeCommand(
                "update usuarios set nome=?, login=?, senha=? where id=?",
                usr.getNome(),usr.getLogin(),usr.getPassword(),usr.getId()
        );
    }

    public Usuario getUsuario(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from usuarios where id=?",id);
        Usuario usr = (rs.next())? populateUsuario(rs) : null;
        rs.close();
        return usr;
    }

    public List<Usuario> getAllUsers() throws SQLException{
        ResultSet rs = executeQuery("select * from usuarios");
        List<Usuario> toreturn = new LinkedList<Usuario>();
        while (rs.next())
            toreturn.add(populateUsuario(rs));
        rs.close();
        return toreturn;
    }

    public static Usuario populateUsuario(ResultSet rs) throws SQLException {
        Usuario toreturn = new Usuario();
        toreturn.setId(rs.getInt("id"));
        toreturn.setLogin(rs.getString("login"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setPassword(rs.getString("senha"));
        return toreturn;
    }

    public boolean isValidUserAndPassword(String user, String senha) throws SQLException{
        ResultSet rs = executeQuery("select * from usuarios where login=? and senha=?",user,senha);
        boolean toreturn = (rs.next())? true : false;
        rs.close();
        return toreturn;
    }

}
