package exe03_ExercicioRefinado;

import java.util.Scanner;

public class Aluno {

	private String nome;
	private String curso;
	private float[] notas = new float[3];
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String curso, float[] notas) {
		super();
		this.nome = nome;
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
		System.out.println("Entre com o Curso ..:");
		curso = sc.next();
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
		                   ( (media > 5)? " aprovado" : " reprovado") );
		System.out.println("------------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	
	
}
