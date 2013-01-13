package exe05_Agregacao;

import java.util.Scanner;

public class Curso {

	
	private String nome;

	public Curso() {
		super();
	}

	public Curso(String nome) {
		super();
		this.nome = nome;
	}

	public void pedeDados(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Curso ..:");
		nome = sc.next();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
