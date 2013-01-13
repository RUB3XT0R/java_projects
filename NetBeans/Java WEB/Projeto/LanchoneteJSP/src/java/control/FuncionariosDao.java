
package control;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import modelo.Funcionario;

public class FuncionariosDao extends Dao{

    public FuncionariosDao(){}

    public boolean addFuncionario(Funcionario f){
        try{
           executeCommand(
                "insert into funcionarios (cpf,nome,email,endereco,cidade,estado,telefone,salario,cargo,senha,login)"
                + "values(?,?,?,?,?,?,?,?,?,?,?)",
                f.getCpf(),f.getNome(),f.getEmail(),f.getEndereco(),f.getCidade(),f.getEstado(),
                f.getTelefone(),f.getSalario(),f.getCargo(),f.getSenha(),f.getLogin()
        );
        return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean removeFuncionario(String cpf){
         try{
        executeCommand("delete from funcionarios where cpf=?",cpf);
        return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean updateFuncionario(Funcionario f){
        try{
        executeCommand(
                "update funcionarios set nome=?,email=?,endereco=?,cidade=?,estado=?,telefone=?,"
                + "salario=?,cargo=?,login=?,senha=? where cpf=?",
                f.getNome(),f.getEmail(),f.getEndereco(),f.getCidade(),f.getEstado(),f.getTelefone(),
                f.getSalario(),f.getCargo(),f.getLogin(),f.getSenha(),f.getCpf()
        );
        return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean containFuncionario(String cpf){
        try {
            return contain("funcionarios","cpf",cpf);
        } catch (SQLException ex) {
            return true;
        }
    }
        
    public Funcionario getFuncionario(String cpf) throws SQLException{
        ResultSet rs = executeQuery("select * from funcionarios where cpf=?",cpf);
        Funcionario f = (rs.next())? populateFuncionario(rs) : null; 
        rs.close();
        return f;
    }

    public List<Funcionario> getFuncionarioByNome(String nome) throws SQLException{
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

    public Funcionario populateFuncionario(ResultSet rs) throws SQLException {
        Funcionario toreturn = new Funcionario();
        toreturn.setCpf(rs.getString("cpf"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setEndereco(rs.getString("endereco"));
        toreturn.setCidade(rs.getString("cidade"));
        toreturn.setEstado(rs.getString("estado"));
        toreturn.setTelefone(rs.getString("telefone"));
        toreturn.setEmail(rs.getString("email"));
        toreturn.setSalario(rs.getFloat("salario"));
        toreturn.setCargo(rs.getString("cargo"));
        toreturn.setSenha(rs.getString("senha"));
        toreturn.setLogin(rs.getString("login"));
        return toreturn;
    }

    public boolean getAdminPermission(String login, String senha){
        try {
            ResultSet rs = executeQuery("select * from funcionarios where login=? and senha=? and cargo='ADMIN'",login,senha);
            return (rs.next())? true : false;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public Funcionario doLogin(String login, String senha){
        try {
            ResultSet rs = executeQuery("select * from funcionarios where login=? and senha=?",login,senha);
            Funcionario f = (rs.next())? populateFuncionario(rs) : null; 
            rs.close();
            return f;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public float getComissaoVendas(float porcentagem, int idFuncionario, int mes, int ano){
        try {
            ResultSet rs = executeQuery("select sum(total)as totalF from venda "
                    + "where funcionarios_id=? and month(data)=? and year(data)=?",idFuncionario,mes,ano);
            float totalF = rs.getFloat("totalF");
            rs.close();
            return totalF*porcentagem;
        } catch (SQLException ex) {
            return -1;
        }
    }
    /*
    public float getVendas(int idFuncionario, int mes, int ano){
        try {
            ResultSet rs = executeQuery("selec * from venda where funcionarios_id=?"
                    + "and month(data) and year(data)=?",idFuncionario,mes,ano);
            Venda totalF = rs.getFloat("totalF");
            rs.close();
            
        } catch (SQLException ex) {
            return -1;
        }
    }
     */
     
}
