package exe06_Criando_Excecoes;

public class IdadeNegativaException extends Exception{

	public IdadeNegativaException(){
		super("Idade n�o pode ser negativa!");
	}
	
}

