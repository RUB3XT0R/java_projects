package exercicio50;

public class Conta {

	protected float saldo;
	
	public float getSaldo(){
		return saldo;
	}
	
	public void depositar(float quantia){
		if(quantia<0) 
		    throw new IllegalArgumentException
		      ("Você tentou depositar um valor negativo");			
		saldo +=quantia;
	}
	
	public void sacar(float quantia){
		if(quantia<0) 
	        throw new IllegalArgumentException
	          ("Você tentou sacar um valor negativo");
		if(quantia>saldo) 
		    throw new IllegalArgumentException
		      ("Você tentou sacar um valor acima do saldo");
		    
		saldo-=quantia;	    
	}
	
	public void atualiza(float taxa){
		this.saldo += this.saldo * taxa;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
