package exercicio49;

public class AtualizadorDeContas {
	
	private float saldoTotal = 0;
	private float taxa;
	
	public AtualizadorDeContas(float taxa) {
		this.taxa = taxa;
	}
	
	void roda(Conta c) {
		System.out.println("Saldo anterior: R$ "+c.saldo);
		c.atualiza(taxa);
		System.out.println("Saldo atual: R$ "+c.saldo);
		saldoTotal+=c.saldo;
	}
	
	public float getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
		
	
		

}
