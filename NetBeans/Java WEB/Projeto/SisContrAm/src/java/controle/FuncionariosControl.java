
package controle;

import dao.FuncionarioDao;
import java.sql.SQLException;
import java.util.List;
import modelo.Funcionario;

public class FuncionariosControl{

    public FuncionarioDao dao;

    public FuncionariosControl() {
            dao = new FuncionarioDao();
    }

    public List<Funcionario> getListOfFuncionarios() throws SQLException {
        return dao.getAllFuncionarios();
    }

    public int addFuncionario(Funcionario funcionario) throws SQLException {
        return dao.inserirFuncionario(funcionario);

    }
    public int updateFuncionario(Funcionario funcionario) throws SQLException {
        return dao.updateFuncionario(funcionario);

    }
    public void removeFuncionario(int id) throws SQLException {
        dao.removeFuncionario(id);
    }
    
    public Funcionario getFuncionario(int id) throws SQLException{
        return dao.getFuncionario(id);
    }
}
