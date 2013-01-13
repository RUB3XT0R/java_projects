package exercicio24;

/*
 * Crie uma  classe chamada Date que inclui  tr�s  informa��es com vari�veis de instancia - 
 * um  m�s (tipo int), um  dia (tipo  int) e um  ano (tipo  int ). Sua classe deve  ter um  
 * construtor que inicializa as  tr�s vari�veis de  inst�ncia e assumir que os valores fornecidos 
 * s�o corretos.  Forne�a um m�todo  set  e um get para cada vari�vel  de  inst�ncia.  Forne�a um  
 * m�todo displayDate que  exibe o m�s, o dia e o ano separados por barras normais.
 * Escreva um  aplicativo  de  teste chamado DateTest que  demonstre  as  capacidades da  classe  Date.
 */

public class Date {

	private int mes;
	private int dia;
	private int ano;
	
	public String displayDate(){
		return mes+"/"+	dia+"/"+ano;	
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
