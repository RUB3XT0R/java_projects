

package controle.aluno;


import controle.daoArq.DaoArqAluno;
import java.util.List;
import modelo.Aluno;

public class AlunoControl {

    private DaoArqAluno dao = new DaoArqAluno();

    public boolean add(int ra, String nome, String datanasc, int ano, String curso, String periodo, String turma){
        return dao.addAluno(new Aluno(ra,nome,datanasc,ano,curso,periodo,turma));
    }
    public boolean up(int ra, String nome, String datanasc, int ano, String curso, String periodo, String turma,int index){
        return dao.upAluno(new Aluno(ra,nome,datanasc,ano,curso,periodo,turma),index);
    }
    public boolean del(int ra){
        return dao.delAluno(new Aluno(ra));
    }
    public Aluno get(int ra) {
        return dao.getAluno(ra);
    }
    public List<Aluno> getList(){
        return dao.getListaAlunos();
    }
    public List<Aluno> getInitialLista(){
        return dao.getAlunos();
    }
    public void salvar(){
        dao.salvarAlteracoes();
    }
}
