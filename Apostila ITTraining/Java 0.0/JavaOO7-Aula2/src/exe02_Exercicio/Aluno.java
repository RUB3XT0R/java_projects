package exe02_Exercicio;

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

	public float calculaMedia(){
		float media = 0; //média começa com zero
		for(float f : notas) media += f; // média é acrescentada
		media /= notas.length; //média é dividida pela quantidade de alunos
		return media;
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
