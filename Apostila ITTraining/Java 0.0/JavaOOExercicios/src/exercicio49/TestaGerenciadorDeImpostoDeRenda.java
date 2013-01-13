package exercicio49;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1000);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
	}

}
