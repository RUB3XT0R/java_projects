package exe03_Stream;


public class Teste {

	public static void main(String[] args) {
		ArquivoReader controle = new ArquivoReader();
		Contato c = new Contato();
		c.setCodigo(1);
		c.setNome("Lucas");
		c.setTelefone("(11) 76542344");
		controle.gravarSer(c,"lucasTelefones");
		
		Contato cont = controle.obterSer("lucasTelefones");
		System.out.println("Código: "+cont.getCodigo()+" Nome: "+cont.getNome()+" Telefone: "+cont.getTelefone());
	}

}
