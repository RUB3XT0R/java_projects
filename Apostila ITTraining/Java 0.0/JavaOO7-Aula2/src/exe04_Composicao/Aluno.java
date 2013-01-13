package exe04_Composicao;

import java.util.Scanner;

public class Aluno {

	private String nome;
	private Curso curso;
	private float[] notas = new float[3];
	
	public Aluno() {
		super();
		curso = new Curso();//adicionar depois do erro
	}

	public Aluno(String nome, Curso curso, float[] notas) {
		super();
		this.nome = nome;
		curso = new Curso();//adicionar depois do erro
		this.curso = curso;
		this.notas = notas;
	}

	private float calculaMedia(){
		float media = 0; //média começa com zero
		for(float f : notas) media += f; // média é acrescentada
		media /= notas.length; //média é dividida pela quantidade de alunos
		return media;
	}
	
	public void pedeDados(){
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Dados do Aluno ----");
		System.out.println("Entre com o Nome ...:");
		nome = sc.next();
		
		curso.pedeDados();
		
		System.out.println("---- Notas do Aluno ----");
		for(int i=0; i< notas.length; i++){
			System.out.println("Entre com a nota "+(i+1)+" ...:");
			notas[i] = sc.nextFloat();			
		}
		System.out.println("------------------------");	
	}
	
	public void mostraStatus(){
		System.out.println("------------------------");
		float media = calculaMedia();
		System.out.println("Média do Aluno é: "+ media);
		System.out.println("O aluno foi"+
		                   ( (media > 5)? " aprovado" : 
		                	   " reprovado") );
		System.out.println("------------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	
	
}
