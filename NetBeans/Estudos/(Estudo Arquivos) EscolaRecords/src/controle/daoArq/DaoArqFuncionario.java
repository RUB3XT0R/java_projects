
package controle.daoArq;

import controle.Ferramentas;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import modelo.Funcionario;

public class DaoArqFuncionario extends DaoArq {

    private List<Funcionario> funcionarios;

    public DaoArqFuncionario() {
        funcionarios = getFuncionarios();
    }
     public boolean addFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            Ferramentas.showErro("Funcionario esta vazio.", "Erro Interno nº05");
            return false;
        }
        if (funcionarios.contains(funcionario)) {
            Ferramentas.showErro("Funcionario já existe.", "Erro Externo nº01");
            return false;
        }
        funcionarios.add(funcionario);
        return true;
    }
      public boolean upFuncionario(Funcionario funcionario, int index) {
        if (funcionario == null) {
            Ferramentas.showErro("Funcionario esta vazio.", "Erro Interno nº05");
            return false;
        }
        if (!funcionarios.contains(funcionario)) {
            addFuncionario(funcionario);
            return false;
        }
        Funcionario aremover = funcionarios.get(index);
        funcionarios.remove(aremover);
        funcionarios.add(funcionario);
        return true;
    }
     public boolean delFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            Ferramentas.showErro("Funcionário esta vazio.", "Erro Interno nº06");
            return false;
        }
        if (funcionarios.contains(funcionario)) {
            funcionarios.remove(funcionario);
            return true;
        } else {
            Ferramentas.showErro("Não foi possível deletar o funcionário, o mesmo não existe.", "Erro Interno nº07");
            return false;
        }
    }
  public Funcionario getFuncionario(int codigo) {
        Funcionario fc=null;
        for(Funcionario funcionario : funcionarios)
             fc = (funcionario.getCodigo()== codigo) ? funcionario : null;
        return fc;
    }
    public List<Funcionario> getFuncionarios() {
        Scanner input = readFile("funcionarios.txt");
        funcionarios = new LinkedList<Funcionario>();
        Funcionario funcionario;
        try {
            while (input.hasNext()) {
                funcionario = new Funcionario();
                funcionario.setCodigo(input.nextInt());
                funcionario.setNome(input.next());
                funcionario.setDataNasc(input.next());
                funcionario.setSalarioHora(input.nextDouble());
                funcionario.setCpf(input.next());
                funcionario.setDataAdmins(input.next());
                funcionario.setCargo(input.next());
                funcionarios.add(funcionario);
            }
        } catch (InputMismatchException i) {
        }

        input.close();
        closeFile();
        return funcionarios;
    }
 public List<Funcionario> getListaFuncionarios(){
        return funcionarios;
    }
    public void salvarAlteracoes() {
        openFile("funcionarios.txt");
        for (Funcionario funcionario : funcionarios) {
            getOutput().format(
                    "%d %s %s %f %s %s %s\n",
                    funcionario.getCodigo(),
                    funcionario.getNome(),
                    funcionario.getDataNasc(),
                    funcionario.getSalarioHora(),
                    funcionario.getCpf(),
                    funcionario.getDataAdmins(),
                    funcionario.getCargo());
        }
        closeFile();
    }
 
}

