package exe07_Criando_Excecoes;

public class IdadeNegativaException extends Exception{

	public IdadeNegativaException(){
		super("Idade não pode ser negativa!");
	}
	
}

