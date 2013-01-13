package exe06_Criando_Excecoes;

public class TestePessoa {


	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		//não vai lançar exceção, porem vai dar um erro,
		//pois essa exceção deve ser tratada
		//p.setIdade(14);
		
		//agora que circundamos com try/catch, não haverá problemas
		try {
			p.setIdade(-6);
		} catch (IdadeNegativaException e) {
			e.printStackTrace();
		}
		

		//não vai lançar exceção, e não e preciso tratar, 
		//já que ele é uma RuntimeException, e seu tratamento
		//não é obrigatorio
		p.setSexo("m");
		
		
		//agora que circundamos com try/catch
		try {
			p.setSexo("s");
		} catch (SexoInvalidoException e) {
			e.printStackTrace();
		}
		
	}

}
