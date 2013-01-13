package exercicio30;

import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Modifique o programa de  Exercício 29 para contar o número de suposições que o jogador faz.  
 * Se o número for  10 ou menos, exiba  Either you  know the secret or you got lucky!  
 * [Você  sabe  o segredo  ou  tem  muita  sorte!] se o jogador adivinhar o número em  10 tentativas, 
 * exiba Aha!  Vou  know  the  secret ! [Aha!  Você  sabe  o  segredo!].  
 * Se  o jogador  fizer  mais  que  10  adivinhações,  exiba  Vou  should be  able to do better!  
 * [Você  é  capaz  de  fazer  melhor]. Porque esse jogo não deve precisar de mais que  10  suposições? 
 * Bem, acaba 'boa suposição' o jogador deve ser capaz de eliminar metade dos números.  
 * Agora mostre por que qualquer número  de 1 a 1.000 pode ser adivinhado em  10 ou menos  tentativas.  
 * */

public class Adivinho {

	private Random r = new Random();
	
	public int makeNumber(){
		int num1 = r.nextInt(1000)+1; //entre 1 e 1000
		int numero=0; //numero de tentativas
		int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Advinhe o número entre 1 e 1000:"));
		do{
			
		    if(resp==num1) {
					JOptionPane.showMessageDialog(null,"Parabéns,  você adivinhou o número !");
					break;
			}
		    numero++;
		    resp = Integer.parseInt(JOptionPane.showInputDialog(null,
		    		(resp>num1 ? "Muito alto." : "Muito baixo." )+" Tente novamente:"));
		}while(true);
		return numero;
	}
	
	public static void main(String args[]){
		Adivinho a = new Adivinho();
		do{
			int tentaivas = a.makeNumber();
			JOptionPane.showMessageDialog(null,"Você utilizou "+tentaivas+" tentativas. "+
			 ( (tentaivas<=10) ? 
				  (tentaivas==10) ? "Aha!  Você  sabe  o  segredo!" : "Você  sabe  o segredo  ou  tem  muita  sorte!" 
				  : "Você  é  capaz  de  fazer  melhor"
			 ));
			
			String op = JOptionPane.showInputDialog(null,"Pronto para a próxima rodada? s/n");
			if (!op.equals("s")) break;
		}while(true);
	}
}
