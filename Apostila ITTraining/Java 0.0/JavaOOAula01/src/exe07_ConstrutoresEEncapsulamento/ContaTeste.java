package exe07_ConstrutoresEEncapsulamento;

/*
 * Objetivos: mostrar o conceito de encapsulamento.
 * alterar a classe para que utilize os metodos get e set.
 * */

public class ContaTeste {


	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		
		minhaConta.setDono("Lucas");
		minhaConta.setSaldo(2300.0);
		
		//mostra o saldo atual
		System.out.println("Saldo Atual:"+minhaConta.getSaldo());
		
		//saca 150 reais
		minhaConta.saca(150);
		System.out.println("Saldo Atual depois de saque de R$150:"+minhaConta.getSaldo());
		
		//deposita 700 reais
		minhaConta.deposita(700);
		System.out.println("Saldo Atual depois de depositar R$700:"+minhaConta.getSaldo());
				
		//eu não tenho 15 mil de saldo
		boolean consegui = minhaConta.saca(15000);
		System.out.println( consegui ? "Consegui sacar" : "Não consegui");
		
		//eu tenho 100 de saldo
		consegui = minhaConta.saca(100);
		System.out.println( consegui ? "Consegui sacar" : "Não consegui");
		
		//testando construtores
		Conta minhaConta2 = new Conta("Júlia");
		Conta minhaConta3 = new Conta(2400);
	}

}
