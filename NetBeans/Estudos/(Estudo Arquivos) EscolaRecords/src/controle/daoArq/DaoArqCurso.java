package controle.daoArq;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import modelo.Curso;
import modelo.CursoDisciplina;

public class DaoArqCurso extends DaoArq{

    private List<Curso> cursos;
    private List<CursoDisciplina> cursosdisciplinas;
    private DaoArqDisciplina daoD = new DaoArqDisciplina();
    
    public DaoArqCurso() {
        cursosdisciplinas = getCursoDisciplinas();
        cursos = getCursos(true);
    }

    public List<Curso> getCursos(boolean comItens) {
        Scanner input = readFile("cursos.txt");
        cursos = new LinkedList<Curso>();
        Curso curso;
        try{
        while (input.hasNext()) {
            curso = new Curso();
            curso.setCodigo(input.nextInt());
            curso.setNome(input.next());
            curso.setDisciplinas(getCursoDisciplinas(curso.getCodigo()));
            cursos.add(curso);
        }
        }catch(InputMismatchException i){}

        input.close();
        closeFile();
        return cursos;
    }

    public List<CursoDisciplina> getCursoDisciplinas() {
        List<CursoDisciplina> toreturn = new LinkedList<CursoDisciplina>();
        DaoArqDisciplina daod = new DaoArqDisciplina();
        DaoArqFuncionario daof = new DaoArqFuncionario();
        Scanner input = readFile("cursodisciplina.txt");
        CursoDisciplina disciplina;
        try {
            while (input.hasNext()) {
                disciplina = new CursoDisciplina();
                disciplina.setCodigo(input.nextInt());
                disciplina.setDisciplina(daod.getDisciplina(input.nextInt()));
                disciplina.setProfessor(daof.getFuncionario(input.nextInt()));
                disciplina.setCurso(new Curso(input.nextInt()));
                toreturn.add(disciplina);
            }
        } catch (InputMismatchException i) {
        }
        input.close();
        closeFile();
        return toreturn;
    }

    public List<CursoDisciplina> getCursoDisciplinas(int id_curso) {
        List<CursoDisciplina> toreturn = new LinkedList<CursoDisciplina>();
        for(CursoDisciplina cd : cursosdisciplinas){
            if( cd.getCurso().getCodigo() == id_curso) toreturn.add(cd);
        }
        return toreturn;
    }


    
}
