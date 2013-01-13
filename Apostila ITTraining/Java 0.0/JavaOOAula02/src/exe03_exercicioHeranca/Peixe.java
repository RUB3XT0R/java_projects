package exe03_exercicioHeranca;

import java.util.Scanner;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe() {
		super();
	}

	public Peixe(String nome, float comprimento, String cor,
			String ambiente, float velocidade, String caracteristica) {
		super(nome, comprimento, 0, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void pegarDados(){
		super.pegarDados();
		System.out.println("Entre com o caracteristica do "+getNome());
		this.caracteristica = new Scanner(System.in).nextLine();
	}

	@Override
	public String toString() {
		return super.toString() +", caracteristica=" + caracteristica;
	}
	
	
}

