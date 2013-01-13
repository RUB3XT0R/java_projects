package exercicio45;

public class ContaCorrente extends Conta {


	public void depositar(float quantia){
		if(quantia>0) 
			saldo+=quantia-0.10f;
	}
	

	public void atualiza(float taxa){
		saldo+=saldo*taxa*2;
	}
	
}
