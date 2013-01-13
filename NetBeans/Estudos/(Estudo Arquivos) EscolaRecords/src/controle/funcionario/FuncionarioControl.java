package controle.funcionario;

import controle.daoArq.DaoArqFuncionario;
import java.util.List;
import modelo.Funcionario;

public class FuncionarioControl {

    private DaoArqFuncionario dao = new DaoArqFuncionario();

    public boolean add(int codigo, String nome, String datanasc, String cpf, double salarioHora, String dataAdmins, String cargo) {
        return dao.addFuncionario(new Funcionario(codigo, nome, datanasc, cpf, salarioHora, dataAdmins, cargo));
    }

    public boolean up(int codigo, String nome, String datanasc, String cpf, double salarioHora, String dataAdmins, String cargo, int index) {
        return dao.upFuncionario(new Funcionario(codigo, nome, datanasc, cpf, salarioHora, dataAdmins, cargo), index);
    }

    public boolean del(int codigo) {
        return dao.delFuncionario(new Funcionario(codigo));
    }

    public Funcionario get(int ra) {
        return dao.getFuncionario(ra);
    }

    public List<Funcionario> getList() {
        return dao.getListaFuncionarios();
    }

    public List<Funcionario> getInitialLista() {
        return dao.getFuncionarios();
    }

    public void salvar() {
        dao.salvarAlteracoes();
    }
}
