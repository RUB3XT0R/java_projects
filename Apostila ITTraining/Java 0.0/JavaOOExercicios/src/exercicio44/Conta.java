package exercicio44;

/*
 * Vamos criar uma classe Conta, que possua um saldo, e os m�todos para pegar saldo, depositar, e sacar.
 * Adicione um m�todo na classe Conta, que atualiza essa conta de acordo com uma taxa percentual fornecida.
 * */

public class Conta {

	private float saldo;
	
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
}
