package exe06_Criando_Excecoes;

public class TestePessoa {


	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		//n�o vai lan�ar exce��o, porem vai dar um erro,
		//pois essa exce��o deve ser tratada
		//p.setIdade(14);
		
		//agora que circundamos com try/catch, n�o haver� problemas
		try {
			p.setIdade(-6);
		} catch (IdadeNegativaException e) {
			e.printStackTrace();
		}
		

		//n�o vai lan�ar exce��o, e n�o e preciso tratar, 
		//j� que ele � uma RuntimeException, e seu tratamento
		//n�o � obrigatorio
		p.setSexo("m");
		
		
		//agora que circundamos com try/catch
		try {
			p.setSexo("s");
		} catch (SexoInvalidoException e) {
			e.printStackTrace();
		}
		
	}

}
