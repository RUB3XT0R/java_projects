package exe06_entendendoClassesMetodos;

/*
 * Objetivos: criação de tipos usando classes,
 * responsabilidade de classes,
 * metodos que recebem parametros.
 * Link com exe02_encapsulamento : alterar a classe visando o encapsulamento.
 * */

public class Conta {

	//atributos
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	
	//metodos
	
	//saca deixa sacar apenas se o valor a se sacado for menor que o saldo.
	public boolean saca(double valor){
		if(saldo < valor){
			return false;
		}else{
			saldo -= valor;
			return true;
		}			
	}
	
	public void deposita(double quantidade){
		saldo += quantidade;
	}
	
	
	
}
