
package controle.aluno;

import controle.aluno.CreateAluno;

public class CreateAlunoTeste {

    public static void main(String args[]) {
        CreateAluno application = new CreateAluno();

        application.openFile();
        application.addAlunos();
        application.closeFile();
    }
}
