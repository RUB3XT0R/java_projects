package exercicio46;

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
