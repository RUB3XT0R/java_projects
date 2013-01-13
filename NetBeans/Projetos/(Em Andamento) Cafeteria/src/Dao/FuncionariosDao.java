
package Dao;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import Modelo.Funcionario;

public class FuncionariosDao extends Dao{

    public FuncionariosDao(){}

    public int addFuncionario(Funcionario f) throws SQLException{
        f.setId(getNextId("funcionarios"));
        executeCommand(
                "insert into funcionarios (id,cpf,nome,email,endereco,cidade,estado,telefone,salario,cargo)"
                + "values(?,?,?,?,?,?,?,?,?,?)",
                f.getId(),f.getCpf(),f.getNome(),f.getEmail(),f.getEndereco(),f.getCidade(),f.getEstado(),f.getTelefone(),f.getSalario(),f.getCargo()
        );
        return f.getId();
    }

    public void removeFuncionario(int idUsuario) throws SQLException{
        executeCommand("delete from funcionarios where id=?",idUsuario);
    }

    public void updateFuncionario(Funcionario f) throws SQLException{
        executeCommand(
                "update funcionarios set cpf=?,nome=?,email=?,endereco=?,cidade=?,estado=?,telefone=?,salario=?,cargo=? where id=?",
                f.getCpf(),f.getNome(),f.getEmail(),f.getEndereco(),f.getCidade(),f.getEstado(),f.getTelefone(),f.getSalario(),f.getCargo(),f.getId()
        );
    }

    public Funcionario getFuncionario(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from funcionarios where id=?",id);
        Funcionario usr = (rs.next())? populateFuncionario(rs) : null;
        rs.close();
        return usr;
    }

    public List<Funcionario> getFuncionario(String nome) throws SQLException{
        ResultSet rs = executeQuery("select * from funcionarios where nome like ?","%"+nome+"%");
        List<Funcionario> toreturn = new LinkedList<Funcionario>();
        while (rs.next())
            toreturn.add(populateFuncionario(rs));
        rs.close();
        return toreturn;
    }

    public List<Funcionario> getAllFuncionarios() throws SQLException{
        ResultSet rs = executeQuery("select * from funcionarios");
        List<Funcionario> toreturn = new LinkedList<Funcionario>();
        while (rs.next())
            toreturn.add(populateFuncionario(rs));
        rs.close();
        return toreturn;
    }

    public static Funcionario populateFuncionario(ResultSet rs) throws SQLException {
        Funcionario toreturn = new Funcionario();
        toreturn.setId(rs.getInt("id"));
        toreturn.setCpf(rs.getLong("cpf"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setEndereco(rs.getString("endereco"));
        toreturn.setCidade(rs.getString("cidade"));
        toreturn.setEstado(rs.getString("estado"));
        toreturn.setTelefone(rs.getString("telefone"));
        toreturn.setEmail(rs.getString("email"));
        toreturn.setSalario(rs.getFloat("salario"));
        toreturn.setCargo(rs.getString("cargo"));
        return toreturn;
    }

     
}
