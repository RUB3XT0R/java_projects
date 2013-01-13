

package dao;

import controle.tipos.Funcao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Funcionario;


public class FuncionarioDao extends Dao{

    public int inserirFuncionario(Funcionario f) throws SQLException{   
        executeCommand(
                "insert into funcionarios "
                + "(nome,login,senha,funcao)"
                + "values(?,?,?,?)",
                f.getNome(),f.getLogin(),f.getSenha(),f.getFuncao().toString()
        );
        ResultSet rs = executeQuery("select id from funcionarios where login=?",f.getLogin());
        while(rs.next())  f.setId(rs.getInt("id"));
        
        return f.getId();
    }

    public int updateFuncionario(Funcionario f) throws SQLException{
        executeCommand(
                "update funcionarios "
                + "set nome=?,login=?,senha=?,funcao=? where id=?",
                f.getNome(),f.getLogin(),f.getSenha(),f.getFuncao().toString(),f.getId()
        );
        return f.getId();
    }

    public void removeFuncionario(int id) throws SQLException {
        executeCommand("delete from funcionarios where id=?", id);
    }

    public Funcionario getFuncionario(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from funcionarios where id=?",id);
        Funcionario f= (rs.next())?  populateFuncionario(rs) : null;
        rs.close();
        return f;
    }

    public List<Funcionario> getAllFuncionarios() throws SQLException{
        ResultSet rs = executeQuery("Select * from funcionarios");
        List<Funcionario> toreturn =new LinkedList<Funcionario>();
        while(rs.next()){
            toreturn.add(populateFuncionario(rs));
        }
        rs.close();
        return toreturn;
    }

    public List<Funcionario> getFuncionarios(String str) throws SQLException{
        ResultSet rs = executeQuery("Select * from funcionarios where nome like ?","%"+str+"%");
        List<Funcionario> toreturn =new LinkedList<Funcionario>();
        while(rs.next()){
            toreturn.add(populateFuncionario(rs));
        }
        rs.close();
        return toreturn;
    }

    public Funcionario populateFuncionario(ResultSet rs) throws SQLException {
        Funcionario f = new Funcionario();
        f.setId(rs.getInt("id"));
        f.setNome(rs.getString("nome"));
        f.setLogin(rs.getString("login"));
        f.setSenha(rs.getString("senha"));
        f.setFuncao(Funcao.valueOf(rs.getString("funcao")));
        return f;
    }

}
