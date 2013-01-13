package exe05_Agregacao;

public class Sala {

	private Aluno[] alunos = new Aluno[3];
	private String nome;
	
	public Sala(String nome) {
		super();
		this.nome = nome;
		
	}
	
	//otimizando
	public void preencher(){
		for(int i=0; i<alunos.length; i++){
			alunos[i] = new Aluno();
			alunos[i].pedeDados();
		}
	}
	public void relatório(){
		System.out.println("-- Lista de Alunos da Sala "+ 
	                                              nome+" --");
		for(Aluno a : alunos) a.mostraStatus(); //alterar o metodo em Aluno, para deixar melhor
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
