package exercicio49;

public class ContaCorrente extends Conta implements Tributavel  {


	public void depositar(float quantia){
		if(quantia>0) 
			saldo+=quantia-0.10f;
	}
	

	public void atualiza(float taxa){
		saldo+=saldo*taxa*2;
	}


	@Override
	public float calculaTributos() {
		return this.getSaldo() * 0.01f;
	}
	
}
