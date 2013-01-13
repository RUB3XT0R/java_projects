package exe07_Criando_Excecoes;

public class Pessoa {

	public String nome;
	public int idade;
	public String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) throws IdadeNegativaException{
		if( idade<=0 ) throw new IdadeNegativaException();
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) throws SexoInvalidoException {
		if( "M".equalsIgnoreCase(sexo)  || "F".equalsIgnoreCase(sexo)){
			this.sexo = sexo;
		}else{
			throw new SexoInvalidoException();
		}
	}
	
	
	
}

