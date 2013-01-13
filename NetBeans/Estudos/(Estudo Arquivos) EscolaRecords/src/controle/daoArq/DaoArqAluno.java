package controle.daoArq;

import controle.Ferramentas;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import modelo.Aluno;

public class DaoArqAluno extends DaoArq {

    private List<Aluno> alunos;

    public DaoArqAluno() {
        alunos = getAlunos();

    }

    public boolean addAluno(Aluno aluno) {
        if (aluno == null) {
            Ferramentas.showErro("Aluno esta vazio.", "Erro Interno nº05");
            return false;
        }
        if (alunos.contains(aluno)) {
            Ferramentas.showErro("Aluno já existe.", "Erro Externo nº01");
            return false;
        }
        alunos.add(aluno);
        return true;
    }

    public boolean upAluno(Aluno aluno,int index) {
        if (aluno == null) {
            Ferramentas.showErro("Aluno esta vazio.", "Erro Interno nº05");
            return false;
        }
        if (!alunos.contains(aluno)) {
            addAluno(aluno);
            return false;
        }
         Aluno aremover = alunos.get(index);
         alunos.remove(aremover);
         alunos.add(aluno);
         return true;
    }

    public boolean delAluno(Aluno aluno) {
        if (aluno == null) {
            Ferramentas.showErro("Aluno esta vazio.", "Erro Interno nº06");
            return false;
        }
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            return true;
        } else {
            Ferramentas.showErro("Não foi possível deletar o aluno, o mesmo não existe.", "Erro Interno nº07");
            return false;
        }
    }

    public Aluno getAluno(int ra) {
        Aluno al=null;
        for(Aluno aluno : alunos)
             al = (aluno.getRa()== ra) ? aluno : null;
        return al;
    }

    public List<Aluno> getAlunos() {
        Scanner input = readFile("alunos.txt");
        alunos = new LinkedList<Aluno>();
        Aluno aluno;
        try{
        while (input.hasNext()) {
            aluno = new Aluno();
            aluno.setRa(input.nextInt());
            aluno.setNome(input.next());
            aluno.setDatanasc(input.next());
            aluno.setTurma(input.next());
            aluno.setCurso(input.next());
            aluno.setPeriodo(input.next());
            aluno.setAno(input.nextInt());
            alunos.add(aluno);
            System.out.println( " 1) "+aluno.getRa()+" "+ aluno.getNome()+" "+ aluno.getDatanasc()+" "+ aluno.getTurma()+" "+ aluno.getCurso()+" "+ aluno.getPeriodo()+" "+ aluno.getAno());
        }
        }catch(InputMismatchException i){}

        input.close();
        closeFile();
        return alunos;
    }

    public List<Aluno> getListaAlunos(){
        return alunos;
    }
    public void salvarAlteracoes() {
        openFile("alunos.txt");
        for (Aluno aluno : alunos) {
            getOutput().format(
                    "%d %s %s %s %s %s %d\n",
                    aluno.getRa(),
                    aluno.getNome(),
                    aluno.getDatanasc(),
                    aluno.getTurma(),
                    aluno.getCurso(),
                    aluno.getPeriodo(),
                    aluno.getAno());
        }
        closeFile();
    }
}
