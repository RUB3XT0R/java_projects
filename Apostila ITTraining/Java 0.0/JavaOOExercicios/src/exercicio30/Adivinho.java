package exercicio30;

import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Modifique o programa de  Exerc�cio 29 para contar o n�mero de suposi��es que o jogador faz.  
 * Se o n�mero for  10 ou menos, exiba  Either you  know the secret or you got lucky!  
 * [Voc�  sabe  o segredo  ou  tem  muita  sorte!] se o jogador adivinhar o n�mero em  10 tentativas, 
 * exiba Aha!  Vou  know  the  secret ! [Aha!  Voc�  sabe  o  segredo!].  
 * Se  o jogador  fizer  mais  que  10  adivinha��es,  exiba  Vou  should be  able to do better!  
 * [Voc�  �  capaz  de  fazer  melhor]. Porque esse jogo n�o deve precisar de mais que  10  suposi��es? 
 * Bem, acaba 'boa suposi��o' o jogador deve ser capaz de eliminar metade dos n�meros.  
 * Agora mostre por que qualquer n�mero  de 1 a 1.000 pode ser adivinhado em  10 ou menos  tentativas.  
 * */

public class Adivinho {

	private Random r = new Random();
	
	public int makeNumber(){
		int num1 = r.nextInt(1000)+1; //entre 1 e 1000
		int numero=0; //numero de tentativas
		int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Advinhe o n�mero entre 1 e 1000:"));
		do{
			
		    if(resp==num1) {
					JOptionPane.showMessageDialog(null,"Parab�ns,  voc� adivinhou o n�mero !");
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
			JOptionPane.showMessageDialog(null,"Voc� utilizou "+tentaivas+" tentativas. "+
			 ( (tentaivas<=10) ? 
				  (tentaivas==10) ? "Aha!  Voc�  sabe  o  segredo!" : "Voc�  sabe  o segredo  ou  tem  muita  sorte!" 
				  : "Voc�  �  capaz  de  fazer  melhor"
			 ));
			
			String op = JOptionPane.showInputDialog(null,"Pronto para a pr�xima rodada? s/n");
			if (!op.equals("s")) break;
		}while(true);
	}
}
