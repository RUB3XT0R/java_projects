package exe06_entendendoClassesMetodos;

/*
 * Objetivos: passagem de parametros para metodos
 * Link com exe02_encapsulamento : mostrar erro de lógica quando é
 * sacado um valor acima do saldo.
 * */

public class ContaTeste {


	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		
		minhaConta.dono="Lucas";
		minhaConta.saldo=2300.0;
		
		//mostra o saldo atual
		System.out.println("Saldo Atual:"+minhaConta.saldo);
		
		//saca 150 reais
		minhaConta.saca(150);
		System.out.println("Saldo Atual depois de saque de R$150:" + minhaConta.saldo);
		
		//deposita 700 reais
		minhaConta.deposita(700);
		System.out.println("Saldo Atual depois de depositar R$700:" + minhaConta.saldo);
				
		//eu não tenho 15 mil de saldo
		boolean consegui = minhaConta.saca(15000);
		System.out.println( consegui ? "Consegui sacar" : "Não consegui");
		
		//eu tenho 100 de saldo
		consegui = minhaConta.saca(100);
		System.out.println( consegui ? "Consegui sacar" : "Não consegui");
		
		minhaConta.saldo = minhaConta.saldo - 15000;
		System.out.println("Saldo Atual depois de sacar R$15mil:" + minhaConta.saldo);
	}

}
