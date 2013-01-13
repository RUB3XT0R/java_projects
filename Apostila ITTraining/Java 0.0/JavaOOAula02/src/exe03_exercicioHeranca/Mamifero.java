package exe03_exercicioHeranca;

import java.util.Scanner;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {
		super();
	}

	public Mamifero(String nome, float comprimento, int num_patas, String cor,
			String ambiente, float velocidade, String alimento) {
		super(nome, comprimento, num_patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}	
	
	public void pegarDados(){
		super.pegarDados();
		System.out.println("Entre com o alimento do "+getNome());
		this.alimento = new Scanner(System.in).nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() +",alimento=" + alimento;
	}
	
}

