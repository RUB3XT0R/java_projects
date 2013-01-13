
package controle.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Login;

public class LoginDao extends Dao{

    public LoginDao(){}

    public int addLogin(Login l) throws SQLException{
        l.setId(getNextId("login"));
        executeCommand(
                "insert into login (id,login,senha,id_funcionario) values(?,?,?,?)",
                l.getId(),l.getLogin(),l.getSenha(),l.getFuncionario().getId()
        );
        return l.getId();
    }

    public void removeLogin(int idUsuario) throws SQLException{
        executeCommand("delete from login where id=?",idUsuario);
    }

    public void updateLogin(Login l) throws SQLException{
        executeCommand(
                "update login set login=?,senha=? where id=?",
                l.getLogin(),l.getSenha(),l.getId()
        );
    }

    public Login getLogin(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from login where id=?",id);
        Login l = (rs.next())? populateLogin(rs) : null;
        rs.close();
        return l;
    }
    public Login getLogin(String login) throws SQLException{
        ResultSet rs = executeQuery("select * from login where login=?",login);
        Login l = (rs.next())? populateLogin(rs) : null;
        rs.close();
        return l;
    }

    public List<Login> getAllLogin() throws SQLException{
        ResultSet rs = executeQuery("select * from login");
        List<Login> toreturn = new LinkedList<Login>();
        while (rs.next())
            toreturn.add(populateLogin(rs));
        rs.close();
        return toreturn;
    }

    public static Login populateLogin(ResultSet rs) throws SQLException {
        Login toreturn = new Login();
        FuncionariosDao f = new FuncionariosDao();
        toreturn.setId(rs.getInt("id"));
        toreturn.setLogin(rs.getString("login"));
        toreturn.setFuncionario(f.getFuncionario(rs.getInt("id_funcionario")));
        toreturn.setSenha(rs.getString("senha"));
        return toreturn;
    }

    public Login isValidUserAndPassword(String user, String senha) throws SQLException{
        ResultSet rs = executeQuery("select * from login where login=? and senha=?",user,senha);
        Login l = (rs.next())? populateLogin(rs) : null;
        rs.close();
        return l;
    }
}
