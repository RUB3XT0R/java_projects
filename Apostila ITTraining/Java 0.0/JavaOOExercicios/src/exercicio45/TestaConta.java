package exercicio45;

public class TestaConta {

	/**
	 * Crie uma classe com método main e instancie essas classes, atualize-as e veja o resultado.
	 */
	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.depositar(1000);
		cc.depositar(1000);
		cp.depositar(1000);
		
		c.atualiza(0.01f);
		cc.atualiza(0.01f);
		cp.atualiza(0.01f);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
