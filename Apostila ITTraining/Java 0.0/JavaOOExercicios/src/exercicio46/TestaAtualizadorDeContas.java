package exercicio46;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.depositar(1000);
		cc.depositar(1000);
		cp.depositar(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01f);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());

	}

}
