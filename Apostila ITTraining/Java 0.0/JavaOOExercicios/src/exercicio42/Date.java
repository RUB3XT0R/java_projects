package exercicio42;

/*
 * Como garantir que datas como 31/2/2005 não sejam aceitas pela sua classe Data? 
 * */

public class Date {

	private int mes=1;
	private int dia=1;
	private int ano;
	
	public String displayDate(){
		return mes+"/"+	dia+"/"+ano;	
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes>1 && mes<=12) this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if(dia<1){ 
			this.dia=1;
			return; //sai
		}
		//meses que tem até dia 31
		if( (mes==1 | mes==3 | mes==5 | mes==7 | mes==8 | mes == 10 | mes==12) & dia>31 ){ 
				this.dia=31;
				return; //sai
		}
		//meses que tem até dia 30
		if( (mes==4 | mes==6 | mes == 9 | mes==11) & dia>30 ){ 
						this.dia=30;
						return; //sai
		}
		if (mes==2 & dia>28){
			     this.dia=28;
			     return;
		}
		this.dia = dia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
