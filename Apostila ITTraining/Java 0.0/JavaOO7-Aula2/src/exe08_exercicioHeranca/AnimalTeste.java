package exe08_exercicioHeranca;

public class AnimalTeste{

	public static void main(String args[]){
	
		Animal camelo = new Mamifero();
		camelo.pegarDados();
		Animal tubarao = new Peixe();
		tubarao.pegarDados();
		System.out.println(camelo);
		System.out.println(tubarao);
		
	}
	
}
