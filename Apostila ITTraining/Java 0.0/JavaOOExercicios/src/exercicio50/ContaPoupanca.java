package exercicio50;

public class ContaPoupanca extends Conta {


	public void atualiza(float taxa){
		saldo+=saldo*taxa*3;
	}
	
}