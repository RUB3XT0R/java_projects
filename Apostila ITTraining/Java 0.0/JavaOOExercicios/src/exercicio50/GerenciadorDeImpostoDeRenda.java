package exercicio50;

public class GerenciadorDeImpostoDeRenda {
	
	private float total;
	
	public void adiciona(Tributavel t){
				System.out.println("Adicionando tribut�vel: "+ t);
				this.total += t.calculaTributos();
	}
	
	public float getTotal(){
		return this.total;
	}
	
}
