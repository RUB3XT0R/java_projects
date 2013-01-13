package exercicio25;

import java.sql.Time;

/**
 * Um  estacionamento cobra uma  taxa mínima de R$2 para estacionar por ate três horas.  
 * Um adicional de  R$ 0,50 por hora não necessariamente inteira é cobrado  após  as  
 * três  primeiras  horas.  A carga  máxima  para  qualquer  dado  período  de  24  horas  
 * é R$  10.  Suponha  que  nenhum  carro  fica estacionado por mais  de  24 horas por vez.  
 * */

public class Estacionamento {

	private int horaInicial;
	private int horaFinal;
	
	public void setInicio(int hora){
		horaInicial= hora;
	}
	
	public void setFinal(int hora){
		horaFinal= hora;
	}
	
	public float calculateCharges(){
		int horas = horaFinal-horaInicial;
		if (horas<=3) return 3.0f;
		if (horas>=24) return 10.0f;
		return 3 + (horas-3)*0.5f;
	}

	public int getHoraInicial() {
		return horaInicial;
	}
	
	public int getHoraFinal() {
		return horaFinal;
	}

	
	
}
