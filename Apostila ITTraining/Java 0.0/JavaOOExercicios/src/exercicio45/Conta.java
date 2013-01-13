package exercicio45;

/*
 * Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca. 
 * Ambas terão o método atualiza reescrito: 
 * A ContaCorrente deve atualizar-se com o dobro da taxa e a ContaPoupanca deve 
 * atualizar-se com o triplo da taxa.
 * Além disso, a ContaCorrente deve reescrever o método deposita, afim de retirar 
 * uma taxa bancária de dez centavos de cada depósito.
 * */

public class Conta {

	protected float saldo;
	
	public float getSaldo(){
		return saldo;
	}
	
	public void depositar(float quantia){
		if(quantia>0) saldo +=quantia;
	}
	
	public void sacar(float quantia){
		if(quantia>0 & quantia<=saldo) saldo-=quantia;
	}
	
	public void atualiza(float taxa){
		this.saldo += this.saldo * taxa;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
