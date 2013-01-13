package exe07_ConstrutoresEEncapsulamento;

/*
 * Objetivos: mostrar o conceito de 
 * encapsulamento, suas vantagens,
 * falar sobre modificadores.
 * */

public class Conta {

	//atributos
	private int numero;
	private String dono;
	private double saldo;
	private double limite;
	private double salario;
	
	//construtor

	public Conta() {
		super();
	}

	public Conta(String dono) {
		super();
		this.dono = dono;
	}

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	//metodos
	
	//saca deixa sacar apenas se o valor a se sacado for menor que o saldo.
	public boolean saca(double valor){
		if(saldo < valor) return false;
		saldo -= valor;
		return true;
	}
	
	public void deposita(double quantidade){
		saldo += quantidade;
	}

	
	//metodos get e set
	//criados a partor do sourse (automatico), após mostrar diferença na ContaTeste
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if( saldo < 0) saldo = 0;
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
