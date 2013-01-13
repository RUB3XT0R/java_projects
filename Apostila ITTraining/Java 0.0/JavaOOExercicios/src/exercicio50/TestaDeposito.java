package exercicio50;

public class TestaDeposito {

	public static void main(String[] args) {
		
		Conta cp = new ContaPoupanca();
		try {
			cp.depositar(-100);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
