package exe08_exercicioHeranca;

import java.util.Scanner;

public class Animal {

	private String nome;
	private float comprimento;
	private int num_patas=4;
	private String cor;
	private String ambiente;
	private float velocidade;
	
	//construtores e métodos get e set
		
	public Animal() {
		super();
	}
	public Animal(String nome, float comprimento, int num_patas, String cor,
			String ambiente, float velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.num_patas = num_patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getNum_patas() {
		return num_patas;
	}
	public void setNum_patas(int num_patas) {
		this.num_patas = num_patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}	
	
	public void pegarDados(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Nome do animal");
		this.nome = sc.next();
		
		System.out.println("Entre com o Comprimento do "+nome);
		this.comprimento = sc.nextFloat();
		
		System.out.println("Entre com o Número de Patas do "+nome);
		this.num_patas = sc.nextInt();
		
		System.out.println("Entre com o Cor do "+nome);
		this.cor = sc.next();
		
		System.out.println("Entre com o Velocidade do "+nome);
		this.velocidade = sc.nextFloat();
		
		System.out.println("Entre com o Ambiente do "+nome);
		this.ambiente = sc.next();
		
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", comprimento=" + comprimento
				+ ", num_patas=" + num_patas + ", cor=" + cor + ", ambiente="
				+ ambiente + ", velocidade=" + velocidade;
	}
	
	
}
