package exe07_Criando_Excecoes;

//exercicio
public class SexoInvalidoException extends RuntimeException {

	public SexoInvalidoException(){
		super("apenas M ou F no sexo");
	}
}
