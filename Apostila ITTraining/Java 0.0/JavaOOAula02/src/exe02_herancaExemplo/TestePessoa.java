package exe02_herancaExemplo;

public class TestePessoa {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.nome="Lucas";
		a.curso="Java OO";
		
		Professor p = new Professor();
		p.nome="Lucas";
		p.disciplina="Logica";
		
		Pessoa ap = new Aluno();
		Aluno aluno = (Aluno) ap;
		Pessoa pp = new Professor();
	}

}
